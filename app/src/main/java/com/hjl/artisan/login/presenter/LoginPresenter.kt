package com.hjl.artisan.login.presenter

import com.hjl.artisan.login.modle.ILoginModel
import com.hjl.artisan.login.modle.LoginModel
import com.hjl.artisan.login.view.ILoginView
import com.wusy.wusylibrary.base.BaseMVPPresenter
import com.wusy.wusylibrary.base.IBaseMVPModel
import com.wusy.wusylibrary.base.IBaseMVPView

import java.util.HashMap

class LoginPresenter: BaseMVPPresenter<ILoginView>(), ILoginPresenter {
    private val model: ILoginModel
    private val handler: LoginHandler = LoginHandler(this)

    init {
        model = LoginModel(handler)
    }

    override fun login(maps: HashMap<String, String>) {
        model.requestLogin(maps)
    }

    override fun getMVPView(): IBaseMVPView? {
        return view
    }

    override fun getModel(): IBaseMVPModel? {
        return model
    }
}
