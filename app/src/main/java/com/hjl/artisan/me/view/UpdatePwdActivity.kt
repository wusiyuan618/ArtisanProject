package com.hjl.artisan.me.view

import android.util.Log
import android.view.View
import cc.fussen.cache.Cache
import com.gohome.pad.data.net.http.UrlForOkhttp
import com.hjl.artisan.R
import com.hjl.artisan.login.bean.LoginBean
import com.wusy.wusylibrary.base.BaseActivity
import com.wusy.wusylibrary.util.CommonUtil
import com.wusy.wusylibrary.util.OkHttpUtil
import kotlinx.android.synthetic.main.activity_updatepwd.*
import okhttp3.Call
import okhttp3.Response
import org.json.JSONObject
import java.io.IOException

class UpdatePwdActivity : BaseActivity() {
    override fun getContentViewId(): Int {
        return R.layout.activity_updatepwd
    }

    override fun findView() {

    }

    override fun init() {
        val loginBean = Cache.with(this)
            .path(cacheDir.path)
            .getCache("LoginBean", LoginBean::class.java)
        titleView.setTitle("修改密码")
            .showBackButton(true, this)
            .showOKButton("确定", true) {
                if (CommonUtil.isNull(edOldPwd.text.toString())) {
                    showToast("请输入旧密码")
                    return@showOKButton
                }
                if (CommonUtil.isNull(edNewPwd.text.toString())) {
                    showToast("请输入新密码")
                    return@showOKButton
                }
                if (CommonUtil.isNull(edNewPwdSure.text.toString())) {
                    showToast("请确认新密码")
                    return@showOKButton
                }
                if (edOldPwd.text.toString() != loginBean.data!!.user!!.password) {
                    showToast("旧密码输入错误")
                    return@showOKButton
                }
                if (edOldPwd.text.toString() == edNewPwd.text.toString()) {
                    showToast("新旧密码不能完全一致")
                    return@showOKButton
                }
                if (edNewPwd.text.toString() != edNewPwdSure.text.toString()) {
                    showToast("两次新密码输入不一致")
                    return@showOKButton
                }
                OkHttpUtil.getInstance().asynGet(UrlForOkhttp.requestUpdatePwd(
                    loginBean.data!!.user!!.id!!
                    , CommonUtil.strForMD5(edOldPwd.text.toString()), CommonUtil.strForMD5(edNewPwd.text.toString())
                )
                    , object : OkHttpUtil.ResultCallBack {
                        override fun successListener(call: Call?, response: Response?) {
                            var json = response!!.body()!!.string()
                            var jo = JSONObject(json)
                            runOnUiThread {
                                showToast(jo.getString("msg"))
                                if (jo.getString("status") == "0") {
                                    finish()
                                }
                            }

                        }

                        override fun failListener(call: Call?, e: IOException?, message: String?) {
                            runOnUiThread {
                                showToast("$message\t密码修改失败")
                            }
                        }
                    })
            }
            .build()
    }
}
