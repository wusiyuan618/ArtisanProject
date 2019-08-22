package com.hjl.artisan.tool.view.ActualMeasurement

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.support.v7.app.AlertDialog
import cc.fussen.cache.Cache
import com.hjl.artisan.R
import com.hjl.artisan.app.Contants
import com.hjl.artisan.login.bean.LoginBean
import com.hjl.artisan.tool.bean.ActualMeasurement.ActualMeasurementCheckPointBean
import com.hjl.artisan.tool.bean.ActualMeasurement.ActuralMeasurementTableBean
import com.hjl.artisan.tool.bean.ActualMeasurement.CheckPointReportBean
import com.hjl.artisan.tool.bean.ActualMeasurement.CheckPointTreeBean
import com.hjl.artisan.tool.model.ActualMeasurement.ActualMeasurementCheckPointModel
import com.hjl.artisan.tool.presenter.ActualMeasurement.CheckPointTreeListViewAdapter
import com.hjl.artisan.treeList.Node
import com.wusy.wusylibrary.base.BaseActivity
import kotlinx.android.synthetic.main.activity_actualmeasurements_checkpoint.*


class ActualMeasurementCheckPointActvity : BaseActivity() {
    lateinit var adapter: CheckPointTreeListViewAdapter
    lateinit var loginBean: LoginBean
    private lateinit var tableBean: ActuralMeasurementTableBean.DataBean.RowsBean
    private lateinit var selectBean: ActuralMeasurementTableBean.DataBean.RowsBean.FloorLinkListBean
    private val acRequestCode = 666
    private var currentNode: Node? = null
    private lateinit var bundle: Bundle
    override fun getContentViewId(): Int {
        return R.layout.activity_actualmeasurements_checkpoint
    }

    override fun findView() {
    }

    override fun init() {
        titleView.setTitle("实测实量")
            .showBackButton(true, this) {
                finishFun()
            }
            .build()
        loginBean = Cache.with(this)
            .path(cacheDir.path)
            .getCache("LoginBean", LoginBean::class.java)
        bundle = intent.extras
        tvNavigate.text = bundle.getString("navigate")
        tableBean = bundle.getSerializable("tableBean") as ActuralMeasurementTableBean.DataBean.RowsBean
        selectBean =
            bundle.getSerializable("selectBean") as ActuralMeasurementTableBean.DataBean.RowsBean.FloorLinkListBean
        var model = ActualMeasurementCheckPointModel(this)
        showLoadImage()
        model.getCheckPoint(
            handler, loginBean.data!!.user!!.id!!, selectBean.measurementsId!!, selectBean.buildingId!!,
            selectBean.unitId!!, bundle.getInt("floorNumberStart"), bundle.getInt("floorNumberEnd")
        )
        btnSubmit.setOnClickListener {
            showLoadImage()
            model.submitCheckPointData(createReportData(),
                handler, loginBean.data!!.user!!.id!!, selectBean.measurementsId!!, selectBean.buildingId!!,
                selectBean.unitId!!, bundle.getInt("floorNumberStart"), bundle.getInt("floorNumberEnd")
            )
        }
    }

    override fun onBackPressed() {
        finishFun()
    }

    private fun finishFun() {
        var dialog: AlertDialog = AlertDialog.Builder(this)
            .setMessage("是否保存测量数据")
            .setNegativeButton("保存") { dialog, _ ->
                //以用户id、measurementsId、buildingId、、unitId、楼宇做为缓存标识
                var index =
                    loginBean.data!!.user!!.id + bundle.getString("measurementsId") + bundle.getString("buildingId") +
                            bundle.getString("unitId") + bundle.getInt("floorNumberStart") + bundle.getInt("floorNumberEnd")
                Cache.with(this)
                    .path(cacheDir.path)
                    .saveCache(index, Contants.mAcualMeasurementBean)
                dialog.dismiss()
                finish()
            }
            .setPositiveButton("取消") { dialog, _ ->
                dialog.dismiss()
                finish()
            }
            .create()
        dialog.show()
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
                1001->{
                    showToast("提交成功")
                    finish()
                }
                1002->{
                    showToast("提交失败")
                }
            }
            hideLoadImage()
        }
    }

    private fun createTreeList(bean: ActualMeasurementCheckPointBean) {
        var treeData = ArrayList<CheckPointTreeBean>()
        for (item in bean.data!!) {
            var flooerId = treeData.size + 1
            var bean = CheckPointTreeBean(
                flooerId, 0,
                item.floorNumber + "层 (" + item.roomList!!.size + "个房间," + item.pointCount + "个检查点)"
            )
            bean.data = item.id
            bean.qualifiendProbability = item.qualifiendProbability
            treeData.add(bean)
            for (room in item.roomList!!) {
                var roomId = treeData.size + 1
                var bean = CheckPointTreeBean(
                    roomId, flooerId,
                    room.roomNumber + "(" + room.pointCount + ")个检查点"
                )
                bean.data = room.id
                bean.qualifiendProbability = room.qualifiendProbability
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
            bundle.putString("flooerId", node.parent.data as String)
            bundle.putString("roomId", node.data as String)
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
                //更新视图数据
                currentNode!!.qualifiendProbability = qualifiendProbability
                currentNode!!.parent.qualifiendProbability = calcProbability(currentNode!!.parent.childrenNodes)
                adapter.notifyDataSetChanged()

                //缓存全局数据
                for (flooer in Contants.mAcualMeasurementBean!!.data!!) {
                    if (flooer.id == currentNode!!.parent.data) {
                        flooer.qualifiendProbability = calcProbability(currentNode!!.parent.childrenNodes)
                        for (room in flooer.roomList!!) {
                            if (room.id == currentNode!!.data) {
                                room.qualifiendProbability = qualifiendProbability
                            }
                        }
                    }
                }
            }
        }
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

    private fun createReportData() : CheckPointReportBean {
        var bean = CheckPointReportBean()
        bean.unit = selectBean.unitId
        bean.unitNumber = selectBean.unit!!.unitNumber
        bean.building = selectBean.buildingId
        bean.buildingNumber = selectBean.building!!.buildingNumber
        bean.comId = loginBean.data!!.list!![0].employee!!.comId
        bean.deptName = loginBean.data!!.list!![0].employee!!.dept!!.deptName
        bean.employeeId = loginBean.data!!.list!![0].employee!!.id
        bean.employeeName = loginBean.data!!.list!![0].employee!!.userName
        bean.floor = bundle.getInt("floorNumberStart").toString() + "-" + bundle.getInt("floorNumberEnd").toString()
        bean.measurementsId = selectBean.measurementsId!!
        bean.name = tableBean.name
        bean.programId = tableBean.programId
        bean.programName = bundle.getString("programName")
        bean.programType = tableBean.programType
        var reportList = ArrayList<CheckPointReportBean.ReportListBean>()
        for (flooer in Contants.mAcualMeasurementBean!!.data!!) {
            for (room in flooer.roomList!!) {
                if (room.qualifiendProbability != null) {
                    var reportListBean = CheckPointReportBean.ReportListBean()
                    reportListBean.roomId=room.id
                    reportListBean.roomNumber=room.roomNumber
                    reportListBean.building = selectBean.buildingId
                    reportListBean.buildingNumber = selectBean.building!!.buildingNumber
                    reportListBean.comId = loginBean.data!!.list!![0].employee!!.comId
                    reportListBean.deptName = loginBean.data!!.list!![0].employee!!.dept!!.deptName
                    reportListBean.employeeId = loginBean.data!!.list!![0].employee!!.id
                    reportListBean.employeeName = loginBean.data!!.list!![0].employee!!.userName
                    reportListBean.floor =flooer.id
                    reportListBean.floorNumber=flooer.floorNumber
                    reportListBean.measurementsId = selectBean.measurementsId!!
                    reportListBean.name = tableBean.name
                    reportListBean.programId = tableBean.programId
                    reportListBean.programName = bundle.getString("programName")
                    reportListBean.programType = tableBean.programType
                    reportListBean.unit = selectBean.unitId
                    reportListBean.unitNumber = selectBean.unit!!.unitNumber
                    reportListBean.qualifiedPercent = room.qualifiendProbability!!
                    var reportArticleList = ArrayList<CheckPointReportBean.ReportListBean.ReportArticleListBean>()
                    for (article in room.measurements!!.articleList!!) {
                        if(article.qualifiendProbability==null) continue
                        var reportArticleBean = CheckPointReportBean.ReportListBean.ReportArticleListBean()
                        reportArticleBean.name = article.name
                        reportArticleBean.qualifiedPercent = article.qualifiendProbability!!
                        var reportItemList =
                            ArrayList<CheckPointReportBean.ReportListBean.ReportArticleListBean.ReportItemListBean>()
                        for(item in article.itemList!!){
                            var reportItemBean= CheckPointReportBean.ReportListBean.ReportArticleListBean.ReportItemListBean()
                            if(item.qualifiendProbability==null) continue
                            reportItemBean.qualifiedPercent=item.qualifiendProbability!!
                            reportItemBean.name=item.name
                            var reportModelList =
                                ArrayList<CheckPointReportBean.ReportListBean.ReportArticleListBean.ReportItemListBean.ReportModelListBean>()
                            for(model in item.modelList!!){
                                var reportModelBean= CheckPointReportBean.ReportListBean.ReportArticleListBean.ReportItemListBean.ReportModelListBean()
                                if(model.qualifiendProbability==null) continue
                                reportModelBean.qualifiedPercent=model.qualifiendProbability!!
                                reportModelBean.criteria=model.criteria
                                reportModelBean.name=model.name
                                reportModelBean.pointRule=model.pointRule
                                reportModelBean.resultName=model.resultName
                                var reportPotionList =
                                    ArrayList<CheckPointReportBean.ReportListBean.ReportArticleListBean.ReportItemListBean.ReportModelListBean.PositionListBean>()
                                for(position in model.roomList!![0].positionList!!){
                                    var positionBean= CheckPointReportBean.ReportListBean.ReportArticleListBean.ReportItemListBean.ReportModelListBean.PositionListBean()
                                    if(position.qualifiendProbability==null) continue
                                    positionBean.qualifiedPercent=position.qualifiendProbability!!
                                    positionBean.name=position.name
                                    var pointList=ArrayList<CheckPointReportBean.ReportListBean.ReportArticleListBean.ReportItemListBean.ReportModelListBean.PositionListBean.PointListBean>()
                                    for(point in position.pointList!!){
                                        if(point.qualifiendStatus==null) continue
                                        var pointBean= CheckPointReportBean.ReportListBean.ReportArticleListBean.ReportItemListBean.ReportModelListBean.PositionListBean.PointListBean()
                                        pointBean.name=point.name
                                        pointBean.qualifiedStatus=point.qualifiendStatus
                                        pointBean.result=point.pointValue
                                        pointList.add(pointBean)
                                    }
                                    positionBean.pointList=pointList
                                    reportPotionList.add(positionBean)
                                }
                                reportModelBean.positionList=reportPotionList
                                reportModelList.add(reportModelBean)
                            }
                            reportItemBean.reportModelList=reportModelList
                            reportItemList.add(reportItemBean)
                        }
                        reportArticleBean.reportItemList = reportItemList
                        reportArticleList.add(reportArticleBean)
                    }
                    reportListBean.reportArticleList = reportArticleList
                    reportList.add(reportListBean)
                }
            }
        }
        bean.reportList = reportList
        return bean
    }
}
