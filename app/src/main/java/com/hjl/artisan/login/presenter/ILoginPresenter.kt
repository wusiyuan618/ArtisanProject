package com.hjl.artisan.login.presenter

import com.wusy.wusylibrary.base.IBaseMVPPresenter

import java.util.HashMap

/**
 * Created by XIAO RONG on 2018/5/30.
 */

interface ILoginPresenter : IBaseMVPPresenter {
    /**
     * 登陆业务
     */
    fun login(maps: HashMap<String, String>)
}
