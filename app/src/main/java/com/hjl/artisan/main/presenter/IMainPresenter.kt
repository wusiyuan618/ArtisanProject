package com.hjl.artisan.main.presenter

import com.wusy.wusylibrary.base.IBaseMVPPresenter
import com.wusy.wusylibrary.view.bottomSelect.BottomSelectBean

interface IMainPresenter : IBaseMVPPresenter{
    fun getBottomSelectData():List<BottomSelectBean>
}
