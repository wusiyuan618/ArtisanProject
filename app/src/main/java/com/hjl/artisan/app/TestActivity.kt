package com.hjl.artisan.app

import android.graphics.Color
import android.support.v7.widget.LinearLayoutManager
import android.view.ViewGroup
import com.hjl.artisan.R
import com.hjl.artisan.tool.presenter.ActualMeasurement.EdModelAdapter
import com.wusy.wusylibrary.base.BaseActivity
import com.wusy.wusylibrary.view.FullyLinearLayoutManager
import com.wusy.wusylibrary.view.moduleComponents.ModuleView
import com.wusy.wusylibrary.view.moduleComponents.ModuleViewBean
import kotlinx.android.synthetic.main.activity_actualmeasurement_end.*

class TestActivity : BaseActivity() {
    override fun getContentViewId(): Int {
        return R.layout.activity_actualmeasurement_end
    }

    override fun findView() {

    }

    override fun init() {
        var modelView = ModuleView(this)
        var params_modelView =
            ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        llModelView.addView(modelView, params_modelView)
        var list = ArrayList<ModuleViewBean>()
        for (item in 0 until 12 ) {
            var bean = ModuleViewBean(0, "$item(mm)", null)
            list.add(bean)
        }
        modelView.setTitle("卧室", Color.BLACK)
            .isShowTitle(true)
            .showRecycelerView(
                this, list,
                EdModelAdapter(this), FullyLinearLayoutManager(this)
            )
    }
}
