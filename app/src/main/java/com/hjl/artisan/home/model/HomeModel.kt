package com.hjl.artisan.home.model

import com.gohome.pad.data.net.http.UrlForOkhttp
import com.google.gson.Gson
import com.hjl.artisan.app.Contants
import com.hjl.artisan.home.bean.ActualMeasurementsReportCountBean
import com.hjl.artisan.home.bean.InspectionReportCountBean
import com.hjl.artisan.home.bean.ProgramAttendanceSummaryBean
import com.hjl.artisan.home.presenter.HomeHandler

import com.wusy.wusylibrary.util.OkHttpUtil
import okhttp3.Call
import okhttp3.Response
import java.io.IOException

class HomeModel(handler:HomeHandler) : IHomeModel {
    val handler=handler
    override fun getProgramAttendanceSummaryIndexTop(employeeId:String,employeeType:String,comId:String,programId:String) {
        OkHttpUtil.getInstance().asynGet(UrlForOkhttp.getProgramAttendanceSummaryIndexTop(employeeId,employeeType,comId,programId)
            ,object :OkHttpUtil.ResultCallBack{
                override fun successListener(call: Call?, response: Response?) {
                    var json=response!!.body()!!.string()
                    var bean=Gson().fromJson(json,ProgramAttendanceSummaryBean::class.java)
                    if(bean.status=="0"){
                        Contants.sendMessageByHandler(handler,bean)

                    }else{
                        Contants.sendMessageByHandler(handler,bean.msg)
                    }
                }

                override fun failListener(call: Call?, e: IOException?, message: String?) {
                    Contants.sendMessageByHandler(handler,message)

                }

            })
    }

    override fun getActualMeasurementsReportCount(employeeId:String,employeeType:String,comId:String,programId:String) {
        OkHttpUtil.getInstance().asynGet(UrlForOkhttp.getActualMeasurementsReportCount(employeeId,employeeType,comId,programId)
            ,object :OkHttpUtil.ResultCallBack{
                override fun successListener(call: Call?, response: Response?) {
                    var json=response!!.body()!!.string()
                    var bean=Gson().fromJson(json,ActualMeasurementsReportCountBean::class.java)
                    if(bean.status=="0"){
                        Contants.sendMessageByHandler(handler,bean)

                    }else{
                        Contants.sendMessageByHandler(handler,bean.msg)
                    }
                }

                override fun failListener(call: Call?, e: IOException?, message: String?) {
                    Contants.sendMessageByHandler(handler,message)
                }

            })
    }

    override fun getInspectionReportCount(employeeId:String,employeeType:String,comId:String,programId:String) {
        OkHttpUtil.getInstance().asynGet(UrlForOkhttp.getInspectionReportCount(employeeId,employeeType,comId,programId)
            ,object :OkHttpUtil.ResultCallBack{
                override fun successListener(call: Call?, response: Response?) {
                    var json=response!!.body()!!.string()
                    var bean=Gson().fromJson(json,InspectionReportCountBean::class.java)
                    if(bean.status=="0"){
                        Contants.sendMessageByHandler(handler,bean)
                    }else{
                        Contants.sendMessageByHandler(handler,bean.msg)
                    }
                }

                override fun failListener(call: Call?, e: IOException?, message: String?) {
                    Contants.sendMessageByHandler(handler,message)
                }

            })
    }
}