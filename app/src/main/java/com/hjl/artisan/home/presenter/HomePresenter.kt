package com.hjl.artisan.home.presenter

import com.hjl.artisan.home.model.HomeModel
import com.hjl.artisan.home.view.IHomeView
import com.wusy.wusylibrary.base.BaseMVPPresenter
import com.wusy.wusylibrary.base.IBaseMVPModel
import com.wusy.wusylibrary.base.IBaseMVPView

class HomePresenter :BaseMVPPresenter<IHomeView>(),IHomePresenter {
    private val handler=HomeHandler(this)
    private val model:HomeModel
    init {
        model=HomeModel(handler)
    }
    override fun getMVPView(): IBaseMVPView {
        return view
    }

    override fun getModel(): IBaseMVPModel {
        return this.model
    }
}