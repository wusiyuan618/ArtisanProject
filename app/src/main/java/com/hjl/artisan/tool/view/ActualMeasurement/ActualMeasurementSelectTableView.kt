package com.hjl.artisan.tool.view.ActualMeasurement

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
import com.hjl.artisan.tool.bean.ActualMeasurement.ActuralMeasurementTableBean
import com.hjl.artisan.tool.model.ActualMeasurement.ActualMeasurementSelectTableModel
import com.hjl.artisan.tool.presenter.ActualMeasurement.ActualMeasurementSelectTableAdapter
import com.wusy.wusylibrary.base.BaseActivity
import com.wusy.wusylibrary.base.BaseRecyclerAdapter
import com.wusy.wusylibrary.util.CommonUtil
import kotlinx.android.synthetic.main.activity_actualmeasurements_list.*

class ActualMeasurementSelectTableView : BaseActivity() {
    var pageIndex=0
    var proId=""
    val model: ActualMeasurementSelectTableModel =
        ActualMeasurementSelectTableModel()
    private lateinit var loginBean:LoginBean
    lateinit var adapter: ActualMeasurementSelectTableAdapter

    val handler= @SuppressLint("HandlerLeak")
    object :Handler(){
        override fun handleMessage(msg: Message?) {
            super.handleMessage(msg)
            when(msg!!.what){
                Contants.OKHTTP_REQUEST_ERROR->{
                    showToast(msg.obj.toString())
                }
                Contants.OKHTTP_REQUEST_SUCCESS->{
                    when(msg.obj){
                        is ActuralMeasurementTableBean ->{
                            var bean=msg.obj as ActuralMeasurementTableBean
                            adapter.list.addAll((bean.data!!.rows) as ArrayList)
                            adapter.notifyDataSetChanged()
                            titleView.setTitle("选择实测实量表 ("+bean.data!!.totalNum+")")
                        }
                    }
                }
            }
            refreshLayout.finishLoadMore()
            refreshLayout.finishRefresh()
        }
    }
    override fun getContentViewId(): Int {
        return R.layout.activity_actualmeasurements_list
    }

    override fun findView() {

    }

    override fun init() {
        titleView.setTitle("选择实测实量表")
            .showBackButton(true,this)
            .build()
        proId=intent.extras.getString("proId")
        loginBean = Cache.with(this)
            .path(cacheDir.path)
            .getCache("LoginBean", LoginBean::class.java)
        adapter= ActualMeasurementSelectTableAdapter(this)
        adapter.setOnRecyclerItemClickLitener(object: BaseRecyclerAdapter.onRecyclerItemClickLitener{
            override fun onRecyclerItemLongClick(view: RecyclerView.ViewHolder?, position: Int) {
            }

            override fun onRecyclerItemClick(view: RecyclerView.ViewHolder?, position: Int) {
                var bundle=Bundle()
                bundle.putString("programName",intent.extras.getString("programName"))
                bundle.putSerializable("tableBean",adapter.list[position])
                navigateTo(ActualMeasurementDetailView::class.java,bundle)
            }

        })
        recyclerView.layoutManager= LinearLayoutManager(this)
        recyclerView.adapter=adapter
        refreshLayout.setOnRefreshListener {
            if(!CommonUtil.isNull(loginBean)){
                getTableList(true)
            }
        }
        refreshLayout.setOnLoadMoreListener {
            pageIndex++
            if(!CommonUtil.isNull(loginBean)){
                getTableList(false)
            }
        }
        refreshLayout.autoRefresh()
    }
    fun getTableList(isClear:Boolean){
        if(isClear){
            pageIndex=0
            adapter.list.clear()
        }
        model.getTableList(pageIndex,loginBean.data!!.list!![0].employee!!,proId
            ,handler)
    }
}
