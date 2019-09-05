package com.hjl.artisan.tool.view.ActualMeasurement

import android.annotation.TargetApi
import android.bluetooth.BluetoothAdapter
import android.bluetooth.le.BluetoothLeScanner
import android.bluetooth.le.ScanCallback
import android.bluetooth.le.ScanResult
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.view.View
import android.widget.TextView
import cc.fussen.cache.Cache
import com.aigestudio.wheelpicker.WheelPicker
import com.gohome.pad.data.net.http.UrlForOkhttp
import com.wusy.wusylibrary.base.BaseActivity
import kotlinx.android.synthetic.main.activity_actualmeasurements_detail.*
import com.hjl.artisan.R
import com.hjl.artisan.login.bean.LoginBean
import com.hjl.artisan.service.RulerService
import com.hjl.artisan.tool.bean.ActualMeasurement.ActuralMeasurementTableBean
import com.hjl.artisan.tool.bean.ActualMeasurement.BleDev
import com.wusy.wusylibrary.util.CommonUtil
import com.wusy.wusylibrary.util.ImageLoaderUtil
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList


class ActualMeasurementDetailView : BaseActivity() {
    private lateinit var buildPop: SelectBuildPop
    private lateinit var foolerPop: SelectFlooerPop
    private lateinit var tableBean: ActuralMeasurementTableBean.DataBean.RowsBean
    private var isReadyBuildPop = false
    private var isReadyFlooerPop = false
    private lateinit var selectBuild: ActuralMeasurementTableBean.DataBean.RowsBean.FloorLinkListBean
    private var selectStartFlooer=0
    private var selectEndFlooer=0


    override fun getContentViewId(): Int {
        return R.layout.activity_actualmeasurements_detail
    }

    override fun findView() {

    }

    override fun init() {
        titleView.setTitle("实测实量")
            .showBackButton(true, this)
            .build()
        tableBean = intent.extras.getSerializable("tableBean") as ActuralMeasurementTableBean.DataBean.RowsBean
        initTitle()
        initBuildPop()
        rlSelectBuild.setOnClickListener {
            if (isReadyBuildPop)
                buildPop.showPopupWindow()
            else
                showToast("无法查询楼宇信息")
        }
        rlSelectFloor.setOnClickListener {
            if (isReadyFlooerPop)
                foolerPop.showPopupWindow()
            else
                showToast("请先选择楼宇")
        }
        btnCheck.setOnClickListener {
            if(selectEndFlooer==0||selectStartFlooer==0){
                showToast("请先确认楼层")
                return@setOnClickListener
            }
            var bundle=Bundle()
            bundle.putString("programName",intent.extras.getString("programName"))
            bundle.putInt("floorNumberStart",selectStartFlooer)
            bundle.putInt("floorNumberEnd",selectEndFlooer)
            bundle.putString("navigate",tvSelectBuild.text.toString().split("(")[0])
            bundle.putSerializable("tableBean",tableBean)
            bundle.putSerializable("selectBean",selectBuild)
            navigateTo(ActualMeasurementCheckPointActvity::class.java,bundle)
        }
        rulerService = Intent(this@ActualMeasurementDetailView, RulerService::class.java)
        scanBle()
    }

    private fun initTitle() {
        tvTitle.text = tableBean.name
        tvProName.text = "项目名称： " + intent.extras.getString("programName")
        val d = Date()
        val sdf = SimpleDateFormat("yyyy-MM-dd")
        tvTime.text = "检查时间： " + sdf.format(d)
        var loginBean = Cache.with(this)
            .path(cacheDir.path)
            .getCache("LoginBean", LoginBean::class.java)
        tvPerson.text =
            "检查人员： " + loginBean.data!!.list!![0].employee!!.dept!!.deptName + " " + loginBean.data!!.list!![0].employee!!.userName
    }

    private fun initFlooerPlan(imgUrl:String?) {
        if (!CommonUtil.isNull(imgUrl)){
            ImageLoaderUtil.getInstance(this).loadingImage(UrlForOkhttp.getImageURL(imgUrl!!),imgFloorPlan)
            tvFloorPlan.visibility=View.VISIBLE
            rlFloorPlan.visibility=View.VISIBLE
        }else{
            tvFloorPlan.visibility=View.GONE
            rlFloorPlan.visibility=View.GONE
        }
    }

    private fun initBuildPop() {
        var buildList = ArrayList<String>()
        for (floorLinkBean in tableBean.floorLinkList!!) {
            buildList.add(
                floorLinkBean.building!!.buildingNumber + "栋" +
                        floorLinkBean.unit!!.unitNumber + "单元" +
                        "(" + floorLinkBean.floorAll!!.floorNumberStart + "-" + floorLinkBean.floorAll!!.floorNumberEnd + ")层"
            )
        }
        buildPop = SelectBuildPop(this)
        var wheel = buildPop.contentView.findViewById<WheelPicker>(R.id.wheel)
        var tvCancel = buildPop.contentView.findViewById<TextView>(R.id.tvCancel)
        var tvOk = buildPop.contentView.findViewById<TextView>(R.id.tvOk)
        initWheel(wheel)
        wheel.data = buildList
        tvCancel.setOnClickListener {
            buildPop.dismiss()
        }
        tvOk.setOnClickListener {
            if (!CommonUtil.isNull(buildList[wheel.currentItemPosition])) {
                tvSelectBuild.text = buildList[wheel.currentItemPosition]
                buildImg.visibility = View.INVISIBLE
                initFoolerPop(tableBean.floorLinkList!![wheel.currentItemPosition])
                selectBuild= tableBean.floorLinkList!![wheel.currentItemPosition]
            }
            buildPop.dismiss()
        }
        isReadyBuildPop = true
    }

    private fun initFoolerPop(floorLinkListBean: ActuralMeasurementTableBean.DataBean.RowsBean.FloorLinkListBean) {
        foolerPop = SelectFlooerPop(this)
        var startList = ArrayList<Int>()
        var endList = ArrayList<Int>()
        var wheelStart = foolerPop.contentView.findViewById<WheelPicker>(R.id.wheelStart)
        var wheelEnd = foolerPop.contentView.findViewById<WheelPicker>(R.id.wheelEnd)
        var tvCancel = foolerPop.contentView.findViewById<TextView>(R.id.tvCancel)
        var tvOk = foolerPop.contentView.findViewById<TextView>(R.id.tvOk)

        for (i in floorLinkListBean.floorAll!!.floorNumberStart!!.toInt() until floorLinkListBean.floorAll!!.floorNumberEnd!!.toInt() + 1) {
            startList.add(i)
        }
        initWheel(wheelStart)
        wheelStart.data = startList


        endList.addAll(startList)
        initWheel(wheelEnd)
        wheelEnd.data = endList

        wheelStart.setOnItemSelectedListener { _, _, position ->
            endList.clear()
            for (i in startList[position] until floorLinkListBean.floorAll!!.floorNumberEnd!!.toInt() + 1) {
                endList.add(i)
            }
            wheelEnd.data = endList
        }
        tvCancel.setOnClickListener {
            foolerPop.dismiss()
        }
        tvOk.setOnClickListener {
            if (!CommonUtil.isNull(startList[wheelStart.currentItemPosition]) && !CommonUtil.isNull(endList[wheelEnd.currentItemPosition])) {
                tvSelectFloor.text =
                    startList[wheelStart.currentItemPosition].toString() + "层至" + endList[wheelEnd.currentItemPosition] + "层"
                floorImg.visibility = View.INVISIBLE
                initFlooerPlan(floorLinkListBean.floorAll!!.imgUrl)
                selectStartFlooer=startList[wheelStart.currentItemPosition]
                selectEndFlooer=endList[wheelEnd.currentItemPosition]
            }
            foolerPop.dismiss()
        }
        isReadyFlooerPop = true
    }

    private fun initWheel(wheel: WheelPicker) {
        wheel.setIndicator(true)
        wheel.indicatorColor = resources.getColor(R.color.green)
        wheel.visibleItemCount = 7
        wheel.itemTextColor = resources.getColor(R.color.wheelNormalItem)
        wheel.selectedItemTextColor = resources.getColor(R.color.colorText)
        wheel.setCurtain(true)
        wheel.setAtmospheric(true)
        wheel.isCurved = true
    }

    private lateinit var bluetoothLeScanner: BluetoothLeScanner
    private var isSearchDev = false
    private lateinit var rulerService: Intent

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    private fun scanBle() {
        val bluetoothAdapter = BluetoothAdapter.getDefaultAdapter()
        bluetoothLeScanner = bluetoothAdapter.bluetoothLeScanner
        // Android5.0新增的扫描API，扫描返回的结果更友好，比如BLE广播数据以前是byte[] scanRecord，而新API帮我们解析成ScanRecord类
        bluetoothLeScanner.startScan(mScanCallback)
        Thread(Runnable {
            Thread.sleep(5000)
            bluetoothLeScanner.stopScan(mScanCallback) //停止扫描
            if (!isSearchDev) {
                runOnUiThread {
                    showToast("未能找到智能量尺")
                }
            }
        }).start()
    }
    private val mScanCallback = @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    object : ScanCallback() {
        // 扫描Callback
        @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
        override fun onScanResult(callbackType: Int, result: ScanResult) {
            val dev = BleDev(result.device, result)
//            Log.i("wsy", "查到了DEV" + dev.dev.name)
            if (dev.dev.name == RulerService.DEVNAME) {
                rulerService.putExtra("dev", dev.dev)
                startService(rulerService)
                isSearchDev=true
                bluetoothLeScanner.stopScan(this) //停止扫描
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        stopService(rulerService)
    }
}
