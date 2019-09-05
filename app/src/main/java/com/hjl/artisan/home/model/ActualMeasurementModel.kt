package com.hjl.artisan.home.model

import android.os.Handler
import com.gohome.pad.data.net.http.UrlForOkhttp
import com.google.gson.Gson
import com.hjl.artisan.app.Contants
import com.hjl.artisan.home.bean.ActualMeasurementsSelectSalesProBean
import com.hjl.artisan.home.bean.CountGroupByLevelBean
import com.wusy.wusylibrary.util.OkHttpUtil
import okhttp3.Call
import okhttp3.Response
import java.io.IOException

class ActualMeasurementModel{
    fun getActualMeasurementReportGroupPage(handler: Handler,employeeId:String,pageIndex:Int,comId:String,programId:String,
                                            programName:String,warningLevel:String){
        OkHttpUtil.getInstance().asynGet(UrlForOkhttp.getActualMeasurementReportGroupPage(employeeId,pageIndex,Contants.pageSize,
            comId,programId,programName,warningLevel),object :OkHttpUtil.ResultCallBack{
            override fun successListener(call: Call?, response: Response?) {
                var json=response?.body()?.string()?:""
                var bean= Gson().fromJson<ActualMeasurementsSelectSalesProBean>(json,ActualMeasurementsSelectSalesProBean::class.java)
                if (bean.status=="0")  Contants.sendMessageByHandler(handler,bean)
                else Contants.sendMessageByHandler(handler,bean.msg)
            }

            override fun failListener(call: Call?, e: IOException?, message: String?) {
                Contants.sendMessageByHandler(handler,message)
            }

        })
    }

    fun getActualMeasurementCountGroupByLevel(handler: Handler,employeeId:String,comId:String,programId:String){
        OkHttpUtil.getInstance().asynGet(UrlForOkhttp.getActualMeasurementCountGroupByLevel(employeeId,comId,
            programId),object :OkHttpUtil.ResultCallBack{
            override fun successListener(call: Call?, response: Response?) {
                var json=response?.body()?.string()?:""
                var bean= Gson().fromJson<CountGroupByLevelBean>(json,CountGroupByLevelBean::class.java)
                if (bean.status=="0")  Contants.sendMessageByHandler(handler,bean)
                else Contants.sendMessageByHandler(handler,bean.msg)
            }

            override fun failListener(call: Call?, e: IOException?, message: String?) {
                Contants.sendMessageByHandler(handler,message)
            }
        })
    }
    fun getInfoNeedRecheck(handler:Handler,id:String){
        OkHttpUtil.getInstance().asynGet(UrlForOkhttp.getInfoNeedRecheck(id),object :OkHttpUtil.ResultCallBack{
            override fun successListener(call: Call?, response: Response?) {

            }

            override fun failListener(call: Call?, e: IOException?, message: String?) {

            }
        })
    }
}
