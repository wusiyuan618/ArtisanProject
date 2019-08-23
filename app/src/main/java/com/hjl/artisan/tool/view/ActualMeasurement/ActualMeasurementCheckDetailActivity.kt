package com.hjl.artisan.tool.view.ActualMeasurement

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ListView
import com.hjl.artisan.R
import com.hjl.artisan.app.Contants
import com.hjl.artisan.tool.bean.ActualMeasurement.ActualMeasurementCheckPointBean
import com.hjl.artisan.tool.bean.ActualMeasurement.CheckPointTreeBean
import com.hjl.artisan.tool.presenter.ActualMeasurement.CheckPointTreeListViewAdapter
import com.hjl.artisan.treeList.Node
import com.wusy.wusylibrary.base.BaseActivity
import com.wusy.wusylibrary.view.CustListView
import kotlinx.android.synthetic.main.activity_actualmeasurements_checkpoint.*

class ActualMeasurementCheckDetailActivity : BaseActivity() {
    lateinit var adapter: CheckPointTreeListViewAdapter
    private val acRequestCode = 888
    private var currentNode: Node? = null
    var flooerId = ""
    var data: ActualMeasurementCheckPointBean.DataBean.RoomListBeanX.MeasurementsBean? = null
    var roomId = ""
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
        flooerId = intent.extras.getString("flooerId")
        roomId = intent.extras.getString("roomId")
        data = findMeasureBeanById(flooerId, roomId)
        if (data != null)
            createTreeList(data!!)
    }

    private fun createTreeList(data: ActualMeasurementCheckPointBean.DataBean.RoomListBeanX.MeasurementsBean) {
        var treeData = ArrayList<CheckPointTreeBean>()
        for (articleIndex in data.articleList!!.indices) {
            var firstId = treeData.size + 1
            var bean = CheckPointTreeBean(
                firstId,
                0,
                (articleIndex + 1).toString() + "、 " + data.articleList!![articleIndex].name
            )
            bean.data = data.articleList!![articleIndex].id
            bean.qualifiendProbability = data.articleList!![articleIndex].qualifiendProbability
            treeData.add(bean)
            for (itemIndex in data.articleList!![articleIndex].itemList!!.indices) {
                var itemId = treeData.size + 1
                var bean = CheckPointTreeBean(
                    itemId,
                    firstId,
                    (articleIndex + 1).toString() + "." + (itemIndex + 1).toString() + " " + data.articleList!![articleIndex].itemList!![itemIndex].name + "(" + data.articleList!![articleIndex].itemList!![itemIndex].modelList!!.size + ")"
                )
                bean.data = data.articleList!![articleIndex].itemList!![itemIndex].id
                bean.qualifiendProbability = data.articleList!![articleIndex].itemList!![itemIndex].qualifiendProbability
                treeData.add(bean)
                for (mode in data.articleList!![articleIndex].itemList!![itemIndex].modelList!!) {
                    var modeId = treeData.size + 1
                    var bean = CheckPointTreeBean(
                        modeId,
                        itemId,
                        mode.name + "[" + mode.criteria + "]mm"
                    )
                    bean.data = mode.id
                    bean.qualifiendProbability =mode.qualifiendProbability
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
            bundle.putString(
                "flooerId",
                flooerId
            )
            bundle.putString(
                "roomId",
                roomId
            )
            bundle.putString(
                "articleId",
                node.parent.parent.data as String
            )
            bundle.putString(
                "itemId",
                node.parent.data as String
            )
            bundle.putString(
                "modeId",
                node.data as String
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
                if (qualifiendProbability == -1f) {
                    currentNode!!.qualifiendProbability = null
                    currentNode!!.parent.qualifiendProbability = calcProbability(currentNode!!.parent.childrenNodes)
                    currentNode!!.parent.parent.qualifiendProbability =
                        calcProbability(currentNode!!.parent.parent.childrenNodes)
                    adapter.notifyDataSetChanged()
                } else {
                    //更新视图数据
                    currentNode!!.qualifiendProbability = qualifiendProbability
                    currentNode!!.parent.qualifiendProbability = calcProbability(currentNode!!.parent.childrenNodes)
                    currentNode!!.parent.parent.qualifiendProbability =
                        calcProbability(currentNode!!.parent.parent.childrenNodes)
                    adapter.notifyDataSetChanged()
                    //缓存全局数据
                }
                for (article
                in this.data!!.articleList!!) {
                    if (currentNode!!.parent.parent.data == article.id) {
                        article.qualifiendProbability = calcProbability(currentNode!!.parent.parent.childrenNodes)
                        for (item
                        in article.itemList!!) {
                            if (item.id == currentNode!!.parent.data) {
                                item.qualifiendProbability = calcProbability(currentNode!!.parent.childrenNodes)
                                for (model
                                in item.modelList!!) {
                                    model.qualifiendProbability = qualifiendProbability
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    override fun onBackPressed() {
        toFinish()
    }

    private fun toFinish() {
        var intent = Intent()
        var bundle = Bundle()
        if (calcProbability() != null) {
            bundle.putFloat("qualifiendProbability", calcProbability()!!)
            intent.putExtras(bundle)
            setResult(RESULT_OK, intent)
        }
        finish()
    }

    /**
     * 计算当前选中的子node的完成率
     * 结果=每一个的完成率/n
     */
    private fun calcProbability(list: List<Node>): Float? {
        var allQualiProF = 0.0f
        var i = 0
        for (node in list) {
            if (node.qualifiendProbability != null) {
                i++
                allQualiProF += node.qualifiendProbability
            }
        }
        return if (i != 0) allQualiProF / i else null
    }

    private fun calcProbability(): Float? {
        var allQualiProF = 0.0f
        var i = 0
        for (node in adapter.getmAllNodes()) {
            if (node.qualifiendProbability != null) {
                i++
                allQualiProF += node.qualifiendProbability
            }
        }
        return if (i != 0) allQualiProF / i else null
    }

    private fun findMeasureBeanById(
        flooerId: String,
        roomId: String
    ): ActualMeasurementCheckPointBean.DataBean.RoomListBeanX.MeasurementsBean? {
        for (flooer in Contants.mAcualMeasurementBean!!.data!!) {
            if (flooer.id == flooerId) {
                for (room in flooer.roomList!!) {
                    if (room.id == roomId) {
                        return room.measurements!!
                    }
                }
            }
        }
        return null
    }
}
