package com.hjl.artisan.me.bean

import com.hjl.artisan.app.HJLBean

class MessageCountBean:HJLBean() {

    /**
     * status : 0
     * data : {"exceptionDealCount":0,"notSignCount":3,"applyDealCount":0,"exceptionCount":0,"applyCount":0}
     */

    var status: String? = null
    var data: DataBean? = null

    class DataBean {
        /**
         * exceptionDealCount : 0
         * notSignCount : 3
         * applyDealCount : 0
         * exceptionCount : 0
         * applyCount : 0
         */

        var exceptionDealCount: Int = 0
        var notSignCount: Int = 0
        var applyDealCount: Int = 0
        var exceptionCount: Int = 0
        var applyCount: Int = 0
    }
}
