package com.hjl.artisan.tool.bean.ActualMeasurement

import com.hjl.artisan.app.HJLBean

class AdvertisementBean : HJLBean() {

    /**
     * status : 0
     * msg : 成功
     * data : [{"status":"1","createTime":1557971076044,"id":"109d7a4fc4c34cf6a57b26bbf3ded6f7","positionId":"1","title":"","content":"","comId":"admin","filePath":"CgProgramBackGroundImg/839069243dbf48e481b8a7f149f1061e.png","url":"https://mp.weixin.qq.com/s/9QVDvWh7DaHwKPuYISrVOg","sort":0},{"status":"1","createTime":1557971076044,"id":"a5121c32feee4ec7b8572d54aeb7f7ee","positionId":"1","title":"","content":"","comId":"admin","filePath":"CgProgramBackGroundImg/264001806ed64d13a9266c9a148718ba.png","url":"","sort":0}]
     */

    var status: String? = null
    var msg: String? = null
    var data: List<DataBean>? = null

    class DataBean {
        /**
         * status : 1
         * createTime : 1557971076044
         * id : 109d7a4fc4c34cf6a57b26bbf3ded6f7
         * positionId : 1
         * title :
         * content :
         * comId : admin
         * filePath : CgProgramBackGroundImg/839069243dbf48e481b8a7f149f1061e.png
         * url : https://mp.weixin.qq.com/s/9QVDvWh7DaHwKPuYISrVOg
         * sort : 0
         */

        var status: String? = null
        var createTime: Long = 0
        var id: String? = null
        var positionId: String? = null
        var title: String? = null
        var content: String? = null
        var comId: String? = null
        var filePath: String? = null
        var url: String? = null
        var sort: Int = 0
    }
}
