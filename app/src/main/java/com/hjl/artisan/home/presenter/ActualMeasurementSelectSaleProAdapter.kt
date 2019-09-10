package com.hjl.artisan.home.presenter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.hjl.artisan.R
import com.hjl.artisan.home.bean.ActualMeasurementsSelectSalesProBean
import com.hjl.artisan.home.view.SelectSalesProViewHolder
import com.wusy.wusylibrary.base.BaseRecyclerAdapter

class ActualMeasurementSelectSaleProAdapter(context: Context) :BaseRecyclerAdapter<ActualMeasurementsSelectSalesProBean.DataBeanX.RowsBean>(context) {
    override fun onMyCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        return SelectSalesProViewHolder(
            LayoutInflater.from(context)
                .inflate(R.layout.item_saleselectpro, parent, false)
        )
    }

    override fun onMyBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        if(holder is SelectSalesProViewHolder) {
            var thisHolder = holder as SelectSalesProViewHolder
            if(list[position].warningLevel=="2"){
                thisHolder.ivIcon.setImageResource(R.mipmap.icon_dangerous_quality)
                thisHolder.tvRisk.text="(风险极高)"
                thisHolder.tvRisk.setTextColor(context.resources.getColor(R.color.red))
            }else{
                thisHolder.ivIcon.setImageResource(R.mipmap.icon_dangerous1_quality)
                thisHolder.tvRisk.text="(风险高)"
                thisHolder.tvRisk.setTextColor(context.resources.getColor(R.color.yellow))
            }
            var location=list[position].program?.locationName?.split(",")?:ArrayList()
            if(location.isNotEmpty()) thisHolder.tvProName.text=location[1]+list[position].program?.partyaName+list[position].program?.programName
            thisHolder.tvTable.text="测量表: "+list[position].name
            thisHolder.tvFraction.text="检测合格率："+((list[position].qualifiedPercent?.toFloat()?:0f)*100)+"%"
            thisHolder.tvTime.text="检测时间："+list[position].startTime
        }
    }
}