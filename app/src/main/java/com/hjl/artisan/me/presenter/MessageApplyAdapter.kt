package com.hjl.artisan.me.presenter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gohome.pad.data.net.http.UrlForOkhttp
import com.hjl.artisan.R
import com.hjl.artisan.me.bean.MessageApplyBean
import com.hjl.artisan.me.view.MessageApplyViewHolder
import com.wusy.wusylibrary.base.BaseRecyclerAdapter
import com.wusy.wusylibrary.util.ImageLoaderUtil

class MessageApplyAdapter(context: Context) :BaseRecyclerAdapter<MessageApplyBean.DataBean.RowsBean>(context){
    lateinit var onBtnClickListener:OnBtnClickListener
    override fun onMyCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        return MessageApplyViewHolder(
            LayoutInflater.from(context)
                .inflate(R.layout.item_msg_apply, parent, false)
        )
    }

    override fun onMyBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        if(holder is MessageApplyViewHolder){
            var thisHolder=holder as MessageApplyViewHolder
            ImageLoaderUtil.getInstance(context).loadingImage(UrlForOkhttp.getImageURL(list[position].applyLink?.labourer?.faceImg?:""),thisHolder.img)
            thisHolder.tvName.text="姓名："+list[position].applyLink?.labourer?.name
            thisHolder.tvUnit.text="工种："
            for (bean in list[position].applyLink?.labourer?.workType?:ArrayList()){
                thisHolder.tvUnit.text=thisHolder.tvUnit.text.toString()+bean.name
            }
            thisHolder.tvGroup.text="班组："+list[position].applyLink?.ganger?.name
            var location=list[position].applyLink?.program?.locationName?.split(",")?:ArrayList()
            if(location.isNotEmpty()) thisHolder.tvPro.text="项目："+location[1]+list[position].applyLink?.program?.partyaName+list[position].applyLink?.program?.programName
            if(list[position].checkStatus=="2"){//已忽略
                thisHolder.llBtn.visibility= View.GONE
                thisHolder.llStatusIgnore.visibility=View.VISIBLE
                thisHolder.llStatusPass.visibility=View.GONE
            }else if(list[position].checkStatus=="1"){//已通过
                thisHolder.llBtn.visibility= View.GONE
                thisHolder.llStatusIgnore.visibility=View.GONE
                thisHolder.llStatusPass.visibility=View.VISIBLE
            }else{
                thisHolder.llBtn.visibility= View.VISIBLE
                thisHolder.llStatusIgnore.visibility=View.GONE
                thisHolder.llStatusPass.visibility=View.GONE
            }
            thisHolder.btnOk.setOnClickListener {
                if(onBtnClickListener!=null) onBtnClickListener.clickOk(list[position],thisHolder)
            }
            thisHolder.btnCancel.setOnClickListener {
                if(onBtnClickListener!=null) onBtnClickListener.clickCancel(list[position],thisHolder)
            }
        }
    }

    interface OnBtnClickListener{
        fun clickOk(bean:MessageApplyBean.DataBean.RowsBean,holder:MessageApplyViewHolder)
        fun clickCancel(bean:MessageApplyBean.DataBean.RowsBean,holder:MessageApplyViewHolder)
    }

}
