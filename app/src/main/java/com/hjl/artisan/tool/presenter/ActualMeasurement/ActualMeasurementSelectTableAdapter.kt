package com.hjl.artisan.tool.presenter.ActualMeasurement

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.hjl.artisan.R
import com.hjl.artisan.tool.bean.ActualMeasurement.ActuralMeasurementTableBean
import com.hjl.artisan.tool.view.ActualMeasurement.ActualMeasurementSelectProViewHolder
import com.wusy.wusylibrary.base.BaseRecyclerAdapter

class ActualMeasurementSelectTableAdapter(context: Context) : BaseRecyclerAdapter<ActuralMeasurementTableBean.DataBean.RowsBean>(context)  {
    override fun onMyCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        return ActualMeasurementSelectProViewHolder(
            LayoutInflater.from(context)
                .inflate(R.layout.item_selectpro, parent, false)
        )
    }

    override fun onMyBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        if (holder is ActualMeasurementSelectProViewHolder) {
            val amHolder = holder as ActualMeasurementSelectProViewHolder
            amHolder.tv.text=list[position].name
        }
    }
}