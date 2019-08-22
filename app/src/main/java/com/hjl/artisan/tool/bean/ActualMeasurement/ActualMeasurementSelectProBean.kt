package com.hjl.artisan.tool.bean.ActualMeasurement

import com.hjl.artisan.app.HJLBean

class ActualMeasurementSelectProBean : HJLBean(){
    /**
     * status : 0
     * msg : 成功
     * data : {"totalNum":1,"rows":[{"status":"1","createTime":1548924360616,"updateTime":1564041223160,"createBy":"admin","updateBy":"admin","id":"cc0b9d96b4c044f7b3067158afb258fd","comId":"59bc934631db4ad6aa8c198d07318f60","partyaName":"沃伟思","programName":"沃伟思","location":"32,394,3328","locationName":"重庆,重庆,永川区","address":"水星科技大厦","money":"10000000","startTime":"2019-01-01","endTime":"2029-01-31","programManagerId":"ddcfd033298f4b30bb40d9e4f746ce2a","area":"500","totalBudgetCost":"1","rateType":"0","programStatus":"1","signType":"1","programType":"1","programImg":"CgProgramBackGroundImg/deviceBehand/d28c4679f496476ca6beb4a17bebb467.png,CgProgramBackGroundImg/deviceBehand/e258facca5e94627a38b7c26fa4a3b1c.png","programColor":"#5CBDC5","checkLabourerType":"1","mpSign":"1","joinTime":0,"nodeInCount":0,"nodeOutCount":0}]}
     */

    var status: String? = null
    var msg: String? = null
    var data: DataBean? = null

    class DataBean {
        /**
         * totalNum : 1
         * rows : [{"status":"1","createTime":1548924360616,"updateTime":1564041223160,"createBy":"admin","updateBy":"admin","id":"cc0b9d96b4c044f7b3067158afb258fd","comId":"59bc934631db4ad6aa8c198d07318f60","partyaName":"沃伟思","programName":"沃伟思","location":"32,394,3328","locationName":"重庆,重庆,永川区","address":"水星科技大厦","money":"10000000","startTime":"2019-01-01","endTime":"2029-01-31","programManagerId":"ddcfd033298f4b30bb40d9e4f746ce2a","area":"500","totalBudgetCost":"1","rateType":"0","programStatus":"1","signType":"1","programType":"1","programImg":"CgProgramBackGroundImg/deviceBehand/d28c4679f496476ca6beb4a17bebb467.png,CgProgramBackGroundImg/deviceBehand/e258facca5e94627a38b7c26fa4a3b1c.png","programColor":"#5CBDC5","checkLabourerType":"1","mpSign":"1","joinTime":0,"nodeInCount":0,"nodeOutCount":0}]
         */

        var totalNum: Int = 0
        var rows: List<RowsBean>? = null

        class RowsBean {
            /**
             * status : 1
             * createTime : 1548924360616
             * updateTime : 1564041223160
             * createBy : admin
             * updateBy : admin
             * id : cc0b9d96b4c044f7b3067158afb258fd
             * comId : 59bc934631db4ad6aa8c198d07318f60
             * partyaName : 沃伟思
             * programName : 沃伟思
             * location : 32,394,3328
             * locationName : 重庆,重庆,永川区
             * address : 水星科技大厦
             * money : 10000000
             * startTime : 2019-01-01
             * endTime : 2029-01-31
             * programManagerId : ddcfd033298f4b30bb40d9e4f746ce2a
             * area : 500
             * totalBudgetCost : 1
             * rateType : 0
             * programStatus : 1
             * signType : 1
             * programType : 1
             * programImg : CgProgramBackGroundImg/deviceBehand/d28c4679f496476ca6beb4a17bebb467.png,CgProgramBackGroundImg/deviceBehand/e258facca5e94627a38b7c26fa4a3b1c.png
             * programColor : #5CBDC5
             * checkLabourerType : 1
             * mpSign : 1
             * joinTime : 0
             * nodeInCount : 0
             * nodeOutCount : 0
             */

            var status: String? = null
            var createTime: Long = 0
            var updateTime: Long = 0
            var createBy: String? = null
            var updateBy: String? = null
            var id: String? = null
            var comId: String? = null
            var partyaName: String? = null
            var programName: String? = null
            var location: String? = null
            var locationName: String? = null
            var address: String? = null
            var money: String? = null
            var startTime: String? = null
            var endTime: String? = null
            var programManagerId: String? = null
            var area: String? = null
            var totalBudgetCost: String? = null
            var rateType: String? = null
            var programStatus: String? = null
            var signType: String? = null
            var programType: String? = null
            var programImg: String? = null
            var programColor: String? = null
            var checkLabourerType: String? = null
            var mpSign: String? = null
            var joinTime: Int = 0
            var nodeInCount: Int = 0
            var nodeOutCount: Int = 0
        }
    }
}
