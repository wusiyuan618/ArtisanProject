package com.hjl.artisan.login.presenter

import android.os.Handler
import android.os.Message
import com.hjl.artisan.app.Contants
import com.hjl.artisan.login.bean.LoginBean

import java.lang.ref.WeakReference

class LoginHandler(presenter: LoginPresenter) : Handler() {
    private val mPresenterReference: WeakReference<LoginPresenter> = WeakReference(presenter)

    override fun handleMessage(msg: Message) {
        super.handleMessage(msg)
        val presenter = mPresenterReference.get()
        if (presenter != null) {
            when(msg.what){
                Contants.OKHTTP_REQUEST_SUCCESS->{
                    var bean:LoginBean= msg.obj as LoginBean
                    presenter.view.saveLoginInfo(bean)
                    presenter.view.toMain(bean)
                }
                Contants.OKHTTP_REQUEST_ERROR->{
                    presenter.view.toast(msg.obj.toString())
                }
            }
            presenter.view.hideLoading()
        }
    }
}
