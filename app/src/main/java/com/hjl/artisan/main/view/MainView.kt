package com.hjl.artisan.main.view

import android.content.Context
import android.util.Log
import com.hjl.artisan.R
import com.hjl.artisan.main.presenter.MainPresenter
import com.wusy.wusylibrary.base.BaseMVPActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainView : BaseMVPActivity<IMainView, MainPresenter>(), IMainView {
    override fun createPresenter(): MainPresenter? {
        return MainPresenter()
    }

    override fun getContentViewId(): Int {
        return R.layout.activity_main
    }

    override fun findView() {

    }

    override fun init() {
        bottomSelectView.createLayout(
            this,
            mPresenter.getBottomSelectData(),
            supportFragmentManager,
            R.id.fragmentView
        )
    }

    override fun getmContext(): Context? {
        return this
    }


}
