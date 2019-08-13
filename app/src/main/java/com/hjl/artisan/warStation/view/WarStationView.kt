package com.hjl.artisan.warStation.view

import android.content.Context
import android.view.View
import com.hjl.artisan.R
import com.hjl.artisan.warStation.presenter.WarStationPresenter
import com.wusy.wusylibrary.base.BaseMVPFragment

class WarStationView :BaseMVPFragment<IWarStationView,WarStationPresenter>(),IWarStationView {
    override fun init() {
    }

    override fun createPresenter(): WarStationPresenter {
        return WarStationPresenter()
    }

    override fun getContentViewId(): Int {
        return R.layout.fragment_warstation
    }

    override fun findView(view: View?) {
    }

    override fun getmContext(): Context? {
        return context
    }
}