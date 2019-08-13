package com.hjl.artisan.warStation.presenter

import com.hjl.artisan.warStation.model.IWarStationModel
import com.hjl.artisan.warStation.model.WarStationModel
import com.hjl.artisan.warStation.view.IWarStationView
import com.wusy.wusylibrary.base.BaseMVPPresenter
import com.wusy.wusylibrary.base.IBaseMVPModel
import com.wusy.wusylibrary.base.IBaseMVPView

class WarStationPresenter:BaseMVPPresenter<IWarStationView>(),IWarStationPresenter {


    private val handler:WarStationHandler= WarStationHandler(this)
    private val model:IWarStationModel
    init {
        model=WarStationModel(handler)
    }
    override fun getMVPView(): IBaseMVPView {
        return view
    }
    override fun getModel(): IBaseMVPModel {
        return this.model
    }
}