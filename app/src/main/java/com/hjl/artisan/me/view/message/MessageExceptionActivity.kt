package com.hjl.artisan.me.view.message

import android.annotation.SuppressLint
import android.os.Handler
import android.os.Message
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.LinearLayout
import cc.fussen.cache.Cache
import com.hjl.artisan.R
import com.hjl.artisan.app.Contants
import com.hjl.artisan.login.bean.LoginBean
import com.hjl.artisan.me.bean.MessageExceptionBean
import com.hjl.artisan.me.modle.MessageModel
import com.hjl.artisan.me.presenter.message.MessageExceptionAdapter
import com.wusy.wusylibrary.base.BaseActivity
import kotlinx.android.synthetic.main.activity_msg_apply.*

class MessageExceptionActivity :BaseActivity(){
    lateinit var model: MessageModel
    lateinit var adapter: MessageExceptionAdapter
    var pageIndex=0
    override fun findView() {

    }

    override fun init() {
        model= MessageModel()
        titleView.setTitle("异常考勤")
            .showBackButton(true,this)
            .build()
        val loginBean = Cache.with(this)
            .path(cacheDir.path)
            .getCache("LoginBean", LoginBean::class.java)
        adapter= MessageExceptionAdapter(this)
        recyclerView.layoutManager= LinearLayoutManager(this) as RecyclerView.LayoutManager?
        recyclerView.adapter=adapter
        refreshLayout.setOnRefreshListener {
            pageIndex=0
            adapter.list.clear()
            model.getNewMessageList(handler,loginBean.data?.list!![0].employee?.id?:"",pageIndex, Contants.pageSize,
                loginBean.data?.list!![0].employee?.comId?:"","exception")
        }
        refreshLayout.setOnLoadMoreListener {
            pageIndex++
            model.getNewMessageList(handler,loginBean.data?.list!![0].employee?.id?:"",pageIndex, Contants.pageSize,
                loginBean.data?.list!![0].employee?.comId?:"","exception")
        }
        refreshLayout.autoRefresh()
        adapter.onBtnClickListener=object: MessageExceptionAdapter.OnBtnClickListener{
            override fun clickOk(bean: MessageExceptionBean.DataBean.RowsBean, holder: MessageExceptionViewHolder, llKnow: LinearLayout) {
                llKnow.visibility=View.GONE
                holder.llStatusPass.visibility=View.VISIBLE
                model.requestUpdateDealStatus(handlerRequest,bean.id?:"")
            }
        }
    }

    override fun getContentViewId(): Int {
        return R.layout.activity_msg_apply
    }
    val handler= @SuppressLint("HandlerLeak")
    object: Handler(){
        override fun handleMessage(msg: Message?) {
            super.handleMessage(msg)
            when(msg?.what?:Contants.OKHTTP_REQUEST_ERROR){
                Contants.OKHTTP_REQUEST_ERROR->{
                    showToast(msg?.obj as String)
                }
                Contants.OKHTTP_REQUEST_SUCCESS->{
                    var bean = msg?.obj as MessageExceptionBean
                    adapter.list.addAll(bean.data?.rows?:ArrayList())
                    adapter.notifyDataSetChanged()
                }
            }
            refreshLayout.finishLoadMore()
            refreshLayout.finishRefresh()
        }
    }
    val handlerRequest= @SuppressLint("HandlerLeak")
    object:Handler() {
        override fun handleMessage(msg: Message?) {
            super.handleMessage(msg)
            when (msg?.what ?: Contants.OKHTTP_REQUEST_ERROR) {
                Contants.OKHTTP_REQUEST_ERROR -> {
                    showToast("网络错误")
                }
                Contants.OKHTTP_REQUEST_SUCCESS -> {
//                    showToast("")
                }
            }
        }
    }
}
