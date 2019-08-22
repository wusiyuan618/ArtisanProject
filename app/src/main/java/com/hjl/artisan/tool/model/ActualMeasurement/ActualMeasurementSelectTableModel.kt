package com.hjl.artisan.tool.model.ActualMeasurement

import android.os.Handler
import com.gohome.pad.data.net.http.UrlForOkhttp
import com.google.gson.Gson
import com.hjl.artisan.app.Contants
import com.hjl.artisan.login.bean.LoginBean
import com.hjl.artisan.tool.bean.ActualMeasurement.ActuralMeasurementTableBean
import com.wusy.wusylibrary.util.OkHttpUtil
import okhttp3.Call
import okhttp3.Response
import java.io.IOException

class ActualMeasurementSelectTableModel{
    fun getTableList(pageIndex:Int,employeeBean: LoginBean.DataBean.ListBean.EmployeeBean,proId:String,handler:Handler){
        OkHttpUtil.getInstance().asynGet(UrlForOkhttp.getActualMeasurementTable(
            pageIndex,Contants.pageSize,true,employeeBean.comId!!,employeeBean.id!!,employeeBean.employeeType!!,proId
        ),object : OkHttpUtil.ResultCallBack{
            override fun successListener(call: Call?, response: Response?) {
                var json=response!!.body()!!.string()
                var bean= Gson().fromJson(json, ActuralMeasurementTableBean::class.java)
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
