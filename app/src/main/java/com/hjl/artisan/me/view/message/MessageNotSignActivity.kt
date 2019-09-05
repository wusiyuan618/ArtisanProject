package com.hjl.artisan.me.view.message

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import cc.fussen.cache.Cache
import com.hjl.artisan.R
import com.hjl.artisan.app.Contants
import com.hjl.artisan.login.bean.LoginBean
import com.hjl.artisan.me.bean.MessageNotSignBean
import com.hjl.artisan.me.modle.MessageModel
import com.hjl.artisan.me.presenter.message.MessageNotSignAdapter
import com.wusy.wusylibrary.base.BaseActivity
import com.wusy.wusylibrary.base.BaseRecyclerAdapter
import kotlinx.android.synthetic.main.activity_msg_apply.*

class MessageNotSignActivity :BaseActivity(){
    lateinit var model: MessageModel
    lateinit var adapter: MessageNotSignAdapter
    var pageIndex=0
    override fun findView() {

    }

    override fun init() {
        model= MessageModel()
        titleView.setTitle("考勤提醒")
            .showBackButton(true,this)
            .build()
        val loginBean = Cache.with(this)
            .path(cacheDir.path)
            .getCache("LoginBean", LoginBean::class.java)
        adapter= MessageNotSignAdapter(this)
        recyclerView.layoutManager= LinearLayoutManager(this) as RecyclerView.LayoutManager?
        recyclerView.adapter=adapter
        refreshLayout.setOnRefreshListener {
            pageIndex=0
            adapter.list.clear()
            model.getNewMessageList(handler,loginBean.data?.list!![0].employee?.id?:"",pageIndex, Contants.pageSize,
                loginBean.data?.list!![0].employee?.comId?:"","notSign")
        }
        refreshLayout.setOnLoadMoreListener {
            pageIndex++
            model.getNewMessageList(handler,loginBean.data?.list!![0].employee?.id?:"",pageIndex, Contants.pageSize,
                loginBean.data?.list!![0].employee?.comId?:"","notSign")
        }
        refreshLayout.autoRefresh()
        adapter.setOnRecyclerItemClickLitener(object :BaseRecyclerAdapter.onRecyclerItemClickLitener{
            override fun onRecyclerItemLongClick(view: RecyclerView.ViewHolder?, position: Int) {
            }

            override fun onRecyclerItemClick(view: RecyclerView.ViewHolder?, position: Int) {
                var bundle=Bundle()
                bundle.putString("programId",adapter.list[position].programId)
                bundle.putString("groupTime",adapter.list[position].groupTime)
                bundle.putInt("notSignCount",adapter.list[position].notSignCount)
                bundle.putString("programName",adapter.list[position].notSignProgram?.locationName?.split(",")!![0]+"-"+adapter.list[position].notSignProgram?.partyaName+"-"+adapter.list[position].notSignProgram?.programName)
                navigateTo(NotSignDetailActivity::class.java,bundle)
            }

        })
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
                    var bean = msg?.obj as MessageNotSignBean
                    adapter.list.addAll(bean.data?.rows?:ArrayList())
                    adapter.notifyDataSetChanged()
                }
            }
            refreshLayout.finishLoadMore()
            refreshLayout.finishRefresh()
        }
    }

}
