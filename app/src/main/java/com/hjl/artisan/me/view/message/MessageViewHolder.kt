package com.hjl.artisan.me.view.message

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import com.hjl.artisan.R
import com.wusy.wusylibrary.view.AvatarImageView

class MessageViewHolder(view:View):RecyclerView.ViewHolder(view){
    var img: AvatarImageView =itemView.findViewById(R.id.img)
    var redIcon: ImageView = itemView.findViewById(R.id.redIcon)
    var tvMsg: TextView = itemView.findViewById(R.id.tvMsg)
    var tvMsgCount: TextView = itemView.findViewById(R.id.tvMsgCount)
    var rlMsg: RelativeLayout = itemView.findViewById(R.id.rlMsg)
}
