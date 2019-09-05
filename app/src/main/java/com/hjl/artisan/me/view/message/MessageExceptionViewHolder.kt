package com.hjl.artisan.me.view.message

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.hjl.artisan.R

class MessageExceptionViewHolder(view: View): RecyclerView.ViewHolder(view){
    var img: ImageView = itemView.findViewById(R.id.img)
    var tvName: TextView = itemView.findViewById(R.id.tvName)
    var tvUnit: TextView = itemView.findViewById(R.id.tvUnit)
    var tvPhone: TextView = itemView.findViewById(R.id.tvPhone)
    var llStatusPass: LinearLayout = itemView.findViewById(R.id.llStatusPass)
    var tvTimePro: TextView = itemView.findViewById(R.id.tvTimePro)
    var llTotal: LinearLayout = itemView.findViewById(R.id.llTotal)

}
