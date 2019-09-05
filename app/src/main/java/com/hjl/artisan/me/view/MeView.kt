package com.hjl.artisan.me.view

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Bitmap
import android.os.Handler
import android.os.Message
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
import com.hjl.artisan.me.bean.MessageCountBean
import com.hjl.artisan.me.modle.MessageModel
import com.hjl.artisan.me.presenter.MePresenter
import com.hjl.artisan.me.view.message.MessageActivity
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
    private lateinit var rlMsg:RelativeLayout
    private lateinit var tvMsgCount:TextView
    override fun findView(view: View?) {
        imgUser=view!!.findViewById(R.id.userImg)
        tvUser= view.findViewById(R.id.userName)
        rlUpdatePwd= view.findViewById(R.id.rlUpdatePwd)
        rlLoginOut=view.findViewById(R.id.rlLoginOut)
        titleView=view.findViewById(R.id.titleView)
        rlMsg=view.findViewById(R.id.rlMsg)
        tvMsgCount=view.findViewById(R.id.tvMsgCount)
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
        tvUser.text= loginBean.data?.list!![0].employee?.userName?:""
        val options = DisplayImageOptions.Builder()
            .showImageOnLoading(R.mipmap.logo)
            .showImageOnFail(R.mipmap.logo)
            .cacheInMemory(true)
            .cacheOnDisk(true)
            .bitmapConfig(Bitmap.Config.RGB_565)
            .build()
        ImageLoaderUtil.getInstance(context).loadingImage(UrlForOkhttp.getImageURL(loginBean.data?.list!![0].employee?.headPortrait?:""),imgUser,options)
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
        rlMsg.setOnClickListener {
            navigateTo(MessageActivity::class.java)
        }
    }

    override fun onResume() {
        super.onResume()
        MessageModel().getNewMessageCount(handler, loginBean.data?.list!![0].employee?.id?:"",loginBean.data?.list!![0].employee?.comId?:"")
    }
    override fun createPresenter(): MePresenter {
        return MePresenter()
    }

    override fun getContentViewId(): Int {
        return R.layout.fragment_me
    }
    var handler= @SuppressLint("HandlerLeak")
    object:Handler(){
        override fun handleMessage(msg: Message?) {
            super.handleMessage(msg)
            when(msg?.what?:Contants.OKHTTP_REQUEST_ERROR){
                Contants.OKHTTP_REQUEST_ERROR->{

                }
                Contants.OKHTTP_REQUEST_SUCCESS->{
                    var bean=msg?.obj as MessageCountBean
                    var countDeal=(bean.data?.applyDealCount?:0)+(bean.data?.exceptionDealCount?:0)
                    var countRead=(bean.data?.applyCount?:0)+(bean.data?.exceptionCount?:0)+(bean.data?.notSignCount?:0)
                    tvMsgCount.text=""
                    if(countRead!=0){
                        tvMsgCount.visibility=View.VISIBLE
                        tvMsgCount.text="(未读${countRead}条) "
                    }
                    if(countDeal!=0){
                        tvMsgCount.visibility=View.VISIBLE
                        tvMsgCount.text=tvMsgCount.text.toString()+"(待处理${countDeal}条) "
                    }
                    if(countRead==0&&countDeal==0){
                        tvMsgCount.visibility=View.GONE
                    }
                }
            }
        }
    }
}