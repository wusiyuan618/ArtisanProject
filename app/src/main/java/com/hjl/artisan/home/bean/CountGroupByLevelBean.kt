package com.hjl.artisan.home.bean

import com.hjl.artisan.app.HJLBean

class CountGroupByLevelBean:HJLBean() {

    /**
     * status : 0
     * msg : 成功
     * data : {"warningCounts":1,"normalCounts":0,"seriousWarningCounts":3}
     */

    var status: String? = null
    var msg: String? = null
    var data: DataBean? = null

    class DataBean {
        /**
         * warningCounts : 1
         * normalCounts : 0
         * seriousWarningCounts : 3
         */

        var warningCounts: Int = 0
        var normalCounts: Int = 0
        var seriousWarningCounts: Int = 0
    }
}
