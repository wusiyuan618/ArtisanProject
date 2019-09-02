package com.hjl.artisan.me.bean

class MessageBean{
    var icon:Int?=null
    var notRedCount:Int=0
    var title:String?=null
    var waitDealCount:Int=0
    var toClass:Class<*>?=null

    fun hasNewMessage():Boolean{
        return notRedCount!=0
    }
    fun hasDealMessage():Boolean{
        return waitDealCount!=0
    }
}
