package com.hjl.artisan.me.presenter

import com.hjl.artisan.me.modle.IMeModel
import com.hjl.artisan.me.modle.MeModel
import com.hjl.artisan.me.view.IMeView
import com.wusy.wusylibrary.base.BaseMVPPresenter
import com.wusy.wusylibrary.base.IBaseMVPModel
import com.wusy.wusylibrary.base.IBaseMVPView

class MePresenter : BaseMVPPresenter<IMeView>(), IMePresenter{
    private val model: IMeModel
    private val handler:MeHandler = MeHandler(this)

    init {
        model=MeModel(handler)
    }
    override fun getMVPView(): IBaseMVPView {
        return view
    }

    override fun getModel(): IBaseMVPModel {
        return model
    }

}