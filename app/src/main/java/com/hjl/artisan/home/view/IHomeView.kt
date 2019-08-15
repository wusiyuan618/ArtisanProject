package com.hjl.artisan.home.view

import com.hjl.artisan.home.bean.ActualMeasurementsReportCountBean
import com.hjl.artisan.home.bean.InspectionReportCountBean
import com.hjl.artisan.home.bean.ProgramAttendanceSummaryBean
import com.wusy.wusylibrary.base.IBaseMVPView

interface IHomeView : IBaseMVPView {
    fun toast(msg:String)

    fun showView(bean:ActualMeasurementsReportCountBean)
    fun showView(bean:InspectionReportCountBean)
    fun showView(bean:ProgramAttendanceSummaryBean)

    fun hideLoading()

}