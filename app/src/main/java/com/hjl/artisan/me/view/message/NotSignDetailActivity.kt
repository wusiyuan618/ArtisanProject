package com.hjl.artisan.me.view.message

import android.annotation.SuppressLint
import android.content.Context
import android.os.Handler
import android.os.Message
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import cc.fussen.cache.Cache
import com.hjl.artisan.R
import com.hjl.artisan.app.Contants
import com.hjl.artisan.login.bean.LoginBean
import com.hjl.artisan.me.bean.NotSignDetailBean
import com.hjl.artisan.me.modle.MessageModel
import com.hjl.artisan.me.presenter.message.NotSignDetailAdapter
import com.wusy.wusylibrary.base.BaseActivity
import kotlinx.android.synthetic.main.activity_notsigndetail.*

class NotSignDetailActivity : BaseActivity(){
    lateinit var model: MessageModel
    lateinit var adapter: NotSignDetailAdapter
    var pageIndex=0
    var searchMsg=""
    override fun findView() {
    }

    override fun init() {
        model= MessageModel()
        titleView.setTitle("未打卡详情")
            .showBackButton(true,this)
            .build()
        val loginBean = Cache.with(this)
            .path(cacheDir.path)
            .getCache("LoginBean", LoginBean::class.java)

        adapter= NotSignDetailAdapter(this)
        recyclerView.layoutManager= LinearLayoutManager(this) as RecyclerView.LayoutManager?
        recyclerView.adapter=adapter
        refreshLayout.setOnRefreshListener {
            pageIndex=0
            adapter.list.clear()
          model.getNotSignList(handler,pageIndex,intent.getStringExtra("programId"),
              loginBean.data?.list!![0].employee?.comId?:"",searchMsg,intent.getStringExtra("groupTime"))
        }
        refreshLayout.setOnLoadMoreListener {
            pageIndex++
            model.getNotSignList(handler,pageIndex,intent.getStringExtra("programId"),
                loginBean.data?.list!![0].employee?.comId?:"",searchMsg,intent.getStringExtra("groupTime"))
        }
        refreshLayout.autoRefresh()
        tvTime.text=intent.getStringExtra("groupTime")
        tvLocation.text=intent.getStringExtra("programName")
        tvCount.text="下班未打卡工匠："+intent.getIntExtra("notSignCount",0)+"人"
        //监听软键盘搜索键
        edSearch.setOnEditorActionListener { v, actionId, event ->
            when (actionId) {
                EditorInfo.IME_ACTION_SEARCH -> {
                    pageIndex=0
                    adapter.list.clear()
                    searchMsg=edSearch.text.toString()
                    showLoadImage()
                    model.getNotSignList(handler,pageIndex,intent.getStringExtra("programId"),
                        loginBean.data?.list!![0].employee?.comId?:"",searchMsg,intent.getStringExtra("groupTime"))
                    //关闭软键盘
                    val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                    imm.hideSoftInputFromWindow(edSearch.windowToken, 0)
                }
            }
            false
        }
    }

    override fun getContentViewId(): Int {
        return R.layout.activity_notsigndetail
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
                    var bean = msg?.obj as NotSignDetailBean
                    adapter.list.addAll(bean.data?.rows?:ArrayList())
                    adapter.notifyDataSetChanged()
                }
            }
            refreshLayout.finishLoadMore()
            refreshLayout.finishRefresh()
            hideLoadImage()
        }
    }

}
