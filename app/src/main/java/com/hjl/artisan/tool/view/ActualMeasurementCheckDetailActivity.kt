package com.hjl.artisan.tool.view

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.hjl.artisan.R
import com.hjl.artisan.tool.bean.ActualMeasurementCheckPointBean
import com.hjl.artisan.tool.bean.CheckPointTreeBean
import com.hjl.artisan.tool.presenter.CheckPointTreeListViewAdapter
import com.hjl.artisan.treeList.Node
import com.wusy.wusylibrary.base.BaseActivity
import kotlinx.android.synthetic.main.activity_actualmeasurements_checkpoint.*

class ActualMeasurementCheckDetailActivity : BaseActivity() {
    lateinit var adapter: CheckPointTreeListViewAdapter
    private val acRequestCode = 888
    private var currentNode: Node? = null
    override fun findView() {
    }

    override fun init() {
        titleView.setTitle("实测实量")
            .showBackButton(true, this) {
                toFinish()
            }
            .build()
        btnSubmit.visibility = View.GONE
        tvNavigate.text = intent.extras.getString("navigate")
        var data =
            intent.extras.getSerializable("data") as ActualMeasurementCheckPointBean.DataBean.RoomListBeanX.MeasurementsBean
        createTreeList(data)
    }
    private fun createTreeList(data:ActualMeasurementCheckPointBean.DataBean.RoomListBeanX.MeasurementsBean){
        var treeData = ArrayList<CheckPointTreeBean>()
        for (article in data.articleList!!) {
            var firstId = treeData.size + 1
            var bean = CheckPointTreeBean(firstId, 0, article.name)
            treeData.add(bean)
            for (item in article.itemList!!) {
                var itemId = treeData.size + 1
                var bean = CheckPointTreeBean(itemId, firstId, item.name + "(" + item.modelList!!.size + ")")
                treeData.add(bean)
                for (mode in item.modelList!!) {
                    var modeId = treeData.size + 1
                    var bean = CheckPointTreeBean(modeId, itemId, mode.name + "[" + mode.criteria + "]mm")
                    bean.data = mode
                    treeData.add(bean)
                }
            }
        }
        adapter = CheckPointTreeListViewAdapter(
            treeView, this@ActualMeasurementCheckDetailActivity,
            treeData, 5, true
        )
        adapter.setOnTreeNodeClickListener { node, position ->
            currentNode = node
            if (node.level != 2) return@setOnTreeNodeClickListener
            var bundle = Bundle()
            bundle.putSerializable(
                "data",
                node.data as ActualMeasurementCheckPointBean.DataBean.RoomListBeanX.MeasurementsBean.ArticleListBean.ItemListBean.ModelListBean
            )
            bundle.putString("navigate", tvNavigate.text.toString())
            toNestActivity(bundle)
        }
        treeView.adapter = adapter
    }

    override fun getContentViewId(): Int {
        return R.layout.activity_actualmeasurements_checkpoint
    }

    private fun toNestActivity(bundle: Bundle) {
        var intent = Intent(this, ActualMeasurementEndActivity::class.java)
        intent.putExtras(bundle)
        startActivityForResult(intent, acRequestCode)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (acRequestCode == requestCode && resultCode == RESULT_OK) {
            var bundle = data!!.extras
            var qualifiendProbability = bundle.getFloat("qualifiendProbability")
            if (currentNode != null) {
                currentNode!!.parent.parent.qualifiendProbability = qualifiendProbability
                adapter.notifyDataSetChanged()
            }
        }
    }

    override fun onBackPressed() {
        toFinish()
    }

    private fun toFinish() {
        var intent = Intent()
        var bundle = Bundle()
        bundle.putFloat("qualifiendProbability", calcProbability())
        intent.putExtras(bundle)
        setResult(RESULT_OK, intent)
        finish()
    }

    private fun calcProbability(): Float {
        var allQualiProF = 0.0f
        var i = 0
        for (node in adapter.getmAllNodes()) {
            if (node.qualifiendProbability != null) {
                i++
                allQualiProF += node.qualifiendProbability
            }
        }
        return if (i != 0) allQualiProF / i else 0.0f
    }

}
