package com.hjl.artisan.tool.view

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.ViewGroup
import com.hjl.artisan.R
import com.hjl.artisan.tool.bean.ActualMeasurementCheckPointBean
import com.hjl.artisan.tool.presenter.EdModelAdapter
import com.wusy.wusylibrary.base.BaseActivity
import com.wusy.wusylibrary.view.moduleComponents.ModuleView
import com.wusy.wusylibrary.view.moduleComponents.ModuleViewBean
import kotlinx.android.synthetic.main.activity_actualmeasurement_end.*

class ActualMeasurementEndActivity : BaseActivity() {
    var modules:ArrayList<ModuleView> =ArrayList()
    private var qualifiedCount=0.0f
    private var measureCount=0.0f
    override fun getContentViewId(): Int {
        return R.layout.activity_actualmeasurement_end
    }

    override fun findView() {

    }

    override fun init() {
        titleView.setTitle("实测实量")
            .showBackButton(true,this)
            .build()
        tvNavigate.text=intent.extras.getString("navigate")

        var data=intent.extras.getSerializable("data") as ActualMeasurementCheckPointBean.DataBean.RoomListBeanX.MeasurementsBean.ArticleListBean.ItemListBean.ModelListBean
                tvContent.text=data.name+"["+data.criteria+"]mm"
        etv.text="选点规则： "+data.pointRule
        for(room in data.roomList!![0].positionList!!){
            var modelView=ModuleView(this)
            var params_modelView =
                ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
            llModelView.addView(modelView,params_modelView)
            var list=ArrayList<ModuleViewBean>()
            for(item in room.pointList!!){
                list.add(ModuleViewBean(0,item.name+"(mm)",null))
            }
            modelView.setTitle(room.name,Color.BLACK)
                .isShowTitle(true)
                .showRecycelerView(this,list, EdModelAdapter(this), LinearLayoutManager(this))
            modules.add(modelView)
        }
        btnSubmit.setOnClickListener {
            var start=data.criteria!!.split("，")[0].toInt()
            var end=data.criteria!!.split("，")[1].toInt()
            for (model in modules){
                for(item in (model.recyclerView.adapter as EdModelAdapter).list){
                    if(item.index==null)continue
                    measureCount++
                    if(item.index.toString().toInt() in start..end){
                        qualifiedCount++
                    }
                }
            }
            var qualifiendProbability=qualifiedCount/measureCount
            var intent=Intent()
            var bundle=Bundle()
            bundle.putFloat("qualifiendProbability",qualifiendProbability)
            intent.putExtras(bundle)
            setResult(RESULT_OK,intent)
            finish()
        }
    }
}
