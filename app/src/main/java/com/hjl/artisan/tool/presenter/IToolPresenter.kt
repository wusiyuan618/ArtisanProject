package com.hjl.artisan.tool.presenter

import com.hjl.artisan.login.bean.LoginBean
import com.wusy.wusylibrary.base.IBaseMVPPresenter
import com.wusy.wusylibrary.view.moduleComponents.ModuleViewBean

interface IToolPresenter : IBaseMVPPresenter{
    fun getProjectPlanBtn(loginBean: LoginBean):ArrayList<ModuleViewBean>
    fun getQualityInspection(loginBean: LoginBean):ArrayList<ModuleViewBean>
    fun getMaterialManagement(loginBean: LoginBean):ArrayList<ModuleViewBean>
    fun getAdvertisement()
}
