package com.gohome.pad.data.net.http

import com.hjl.artisan.BuildConfig
import com.wusy.wusylibrary.util.CommonUtil

object UrlForOkhttp {
        var baseUrl= BuildConfig.HJL_BASE_URL
    var comParam:String="&poatform=Android"
    /**
     *  登录
     */
    fun requestLoginUrl(username:String,password:String):String{
        return "${baseUrl}cgProgramApi/user/loginMiniProgram?proprietorKey=$username&pwd=$password$comParam"
    }
    /**
     * 返回图片url
     */
    fun getImageURL(path:String):String{
        return BuildConfig.HJL_BASE_IMG_URL+path
    }
    /**
     * -------------------------------------------------
     *                       首页
     * --------------------------------------------------
     */
    /**
     * 考勤汇总首页
     */
    fun getProgramAttendanceSummaryIndexTop(employeeId:String,employeeType:String,comId:String,programId:String):String{
        return "${baseUrl}cgProgramApi/worktimeStatistic/getProgramAttendanceSummaryIndexTop?" +
                "employeeId=$employeeId&employeeType=$employeeType&comId=$comId&programId=$programId$comParam"
    }
    /**
     * 获取实测实量报告预警数量
     */
    fun getActualMeasurementsReportCount(employeeId:String,employeeType:String,comId:String,programId:String):String{
        return "${baseUrl}cgProgramApi/actualMeasurementsReport/getCountGroupByLevel?" +
                "employeeId=$employeeId&employeeType=$employeeType&comId=$comId&programId=$programId$comParam"
    }
    /**
     * 获取巡检报告预警数量
     */
    fun getInspectionReportCount(employeeId:String,employeeType:String,comId:String,programId:String):String{
        return "${baseUrl}cgProgramApi/inspectionReport/getCountGroupByLevel?" +
                "employeeId=$employeeId&employeeType=$employeeType&comId=$comId&programId=$programId$comParam"
    }
    /**
     * -------------------------------------------------
     *                       工具
     * --------------------------------------------------
     */
    /**
     * 获取广告列表
     */
    fun getAdvertisement():String{
        return "${baseUrl}cgProgramApi/advertisement/getList?$comParam"
    }
    /**
     * ------------------------------
     *           实测实量
     * ------------------------------
     */
    /**
     * 获取项目列表GET
     */
    fun getActualMeasurementsProgramList(pageIndex:Int,pageSize:Int,queryCount:Boolean,comId:String,
                                         employeeId:String,locationName:String,programName:String):String{
        var locationNameStr=if(CommonUtil.isNull(locationName)) "" else "&locationName=$locationName"
        var programNameStr=if(CommonUtil.isNull(programName)) "" else "&programName=$programName"

        return "${baseUrl}cgProgramApi/actualMeasurements/getProgramPage?" +
                "pageIndex=$pageIndex&pageSize=$pageSize&queryCount=$queryCount&comId=$comId" +
                "&employeeId=$employeeId$locationNameStr$programNameStr$comParam"
    }
    /**
     *  获取区域信息
     */
    fun getActualMeasurementAreaList(employeeId:String,employeeType:String,comId:String):String{
        return "${baseUrl}cgProgramApi/actualMeasurements/getProgramLocationList?" +
                "employeeId=$employeeId&employeeType=$employeeType&comId=$comId$comParam"
    }

}
