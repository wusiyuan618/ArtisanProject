package com.hjl.artisan.me.bean

import com.hjl.artisan.app.HJLBean

class MessageExceptionBean : HJLBean(){

    /**
     * status : 0
     * data : {"totalNum":1,"rows":[{"status":"1","createTime":1567151924230,"updateTime":1567153218759,"id":"4646d818877b4affa0d807f851135e52","employeeId":"421d7d8dacbf457789f0aa39034de4d1","comId":"59bc934631db4ad6aa8c198d07318f60","programId":"cc0b9d96b4c044f7b3067158afb258fd,4ff1d95aa2bf42b889cfaf84db97bc57","labourerId":"bf6b955cd85640f2b192b6394c9efc67","msgId":"48804d1e55e141e992371b81e15b1b2a","groupTime":"2019-08-31","msgType":"exception","readStatus":"1","dealStatus":"1","checkStatus":"0","exceptionSignProgram":[{"status":"1","createTime":1548924360616,"updateTime":1566801831943,"createBy":"admin","updateBy":"admin","id":"cc0b9d96b4c044f7b3067158afb258fd","comId":"59bc934631db4ad6aa8c198d07318f60","partyaName":"沃伟思","programName":"沃伟思","location":"32,394,3328","locationName":"重庆,重庆,永川区","address":"水星科技大厦","money":"10000000","startTime":"2019-01-01","endTime":"2029-01-31","programManagerId":"ddcfd033298f4b30bb40d9e4f746ce2a","area":"500","totalBudgetCost":"1","rateType":"0","programStatus":"1","signType":"1","programType":"1","programImg":"CgProgramBackGroundImg/deviceBehand/d28c4679f496476ca6beb4a17bebb467.png,CgProgramBackGroundImg/deviceBehand/e258facca5e94627a38b7c26fa4a3b1c.png","programColor":"#5CBDC5","checkLabourerType":"1","mpSign":"1","joinTime":0,"nodeInCount":0,"nodeOutCount":0},{"status":"1","createTime":1547200799071,"updateTime":1559033335394,"createBy":"ddcfd033298f4b30bb40d9e4f746ce2a","updateBy":"admin","id":"4ff1d95aa2bf42b889cfaf84db97bc57","financialNumber":"1","comId":"59bc934631db4ad6aa8c198d07318f60","partyaName":"aaaaa","programName":"皮皮项目","location":"3,36,399","locationName":"安徽,安庆,大观区","address":"123123123123","money":"4000","startTime":"2019-01-02","endTime":"2019-01-04","programManagerId":"421d7d8dacbf457789f0aa39034de4d1","programStatus":"1","signType":"1","programImg":"/root/pic/CgProgramBackGroundImg/490d2fd9bbf84a5cbb8d98c7bc4a1f0b.png,/root/pic/CgProgramBackGroundImg/8ff01d4785d0469787b34e7069083caa.png","checkLabourerType":"1","mpSign":"1","joinTime":0,"nodeInCount":0,"nodeOutCount":0}],"exceptionSignLabourer":{"status":"1","createTime":1553215866841,"updateTime":1567151876011,"id":"bf6b955cd85640f2b192b6394c9efc67","appUserId":"3bd80dfd27ef447dbc8e56c79bd98d2a","name":"吴思源","programName":"皮皮项目","programLocation":"安徽,安庆,大观区","sex":"1","phone":"13617631765","faceImg":"/root/pic/CgProgramBackGroundImg/headImg/8f2a2c7b5dc449fd8a2df432d5760acc.jpg","checkStatus":"1","checkStatusPhone":"0","checkStatusIdcard":"0","platForm":"1","mark":"10:D0:7A:1F:03:16","joinProgramName":"测试项目1","isConcern":"1","deviceMac":"10:D0:7A:1F:03:16","gangerId":"db81af76d78a45ecb04b0e0fda291aa4","faceProperties":"CE4yPeXIWb6ijFG8ygWnvYoRi751sci9nUd0Pd3fDr0eJxe+ZlJIPj8QZ75vxg29tJDgO02tGL6ees89PcIRPWzx2r2Vvx2+enQ4vtdUPr7aC9m7MBquuz7pmLxmePe9GcgWPUp+oz1c/e89CNgZPdYQCr0B83++A43cuwAZXD3wH6A7gKigPQcpWT0mMhi8vlgjPRuJmD3nHRm7qpFrPOCE7L3q1to9BTVWPRuSjb2dmyK+ciIFvOibdb3DYrA9/TKSPVyY2Tsqejq7csaPvdvPJr3dSZ895Tu/vZucQb4YC248hWxgvbZymr1m7Dw9sJ/jPfuYRj210Es9aZrKPWxjkT0i/Qi+VKiEPWj6y72CRn68ODAmPTHhur15a0m9mx7RPTVoHz7DL389nISzPTKobDtSu0g9J6GNvUa4b76UMQo9QeCQPBT9yjuW7qo83IV3vJsTmr0Firg86ZBZvcjvPz3q4Mo7s2BIvMsOrb2Mh8q9HkwFvDnYwLwgXH+9xq1AveYDAr379bQ9Xs6wvQLgrbwM1JA7S9ZOPee2rz2YqAO7sa/4vKxrlb10U9I8IV9FPXgCMb3smp28ZcN3vYICgbuu1B+9BFcHvWzBkT2uFhw90pjpPWmZAj3kfgq8BbnjvJIErD3s6Na7ag+NPKOZfDzlzIA8RMMzvLaZlrzvYg3DAACAPw==","workTime":0,"overTime":0,"normalTime":0,"money":0,"actualMoney":0,"workType":[{"status":"1","createTime":1553057155645,"updateTime":1554283314604,"createBy":"admin","id":"d523673fa2fd466bb9ec02705897a86e","name":"焊工","comId":"586238e5f33b4788b0d4663b18de33d4","color":"#3BB4C4"}],"evaluateList":[],"blackEvaluateList":[],"map":{}},"notSignCount":0}]}
     */

    var status: String? = null
    var data: DataBean? = null

    class DataBean {
        /**
         * totalNum : 1
         * rows : [{"status":"1","createTime":1567151924230,"updateTime":1567153218759,"id":"4646d818877b4affa0d807f851135e52","employeeId":"421d7d8dacbf457789f0aa39034de4d1","comId":"59bc934631db4ad6aa8c198d07318f60","programId":"cc0b9d96b4c044f7b3067158afb258fd,4ff1d95aa2bf42b889cfaf84db97bc57","labourerId":"bf6b955cd85640f2b192b6394c9efc67","msgId":"48804d1e55e141e992371b81e15b1b2a","groupTime":"2019-08-31","msgType":"exception","readStatus":"1","dealStatus":"1","checkStatus":"0","exceptionSignProgram":[{"status":"1","createTime":1548924360616,"updateTime":1566801831943,"createBy":"admin","updateBy":"admin","id":"cc0b9d96b4c044f7b3067158afb258fd","comId":"59bc934631db4ad6aa8c198d07318f60","partyaName":"沃伟思","programName":"沃伟思","location":"32,394,3328","locationName":"重庆,重庆,永川区","address":"水星科技大厦","money":"10000000","startTime":"2019-01-01","endTime":"2029-01-31","programManagerId":"ddcfd033298f4b30bb40d9e4f746ce2a","area":"500","totalBudgetCost":"1","rateType":"0","programStatus":"1","signType":"1","programType":"1","programImg":"CgProgramBackGroundImg/deviceBehand/d28c4679f496476ca6beb4a17bebb467.png,CgProgramBackGroundImg/deviceBehand/e258facca5e94627a38b7c26fa4a3b1c.png","programColor":"#5CBDC5","checkLabourerType":"1","mpSign":"1","joinTime":0,"nodeInCount":0,"nodeOutCount":0},{"status":"1","createTime":1547200799071,"updateTime":1559033335394,"createBy":"ddcfd033298f4b30bb40d9e4f746ce2a","updateBy":"admin","id":"4ff1d95aa2bf42b889cfaf84db97bc57","financialNumber":"1","comId":"59bc934631db4ad6aa8c198d07318f60","partyaName":"aaaaa","programName":"皮皮项目","location":"3,36,399","locationName":"安徽,安庆,大观区","address":"123123123123","money":"4000","startTime":"2019-01-02","endTime":"2019-01-04","programManagerId":"421d7d8dacbf457789f0aa39034de4d1","programStatus":"1","signType":"1","programImg":"/root/pic/CgProgramBackGroundImg/490d2fd9bbf84a5cbb8d98c7bc4a1f0b.png,/root/pic/CgProgramBackGroundImg/8ff01d4785d0469787b34e7069083caa.png","checkLabourerType":"1","mpSign":"1","joinTime":0,"nodeInCount":0,"nodeOutCount":0}],"exceptionSignLabourer":{"status":"1","createTime":1553215866841,"updateTime":1567151876011,"id":"bf6b955cd85640f2b192b6394c9efc67","appUserId":"3bd80dfd27ef447dbc8e56c79bd98d2a","name":"吴思源","programName":"皮皮项目","programLocation":"安徽,安庆,大观区","sex":"1","phone":"13617631765","faceImg":"/root/pic/CgProgramBackGroundImg/headImg/8f2a2c7b5dc449fd8a2df432d5760acc.jpg","checkStatus":"1","checkStatusPhone":"0","checkStatusIdcard":"0","platForm":"1","mark":"10:D0:7A:1F:03:16","joinProgramName":"测试项目1","isConcern":"1","deviceMac":"10:D0:7A:1F:03:16","gangerId":"db81af76d78a45ecb04b0e0fda291aa4","faceProperties":"CE4yPeXIWb6ijFG8ygWnvYoRi751sci9nUd0Pd3fDr0eJxe+ZlJIPj8QZ75vxg29tJDgO02tGL6ees89PcIRPWzx2r2Vvx2+enQ4vtdUPr7aC9m7MBquuz7pmLxmePe9GcgWPUp+oz1c/e89CNgZPdYQCr0B83++A43cuwAZXD3wH6A7gKigPQcpWT0mMhi8vlgjPRuJmD3nHRm7qpFrPOCE7L3q1to9BTVWPRuSjb2dmyK+ciIFvOibdb3DYrA9/TKSPVyY2Tsqejq7csaPvdvPJr3dSZ895Tu/vZucQb4YC248hWxgvbZymr1m7Dw9sJ/jPfuYRj210Es9aZrKPWxjkT0i/Qi+VKiEPWj6y72CRn68ODAmPTHhur15a0m9mx7RPTVoHz7DL389nISzPTKobDtSu0g9J6GNvUa4b76UMQo9QeCQPBT9yjuW7qo83IV3vJsTmr0Firg86ZBZvcjvPz3q4Mo7s2BIvMsOrb2Mh8q9HkwFvDnYwLwgXH+9xq1AveYDAr379bQ9Xs6wvQLgrbwM1JA7S9ZOPee2rz2YqAO7sa/4vKxrlb10U9I8IV9FPXgCMb3smp28ZcN3vYICgbuu1B+9BFcHvWzBkT2uFhw90pjpPWmZAj3kfgq8BbnjvJIErD3s6Na7ag+NPKOZfDzlzIA8RMMzvLaZlrzvYg3DAACAPw==","workTime":0,"overTime":0,"normalTime":0,"money":0,"actualMoney":0,"workType":[{"status":"1","createTime":1553057155645,"updateTime":1554283314604,"createBy":"admin","id":"d523673fa2fd466bb9ec02705897a86e","name":"焊工","comId":"586238e5f33b4788b0d4663b18de33d4","color":"#3BB4C4"}],"evaluateList":[],"blackEvaluateList":[],"map":{}},"notSignCount":0}]
         */

        var totalNum: Int = 0
        var rows: List<RowsBean>? = null

        class RowsBean {
            /**
             * status : 1
             * createTime : 1567151924230
             * updateTime : 1567153218759
             * id : 4646d818877b4affa0d807f851135e52
             * employeeId : 421d7d8dacbf457789f0aa39034de4d1
             * comId : 59bc934631db4ad6aa8c198d07318f60
             * programId : cc0b9d96b4c044f7b3067158afb258fd,4ff1d95aa2bf42b889cfaf84db97bc57
             * labourerId : bf6b955cd85640f2b192b6394c9efc67
             * msgId : 48804d1e55e141e992371b81e15b1b2a
             * groupTime : 2019-08-31
             * msgType : exception
             * readStatus : 1
             * dealStatus : 1
             * checkStatus : 0
             * exceptionSignProgram : [{"status":"1","createTime":1548924360616,"updateTime":1566801831943,"createBy":"admin","updateBy":"admin","id":"cc0b9d96b4c044f7b3067158afb258fd","comId":"59bc934631db4ad6aa8c198d07318f60","partyaName":"沃伟思","programName":"沃伟思","location":"32,394,3328","locationName":"重庆,重庆,永川区","address":"水星科技大厦","money":"10000000","startTime":"2019-01-01","endTime":"2029-01-31","programManagerId":"ddcfd033298f4b30bb40d9e4f746ce2a","area":"500","totalBudgetCost":"1","rateType":"0","programStatus":"1","signType":"1","programType":"1","programImg":"CgProgramBackGroundImg/deviceBehand/d28c4679f496476ca6beb4a17bebb467.png,CgProgramBackGroundImg/deviceBehand/e258facca5e94627a38b7c26fa4a3b1c.png","programColor":"#5CBDC5","checkLabourerType":"1","mpSign":"1","joinTime":0,"nodeInCount":0,"nodeOutCount":0},{"status":"1","createTime":1547200799071,"updateTime":1559033335394,"createBy":"ddcfd033298f4b30bb40d9e4f746ce2a","updateBy":"admin","id":"4ff1d95aa2bf42b889cfaf84db97bc57","financialNumber":"1","comId":"59bc934631db4ad6aa8c198d07318f60","partyaName":"aaaaa","programName":"皮皮项目","location":"3,36,399","locationName":"安徽,安庆,大观区","address":"123123123123","money":"4000","startTime":"2019-01-02","endTime":"2019-01-04","programManagerId":"421d7d8dacbf457789f0aa39034de4d1","programStatus":"1","signType":"1","programImg":"/root/pic/CgProgramBackGroundImg/490d2fd9bbf84a5cbb8d98c7bc4a1f0b.png,/root/pic/CgProgramBackGroundImg/8ff01d4785d0469787b34e7069083caa.png","checkLabourerType":"1","mpSign":"1","joinTime":0,"nodeInCount":0,"nodeOutCount":0}]
             * exceptionSignLabourer : {"status":"1","createTime":1553215866841,"updateTime":1567151876011,"id":"bf6b955cd85640f2b192b6394c9efc67","appUserId":"3bd80dfd27ef447dbc8e56c79bd98d2a","name":"吴思源","programName":"皮皮项目","programLocation":"安徽,安庆,大观区","sex":"1","phone":"13617631765","faceImg":"/root/pic/CgProgramBackGroundImg/headImg/8f2a2c7b5dc449fd8a2df432d5760acc.jpg","checkStatus":"1","checkStatusPhone":"0","checkStatusIdcard":"0","platForm":"1","mark":"10:D0:7A:1F:03:16","joinProgramName":"测试项目1","isConcern":"1","deviceMac":"10:D0:7A:1F:03:16","gangerId":"db81af76d78a45ecb04b0e0fda291aa4","faceProperties":"CE4yPeXIWb6ijFG8ygWnvYoRi751sci9nUd0Pd3fDr0eJxe+ZlJIPj8QZ75vxg29tJDgO02tGL6ees89PcIRPWzx2r2Vvx2+enQ4vtdUPr7aC9m7MBquuz7pmLxmePe9GcgWPUp+oz1c/e89CNgZPdYQCr0B83++A43cuwAZXD3wH6A7gKigPQcpWT0mMhi8vlgjPRuJmD3nHRm7qpFrPOCE7L3q1to9BTVWPRuSjb2dmyK+ciIFvOibdb3DYrA9/TKSPVyY2Tsqejq7csaPvdvPJr3dSZ895Tu/vZucQb4YC248hWxgvbZymr1m7Dw9sJ/jPfuYRj210Es9aZrKPWxjkT0i/Qi+VKiEPWj6y72CRn68ODAmPTHhur15a0m9mx7RPTVoHz7DL389nISzPTKobDtSu0g9J6GNvUa4b76UMQo9QeCQPBT9yjuW7qo83IV3vJsTmr0Firg86ZBZvcjvPz3q4Mo7s2BIvMsOrb2Mh8q9HkwFvDnYwLwgXH+9xq1AveYDAr379bQ9Xs6wvQLgrbwM1JA7S9ZOPee2rz2YqAO7sa/4vKxrlb10U9I8IV9FPXgCMb3smp28ZcN3vYICgbuu1B+9BFcHvWzBkT2uFhw90pjpPWmZAj3kfgq8BbnjvJIErD3s6Na7ag+NPKOZfDzlzIA8RMMzvLaZlrzvYg3DAACAPw==","workTime":0,"overTime":0,"normalTime":0,"money":0,"actualMoney":0,"workType":[{"status":"1","createTime":1553057155645,"updateTime":1554283314604,"createBy":"admin","id":"d523673fa2fd466bb9ec02705897a86e","name":"焊工","comId":"586238e5f33b4788b0d4663b18de33d4","color":"#3BB4C4"}],"evaluateList":[],"blackEvaluateList":[],"map":{}}
             * notSignCount : 0
             */

            var status: String? = null
            var createTime: Long = 0
            var updateTime: Long = 0
            var id: String? = null
            var employeeId: String? = null
            var comId: String? = null
            var programId: String? = null
            var labourerId: String? = null
            var msgId: String? = null
            var groupTime: String? = null
            var msgType: String? = null
            var readStatus: String? = null
            var dealStatus: String? = null
            var checkStatus: String? = null
            var exceptionSignLabourer: ExceptionSignLabourerBean? = null
            var notSignCount: Int = 0
            var exceptionSignProgram: List<ExceptionSignProgramBean>? = null

            class ExceptionSignLabourerBean {
                /**
                 * status : 1
                 * createTime : 1553215866841
                 * updateTime : 1567151876011
                 * id : bf6b955cd85640f2b192b6394c9efc67
                 * appUserId : 3bd80dfd27ef447dbc8e56c79bd98d2a
                 * name : 吴思源
                 * programName : 皮皮项目
                 * programLocation : 安徽,安庆,大观区
                 * sex : 1
                 * phone : 13617631765
                 * faceImg : /root/pic/CgProgramBackGroundImg/headImg/8f2a2c7b5dc449fd8a2df432d5760acc.jpg
                 * checkStatus : 1
                 * checkStatusPhone : 0
                 * checkStatusIdcard : 0
                 * platForm : 1
                 * mark : 10:D0:7A:1F:03:16
                 * joinProgramName : 测试项目1
                 * isConcern : 1
                 * deviceMac : 10:D0:7A:1F:03:16
                 * gangerId : db81af76d78a45ecb04b0e0fda291aa4
                 * faceProperties : CE4yPeXIWb6ijFG8ygWnvYoRi751sci9nUd0Pd3fDr0eJxe+ZlJIPj8QZ75vxg29tJDgO02tGL6ees89PcIRPWzx2r2Vvx2+enQ4vtdUPr7aC9m7MBquuz7pmLxmePe9GcgWPUp+oz1c/e89CNgZPdYQCr0B83++A43cuwAZXD3wH6A7gKigPQcpWT0mMhi8vlgjPRuJmD3nHRm7qpFrPOCE7L3q1to9BTVWPRuSjb2dmyK+ciIFvOibdb3DYrA9/TKSPVyY2Tsqejq7csaPvdvPJr3dSZ895Tu/vZucQb4YC248hWxgvbZymr1m7Dw9sJ/jPfuYRj210Es9aZrKPWxjkT0i/Qi+VKiEPWj6y72CRn68ODAmPTHhur15a0m9mx7RPTVoHz7DL389nISzPTKobDtSu0g9J6GNvUa4b76UMQo9QeCQPBT9yjuW7qo83IV3vJsTmr0Firg86ZBZvcjvPz3q4Mo7s2BIvMsOrb2Mh8q9HkwFvDnYwLwgXH+9xq1AveYDAr379bQ9Xs6wvQLgrbwM1JA7S9ZOPee2rz2YqAO7sa/4vKxrlb10U9I8IV9FPXgCMb3smp28ZcN3vYICgbuu1B+9BFcHvWzBkT2uFhw90pjpPWmZAj3kfgq8BbnjvJIErD3s6Na7ag+NPKOZfDzlzIA8RMMzvLaZlrzvYg3DAACAPw==
                 * workTime : 0
                 * overTime : 0
                 * normalTime : 0
                 * money : 0
                 * actualMoney : 0
                 * workType : [{"status":"1","createTime":1553057155645,"updateTime":1554283314604,"createBy":"admin","id":"d523673fa2fd466bb9ec02705897a86e","name":"焊工","comId":"586238e5f33b4788b0d4663b18de33d4","color":"#3BB4C4"}]
                 * evaluateList : []
                 * blackEvaluateList : []
                 * map : {}
                 */

                var status: String? = null
                var createTime: Long = 0
                var updateTime: Long = 0
                var id: String? = null
                var appUserId: String? = null
                var name: String? = null
                var programName: String? = null
                var programLocation: String? = null
                var sex: String? = null
                var phone: String? = null
                var faceImg: String? = null
                var checkStatus: String? = null
                var checkStatusPhone: String? = null
                var checkStatusIdcard: String? = null
                var platForm: String? = null
                var mark: String? = null
                var joinProgramName: String? = null
                var isConcern: String? = null
                var deviceMac: String? = null
                var gangerId: String? = null
                var faceProperties: String? = null
                var workTime: Int = 0
                var overTime: Int = 0
                var normalTime: Int = 0
                var money: Int = 0
                var actualMoney: Int = 0
                var map: MapBean? = null
                var workType: List<WorkTypeBean>? = null
                var evaluateList: List<*>? = null
                var blackEvaluateList: List<*>? = null

                class MapBean

                class WorkTypeBean {
                    /**
                     * status : 1
                     * createTime : 1553057155645
                     * updateTime : 1554283314604
                     * createBy : admin
                     * id : d523673fa2fd466bb9ec02705897a86e
                     * name : 焊工
                     * comId : 586238e5f33b4788b0d4663b18de33d4
                     * color : #3BB4C4
                     */

                    var status: String? = null
                    var createTime: Long = 0
                    var updateTime: Long = 0
                    var createBy: String? = null
                    var id: String? = null
                    var name: String? = null
                    var comId: String? = null
                    var color: String? = null
                }
            }

            class ExceptionSignProgramBean {
                /**
                 * status : 1
                 * createTime : 1548924360616
                 * updateTime : 1566801831943
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
                 * financialNumber : 1
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
                var financialNumber: String? = null
            }
        }
    }
}
