package com.hjl.artisan.main.modle

import com.wusy.wusylibrary.base.IBaseMVPModel
import com.wusy.wusylibrary.view.bottomSelect.BottomSelectBean


interface IMainModel : IBaseMVPModel{
    fun getMainData(): List<BottomSelectBean>
}
