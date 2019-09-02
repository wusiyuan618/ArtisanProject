package com.hjl.artisan.me.view

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Handler
import android.os.Message
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import cc.fussen.cache.Cache
import com.hjl.artisan.R
import com.hjl.artisan.app.Contants
import com.hjl.artisan.login.bean.LoginBean
import com.hjl.artisan.me.bean.MessageBean
import com.hjl.artisan.me.bean.MessageCountBean
import com.hjl.artisan.me.modle.MessageModel
import com.hjl.artisan.me.presenter.MessageAdapter
import com.wusy.wusylibrary.base.BaseActivity
import com.wusy.wusylibrary.base.BaseRecyclerAdapter
import kotlinx.android.synthetic.main.activity_msg.*

class MessageActivity :BaseActivity(){
    lateinit var adapter:MessageAdapter
    lateinit var model:MessageModel
    lateinit var loginBean:LoginBean
    override fun findView() {
    }

    override fun init() {
        titleView.setTitle("消息")
            .showBackButton(true,this)
            .build()
        model= MessageModel()
        adapter=MessageAdapter(this)
        adapter.setOnRecyclerItemClickLitener(object:BaseRecyclerAdapter.onRecyclerItemClickLitener{
            override fun onRecyclerItemLongClick(view: RecyclerView.ViewHolder?, position: Int) {
            }

            override fun onRecyclerItemClick(view: RecyclerView.ViewHolder?, position: Int) {
                navigateTo(adapter.list[position].toClass)
            }

        })
        recyclerView.layoutManager= LinearLayoutManager(this) as RecyclerView.LayoutManager?
        recyclerView.adapter=adapter
        loginBean = Cache.with(this)
            .path(cacheDir.path)
            .getCache("LoginBean", LoginBean::class.java)
    }

    override fun getContentViewId(): Int {
        return R.layout.activity_msg
    }

    override fun onResume() {
        super.onResume()
        model.getNewMessageCount(handler, loginBean.data?.list!![0].employee?.id?:"",loginBean.data?.list!![0].employee?.comId?:"")
    }
    var handler= @SuppressLint("HandlerLeak")
    object :Handler(){
        override fun handleMessage(msg: Message?) {
            super.handleMessage(msg)
            when(msg?.what?:Contants.OKHTTP_REQUEST_ERROR){
                Contants.OKHTTP_REQUEST_ERROR->{
                    showToast(msg?.obj  as String)
                }
                Contants.OKHTTP_REQUEST_SUCCESS->{
                    var bean=msg?.obj as MessageCountBean
                    var list=ArrayList<MessageBean>()
                    list.add(MessageBean().apply {
                        this.title="申请"
                        this.icon= R.mipmap.icon_apply
                        this.toClass=MessageApplyActivity::class.java
                        this.waitDealCount=bean.data?.applyDealCount?:0
                        this.notRedCount=bean.data?.applyCount?:0
                    })
                    list.add(MessageBean().apply {
                        this.title="异常考勤"
                        this.icon= R.mipmap.icon_abnormal
                        this.toClass=MessageExceptionActivity::class.java
                        this.waitDealCount=bean.data?.exceptionDealCount?:0
                        this.notRedCount=bean.data?.exceptionCount?:0
                    })
                    list.add(MessageBean().apply {
                        this.title="考勤提醒"
                        this.icon= R.mipmap.icon_remind
                        this.toClass=MessageNotSignActivity::class.java
                        this.waitDealCount=0
                        this.notRedCount=bean.data?.notSignCount?:0
                    })
                    adapter.list=list
                    adapter.notifyDataSetChanged()
                }
            }
        }
    }
}
