package com.hjl.artisan.tool.view

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.util.Log
import com.hjl.artisan.R
import com.hjl.artisan.app.Contants
import com.hjl.artisan.tool.bean.ActualMeasurementCheckPointBean
import com.hjl.artisan.tool.bean.CheckPointTreeBean
import com.hjl.artisan.tool.model.ActualMeasurementCheckPointModel
import com.hjl.artisan.tool.presenter.CheckPointTreeListViewAdapter
import com.hjl.artisan.treeList.Node
import com.wusy.wusylibrary.base.BaseActivity
import kotlinx.android.synthetic.main.activity_actualmeasurements_checkpoint.*


class ActualMeasurementCheckPointActvity : BaseActivity() {
    lateinit var adapter: CheckPointTreeListViewAdapter
    private val acRequestCode = 666
    private var currentNode: Node? = null
    override fun getContentViewId(): Int {
        return R.layout.activity_actualmeasurements_checkpoint
    }

    override fun findView() {
    }

    override fun init() {
        titleView.setTitle("实测实量")
            .showBackButton(true, this)
            .build()
        var bundle = intent.extras
        tvNavigate.text = bundle.getString("navigate")
        var model = ActualMeasurementCheckPointModel()
        showLoadImage()
        model.getCheckPoint(
            handler, bundle.getString("measurementsId"), bundle.getString("buildingId"),
            bundle.getString("unitId"), bundle.getInt("floorNumberStart"), bundle.getInt("floorNumberEnd")
        )

    }

    var handler = @SuppressLint("HandlerLeak")
    object : Handler() {
        override fun handleMessage(msg: Message?) {
            super.handleMessage(msg)
            when (msg!!.what) {
                Contants.OKHTTP_REQUEST_ERROR -> {
                    showToast(msg.obj.toString())
                }
                Contants.OKHTTP_REQUEST_SUCCESS -> {
                    when (msg.obj) {
                        is ActualMeasurementCheckPointBean -> {
                            Contants.mAcualMeasurementBean = msg.obj as ActualMeasurementCheckPointBean
                            createTreeList(Contants.mAcualMeasurementBean!!)
                        }
                    }
                }
            }
            hideLoadImage()
        }
    }

    private fun createTreeList(bean:ActualMeasurementCheckPointBean) {
        var treeData = ArrayList<CheckPointTreeBean>()
        for (item in bean.data!!) {
            var flooerId = treeData.size + 1
            var bean = CheckPointTreeBean(
                flooerId, 0,
                item.floorNumber + "层 (" + item.roomList!!.size + "个房间," + item.pointCount + "个检查点)"
            )
            treeData.add(bean)
            for (room in item.roomList!!) {
                var roomId = treeData.size + 1
                var bean = CheckPointTreeBean(
                    roomId, flooerId,
                    room.roomNumber + "(" + room.pointCount + ")个检查点"
                )
                bean.data = room.measurements
                treeData.add(bean)
            }
        }
        adapter = CheckPointTreeListViewAdapter(
            treeView, this@ActualMeasurementCheckPointActvity,
            treeData, 0, true
        )
        adapter.setOnTreeNodeClickListener { node, position ->
            if (node.level != 1) return@setOnTreeNodeClickListener
            currentNode = node
            var bundle = Bundle()
            bundle.putSerializable(
                "data",
                (node.data as ActualMeasurementCheckPointBean.DataBean.RoomListBeanX.MeasurementsBean)
            )
            bundle.putString(
                "navigate", tvNavigate.text.toString() + " "
                        + node.parent.name.split("(")[0]
                        + node.name.split("(")[0]
            )
            toNestActivity(bundle)
        }
        treeView.adapter = adapter
    }

    fun toNestActivity(bundle: Bundle) {
        var intent = Intent(this, ActualMeasurementCheckDetailActivity::class.java)
        intent.putExtras(bundle)
        startActivityForResult(intent, acRequestCode)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (acRequestCode == requestCode && resultCode == RESULT_OK) {
            var bundle = data!!.extras
            var qualifiendProbability = bundle.getFloat("qualifiendProbability")
            if (currentNode != null) {
                currentNode!!.parent.qualifiendProbability = qualifiendProbability
                adapter.notifyDataSetChanged()
            }

        }
    }

}
