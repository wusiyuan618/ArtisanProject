package com.hjl.artisan.home.view

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.LinearLayout
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
class SaleDetailViewHolder(view:View):RecyclerView.ViewHolder(view){
    var checkbox: CheckBox =itemView.findViewById(R.id.checkbox)
    var tvTitle: TextView =itemView.findViewById(R.id.tvTitle)
    var tvLocation: TextView =itemView.findViewById(R.id.tvLocation)
    var tvPoint: TextView =itemView.findViewById(R.id.tvPoint)
    var tvQualified: TextView =itemView.findViewById(R.id.tvQualified)
    var llFeedBack: LinearLayout =itemView.findViewById(R.id.llFeedBack)
    var feedBackList: LinearLayout =itemView.findViewById(R.id.feedBackList)
}
