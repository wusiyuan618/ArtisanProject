package com.hjl.artisan.me.view

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.hjl.artisan.R

class NotSignDetailViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    var tvName: TextView = itemView.findViewById(R.id.tvName)
    var tvGroup: TextView = itemView.findViewById(R.id.tvGroup)
    var tvleader: TextView = itemView.findViewById(R.id.tvleader)
    var tvUnit: TextView = itemView.findViewById(R.id.tvUnit)
    var tvPhone: TextView = itemView.findViewById(R.id.tvPhone)
    var tvSignTimeContent: TextView = itemView.findViewById(R.id.tvSignTimeContent)
    var img: ImageView = itemView.findViewById(R.id.img)

}
