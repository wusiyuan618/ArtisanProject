package com.hjl.artisan.main.view

import android.content.Context
import android.util.Log
import com.hjl.artisan.R
import com.hjl.artisan.main.presenter.MainPresenter
import com.wusy.wusylibrary.base.BaseMVPActivity
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.graphics.Color
import java.util.*


class MainView : BaseMVPActivity<IMainView, MainPresenter>(), IMainView {
    private var isExit = false
    private var timerTask: TimerTask? = null
    private var timer: Timer? = null
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
        bottomSelectView.setBackgroundColor(Color.WHITE)
        timer = Timer()//用于退出键监听的二次点击退出功能

    }

    override fun getmContext(): Context? {
        return this
    }
    /**
     * 退出事件监听
     */
    override fun onBackPressed() {
        if (isExit) {
            val home = Intent(Intent.ACTION_MAIN)
            home.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            home.addCategory(Intent.CATEGORY_HOME)
            startActivity(home)
        } else {
            isExit = true
            showToast("再按一次进入后台运行")
            timerTask = object : TimerTask() {
                override fun run() {
                    isExit = false
                }
            }
            timer?.schedule(timerTask, 2000)
        }
    }

}
