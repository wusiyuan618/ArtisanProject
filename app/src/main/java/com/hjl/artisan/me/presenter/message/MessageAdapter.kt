package com.hjl.artisan.me.presenter.message

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hjl.artisan.R
import com.hjl.artisan.me.bean.MessageBean
import com.hjl.artisan.me.view.message.MessageViewHolder
import com.wusy.wusylibrary.base.BaseRecyclerAdapter

class MessageAdapter(context:Context):BaseRecyclerAdapter<MessageBean>(context){
    override fun onMyCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        return MessageViewHolder(
            LayoutInflater.from(context)
                .inflate(R.layout.item_message, parent, false)
        )
    }

    override fun onMyBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        if (holder is MessageViewHolder){
            var thisHolder=holder as MessageViewHolder
            thisHolder.img.setImageResource(list[position].icon?:0)
            thisHolder.tvMsg.text=list[position].title
            if(list[position].hasNewMessage()){
                thisHolder.redIcon.visibility= View.VISIBLE
                thisHolder.tvMsgCount.text="未读("+list[position].notRedCount+"条)  "
                thisHolder.tvMsgCount.setTextColor(context.resources.getColor(R.color.colorTextSelect))
            }
            if(list[position].hasDealMessage()){
                thisHolder.redIcon.visibility= View.VISIBLE
                thisHolder.tvMsgCount.text=thisHolder.tvMsgCount.text.toString()+"待处理("+list[position].waitDealCount+"条)"
                thisHolder.tvMsgCount.setTextColor(context.resources.getColor(R.color.colorTextSelect))
            }
            if(!list[position].hasDealMessage()&&!list[position].hasNewMessage()){
                thisHolder.redIcon.visibility= View.GONE
                thisHolder.tvMsgCount.text="无新消息"
                thisHolder.tvMsgCount.setTextColor(context.resources.getColor(R.color.msgNotReadColor))
            }
        }
    }

}
