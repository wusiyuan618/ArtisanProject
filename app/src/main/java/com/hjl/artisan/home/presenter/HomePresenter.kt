package com.hjl.artisan.home.presenter

import com.hjl.artisan.home.model.HomeModel
import com.hjl.artisan.home.view.IHomeView
import com.wusy.wusylibrary.base.BaseMVPPresenter
import com.wusy.wusylibrary.base.IBaseMVPModel
import com.wusy.wusylibrary.base.IBaseMVPView

class HomePresenter :BaseMVPPresenter<IHomeView>(),IHomePresenter {
    override fun getActualMeasurementsReportCount(employeeId:String,employeeType:String,comId:String,programId:String) {
        model.getActualMeasurementsReportCount(employeeId,employeeType,comId,programId)
    }

    override fun getInspectionReportCount(employeeId:String,employeeType:String,comId:String,programId:String) {
        model.getInspectionReportCount(employeeId,employeeType,comId,programId)
    }

    override fun getProgramAttendanceSummaryIndexTop(employeeId:String,employeeType:String,comId:String,programId:String) {
        model.getProgramAttendanceSummaryIndexTop(employeeId,employeeType,comId,programId)
    }

    private val handler=HomeHandler(this)
    private val model:HomeModel
    init {
        model=HomeModel(handler)
    }
    override fun getMVPView(): IBaseMVPView {
        return view
    }

    override fun getModel(): IBaseMVPModel {
        return this.model
    }
}