package com.hjl.artisan.tool.presenter

import com.hjl.artisan.login.bean.LoginBean
import com.hjl.artisan.tool.model.ToolModel
import com.hjl.artisan.tool.view.IToolView
import com.wusy.wusylibrary.base.BaseMVPPresenter
import com.wusy.wusylibrary.base.IBaseMVPModel
import com.wusy.wusylibrary.base.IBaseMVPView
import com.wusy.wusylibrary.view.moduleComponents.ModuleViewBean

class ToolPresenter :BaseMVPPresenter<IToolView>(),IToolPresenter {
    override fun getAdvertisement() {
        model.getAdvertisement()
    }

    override fun getProjectPlanBtn(loginBean: LoginBean):ArrayList<ModuleViewBean> {
        return model.getProjectPlanBtn(loginBean)
    }

    override fun getQualityInspection(loginBean: LoginBean):ArrayList<ModuleViewBean> {
        return model.getQualityInspection(loginBean)
    }

    override fun getMaterialManagement(loginBean: LoginBean):ArrayList<ModuleViewBean> {
        return model.getMaterialManagement(loginBean)
    }

    private val handler:ToolHandler= ToolHandler(this)
    private val model:ToolModel
    init {
        model= ToolModel(handler)
    }
    override fun getMVPView(): IBaseMVPView {
        return view
    }

    override fun getModel(): IBaseMVPModel {
        return this.model
    }
}