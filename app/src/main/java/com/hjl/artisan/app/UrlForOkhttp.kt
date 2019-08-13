package com.gohome.pad.data.net.http

import com.hjl.artisan.BuildConfig

object UrlForOkhttp {
    var baseUrl= BuildConfig.HJL_BASE_URL
    var comParam:String="poatform=Android"
    /**
     *  登录
     */
    fun requestLoginUrl(username:String,password:String):String{
        return "${baseUrl}cgProgramApi/user/loginMiniProgram?proprietorKey=$username&pwd=$password&$comParam"
    }
}
