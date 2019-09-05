package com.hjl.artisan.me.view.message

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.RelativeLayout
import android.widget.TextView
import com.hjl.artisan.R

class MessageNotSignViewHolder(view: View):RecyclerView.ViewHolder(view){
    var rlTime: RelativeLayout = itemView.findViewById(R.id.rlTime)
    var tvTime: TextView = itemView.findViewById(R.id.tvTime)
    var tvTitle: TextView = itemView.findViewById(R.id.tvTitle)
    var tvContent: TextView = itemView.findViewById(R.id.tvContent)

}
