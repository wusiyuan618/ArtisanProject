package com.hjl.artisan.me.view

import android.content.Context
import android.view.View
import com.hjl.artisan.R
import com.hjl.artisan.me.presenter.MePresenter
import com.wusy.wusylibrary.base.BaseMVPFragment

class MeView : BaseMVPFragment<IMeView, MePresenter>(), IMeView{
    override fun findView(view: View?) {
    }

    override fun getmContext(): Context? {
        return context
    }


    override fun init() {
    }

    override fun createPresenter(): MePresenter {
        return MePresenter()
    }

    override fun getContentViewId(): Int {
        return R.layout.fragment_me
    }
}