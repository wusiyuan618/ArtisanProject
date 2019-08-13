package com.hjl.artisan.login.view


import android.Manifest
import android.content.Context
import com.hjl.artisan.login.presenter.LoginPresenter
import com.wusy.wusylibrary.base.BaseMVPActivity
import com.wusy.wusylibrary.util.permissions.PermissionsManager
import com.wusy.wusylibrary.util.permissions.PermissionsResultAction
import kotlinx.android.synthetic.main.activity_login.*

import cc.fussen.cache.Cache
import com.hjl.artisan.R
import com.hjl.artisan.login.bean.LoginBean
import com.hjl.artisan.main.view.MainView
import com.wusy.wusylibrary.util.CommonUtil


class LoginView : BaseMVPActivity<ILoginView, LoginPresenter>(), ILoginView {
    override fun hideLoading() {
        hideLoadImage()
    }

    override fun toast(msg:String) {
        showToast(msg)
    }

    override fun getContentViewId(): Int {
        return R.layout.activity_login
    }

    override fun findView() {

    }

    override fun init() {
        requestPermissions()
        titleView.setTitle("登录")
            .build()
        directLogin()
        btn_login.setOnClickListener {
            login()
        }
    }


    override fun toMain(bean: LoginBean) {
        navigateTo(MainView::class.java)
        finish()
    }

    override fun clearPassword() {
        ed_passWord.setText("")

    }

    override fun saveLoginInfo(bean: LoginBean) {
        bean.data!!.user!!.password=ed_passWord.text.toString()
        Cache.with(this)
            .path(cacheDir.path)
            .saveCache("LoginBean", bean)
    }

    override fun directLogin() {
        val loginBean = Cache.with(this)
            .path(cacheDir.path)
            .getCache("LoginBean", LoginBean::class.java)
        if(!CommonUtil.isNull(loginBean)) {
            ed_userName.setText(loginBean.data!!.user!!.phoneNumber)
            ed_passWord.setText(loginBean.data!!.user!!.password)
        }
        login()
    }
    private fun login(){
        var map=HashMap<String,String>()
        if(ed_userName.text.toString()==""){
            showToast("请输入用户名")
            return
        }
        if(ed_passWord.text.toString()==""){
            showToast("请输入密码")
            return
        }
        showLoadImage()

        map["userName"] = ed_userName.text.toString()
        map["passWord"] = ed_passWord.text.toString()
        mPresenter.login(map)
    }
    override fun createPresenter(): LoginPresenter {
        return LoginPresenter()
    }


    override fun getmContext(): Context {
        return this
    }


    override fun onRequestPermissionsResult(
        permsRequestCode: Int,
        permissions: Array<String>, grantResults: IntArray) {
        PermissionsManager.getInstance().notifyPermissionsChange(permissions, grantResults)
    }

    private fun requestPermissions() {
        if (!//写入权限
            //电话拨打权限
            PermissionsManager.getInstance().hasAllPermissions(
                this,
                arrayOf(
                    Manifest.permission.WRITE_EXTERNAL_STORAGE,
                    Manifest.permission.CALL_PHONE,
                    Manifest.permission.READ_PHONE_STATE,
                    Manifest.permission.READ_EXTERNAL_STORAGE,
                    Manifest.permission.ACCESS_FINE_LOCATION
                )
            )
        )
        ;
        PermissionsManager.getInstance().requestPermissionsIfNecessaryForResult(this,
            arrayOf(
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.CALL_PHONE,
                Manifest.permission.READ_PHONE_STATE,
                Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.ACCESS_FINE_LOCATION
            ), object :
                PermissionsResultAction() {

                override fun onGranted() {
                    // TODO Auto-generated method stub
                    showLogInfo("权限添加成功")

                }

                override fun onDenied(permission: String) {
                    // TODO Auto-generated method stub
                    showLogError("用户拒绝添加权限---$permission")
                }
            })
    }
}
