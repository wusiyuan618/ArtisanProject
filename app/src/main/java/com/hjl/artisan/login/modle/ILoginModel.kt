package com.hjl.artisan.login.modle


import com.wusy.wusylibrary.base.IBaseMVPModel

import java.util.HashMap

/**
 * Created by XIAO RONG on 2018/5/30.
 */

interface ILoginModel : IBaseMVPModel{
    /**
     * 请求登陆
     * @param maps
     */
    fun requestLogin(maps: HashMap<String, String>)
}
