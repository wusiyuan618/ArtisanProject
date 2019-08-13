package com.hjl.artisan.login.view

import com.hjl.artisan.login.bean.LoginBean
import com.wusy.wusylibrary.base.IBaseMVPView

/**
 * Created by XIAO RONG on 2018/5/30.
 */

interface ILoginView : IBaseMVPView {
    /**
     * 跳转主界面
     * @param bean 登陆数据Bean
     */
    fun toMain(bean: LoginBean)

    /**
     * 清空密码
     */
    fun clearPassword()

    /**
     * 保存登陆信息
     */
    fun saveLoginInfo(bean: LoginBean)

    /**
     * 直接登录
     */
    fun directLogin()
    /**
     * 显示Toast
     */
    fun toast(msg:String)
    /**
     * 隐藏等待动画
     */
    fun hideLoading()
}
