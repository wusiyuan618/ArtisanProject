package com.hjl.artisan.tool.model

import android.content.Context
import android.os.Handler
import android.support.v7.app.AlertDialog
import cc.fussen.cache.Cache
import com.gohome.pad.data.net.http.UrlForOkhttp
import com.google.gson.Gson
import com.hjl.artisan.app.Contants
import com.hjl.artisan.tool.bean.ActualMeasurementCheckPointBean
import com.hjl.artisan.tool.bean.CheckPointReportBean
import com.wusy.wusylibrary.util.OkHttpUtil
import okhttp3.Call
import okhttp3.Response
import org.json.JSONObject
import java.io.IOException

class ActualMeasurementCheckPointModel(context:Context){
    var mC=context
    fun getCheckPoint(handler: Handler,userId:String,measurementsId:String,buildingId:String,
                      unitId:String,floorNumberStart:Int,floorNumberEnd:Int){
        val index = userId + measurementsId + buildingId +
                    unitId + floorNumberStart + floorNumberEnd
        val bean= Cache.with(mC)
            .path(mC.cacheDir.path)
            .getCache(index,ActualMeasurementCheckPointBean::class.java)
        if(bean!=null){
            val dialog: AlertDialog = AlertDialog.Builder(mC)
                .setMessage("检查到上次测量的信息，是否使用？")
                .setNegativeButton("使用") { dialog, _ ->
                    Contants.sendMessageByHandler(handler,bean)
                    dialog.dismiss()
                }
                .setPositiveButton("取消") { dialog, _ ->
                    //删除缓存数据
                    Cache.with(mC)
                        .path(mC.cacheDir.path)
                        .remove(index)
                    //获取新的数据
                    requestCheckPointData(handler,measurementsId,buildingId,unitId, floorNumberStart,floorNumberEnd)
                    dialog.dismiss()
                }
                .create()
            dialog.show()
        }else{
            requestCheckPointData(handler,measurementsId,buildingId,unitId, floorNumberStart,floorNumberEnd)
        }

    }
    private fun requestCheckPointData(handler: Handler,measurementsId:String,buildingId:String,
                                      unitId:String,floorNumberStart:Int,floorNumberEnd:Int){
        OkHttpUtil.getInstance().asynGet(UrlForOkhttp.getActuralMeasurementCheckPoint(
            measurementsId,buildingId,unitId,floorNumberStart,floorNumberEnd
        ),object : OkHttpUtil.ResultCallBack{
            override fun successListener(call: Call?, response: Response?) {
                val json=response!!.body()!!.string()
                val bean=Gson().fromJson(json,ActualMeasurementCheckPointBean::class.java)
                if(bean.status=="0")
                    Contants.sendMessageByHandler(handler,bean)
                else
                    Contants.sendMessageByHandler(handler,bean.msg)
            }

            override fun failListener(call: Call?, e: IOException?, message: String?) {
                Contants.sendMessageByHandler(handler,message)
            }

        })
    }
    fun submitCheckPointData(bean: CheckPointReportBean,handler: Handler,userId:String,measurementsId:String,buildingId:String,
                             unitId:String,floorNumberStart:Int,floorNumberEnd:Int){
        var jsonStr=Gson().toJson(bean)
        OkHttpUtil.getInstance().anysPost(UrlForOkhttp.requestSubmitCheckPoint(),"admin",jsonStr,object : OkHttpUtil.ResultCallBack{
            override fun successListener(call: Call?, response: Response?) {
                var json=response!!.body()!!.string()
                var jo=JSONObject(json)
                if(jo.getString("status")=="0"){
                    val index = userId + measurementsId + buildingId +
                            unitId + floorNumberStart + floorNumberEnd
                    Cache.with(mC)
                        .path(mC.cacheDir.path)
                        .remove(index)
                    handler.sendEmptyMessage(1001)
                }else{
                    handler.sendEmptyMessage(1002)
                }
            }

            override fun failListener(call: Call?, e: IOException?, message: String?) {
                handler.sendEmptyMessage(1002)
            }
        })
    }
}
