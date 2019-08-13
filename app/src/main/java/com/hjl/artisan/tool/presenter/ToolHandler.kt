package com.hjl.artisan.tool.presenter

import android.os.Handler
import android.os.Message
import java.lang.ref.WeakReference

class ToolHandler(presenter:ToolPresenter) :Handler() {
    private val mPresenterReference: WeakReference<ToolPresenter> = WeakReference(presenter)

    override fun handleMessage(msg: Message) {
        super.handleMessage(msg)
        val presenter = mPresenterReference.get()
        if (presenter != null) {

        }
    }
}