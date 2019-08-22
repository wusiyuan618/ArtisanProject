package com.hjl.artisan.tool.view.ActualMeasurement

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.ViewGroup
import com.hjl.artisan.R
import com.hjl.artisan.app.Contants
import com.hjl.artisan.tool.bean.ActualMeasurement.ActualMeasurementCheckPointBean
import com.hjl.artisan.tool.presenter.ActualMeasurement.EdModelAdapter
import com.wusy.wusylibrary.base.BaseActivity
import com.wusy.wusylibrary.view.moduleComponents.ModuleView
import com.wusy.wusylibrary.view.moduleComponents.ModuleViewBean
import kotlinx.android.synthetic.main.activity_actualmeasurement_end.*

class ActualMeasurementEndActivity : BaseActivity() {
    var modules: ArrayList<ModuleView> = ArrayList()
    var modelBean: ActualMeasurementCheckPointBean.DataBean.RoomListBeanX.MeasurementsBean.ArticleListBean.ItemListBean.ModelListBean?=null
    private var qualifiedCount = 0.0f
    private var measureCount = 0.0f
    override fun getContentViewId(): Int {
        return R.layout.activity_actualmeasurement_end
    }

    override fun findView() {

    }

    override fun init() {
        titleView.setTitle("实测实量")
            .showBackButton(true, this)
            .build()
        tvNavigate.text = intent.extras.getString("navigate")
        var bundle=intent.extras
        modelBean = findMeasureBeanById(bundle.getString("flooerId"),bundle.getString("roomId"),bundle.getString("articleId"),
                bundle.getString("itemId"),bundle.getString("modeId"))
        createView(modelBean!!)
        btnSubmit.setOnClickListener {
            var start = modelBean!!.criteria!!.split("，")[0].toInt()
            var end = modelBean!!.criteria!!.split("，")[1].toInt()
            for (modelIndex in modules.indices) {
                var currentMeasureCount=0.0f
                var currentQualifiedCount=0.0f
                for (itemIndex in (modules[modelIndex].recyclerView.adapter as EdModelAdapter).list.indices) {
                    if ((modules[modelIndex].recyclerView.adapter as EdModelAdapter).list[itemIndex].index == null) continue
                    //将输入的数据缓存
                    modelBean!!.roomList!![0].positionList!![modelIndex].pointList!![itemIndex].pointValue= (modules[modelIndex].recyclerView.adapter as EdModelAdapter).list[itemIndex].index as String?
                    measureCount++
                    currentMeasureCount++
                    if ((modules[modelIndex].recyclerView.adapter as EdModelAdapter).list[itemIndex].index.toString().toInt() in start..end) {
                        qualifiedCount++
                        currentQualifiedCount++
                        modelBean!!.roomList!![0].positionList!![modelIndex].pointList!![itemIndex].qualifiendStatus="1"
                    }else{
                        modelBean!!.roomList!![0].positionList!![modelIndex].pointList!![itemIndex].qualifiendStatus="0"
                    }
                }
                if(currentMeasureCount!=0.0f) modelBean!!.roomList!![0].positionList!![modelIndex].qualifiendProbability=currentQualifiedCount / currentMeasureCount
            }
            var intent = Intent()
            var bundle = Bundle()
            if(measureCount!=0.0f){
                var qualifiendProbability = qualifiedCount / measureCount
                bundle.putFloat("qualifiendProbability", qualifiendProbability)
                intent.putExtras(bundle)
                setResult(RESULT_OK, intent)
            }
            finish()
        }
    }
    private fun createView(data: ActualMeasurementCheckPointBean.DataBean.RoomListBeanX.MeasurementsBean.ArticleListBean.ItemListBean.ModelListBean){
        tvContent.text = data.name + "[" + data.criteria + "]mm"
        etv.text = "选点规则： " + data.pointRule
        for (room in data.roomList!![0].positionList!!) {
            var modelView = ModuleView(this)
            var params_modelView =
                ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
            llModelView.addView(modelView, params_modelView)
            var list = ArrayList<ModuleViewBean>()
            for (item in room.pointList!!) {
                var bean=ModuleViewBean(0, item.name + "(mm)", null)
                bean.index=item.pointValue
                list.add(bean)

            }
            modelView.setTitle(room.name, Color.BLACK)
                .isShowTitle(true)
                .showRecycelerView(this, list,
                    EdModelAdapter(this), LinearLayoutManager(this))
            modules.add(modelView)
        }
    }

    private fun findMeasureBeanById(
        flooerId: String,
        roomId: String,
        articleId: String,
        itemId: String,
        modelId: String
    ): ActualMeasurementCheckPointBean.DataBean.RoomListBeanX.MeasurementsBean.ArticleListBean.ItemListBean.ModelListBean? {
        for (flooer
        in Contants.mAcualMeasurementBean!!.data!!) {
            if (flooer.id == flooerId) {
                for (room
                in flooer.roomList!!) {
                    if (room.id == roomId) {
                        for (article
                        in room.measurements!!.articleList!!) {
                            if(article.id==articleId){
                                for (item
                                in article.itemList!!){
                                    if(item.id==itemId){
                                        for (model
                                        in item.modelList!!){
                                            if(model.id==modelId){
                                                return model
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return null
    }
}
