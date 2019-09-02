package com.hjl.artisan.me.presenter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hjl.artisan.R
import com.hjl.artisan.me.bean.MessageNotSignBean
import com.hjl.artisan.me.view.MessageNotSignViewHolder
import com.wusy.wusylibrary.base.BaseRecyclerAdapter

class MessageNotSignAdapter(context:Context) :BaseRecyclerAdapter<MessageNotSignBean.DataBean.RowsBean>(context){
    var currentGroupTime=""
    override fun onMyCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        return MessageNotSignViewHolder(
            LayoutInflater.from(context)
                .inflate(R.layout.item_msg_notsign, parent, false)
        )
    }

    override fun onMyBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        if(holder is MessageNotSignViewHolder){
            val thisHolder=holder as MessageNotSignViewHolder
            if(list[position].groupTime==currentGroupTime){
                thisHolder.rlTime.visibility= View.GONE
            }else{
                currentGroupTime=list[position].groupTime?:""
                thisHolder.rlTime.visibility= View.VISIBLE
            }
            var location=list[position].notSignProgram?.locationName?.split(",")?:ArrayList()
            thisHolder.tvTitle.text=location[0]+"-"+list[position].notSignProgram?.partyaName+"-"+list[position].notSignProgram?.programName
            thisHolder.tvContent.text=list[position].notSignCount.toString()
            thisHolder.tvTime.text=list[position].groupTime
        }
    }
}
