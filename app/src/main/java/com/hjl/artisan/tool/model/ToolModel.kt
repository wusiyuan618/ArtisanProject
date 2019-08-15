package com.hjl.artisan.tool.model

import android.os.Handler
import android.util.Log
import com.gohome.pad.data.net.http.UrlForOkhttp
import com.google.gson.Gson
import com.hjl.artisan.app.Contants
import com.hjl.artisan.login.bean.LoginBean
import com.hjl.artisan.tool.bean.AdvertisementBean
import com.hjl.artisan.tool.presenter.ToolHandler
import com.wusy.wusylibrary.util.OkHttpUtil
import com.wusy.wusylibrary.view.moduleComponents.ModuleViewBean
import okhttp3.Call
import okhttp3.Response
import java.io.IOException

class ToolModel(handler:Handler) :IToolModel{
    val handler=handler as ToolHandler
    override fun getAdvertisement() {
        OkHttpUtil.getInstance().asynGet(UrlForOkhttp.getAdvertisement(),object :OkHttpUtil.ResultCallBack{
            override fun failListener(call: Call?, e: IOException?, message: String?) {
                Contants.sendMessageByHandler(handler,message)
            }

            override fun successListener(call: Call?, response: Response?) {
                var json=response!!.body()!!.string()
                var bean=Gson().fromJson(json,AdvertisementBean::class.java)
                if (bean.status=="0"){
                    Contants.sendMessageByHandler(handler,bean)
                }else{
                    Contants.sendMessageByHandler(handler,bean.msg)
                }
            }
        })
    }

    override fun getProjectPlanBtn(loginBean: LoginBean):ArrayList<ModuleViewBean>{
        var list=ArrayList<ModuleViewBean>()
        var toolBean=getToolList(loginBean)
        if(toolBean!=null){
            for (modelViewBean in ModelViewDataUtil.initProjectPlanData()){
                for (bean in toolBean.childList!!){
                    if(modelViewBean.index==bean.functionUrl){
                        list.add(modelViewBean)
                        break
                    }
                }
            }
        }
        return list
    }

    override fun getQualityInspection(loginBean: LoginBean) :ArrayList<ModuleViewBean>{
        var list=ArrayList<ModuleViewBean>()
        var toolBean=getToolList(loginBean)
        if(toolBean!=null){
            for (modelViewBean in ModelViewDataUtil.initQualityInspection()){
                for (bean in toolBean.childList!!){
                    if(modelViewBean.index==bean.functionUrl){
                        list.add(modelViewBean)
                        break
                    }
                }
            }
        }
        Log.i("wsy",list.size.toString())
        return list
    }

    override fun getMaterialManagement(loginBean: LoginBean) :ArrayList<ModuleViewBean>{
        var list=ArrayList<ModuleViewBean>()
        var toolBean=getToolList(loginBean)
        if(toolBean!=null){
            for (modelViewBean in ModelViewDataUtil.initMaterialManagement()){
                for (bean in toolBean.childList!!){
                    if(modelViewBean.index==bean.functionUrl){
                        list.add(modelViewBean)
                        break
                    }
                }
            }
        }
        return list
    }
    private fun getToolList(loginBean: LoginBean):LoginBean.DataBean.ListBean.FunctionListBean?{
        for (bean in loginBean.data!!.list!![0].functionList!!){
            if(bean.functionUrl =="/pages/tools/main"){
                return bean
            }
        }
        return null
    }
}