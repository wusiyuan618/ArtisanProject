package com.hjl.artisan.tool.model

import android.os.Handler
import com.gohome.pad.data.net.http.UrlForOkhttp
import com.google.gson.Gson
import com.hjl.artisan.app.Contants
import com.hjl.artisan.tool.bean.ActualMeasurementCheckPointBean
import com.wusy.wusylibrary.util.OkHttpUtil
import okhttp3.Call
import okhttp3.Response
import java.io.IOException

class ActualMeasurementCheckPointModel{
    fun getCheckPoint(handler: Handler,measurementsId:String,buildingId:String,
                      unitId:String,floorNumberStart:Int,floorNumberEnd:Int){
        OkHttpUtil.getInstance().asynGet(UrlForOkhttp.getActuralMeasurementCheckPoint(
            measurementsId,buildingId,unitId,floorNumberStart,floorNumberEnd
        ),object : OkHttpUtil.ResultCallBack{
            override fun successListener(call: Call?, response: Response?) {
                var json=response!!.body()!!.string()
                var bean=Gson().fromJson(json,ActualMeasurementCheckPointBean::class.java)
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
}
