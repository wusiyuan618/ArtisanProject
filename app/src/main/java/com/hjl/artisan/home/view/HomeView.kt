package com.hjl.artisan.home.view

import android.content.Context
import android.view.View
import cc.fussen.cache.Cache
import com.hjl.artisan.R
import com.hjl.artisan.home.bean.ActualMeasurementsReportCountBean
import com.hjl.artisan.home.bean.InspectionReportCountBean
import com.hjl.artisan.home.bean.ProgramAttendanceSummaryBean
import com.hjl.artisan.home.presenter.HomePresenter
import com.hjl.artisan.login.bean.LoginBean
import com.wusy.wusylibrary.base.BaseMVPFragment
import com.wusy.wusylibrary.util.CommonUtil
import com.wusy.wusylibrary.view.TitleView
import kotlinx.android.synthetic.main.fragment_home.*

class HomeView : BaseMVPFragment<IHomeView,HomePresenter>(),IHomeView{
    lateinit var titleView:TitleView
    override fun hideLoading() {
        hideLoadImage()
    }

    override fun showView(bean: ActualMeasurementsReportCountBean) {
        scslRedCount.text=bean.data.seriousWarningCounts.toString()
        scslYellowCount.text=bean.data.warningCounts.toString()
        scslLL.setOnClickListener {

        }
    }

    override fun showView(bean: InspectionReportCountBean) {
        xcbRedCount.text=bean.data.seriousWarningCounts.toString()
        xcbYellowCount.text=bean.data.warningCounts.toString()
        xcbLL.setOnClickListener {

        }
    }

    override fun showView(bean: ProgramAttendanceSummaryBean) {
        allLabourer.text="在册工匠数："+bean.data.labourerRegistCount+"人"
        allGroup.text="在册班组:："+bean.data.gangerRegistCount+"组"
        allProject.text="在册项目:："+bean.data.programRegistCount+"个"
        AttendanceCount.text=bean.data.todaySign.toString()
        plan.text="计划:"+bean.data.todayPlanLabourerCount.toString()
        group.text="班组:"+bean.data.todaySignGanger.toString()+"组"
        project.text="项目:"+bean.data.todaySignProgram.toString()+"/"+bean.data.todayAllProgram
        AttendanceImage.setOnClickListener {

        }
    }

    override fun toast(msg: String) {
        showToast(msg)
    }

    override fun init() {
        val loginBean = Cache.with(this)
            .path(activity!!.cacheDir.path)
            .getCache("LoginBean", LoginBean::class.java)
        if(!CommonUtil.isNull(loginBean)) {
            titleView.setTitle(loginBean.data!!.list!![0].company!!.communityName).build()
            showLoadImage()
            mPresenter.getActualMeasurementsReportCount(loginBean.data!!.list!![0].employee!!.id.toString(),
                loginBean.data!!.list!![0].employee!!.employeeType.toString(),
                loginBean.data!!.list!![0].employee!!.comId.toString(),"")
            mPresenter.getInspectionReportCount(loginBean.data!!.list!![0].employee!!.id.toString(),
                loginBean.data!!.list!![0].employee!!.employeeType.toString(),
                loginBean.data!!.list!![0].employee!!.comId.toString(),"")
            mPresenter.getProgramAttendanceSummaryIndexTop(loginBean.data!!.list!![0].employee!!.id.toString(),
                loginBean.data!!.list!![0].employee!!.employeeType.toString(),
                loginBean.data!!.list!![0].employee!!.comId.toString(),"")
        }
    }

    override fun createPresenter(): HomePresenter {
       return HomePresenter()
    }

    override fun getContentViewId(): Int {
        return R.layout.fragment_home
    }

    override fun findView(view: View?) {
        titleView=view!!.findViewById(R.id.titleView)
    }

    override fun getmContext(): Context {
        return context!!
    }


}