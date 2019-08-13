package com.hjl.artisan.tool.view

import android.content.Context
import android.view.View
import com.hjl.artisan.R
import com.hjl.artisan.tool.presenter.ToolPresenter
import com.wusy.wusylibrary.base.BaseMVPFragment

class ToolView :BaseMVPFragment<IToolView,ToolPresenter>(),IToolView{
    override fun init() {

    }

    override fun createPresenter(): ToolPresenter {
        return ToolPresenter()
    }

    override fun getContentViewId(): Int {
        return R.layout.fragment_tool
    }

    override fun findView(view: View?) {
    }

    override fun getmContext(): Context? {
        return context
    }
}