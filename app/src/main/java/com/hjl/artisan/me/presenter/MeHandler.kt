package com.hjl.artisan.me.presenter

import android.os.Handler
import android.os.Message
import java.lang.ref.WeakReference

class MeHandler(presenter: MePresenter) :Handler(){
    private val mPresenterReference: WeakReference<MePresenter> = WeakReference(presenter)

    override fun handleMessage(msg: Message) {
        super.handleMessage(msg)
        val presenter = mPresenterReference.get()
        if (presenter != null) {

        }
    }
}
