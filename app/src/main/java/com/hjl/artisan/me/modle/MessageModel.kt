package com.hjl.artisan.me.modle

import android.os.Handler
import com.gohome.pad.data.net.http.UrlForOkhttp
import com.google.gson.Gson
import com.hjl.artisan.app.Contants
import com.hjl.artisan.app.HJLBean
import com.hjl.artisan.me.bean.*
import com.wusy.wusylibrary.util.OkHttpUtil
import okhttp3.Call
import okhttp3.Response
import org.json.JSONObject
import java.io.IOException

class MessageModel{
    fun getNewMessageCount(handler: Handler, employeeId:String, comId:String){
        OkHttpUtil.getInstance().asynGet(UrlForOkhttp.getNewMessageCount(employeeId,comId),object :OkHttpUtil.ResultCallBack{
            override fun successListener(call: Call?, response: Response?) {
                var json=response?.body()?.string()?:""
                var bean=Gson().fromJson<MessageCountBean>(json,MessageCountBean::class.java)
                if(bean.status=="0"){
                    Contants.sendMessageByHandler(handler,bean)
                }else{
                    Contants.sendMessageByHandler(handler,"error")
                }

            }

            override fun failListener(call: Call?, e: IOException?, message: String?) {
                Contants.sendMessageByHandler(handler,message)
            }

        })
    }
    fun getNewMessageList(handler: Handler, employeeId:String,pageIndex:Int,pageSize:Int,comId:String,msgType:String){
        OkHttpUtil.getInstance().asynGet(UrlForOkhttp.getMessageList(employeeId,pageIndex,pageSize,comId,msgType),object :OkHttpUtil.ResultCallBack{
            override fun successListener(call: Call?, response: Response?) {
                var json=response?.body()?.string()?:""
                var bean:HJLBean?=null
                when(msgType){
                    "apply"->{
                        bean=Gson().fromJson<MessageApplyBean>(json,MessageApplyBean::class.java)
                        if(bean.status?:"1"=="0"){
                            Contants.sendMessageByHandler(handler,bean)
                        }else{
                            Contants.sendMessageByHandler(handler,"网络错误")
                        }
                    }
                    "notSign"->{
                        bean=Gson().fromJson<MessageNotSignBean>(json,MessageNotSignBean::class.java)
                        if(bean.status?:"1"=="0"){
                            Contants.sendMessageByHandler(handler,bean)
                        }else{
                            Contants.sendMessageByHandler(handler,"网络错误")
                        }
                    }
                    "exception"->{
                        bean=Gson().fromJson<MessageExceptionBean>(json,MessageExceptionBean::class.java)
                        if(bean.status?:"1"=="0"){
                            Contants.sendMessageByHandler(handler,bean)
                        }else{
                            Contants.sendMessageByHandler(handler,"网络错误")
                        }
                    }
                }
            }

            override fun failListener(call: Call?, e: IOException?, message: String?) {
                Contants.sendMessageByHandler(handler,message)
            }

        })
    }
    fun requestPassOrIgnore(handler: Handler,id:String,checkStatus:String,employeeType:String){
        var map=HashMap<String,String>()
        map["id"] = id
        map["checkStatus"] = checkStatus
        map["employeeType"] = employeeType
        OkHttpUtil.getInstance().asynPost(UrlForOkhttp.requestCheckLabourer(),map
        ,object:OkHttpUtil.ResultCallBack{
                override fun successListener(call: Call?, response: Response?) {
                    var json=response?.body()?.string()?:""
                    var jo=JSONObject(json)
                    if(jo.getString("status")=="0"){
                        handler.sendEmptyMessage(Contants.OKHTTP_REQUEST_SUCCESS)
                    }else{
                        handler.sendEmptyMessage(Contants.OKHTTP_REQUEST_ERROR)
                    }
                }

                override fun failListener(call: Call?, e: IOException?, message: String?) {
                    handler.sendEmptyMessage(Contants.OKHTTP_REQUEST_ERROR)
                }

            })
    }
    fun getNotSignList(handler: Handler,pageIndex:Int,programId:String,comId:String,searchKey:String,groupTime:String){
        OkHttpUtil.getInstance().asynGet(UrlForOkhttp.getNotSignDeatailList(pageIndex,Contants.pageSize,programId,comId,searchKey,groupTime)
        ,object :OkHttpUtil.ResultCallBack{
                override fun successListener(call: Call?, response: Response?) {
                    var json=response?.body()?.string()?:""
                    var bean = Gson().fromJson<NotSignDetailBean>(json,NotSignDetailBean::class.java)
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
    fun requestUpdateDealStatus(handler: Handler,msgId:String){
        var map=HashMap<String,String>()
        map["id"] = msgId
        OkHttpUtil.getInstance().asynPost(UrlForOkhttp.requestUpdateDealStatus(),map,object :OkHttpUtil.ResultCallBack{
            override fun failListener(call: Call?, e: IOException?, message: String?) {
                handler.sendEmptyMessage(Contants.OKHTTP_REQUEST_ERROR)
            }

            override fun successListener(call: Call?, response: Response?) {
                var json=response?.body()?.string()?:""
                var jo=JSONObject(json)
                if(jo.getString("status")=="0"){
                    handler.sendEmptyMessage(Contants.OKHTTP_REQUEST_SUCCESS)
                }else{
                    handler.sendEmptyMessage(Contants.OKHTTP_REQUEST_ERROR)
                }
            }
        })
    }
}
