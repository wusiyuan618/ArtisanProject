package com.hjl.artisan.tool.model

import com.hjl.artisan.login.bean.LoginBean
import com.wusy.wusylibrary.base.IBaseMVPModel
import com.wusy.wusylibrary.view.moduleComponents.ModuleViewBean

interface IToolModel : IBaseMVPModel {
    fun getProjectPlanBtn(loginBean: LoginBean):ArrayList<ModuleViewBean>
    fun getQualityInspection(loginBean: LoginBean):ArrayList<ModuleViewBean>
    fun getMaterialManagement(loginBean: LoginBean):ArrayList<ModuleViewBean>
    fun getAdvertisement()

}