package com.hjl.artisan.me.bean

import com.hjl.artisan.app.HJLBean

class NotSignDetailBean :HJLBean(){

    /**
     * status : 0
     * msg : 成功
     * data : {"totalNum":1,"rows":[{"status":"1","createTime":1566806612547,"id":"2ea6da18e82f4e8282167e4201b0ea8c","comId":"59bc934631db4ad6aa8c198d07318f60","programId":"cc0b9d96b4c044f7b3067158afb258fd","gangerId":"d81aa641456c4c7b993718d9db99e163","labourerId":"390a362ff8734e8ca9fef337da7dcd26","groupTime":"2019-08-26","inTime":"2019-08-26 09:04:06","onlineStatus":"1","labourerName":"0000","labourerFaceImg":"CgProgramBackGroundImg/headImg/675864f57bad48458654a63182d8a1f3.jpg","labourerPhone":"18983465764","labourerWorkType":"抹灰工","gangerName":"1122"}]}
     */

    var status: String? = null
    var msg: String? = null
    var data: DataBean? = null

    class DataBean {
        /**
         * totalNum : 1
         * rows : [{"status":"1","createTime":1566806612547,"id":"2ea6da18e82f4e8282167e4201b0ea8c","comId":"59bc934631db4ad6aa8c198d07318f60","programId":"cc0b9d96b4c044f7b3067158afb258fd","gangerId":"d81aa641456c4c7b993718d9db99e163","labourerId":"390a362ff8734e8ca9fef337da7dcd26","groupTime":"2019-08-26","inTime":"2019-08-26 09:04:06","onlineStatus":"1","labourerName":"0000","labourerFaceImg":"CgProgramBackGroundImg/headImg/675864f57bad48458654a63182d8a1f3.jpg","labourerPhone":"18983465764","labourerWorkType":"抹灰工","gangerName":"1122"}]
         */

        var totalNum: Int = 0
        var rows: List<RowsBean>? = null

        class RowsBean {
            /**
             * status : 1
             * createTime : 1566806612547
             * id : 2ea6da18e82f4e8282167e4201b0ea8c
             * comId : 59bc934631db4ad6aa8c198d07318f60
             * programId : cc0b9d96b4c044f7b3067158afb258fd
             * gangerId : d81aa641456c4c7b993718d9db99e163
             * labourerId : 390a362ff8734e8ca9fef337da7dcd26
             * groupTime : 2019-08-26
             * inTime : 2019-08-26 09:04:06
             * onlineStatus : 1
             * labourerName : 0000
             * labourerFaceImg : CgProgramBackGroundImg/headImg/675864f57bad48458654a63182d8a1f3.jpg
             * labourerPhone : 18983465764
             * labourerWorkType : 抹灰工
             * gangerName : 1122
             */

            var status: String? = null
            var createTime: Long = 0
            var id: String? = null
            var comId: String? = null
            var programId: String? = null
            var gangerId: String? = null
            var labourerId: String? = null
            var groupTime: String? = null
            var inTime: String? = null
            var onlineStatus: String? = null
            var labourerName: String? = null
            var labourerFaceImg: String? = null
            var labourerPhone: String? = null
            var labourerWorkType: String? = null
            var gangerName: String? = null
        }
    }
}
