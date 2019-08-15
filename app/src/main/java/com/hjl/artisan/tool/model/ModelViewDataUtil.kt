package com.hjl.artisan.tool.model

import com.hjl.artisan.R
import com.hjl.artisan.tool.view.ActualMeasurementSelectProView
import com.wusy.wusylibrary.view.moduleComponents.ModuleViewBean

object ModelViewDataUtil {
    fun initProjectPlanData():ArrayList<ModuleViewBean>{
        var list=ArrayList<ModuleViewBean>()
        return list
    }
    fun initQualityInspection():ArrayList<ModuleViewBean>{
        var list=ArrayList<ModuleViewBean>()

        var zlxj=ModuleViewBean(R.mipmap.icon_quality_tool,"质量巡检",null)
        zlxj.index="INSPECTION_ENTRY"
        list.add(zlxj)

        var scsl=ModuleViewBean(R.mipmap.icon_spotcheck_tool,"实测实量",ActualMeasurementSelectProView::class.java)
        scsl.index="SPOTCHECK_ENTRY"
        list.add(scsl)

        return list
    }
    fun initMaterialManagement():ArrayList<ModuleViewBean>{
        var list=ArrayList<ModuleViewBean>()
        return list
    }
}