package com.hjl.artisan.app

import android.os.Handler
import com.hjl.artisan.home.presenter.HomeHandler
import java.util.*

object Contants {
    const val OKHTTP_REQUEST_SUCCESS=0
    const val OKHTTP_REQUEST_ERROR=1
    /**
     *  网络请求发生错误时发送Handler消息
     */
    fun sendMessageByHandler(handler: Handler,errorMsg:String?){
        var msg=handler.obtainMessage()
        msg.what=OKHTTP_REQUEST_ERROR
        msg.obj=errorMsg
        handler.sendMessage(msg)
    }
    /**
     *  网络请求成功时发送Handler消息
     */
    fun sendMessageByHandler(handler: Handler,hjlBean:HJLBean?){
        var msg=handler.obtainMessage()
        msg.what=OKHTTP_REQUEST_SUCCESS
        msg.obj=hjlBean
        handler.sendMessage(msg)
    }
}