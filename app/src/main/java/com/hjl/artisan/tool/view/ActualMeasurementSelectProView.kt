package com.hjl.artisan.tool.view

import android.annotation.SuppressLint
import android.os.Handler
import android.os.Message
import android.support.v7.widget.LinearLayoutManager
import android.widget.TextView
import cc.fussen.cache.Cache
import com.afollestad.materialdialogs.MaterialDialog
import com.hjl.artisan.R
import com.hjl.artisan.app.Contants
import com.hjl.artisan.login.bean.LoginBean
import com.hjl.artisan.tool.bean.ActualMeasurementSelectProBean
import com.hjl.artisan.tool.bean.AreaBean
import com.hjl.artisan.tool.model.ActualMeasurementSelectProModel
import com.hjl.artisan.tool.presenter.ActualMeasurementSelectProAdapter
import com.wusy.wusylibrary.base.BaseActivity
import com.wusy.wusylibrary.util.CommonUtil
import kotlinx.android.synthetic.main.activity_selectpro.*
import android.view.inputmethod.EditorInfo
import android.content.Context
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.inputmethod.InputMethodManager
import com.wusy.wusylibrary.base.BaseRecyclerAdapter


class ActualMeasurementSelectProView : BaseActivity() {
    var pageIndex=0
    val model:ActualMeasurementSelectProModel= ActualMeasurementSelectProModel()
    var area=""
    var proName=""
    var areaList=ArrayList<String>()
    private lateinit var loginBean:LoginBean
    lateinit var adapter:ActualMeasurementSelectProAdapter
    override fun getContentViewId(): Int {
        return R.layout.activity_selectpro
    }

    override fun findView() {

    }

    override fun init() {
        titleView.setTitle("选择项目")
            .showBackButton(true,this)
            .build()
        loginBean = Cache.with(this)
            .path(cacheDir.path)
            .getCache("LoginBean", LoginBean::class.java)
        model.getArea(loginBean.data!!.list!![0].employee!!,handler)
        adapter=ActualMeasurementSelectProAdapter(this)
        adapter.setOnRecyclerItemClickLitener(object:BaseRecyclerAdapter.onRecyclerItemClickLitener{
            override fun onRecyclerItemLongClick(view: RecyclerView.ViewHolder?, position: Int) {
            }

            override fun onRecyclerItemClick(view: RecyclerView.ViewHolder?, position: Int) {
                var bundle=Bundle()
                bundle.putString("proId",adapter.list[position].id)
                bundle.putString("programName",adapter.list[position].programName)
                navigateTo(ActualMeasurementSelectTableView::class.java,bundle)
            }

        })
        recyclerView.layoutManager=LinearLayoutManager(this)
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
        tvArea.setOnClickListener {
            createAreaDialog(areaList).show()
        }
        tvAll.setOnClickListener {
            changeSelect(tvAll)
            area=""
            proName=""
            tvArea.text="区域"
            getProList(true,true)
        }
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
    }
    fun getProList(isClear:Boolean,isShowAnim:Boolean){
        if(isClear){
            pageIndex=0
            adapter.list.clear()
        }
        if(isShowAnim) showLoadImage()
        model.getProList(loginBean.data!!.list!![0].employee!!,pageIndex
            ,area,proName,handler)
    }

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
                        is AreaBean->{
                            var bean = msg.obj as AreaBean
                            areaList=bean.data as ArrayList<String>
                            return
                        }
                        is ActualMeasurementSelectProBean->{
                            var bean=msg.obj as ActualMeasurementSelectProBean
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
    fun createAreaDialog(list: ArrayList<String>): MaterialDialog.Builder {
        return MaterialDialog.Builder(this)
            .title("选择区域")
            .content("请选择项目所在区域地址")
            .items(list)
            .positiveText("确认")
            .itemsCallbackSingleChoice(
                0) { _, _, _, text ->
                //0 表示第一个选中 -1 不选
                changeSelect(tvArea)
                tvArea.text=text
                area= text as String
                getProList(true,true)
                true
            }
    }
    fun changeSelect(tv:TextView){
        tvAll.text="全部"
        tvArea.text="区域"
        tvAll.setTextColor(resources.getColor(R.color.colorText))
        tvArea.setTextColor(resources.getColor(R.color.colorText))
        tv.setTextColor(resources.getColor(R.color.colorTextSelect))
    }
}
