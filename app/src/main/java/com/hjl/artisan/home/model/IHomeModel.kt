package com.hjl.artisan.home.model

import com.wusy.wusylibrary.base.IBaseMVPModel

interface IHomeModel : IBaseMVPModel{
    /**
     * 考勤汇总首页
     */
    fun getProgramAttendanceSummaryIndexTop(employeeId:String,employeeType:String,comId:String,programId:String)
    /**
     * 获取实测实量报告预警数量
     */
    fun getActualMeasurementsReportCount(employeeId:String,employeeType:String,comId:String,programId:String)
    /**
     * 获取巡检报告预警数量
     */
    fun getInspectionReportCount(employeeId:String,employeeType:String,comId:String,programId:String)
}