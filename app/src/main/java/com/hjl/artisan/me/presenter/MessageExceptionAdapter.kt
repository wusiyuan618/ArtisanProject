package com.hjl.artisan.me.presenter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.gohome.pad.data.net.http.UrlForOkhttp
import com.hjl.artisan.R
import com.hjl.artisan.me.bean.MessageExceptionBean
import com.hjl.artisan.me.view.MessageExceptionViewHolder
import com.wusy.wusylibrary.base.BaseRecyclerAdapter
import com.wusy.wusylibrary.util.ImageLoaderUtil

class MessageExceptionAdapter(context: Context) : BaseRecyclerAdapter<MessageExceptionBean.DataBean.RowsBean>(context){
    lateinit var onBtnClickListener:OnBtnClickListener

    override fun onMyCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        return MessageExceptionViewHolder(
            LayoutInflater.from(context)
                .inflate(R.layout.item_msg_errorsign, parent, false)
        )
    }

    override fun onMyBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        if(holder is MessageExceptionViewHolder){
            val thisHolder=holder as MessageExceptionViewHolder
            thisHolder.tvName.text="姓名："+list[position].exceptionSignLabourer?.name?:""
            thisHolder.tvUnit.text="工种："+list[position].exceptionSignLabourer?.workType!![0].name?:""
            thisHolder.tvPhone.text="联系方式："+list[position].exceptionSignLabourer?.phone?:""
            thisHolder.tvTimePro.text="("+list[position].groupTime+")同时出现的项目"
            ImageLoaderUtil.getInstance(context).loadingImage(UrlForOkhttp.getImageURL(list[position].exceptionSignLabourer?.faceImg?:""),thisHolder.img)
            for(bean in list[position].exceptionSignProgram?:ArrayList()){
                var paramsTextView = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)
                paramsTextView.gravity=Gravity.CENTER_HORIZONTAL
                var programStr=bean.locationName?.split(",")!![1]+bean.partyaName+bean.programName
                paramsTextView.bottomMargin=10
                if(thisHolder.llTotal.tag!="initEnd") thisHolder.llTotal.addView(createTextViewItem(programStr),paramsTextView)
            }
            var llKnow=createButton()
            var paramsKnow = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 80)
            llKnow.setBackgroundColor(context.resources.getColor(R.color.selectColor))
            llKnow.gravity=Gravity.CENTER
            paramsKnow.leftMargin=20
            paramsKnow.rightMargin=20
            paramsKnow.topMargin=20
            if(thisHolder.llTotal.tag!="initEnd") thisHolder.llTotal.addView(llKnow,paramsKnow)
            if(list[position].dealStatus=="1"){
                thisHolder.llStatusPass.visibility=View.VISIBLE
                llKnow.visibility=View.GONE
            }else{
                thisHolder.llStatusPass.visibility=View.GONE
                llKnow.visibility=View.VISIBLE
            }
            llKnow.setOnClickListener {
                if(onBtnClickListener!=null) onBtnClickListener.clickOk(list[position],thisHolder,llKnow)
            }

            var line=View(context)
            var paramsLine = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 2)
            line.setBackgroundColor(context.resources.getColor(R.color.dividingLine))
            paramsLine.leftMargin=24
            paramsLine.rightMargin=24
            paramsLine.topMargin=20
            if(thisHolder.llTotal.tag!="initEnd") thisHolder.llTotal.addView(line,paramsLine)
            thisHolder.llTotal.tag="initEnd"
        }
    }
    fun createTextViewItem(text:String):TextView{
        var tv=TextView(context)
        tv.textSize=11f
        tv.text=text
//        tv.setTextColor(context.resources.getColor(R.color.colorText))
        return tv
    }
    fun createButton():LinearLayout{
        var img=ImageView(context)
        var paramsImg = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)
        img.setImageResource(R.mipmap.icon_yes_news)
        var tv=TextView(context)
        var paramsTextView = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)
        tv.textSize=13.0f
        tv.setTextColor(context.resources.getColor(R.color.white))
        tv.text="我知道了"
        paramsTextView.leftMargin=24
        var ll=LinearLayout(context)
        ll.addView(img,paramsImg)
        ll.addView(tv,paramsTextView)
        return ll
    }
    interface OnBtnClickListener{
        fun clickOk(bean:MessageExceptionBean.DataBean.RowsBean,holder:MessageExceptionViewHolder,llKnow:LinearLayout)
    }



}
