package com.hjl.artisan.me.view

import android.content.Context
import android.graphics.Bitmap
import android.support.v7.app.AlertDialog
import android.view.View
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import cc.fussen.cache.Cache
import com.gohome.pad.data.net.http.UrlForOkhttp
import com.hjl.artisan.R
import com.hjl.artisan.app.Contants
import com.hjl.artisan.login.bean.LoginBean
import com.hjl.artisan.login.view.LoginView
import com.hjl.artisan.me.presenter.MePresenter
import com.nostra13.universalimageloader.core.DisplayImageOptions
import com.wusy.wusylibrary.base.BaseMVPFragment
import com.wusy.wusylibrary.util.ImageLoaderUtil
import com.wusy.wusylibrary.view.TitleView

class MeView : BaseMVPFragment<IMeView, MePresenter>(), IMeView{
    lateinit var loginBean:LoginBean
    private lateinit var titleView:TitleView
    private lateinit var imgUser:ImageView
    private lateinit var tvUser:TextView
    private lateinit var rlUpdatePwd:RelativeLayout
    private lateinit var rlLoginOut:RelativeLayout
    override fun findView(view: View?) {
        imgUser=view!!.findViewById(R.id.userImg)
        tvUser= view.findViewById(R.id.userName)
        rlUpdatePwd= view.findViewById(R.id.rlUpdatePwd)
        rlLoginOut=view.findViewById(R.id.rlLoginOut)
        titleView=view.findViewById(R.id.titleView)

    }

    override fun getmContext(): Context? {
        return context
    }


    override fun init() {
        titleView.setTitle("个人中心")
            .build()
        loginBean = Cache.with(this)
            .path(activity!!.cacheDir.path)
            .getCache("LoginBean", LoginBean::class.java)
        tvUser.text= loginBean.data!!.list!![0].employee!!.userName
        val options = DisplayImageOptions.Builder()
            .showImageOnLoading(R.mipmap.logo)
            .showImageOnFail(R.mipmap.logo)
            .cacheInMemory(true)
            .cacheOnDisk(true)
            .bitmapConfig(Bitmap.Config.RGB_565)
            .build()
        ImageLoaderUtil.getInstance(context).loadingImage(UrlForOkhttp.getImageURL(loginBean.data!!.list!![0].employee!!.headPortrait),imgUser)
        rlLoginOut.setOnClickListener {
            var dialog: AlertDialog = AlertDialog.Builder(context!!)
                .setMessage("确定要退出登录吗")
                .setNegativeButton("确定") { dialog, _ ->
                    Cache.with(this)
                        .path(activity!!.cacheDir.path)
                        .remove("LoginBean")
                    navigateTo(LoginView::class.java)
                    dialog.dismiss()
                    activity!!.finish()
                }
                .setPositiveButton("取消") { dialog, _ ->
                    dialog.dismiss()
                }
                .create()
            dialog.show()

        }
        rlUpdatePwd.setOnClickListener {
            navigateTo(UpdatePwdActivity::class.java)
        }
    }

    override fun createPresenter(): MePresenter {
        return MePresenter()
    }

    override fun getContentViewId(): Int {
        return R.layout.fragment_me
    }
}