package com.hjl.artisan.tool.bean.ActualMeasurement

import android.bluetooth.BluetoothDevice
import android.bluetooth.le.ScanResult

import java.util.Objects

class BleDev internal constructor(var dev: BluetoothDevice, internal var scanResult: ScanResult) {

    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o == null || javaClass != o.javaClass) return false
        val bleDev = o as BleDev?
        return dev == bleDev!!.dev
    }

    override fun hashCode(): Int {
        return Objects.hash(dev)
    }
}