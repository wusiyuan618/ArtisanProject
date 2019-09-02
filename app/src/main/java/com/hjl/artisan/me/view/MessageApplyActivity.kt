package com.hjl.artisan.me.view

import android.annotation.SuppressLint
import android.os.Handler
import android.os.Message
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import cc.fussen.cache.Cache
import com.hjl.artisan.R
import com.hjl.artisan.app.Contants
import com.hjl.artisan.login.bean.LoginBean
import com.hjl.artisan.me.bean.MessageApplyBean
import com.hjl.artisan.me.modle.MessageModel
import com.hjl.artisan.me.presenter.MessageApplyAdapter
import com.wusy.wusylibrary.base.BaseActivity
import kotlinx.android.synthetic.main.activity_msg_apply.*

class MessageApplyActivity:BaseActivity(){
    var pageIndex=0
    lateinit var model:MessageModel
    lateinit var adapter:MessageApplyAdapter
    override fun findView() {
    }

    override fun init() {
        titleView.setTitle("申请")
            .showBackButton(true,this)
            .build()
        val loginBean = Cache.with(this)
            .path(cacheDir.path)
            .getCache("LoginBean", LoginBean::class.java)
        model= MessageModel()

        adapter= MessageApplyAdapter(this)
        adapter.onBtnClickListener=object:MessageApplyAdapter.OnBtnClickListener{
            override fun clickCancel(bean: MessageApplyBean.DataBean.RowsBean,holder: MessageApplyViewHolder) {
                holder.llBtn.visibility= View.GONE
                holder.llStatusIgnore.visibility=View.VISIBLE
                holder.llStatusPass.visibility=View.GONE
                model.requestPassOrIgnore(handlerRequest,bean.msgId?:"","2",loginBean.data?.list!![0].employee?.employeeType?:"")
            }

            override fun clickOk(bean: MessageApplyBean.DataBean.RowsBean,holder: MessageApplyViewHolder) {
                holder.llBtn.visibility= View.GONE
                holder.llStatusPass.visibility=View.VISIBLE
                holder.llStatusIgnore.visibility=View.GONE
                model.requestPassOrIgnore(handlerRequest,bean.msgId?:"","1",loginBean.data?.list!![0].employee?.employeeType?:"")

            }
        }
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter=adapter
        refreshLayout.setOnRefreshListener {
            pageIndex=0
            adapter.list.clear()
            model.getNewMessageList(handler,loginBean.data?.list!![0].employee?.id?:"",pageIndex,Contants.pageSize,
                loginBean.data?.list!![0].employee?.comId?:"","apply")
        }
        refreshLayout.setOnLoadMoreListener {
            pageIndex++
            model.getNewMessageList(handler,loginBean.data?.list!![0].employee?.id?:"",pageIndex,Contants.pageSize,
                loginBean.data?.list!![0].employee?.comId?:"","apply")
        }
        refreshLayout.autoRefresh()
    }

    override fun getContentViewId(): Int {
        return R.layout.activity_msg_apply
    }
    val handler= @SuppressLint("HandlerLeak")
    object:Handler(){
        override fun handleMessage(msg: Message?) {
            super.handleMessage(msg)
            when(msg?.what?:Contants.OKHTTP_REQUEST_ERROR){
                Contants.OKHTTP_REQUEST_ERROR->{
                    showToast(msg?.obj as String)
                }
                Contants.OKHTTP_REQUEST_SUCCESS->{
                    var bean = msg?.obj as MessageApplyBean
                    adapter.list.addAll(bean.data?.rows?:ArrayList())
                    adapter.notifyDataSetChanged()
                }
            }
            refreshLayout.finishLoadMore()
            refreshLayout.finishRefresh()
        }
    }
    val handlerRequest= @SuppressLint("HandlerLeak")
    object:Handler(){
        override fun handleMessage(msg: Message?) {
            super.handleMessage(msg)
            when(msg?.what?:Contants.OKHTTP_REQUEST_ERROR){
                Contants.OKHTTP_REQUEST_ERROR->{
                    showToast("网络错误")
                }
                Contants.OKHTTP_REQUEST_SUCCESS->{
//                    showToast("")
                }
            }
        }
    }
}
