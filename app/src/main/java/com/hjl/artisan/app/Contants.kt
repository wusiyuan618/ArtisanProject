package com.hjl.artisan.app

import android.os.Handler
import com.hjl.artisan.home.presenter.HomeHandler
import com.hjl.artisan.tool.bean.ActualMeasurementCheckPointBean
import com.hjl.artisan.tool.bean.CheckPointTreeBean
import java.util.*
import kotlin.collections.ArrayList

object Contants {
    const val OKHTTP_REQUEST_SUCCESS=0
    const val OKHTTP_REQUEST_ERROR=1

    //列表条数
    const val pageSize=12
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
    /**
     * 实测实量数据存储
     */
    var mAcualMeasurementBean:ActualMeasurementCheckPointBean?=null
}