package com.hjl.artisan.tool.view.ActualMeasurement

import android.annotation.TargetApi
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import com.hjl.artisan.R
import com.hjl.artisan.app.Contants
import com.hjl.artisan.app.SystemTTS
import com.hjl.artisan.service.BlueBLEUtil
import com.hjl.artisan.service.RulerService
import com.hjl.artisan.tool.bean.ActualMeasurement.ActualMeasurementCheckPointBean
import com.hjl.artisan.tool.bean.ActualMeasurement.EditAndRulerBean
import com.hjl.artisan.tool.presenter.ActualMeasurement.EdModelAdapter
import com.wusy.wusylibrary.base.BaseActivity
import com.wusy.wusylibrary.util.CommonUtil
import com.wusy.wusylibrary.view.FullyLinearLayoutManager
import com.wusy.wusylibrary.view.moduleComponents.ModuleView
import com.wusy.wusylibrary.view.moduleComponents.ModuleViewBean
import kotlinx.android.synthetic.main.activity_actualmeasurement_end.*
import kotlin.collections.ArrayList

class ActualMeasurementEndActivity : BaseActivity() {
    var modules: ArrayList<ModuleView> = ArrayList()
    var modelBean: ActualMeasurementCheckPointBean.DataBean.RoomListBeanX.MeasurementsBean.ArticleListBean.ItemListBean.ModelListBean? =
        null
    private var qualifiedCount = 0.0f
    private var measureCount = 0.0f
    private lateinit var bradcast:EndBradCast
    private var start=0
    private var end=0
    private lateinit var blueBLEUtil: BlueBLEUtil

    companion object {
        var currentEditText:EditText?=null
        var editTextList=ArrayList<EditAndRulerBean>()
        var currentIndext=0
    }
    init {
        currentEditText=null
        editTextList= ArrayList()
        currentIndext=0
    }
    override fun getContentViewId(): Int {
        return R.layout.activity_actualmeasurement_end
    }

    override fun findView() {

    }

    override fun init() {
        titleView.setTitle("实测实量")
            .showBackButton(true, this)
            .build()
        blueBLEUtil=BlueBLEUtil(this)
        tvNavigate.text = intent.extras.getString("navigate")
        var bundle = intent.extras
        modelBean = findMeasureBeanById(
            bundle.getString("flooerId"), bundle.getString("roomId"), bundle.getString("articleId"),
            bundle.getString("itemId"), bundle.getString("modeId")
        )
        createView(modelBean!!)
        start = modelBean!!.criteria!!.split("，")[0].toInt()
        end = modelBean!!.criteria!!.split("，")[1].toInt()
        btnSubmit.setOnClickListener {
            for (modelIndex in modules.indices) {
                var currentMeasureCount = 0.0f
                var currentQualifiedCount = 0.0f
                for (itemIndex in (modules[modelIndex].recyclerView.adapter as EdModelAdapter).list.indices) {
                    if (CommonUtil.isNull((modules[modelIndex].recyclerView.adapter as EdModelAdapter).list[itemIndex].index)) {
                        modelBean!!.roomList!![0].positionList!![modelIndex].pointList!![itemIndex].pointValue = null
                        modelBean!!.roomList!![0].positionList!![modelIndex].pointList!![itemIndex].qualifiendStatus =
                            null
                        continue
                    }
                    //将输入的数据缓存
                    modelBean!!.roomList!![0].positionList!![modelIndex].pointList!![itemIndex].pointValue =
                        (modules[modelIndex].recyclerView.adapter as EdModelAdapter).list[itemIndex].index as String?
                    measureCount++
                    currentMeasureCount++
                    if ((modules[modelIndex].recyclerView.adapter as EdModelAdapter).list[itemIndex].index.toString().toFloat() in start..end) {
                        qualifiedCount++
                        currentQualifiedCount++
                        modelBean!!.roomList!![0].positionList!![modelIndex].pointList!![itemIndex].qualifiendStatus =
                            "1"
                    } else {
                        modelBean!!.roomList!![0].positionList!![modelIndex].pointList!![itemIndex].qualifiendStatus =
                            "0"
                    }
                }
                if (currentMeasureCount != 0.0f) modelBean!!.roomList!![0].positionList!![modelIndex].qualifiendProbability =
                    currentQualifiedCount / currentMeasureCount
            }
            var intent = Intent()
            var bundle = Bundle()
            var qualifiendProbability = 0.0f
            if (measureCount != 0.0f) {
                qualifiendProbability = qualifiedCount / measureCount
            } else {
                qualifiendProbability = -1f
            }
            bundle.putFloat("qualifiendProbability", qualifiendProbability)
            intent.putExtras(bundle)
            setResult(RESULT_OK, intent)
            finish()
        }
        bradcast=EndBradCast()
        var actions=ArrayList<String>()
        actions.add(RulerService.FAILURE)
        actions.add(RulerService.READNOTICEMSG)
        addBroadcastAction(actions,bradcast)
    }

    private fun createView(data: ActualMeasurementCheckPointBean.DataBean.RoomListBeanX.MeasurementsBean.ArticleListBean.ItemListBean.ModelListBean) {
        tvContent.text = data.name + "[" + data.criteria + "]mm"
        etv.text = "选点规则： " + data.pointRule
        for (room in data.roomList!![0].positionList!!) {
            var modelView = ModuleView(this)
            var params_modelView =
                ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
            llModelView.addView(modelView, params_modelView)
            var list = ArrayList<ModuleViewBean>()
            for (item in room.pointList!!) {
                var bean = ModuleViewBean(0, item.name + "(mm)", null)
                bean.index = item.pointValue
                list.add(bean)

            }
            Log.i("wsy",list.size.toString())
            var adapter=EdModelAdapter(this)
            adapter.roomName=room.name
            modelView.setTitle(room.name, Color.BLACK)
                .isShowTitle(true)
                .showRecycelerView(
                    this, list,
                    adapter, FullyLinearLayoutManager(this)
                )
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
                            if (article.id == articleId) {
                                for (item
                                in article.itemList!!) {
                                    if (item.id == itemId) {
                                        for (model
                                        in item.modelList!!) {
                                            if (model.id == modelId) {
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

    override fun onDestroy() {
        super.onDestroy()
    }
    var lastTime=System.currentTimeMillis()
    inner class EndBradCast:BroadcastReceiver(){
        override fun onReceive(context: Context?, intent: Intent?) {
            when(intent?.action?:""){
                RulerService.FAILURE->{
                    SystemTTS.getInstance(this@ActualMeasurementEndActivity).
                        playText(intent?.getStringExtra("data")?:"")
                    blueBLEUtil.reConnect()
                }
                RulerService.READNOTICEMSG->{
                    showLoadImage()
                    var currentTime=System.currentTimeMillis()
                    if(currentTime-lastTime>1000){
                        lastTime=currentTime
                        var dataStr=(intent?.getStringExtra("data")?.substring(4,7)?:"0").toInt().toString()
                        if(dataStr.toInt() in start..end){
                            SystemTTS.getInstance(this@ActualMeasurementEndActivity).playText(dataStr+"毫米，合格")
                        }else{
                            SystemTTS.getInstance(this@ActualMeasurementEndActivity).playText(dataStr+"毫米，不合格")
                        }
                        writeToEidtText(dataStr)
                        hideInput()
                    }
                    hideLoadImage()
                }
            }
        }
    }
    fun writeToEidtText(text:String){
        if(currentEditText!=null){
            currentEditText!!.setText(text)
            if(currentIndext< editTextList.size-1){
                if(editTextList[currentIndext].isEnd){
                    SystemTTS.getInstance(this@ActualMeasurementEndActivity).playText("即将测量下一个房间:"+editTextList[currentIndext+1].roomName)
                }
                currentIndext++
                currentEditText= editTextList[currentIndext].editText
                currentEditText!!.requestFocus()

            }else{
                SystemTTS.getInstance(this@ActualMeasurementEndActivity).playText("该表格录入完成")
            }
        }else{
            if(editTextList.size>0){
                currentEditText= editTextList[0].editText
                currentEditText!!.requestFocus()
                writeToEidtText(text)
            }
        }
    }
    /**
     * 隐藏键盘
     */
    private fun hideInput() {
        var imm:InputMethodManager  = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        var v:View= window.peekDecorView()
        if (null != v) {
            imm.hideSoftInputFromWindow(v.windowToken, 0)
        }
    }
}
