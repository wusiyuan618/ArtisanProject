package com.hjl.artisan.home.view

import android.content.Context
import android.view.View
import com.hjl.artisan.R
import com.hjl.artisan.home.presenter.HomePresenter
import com.wusy.wusylibrary.base.BaseMVPFragment

class HomeView : BaseMVPFragment<IHomeView,HomePresenter>(),IHomeView{
    override fun init() {

    }

    override fun createPresenter(): HomePresenter {
       return HomePresenter()
    }

    override fun getContentViewId(): Int {
        return R.layout.fragment_home
    }

    override fun findView(view: View?) {
    }

    override fun getmContext(): Context {
        return context!!
    }


}