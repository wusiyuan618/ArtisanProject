package com.hjl.artisan.tool.presenter

import com.hjl.artisan.tool.model.ToolModel
import com.hjl.artisan.tool.view.IToolView
import com.wusy.wusylibrary.base.BaseMVPPresenter
import com.wusy.wusylibrary.base.IBaseMVPModel
import com.wusy.wusylibrary.base.IBaseMVPView

class ToolPresenter :BaseMVPPresenter<IToolView>(),IToolPresenter {
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