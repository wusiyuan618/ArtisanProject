package com.hjl.artisan.tool.view.ActualMeasurement

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.hjl.artisan.R

class EdModelViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var tv: TextView = itemView.findViewById<View>(R.id.tvModelItem) as TextView
    var ed: EditText = itemView.findViewById<View>(R.id.edModelItem) as EditText
}
