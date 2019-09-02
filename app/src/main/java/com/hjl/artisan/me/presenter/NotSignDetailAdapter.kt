package com.hjl.artisan.me.presenter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.gohome.pad.data.net.http.UrlForOkhttp
import com.hjl.artisan.R
import com.hjl.artisan.me.bean.NotSignDetailBean
import com.hjl.artisan.me.view.NotSignDetailViewHolder
import com.wusy.wusylibrary.base.BaseRecyclerAdapter
import com.wusy.wusylibrary.util.ImageLoaderUtil

class NotSignDetailAdapter(context: Context) : BaseRecyclerAdapter<NotSignDetailBean.DataBean.RowsBean>(context){
    override fun onMyCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        return NotSignDetailViewHolder(
            LayoutInflater.from(context)
                .inflate(R.layout.item_notsigndetail, parent, false)
        )
    }

    override fun onMyBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        if(holder is NotSignDetailViewHolder){
            val thisHolder=holder as NotSignDetailViewHolder
            thisHolder.tvName.text="姓名: "+list[position].labourerName
            thisHolder.tvGroup.text="班组: "+list[position].gangerName
            thisHolder.tvUnit.text="工种: "+list[position].labourerWorkType
            thisHolder.tvleader.text="班主: "+"-"
            thisHolder.tvPhone.text="联系方式: "+list[position].labourerPhone
            var times=list[position].inTime?.split(" ")!![1].split(":")
            thisHolder.tvSignTimeContent.text= times[0]+":"+times[1]+" - ?"
            ImageLoaderUtil.getInstance(context).loadingImage(UrlForOkhttp.getImageURL(list[position].labourerFaceImg),thisHolder.img)
        }
    }

}
