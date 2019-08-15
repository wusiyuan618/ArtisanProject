package com.hjl.artisan.tool.view

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.view.View
import cc.fussen.cache.Cache
import com.hjl.artisan.R
import com.hjl.artisan.login.bean.LoginBean
import com.hjl.artisan.tool.bean.AdvertisementBean
import com.hjl.artisan.tool.presenter.ToolPresenter
import com.hjl.artisan.web.WebViewActivity
import com.wusy.wusylibrary.base.BaseMVPFragment
import com.wusy.wusylibrary.util.CommonUtil
import com.wusy.wusylibrary.view.CarouselView
import com.wusy.wusylibrary.view.TitleView
import com.wusy.wusylibrary.view.moduleComponents.ModuleView

class ToolView :BaseMVPFragment<IToolView,ToolPresenter>(),IToolView{
    override fun initCarousel(list:ArrayList<CarouselView.CarouselBean>) {
        carouselView.init(list,CarouselView.ANIM_LEFTLEAVE)
        carouselView.setOnImageClickListener {
            if(it.data!=null){
                var intent=Intent(context,WebViewActivity::class.java)
                var url=(it.data as com.hjl.artisan.tool.bean.AdvertisementBean.DataBean).url
                intent.putExtra("url",url)
                if(!CommonUtil.isNull(url)) startActivity(intent)
                else showToast("没有更多内容了")
            }else showToast("没有更多内容了")
        }
    }

    lateinit var titleView:TitleView
    lateinit var projectPlan: ModuleView
    lateinit var qualityInspection: ModuleView
    lateinit var materialManagement: ModuleView
    lateinit var carouselView:CarouselView

    override fun init() {
        titleView.setTitle("工具")
            .build()
        mPresenter.getAdvertisement()
        val loginBean = Cache.with(this)
            .path(activity!!.cacheDir.path)
            .getCache("LoginBean", LoginBean::class.java)
        if(!CommonUtil.isNull(loginBean)) {
//            projectPlan.setTitle("项目计划",Color.BLACK)
//                .showRecycelerView(context,mPresenter.getProjectPlanBtn(loginBean))
            qualityInspection.setTitle("质量检测",Color.BLACK)
                .showRecycelerView(context,mPresenter.getQualityInspection(loginBean))
//            materialManagement.setTitle("材料管理",Color.BLACK)
//                .showRecycelerView(context,mPresenter.getMaterialManagement(loginBean))
        }
    }

    override fun createPresenter(): ToolPresenter {
        return ToolPresenter()
    }

    override fun getContentViewId(): Int {
        return R.layout.fragment_tool
    }

    override fun findView(view: View?) {
        if(view!=null){
            titleView=view.findViewById(R.id.titleView)
            carouselView=view.findViewById(R.id.carouselView)
            projectPlan=view.findViewById(R.id.projectPlan)
            qualityInspection=view.findViewById(R.id.qualityInspection)
            materialManagement=view.findViewById(R.id.materialManagement)
        }
    }

    override fun getmContext(): Context? {
        return context
    }
}