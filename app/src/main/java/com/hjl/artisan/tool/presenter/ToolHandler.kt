package com.hjl.artisan.tool.presenter

import android.os.Handler
import android.os.Message
import com.gohome.pad.data.net.http.UrlForOkhttp
import com.hjl.artisan.app.Contants
import com.hjl.artisan.tool.bean.ActualMeasurement.AdvertisementBean
import com.wusy.wusylibrary.view.CarouselView
import java.lang.ref.WeakReference

class ToolHandler(presenter:ToolPresenter) :Handler() {
    private val mPresenterReference: WeakReference<ToolPresenter> = WeakReference(presenter)

    override fun handleMessage(msg: Message) {
        super.handleMessage(msg)
        val presenter = mPresenterReference.get()
        if (presenter != null) {
            when(msg.what){
                Contants.OKHTTP_REQUEST_SUCCESS->{
                    var bean = msg.obj as AdvertisementBean
                    var list=ArrayList<CarouselView.CarouselBean>()
                    for (item in bean.data!!){
                        var cb=CarouselView.CarouselBean(UrlForOkhttp.getImageURL(item.filePath!!))
                        cb.data=item
                        list.add(cb)
                    }
                    list.add(CarouselView.CarouselBean("http://pic25.nipic.com/20121112/9252150_150552938000_2.jpg"))
                    list.add(CarouselView.CarouselBean("http://pic51.nipic.com/file/20141025/8649940_220505558734_2.jpg"))
                    list.add(CarouselView.CarouselBean("http://pic25.nipic.com/20121112/9252150_150552938000_2.jpg"))
                    list.add(CarouselView.CarouselBean("http://pic51.nipic.com/file/20141025/8649940_220505558734_2.jpg"))
                    presenter.view.initCarousel(list)
                }
                Contants.OKHTTP_REQUEST_ERROR->{

                }
            }
        }
    }
}