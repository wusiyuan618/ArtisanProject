package com.hjl.artisan.home.view

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.TextView
import cc.fussen.cache.Cache
import com.hjl.artisan.R
import com.hjl.artisan.app.Contants
import com.hjl.artisan.home.bean.ActualMeasurementsSelectSalesProBean
import com.hjl.artisan.home.bean.CountGroupByLevelBean
import com.hjl.artisan.home.model.ActualMeasurementModel
import com.hjl.artisan.home.presenter.ActualMeasurementSelectSaleProAdapter
import com.hjl.artisan.login.bean.LoginBean
import com.wusy.wusylibrary.base.BaseActivity
import com.wusy.wusylibrary.base.BaseRecyclerAdapter
import com.wusy.wusylibrary.util.CommonUtil
import kotlinx.android.synthetic.main.activity_actualmeasurement_selectsalespro.*

class ActualMeasurementSelectSalesProActivity:BaseActivity(){
    var pageIndex=0
    val model: ActualMeasurementModel =
        ActualMeasurementModel()
    var proName=""
    var level="2"
    var areaList=ArrayList<String>()
    var redStr="红色预警"
    var yellowStr="黄色预警"
    private lateinit var loginBean: LoginBean
    lateinit var adapter: ActualMeasurementSelectSaleProAdapter
    override fun findView() {
    }

    override fun init() {
        titleView.setTitle("实测实量")
            .showBackButton(true,this)
            .build()
        loginBean = Cache.with(this)
            .path(cacheDir.path)
            .getCache("LoginBean", LoginBean::class.java)
        adapter= ActualMeasurementSelectSaleProAdapter(this)
        adapter.setOnRecyclerItemClickLitener(object: BaseRecyclerAdapter.onRecyclerItemClickLitener{
            override fun onRecyclerItemLongClick(view: RecyclerView.ViewHolder?, position: Int) {
            }

            override fun onRecyclerItemClick(view: RecyclerView.ViewHolder?, position: Int) {
                model.getInfoNeedRecheck(handler, adapter.list[position].id?:"")
            }

        })
        recyclerView.layoutManager= LinearLayoutManager(this)
        recyclerView.adapter=adapter
        refreshLayout.setOnRefreshListener {
            if(!CommonUtil.isNull(loginBean)){
                getProList(true,false)
            }
        }
        refreshLayout.setOnLoadMoreListener {
            pageIndex++
            if(!CommonUtil.isNull(loginBean)){
                getProList(false,false)
            }
        }
        refreshLayout.autoRefresh()
        model.getActualMeasurementCountGroupByLevel(handler,loginBean.data?.list!![0].employee?.id?:"",
            loginBean.data?.list!![0].employee?.comId?:"","")

        //监听软键盘搜索键
        edSearch.setOnEditorActionListener { v, actionId, event ->
            when (actionId) {
                EditorInfo.IME_ACTION_SEARCH -> {
                    proName=edSearch.text.toString()
                    getProList(true,true)
                    //关闭软键盘
                    val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                    imm.hideSoftInputFromWindow(edSearch.windowToken, 0)
                }
            }
            false
        }
        tvRedWarn.setOnClickListener {
            changeSelect(tvRedWarn)
            level="2"
            getProList(true,true)
        }
        tvYellowWarn.setOnClickListener {
            changeSelect(tvYellowWarn)
            level="1"
            getProList(true,true)
        }
    }

    override fun getContentViewId(): Int {
        return R.layout.activity_actualmeasurement_selectsalespro
    }

    private fun getProList(isClear:Boolean, isShowAnim:Boolean){
        if(isClear){
            pageIndex=0
            adapter.list.clear()
        }
        if(isShowAnim) showLoadImage()
        model.getActualMeasurementReportGroupPage(handler,loginBean.data?.list!![0].employee?.id?:"",pageIndex,
            loginBean.data?.list!![0].employee?.comId?:"","",proName,level)
    }
    val handler= @SuppressLint("HandlerLeak")
    object : Handler(){
        override fun handleMessage(msg: Message?) {
            super.handleMessage(msg)
            when(msg!!.what){
                Contants.OKHTTP_REQUEST_ERROR->{
                    showToast(msg.obj.toString())
                }
                Contants.OKHTTP_REQUEST_SUCCESS->{
                    when(msg.obj){
                        is CountGroupByLevelBean ->{
                            var bean = msg.obj as CountGroupByLevelBean
                            redStr= "红色预警("+(bean.data?.seriousWarningCounts?:"")+")"
                            tvRedWarn.text=redStr
                            yellowStr= "黄色预警("+(bean.data?.warningCounts?:"")+")"
                            tvYellowWarn.text=yellowStr
                            return
                        }
                        is ActualMeasurementsSelectSalesProBean ->{
                            var bean=msg.obj as ActualMeasurementsSelectSalesProBean
                            adapter.list.addAll((bean.data!!.rows) as ArrayList)
                            adapter.notifyDataSetChanged()
                        }
                    }
                }
            }
            refreshLayout.finishLoadMore()
            refreshLayout.finishRefresh()
            hideLoadImage()
        }
    }
    fun changeSelect(tv: TextView){
        tvRedWarn.text=redStr
        tvYellowWarn.text=yellowStr
        tvRedWarn.setTextColor(resources.getColor(R.color.colorText))
        tvYellowWarn.setTextColor(resources.getColor(R.color.colorText))
        tv.setTextColor(resources.getColor(R.color.colorTextSelect))
    }
}
