package com.hjl.artisan.tool.model.ActualMeasurement

import android.os.Handler
import com.gohome.pad.data.net.http.UrlForOkhttp
import com.google.gson.Gson
import com.hjl.artisan.app.Contants
import com.hjl.artisan.login.bean.LoginBean
import com.hjl.artisan.tool.bean.ActualMeasurement.ActualMeasurementSelectProBean
import com.hjl.artisan.tool.bean.ActualMeasurement.AreaBean
import com.wusy.wusylibrary.util.OkHttpUtil
import okhttp3.Call
import okhttp3.Response
import java.io.IOException

class ActualMeasurementSelectProModel() {
    fun getProList(employeeBean: LoginBean.DataBean.ListBean.EmployeeBean,pageIndex:Int,
                   locationName:String,programName:String,handler: Handler){
        OkHttpUtil.getInstance().asynGet(UrlForOkhttp.getActualMeasurementsProgramList(
            pageIndex,Contants.pageSize,false,
            employeeBean.comId!!,employeeBean.id!!,locationName,programName
        ),object :OkHttpUtil.ResultCallBack{
            override fun successListener(call: Call?, response: Response?) {
                var json=response!!.body()!!.string()
                var bean=Gson().fromJson(json,
                    ActualMeasurementSelectProBean::class.java)
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
    fun getArea(employeeBean: LoginBean.DataBean.ListBean.EmployeeBean,handler: Handler){
        OkHttpUtil.getInstance().asynGet(UrlForOkhttp.getActualMeasurementAreaList(
            employeeBean.id!!,employeeBean.employeeType!!,employeeBean.comId!!),object:OkHttpUtil.ResultCallBack{
            override fun successListener(call: Call?, response: Response?) {
                var json=response!!.body()!!.string()
                var bean=Gson().fromJson(json, AreaBean::class.java)
                if (bean.status=="0")
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