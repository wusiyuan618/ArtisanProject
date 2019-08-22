package com.hjl.artisan.tool.view.ActualMeasurement

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.hjl.artisan.R

class ActualMeasurementSelectProViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val tv:TextView = itemView.findViewById(R.id.tv)
    val img:ImageView=itemView.findViewById(R.id.img)
}