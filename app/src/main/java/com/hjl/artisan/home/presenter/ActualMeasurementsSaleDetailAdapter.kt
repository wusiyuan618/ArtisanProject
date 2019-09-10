package com.hjl.artisan.home.presenter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.hjl.artisan.R
import com.hjl.artisan.home.bean.ActualMeasurementsSalesDetailBean
import com.hjl.artisan.home.view.SaleDetailViewHolder
import com.wusy.wusylibrary.base.BaseRecyclerAdapter

class ActualMeasurementsSaleDetailAdapter(context:Context):BaseRecyclerAdapter<ActualMeasurementsSalesDetailBean.DataBeanX.ReportListBean>(context){
    override fun onMyCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        return SaleDetailViewHolder(
            LayoutInflater.from(context)
                .inflate(R.layout.item_salesdetail, parent, false)
        )
    }

    override fun onMyBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        if(holder is SaleDetailViewHolder){
            var thisHolder=holder as SaleDetailViewHolder

        }
    }

}
