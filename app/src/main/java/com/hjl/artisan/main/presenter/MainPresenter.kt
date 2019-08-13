package com.hjl.artisan.main.presenter

import com.hjl.artisan.main.modle.IMainModel
import com.hjl.artisan.main.modle.MainModel
import com.hjl.artisan.main.view.IMainView
import com.wusy.wusylibrary.base.BaseMVPPresenter
import com.wusy.wusylibrary.base.IBaseMVPModel
import com.wusy.wusylibrary.base.IBaseMVPView
import com.wusy.wusylibrary.view.bottomSelect.BottomSelectBean

class MainPresenter : BaseMVPPresenter<IMainView>(), IMainPresenter {
    override fun getBottomSelectData(): List<BottomSelectBean> {
       return model.getMainData()
    }

    private val model: IMainModel

    init {
        model = MainModel()
    }
    override fun getMVPView(): IBaseMVPView? {
        return view
    }

    override fun getModel(): IBaseMVPModel? {
        return this.model
    }
}
