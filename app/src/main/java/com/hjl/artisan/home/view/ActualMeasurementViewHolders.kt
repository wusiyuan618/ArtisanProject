package com.hjl.artisan.home.view

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.hjl.artisan.R

class SelectSalesProViewHolder(view:View):RecyclerView.ViewHolder(view){
    var ivIcon: ImageView =itemView.findViewById(R.id.ivIcon)
    var tvProName: TextView =itemView.findViewById(R.id.tvProName)
    var tvFraction: TextView =itemView.findViewById(R.id.tvFraction)
    var tvRisk: TextView =itemView.findViewById(R.id.tvRisk)
    var tvTime: TextView =itemView.findViewById(R.id.tvTime)
    var tvTable: TextView =itemView.findViewById(R.id.tvTable)
}
