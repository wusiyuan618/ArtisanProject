package com.hjl.artisan.main.modle

import android.content.Context
import com.wusy.wusylibrary.view.bottomSelect.BottomSelectBean

class MainModel : IMainModel {
    override fun getMainData(): List<BottomSelectBean> {
        return MainDataUtil.getInstance().bottomSelectData
    }

}
