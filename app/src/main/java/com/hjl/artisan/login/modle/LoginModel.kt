package com.hjl.artisan.login.modle

import android.os.Handler
import android.widget.Toast
import com.gohome.pad.data.net.http.UrlForOkhttp
import com.google.gson.Gson
import com.hjl.artisan.app.Contants
import com.hjl.artisan.login.bean.LoginBean
import com.hjl.artisan.login.presenter.LoginHandler
import com.wusy.wusylibrary.util.CommonUtil
import com.wusy.wusylibrary.util.OkHttpUtil
import okhttp3.Call
import java.io.IOException

import java.util.HashMap

class LoginModel(handler: Handler) : ILoginModel {
    private val handler: LoginHandler = handler as LoginHandler

    override fun requestLogin(maps: HashMap<String, String>) {

        OkHttpUtil.getInstance().asynGet(UrlForOkhttp.requestLoginUrl(maps["userName"].toString(),CommonUtil.strForMD5(maps["passWord"].toString()))
            , object : OkHttpUtil.ResultCallBack{
            override fun failListener(call: Call?, e: IOException?, message: String?) {
                var msg=handler.obtainMessage()
                msg.what=Contants.OKHTTP_REQUEST_ERROR
                msg.obj=message
                handler.sendMessage(msg)
            }


            override fun successListener(call: okhttp3.Call?, response: okhttp3.Response?) {
                var json=response!!.body()!!.string()
                var bean= Gson().fromJson(json,LoginBean::class.java)
                if(bean.status=="0"){
                    var msg=handler.obtainMessage()
                    msg.what=Contants.OKHTTP_REQUEST_SUCCESS
                    msg.obj=bean
                    handler.sendMessage(msg)
                }else{
                    var msg=handler.obtainMessage()
                    msg.what=Contants.OKHTTP_REQUEST_ERROR
                    msg.obj=bean.msg
                    handler.sendMessage(msg)
                }
            }
        })
    }
}
