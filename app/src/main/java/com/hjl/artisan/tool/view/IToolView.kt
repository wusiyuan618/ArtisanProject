package com.hjl.artisan.tool.view

import com.wusy.wusylibrary.base.IBaseMVPView
import com.wusy.wusylibrary.view.CarouselView

interface IToolView :IBaseMVPView{
    fun initCarousel(list:ArrayList<CarouselView.CarouselBean>)
}
