package com.hjl.artisan.me.view.message

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.hjl.artisan.R

class MessageApplyViewHolder(view: View): RecyclerView.ViewHolder(view){
    var img: ImageView =itemView.findViewById(R.id.img)
    var tvName: TextView =itemView.findViewById(R.id.tvName)
    var tvUnit: TextView =itemView.findViewById(R.id.tvUnit)
    var tvGroup: TextView =itemView.findViewById(R.id.tvGroup)
    var tvPro: TextView =itemView.findViewById(R.id.tvPro)
    var llBtn: LinearLayout =itemView.findViewById(R.id.llBtn)
    var btnOk: LinearLayout =itemView.findViewById(R.id.btnOk)
    var btnCancel: LinearLayout =itemView.findViewById(R.id.btnCancel)
    var llStatusIgnore: LinearLayout =itemView.findViewById(R.id.llStatusIgnore)
    var llStatusPass: LinearLayout =itemView.findViewById(R.id.llStatusPass)


}
