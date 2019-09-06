package com.hjl.artisan.service

import android.annotation.TargetApi
import android.app.Activity
import android.bluetooth.BluetoothAdapter
import android.bluetooth.le.BluetoothLeScanner
import android.bluetooth.le.ScanCallback
import android.bluetooth.le.ScanResult
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.os.Build
import android.support.annotation.RequiresApi
import android.support.v7.app.AlertDialog
import android.util.Log
import android.widget.Toast
import com.hjl.artisan.tool.bean.ActualMeasurement.BleDev

class BlueBLEUtil constructor(private val activity: Activity) {
    private lateinit var bluetoothLeScanner: BluetoothLeScanner
    private var isSearchDev = false
    private var rulerService: Intent = Intent(activity, RulerService::class.java)
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    /**
     * 开始扫描 蓝牙设备
     */
    fun scanBle() {
        var intent=Intent(RulerService.CONNECTING)
        activity.sendBroadcast(intent)
        val bluetoothAdapter = BluetoothAdapter.getDefaultAdapter()
        if (bluetoothAdapter == null) {//没有蓝牙驱动
            var intent=Intent(RulerService.FAILURE)
            intent.putExtra("data","本机没有找到蓝牙硬件或驱动！")
            activity.sendBroadcast(intent)
            return
        } else {
            if (!bluetoothAdapter.isEnabled) {//蓝牙没有开启
                //直接开启蓝牙
                bluetoothAdapter.enable()
                reConnect()
            }else{//蓝牙正常，开始扫描
                bluetoothLeScanner = bluetoothAdapter.bluetoothLeScanner
                // Android5.0新增的扫描API，扫描返回的结果更友好，比如BLE广播数据以前是byte[] scanRecord，而新API帮我们解析成ScanRecord类
                bluetoothLeScanner.startScan(mScanCallback)
                Thread(Runnable {
                    Thread.sleep(5000)
                    bluetoothLeScanner.stopScan(mScanCallback) //停止扫描
                    if (!isSearchDev) {
                        var intent=Intent(RulerService.FAILURE)
                        intent.putExtra("data","未能识别到靠尺设备")
                        activity.sendBroadcast(intent)
                    }
                }).start()
            }
        }

    }
    fun stopBle(){
        activity.stopService(rulerService)
    }
    private val mScanCallback = @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    object : ScanCallback() {
        // 扫描Callback
        @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
        override fun onScanResult(callbackType: Int, result: ScanResult) {
            val dev = BleDev(result.device, result)
            Log.i("wsy",dev.dev.name?:"")
            if (dev.dev.name == RulerService.DEVNAME) {
                rulerService.putExtra("dev", dev.dev)
                activity.startService(rulerService)
                isSearchDev=true
                bluetoothLeScanner.stopScan(this) //停止扫描
            }
        }
    }
    fun reConnect() {
        val dialog = AlertDialog.Builder(activity)
            .setMessage("未能连接到靠尺设备，是否继续连接")
            .setNegativeButton("重连") { dialog, which ->
                isSearchDev=false
                scanBle()
                dialog.dismiss()
            }
            .setPositiveButton("取消") {
                    dialog, which -> dialog.dismiss()
            }.create()
        dialog.show()
    }
}
