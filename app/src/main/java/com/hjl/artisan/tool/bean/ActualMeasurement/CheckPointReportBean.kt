package com.hjl.artisan.tool.bean.ActualMeasurement

class CheckPointReportBean {

    /**
     * building : b5fcb8395ae84c68bd8639b00068b414
     * buildingNumber : 1
     * unit : afc5cc774e624635b4a4213740492a3c
     * unitNumber : 1
     * comId : 59bc934631db4ad6aa8c198d07318f60
     * deptName : 财务部
     * employeeId : 421d7d8dacbf457789f0aa39034de4d1
     * employeeName : 段秋霞
     * floor : 1-2
     * measurementsId : bfda97eb5d314bdda8c0eb4dfe46f2a6
     * name : 实测实量表1
     * programId : cc0b9d96b4c044f7b3067158afb258fd
     * programName : 沃伟思
     * programType : 1
     * reportList : [{"roomId":"bcc70bca2deb4dd7b97bfe7338c506df","roomNumber":"2","building":"b5fcb8395ae84c68bd8639b00068b414","buildingNumber":"1","unit":"afc5cc774e624635b4a4213740492a3c","unitNumber":"1","comId":"59bc934631db4ad6aa8c198d07318f60","deptName":"财务部","employeeId":"421d7d8dacbf457789f0aa39034de4d1","employeeName":"段秋霞","floor":"a1d13404acd44f0cbd65ff8d9b315336","floorNumber":"1","measurementsId":"bfda97eb5d314bdda8c0eb4dfe46f2a6","name":"实测实量表1","programId":"cc0b9d96b4c044f7b3067158afb258fd","programName":"沃伟思","programType":"1","qualifiedPercent":0,"reportArticleList":[{"name":"检查项目2","qualifiedPercent":0,"reportItemList":[{"name":"指标二","qualifiedPercent":0,"reportModelList":[{"criteria":"2，4","name":"明细啊","pointRule":"这个选点规则","positionList":[{"name":"卧室","pointList":[{"name":"卧室检测点一","result":"1","qualifiedStatus":"0"},{"name":"卧室检测点二","result":"","qualifiedStatus":""}],"qualifiedPercent":0}],"qualifiedPercent":0,"resultName":"这是检测结果名称"}]}]},{"name":"检查项目1","reportItemList":[{"name":"检查指标1","reportModelList":[]}]}]}]
     */

    var building: String? = null
    var buildingNumber: String? = null
    var unit: String? = null
    var unitNumber: String? = null
    var comId: String? = null
    var deptName: String? = null
    var employeeId: String? = null
    var employeeName: String? = null
    var floor: String? = null
    var measurementsId: String? = null
    var name: String? = null
    var programId: String? = null
    var programName: String? = null
    var programType: String? = null
    var reportList: List<ReportListBean>? = null

    class ReportListBean {
        /**
         * roomId : bcc70bca2deb4dd7b97bfe7338c506df
         * roomNumber : 2
         * building : b5fcb8395ae84c68bd8639b00068b414
         * buildingNumber : 1
         * unit : afc5cc774e624635b4a4213740492a3c
         * unitNumber : 1
         * comId : 59bc934631db4ad6aa8c198d07318f60
         * deptName : 财务部
         * employeeId : 421d7d8dacbf457789f0aa39034de4d1
         * employeeName : 段秋霞
         * floor : a1d13404acd44f0cbd65ff8d9b315336
         * floorNumber : 1
         * measurementsId : bfda97eb5d314bdda8c0eb4dfe46f2a6
         * name : 实测实量表1
         * programId : cc0b9d96b4c044f7b3067158afb258fd
         * programName : 沃伟思
         * programType : 1
         * qualifiedPercent : 0
         * reportArticleList : [{"name":"检查项目2","qualifiedPercent":0,"reportItemList":[{"name":"指标二","qualifiedPercent":0,"reportModelList":[{"criteria":"2，4","name":"明细啊","pointRule":"这个选点规则","positionList":[{"name":"卧室","pointList":[{"name":"卧室检测点一","result":"1","qualifiedStatus":"0"},{"name":"卧室检测点二","result":"","qualifiedStatus":""}],"qualifiedPercent":0}],"qualifiedPercent":0,"resultName":"这是检测结果名称"}]}]},{"name":"检查项目1","reportItemList":[{"name":"检查指标1","reportModelList":[]}]}]
         */

        var roomId: String? = null
        var roomNumber: String? = null
        var building: String? = null
        var buildingNumber: String? = null
        var unit: String? = null
        var unitNumber: String? = null
        var comId: String? = null
        var deptName: String? = null
        var employeeId: String? = null
        var employeeName: String? = null
        var floor: String? = null
        var floorNumber: String? = null
        var measurementsId: String? = null
        var name: String? = null
        var programId: String? = null
        var programName: String? = null
        var programType: String? = null
        var qualifiedPercent: Float = 0.0f
        var reportArticleList: List<ReportArticleListBean>? = null

        class ReportArticleListBean {
            /**
             * name : 检查项目2
             * qualifiedPercent : 0
             * reportItemList : [{"name":"指标二","qualifiedPercent":0,"reportModelList":[{"criteria":"2，4","name":"明细啊","pointRule":"这个选点规则","positionList":[{"name":"卧室","pointList":[{"name":"卧室检测点一","result":"1","qualifiedStatus":"0"},{"name":"卧室检测点二","result":"","qualifiedStatus":""}],"qualifiedPercent":0}],"qualifiedPercent":0,"resultName":"这是检测结果名称"}]}]
             */

            var name: String? = null
            var qualifiedPercent: Float = 0.0f
            var reportItemList: List<ReportItemListBean>? = null

            class ReportItemListBean {
                /**
                 * name : 指标二
                 * qualifiedPercent : 0
                 * reportModelList : [{"criteria":"2，4","name":"明细啊","pointRule":"这个选点规则","positionList":[{"name":"卧室","pointList":[{"name":"卧室检测点一","result":"1","qualifiedStatus":"0"},{"name":"卧室检测点二","result":"","qualifiedStatus":""}],"qualifiedPercent":0}],"qualifiedPercent":0,"resultName":"这是检测结果名称"}]
                 */

                var name: String? = null
                var qualifiedPercent: Float = 0.0f
                var reportModelList: List<ReportModelListBean>? = null

                class ReportModelListBean {
                    /**
                     * criteria : 2，4
                     * name : 明细啊
                     * pointRule : 这个选点规则
                     * positionList : [{"name":"卧室","pointList":[{"name":"卧室检测点一","result":"1","qualifiedStatus":"0"},{"name":"卧室检测点二","result":"","qualifiedStatus":""}],"qualifiedPercent":0}]
                     * qualifiedPercent : 0
                     * resultName : 这是检测结果名称
                     */

                    var criteria: String? = null
                    var name: String? = null
                    var pointRule: String? = null
                    var qualifiedPercent: Float = 0.0f
                    var resultName: String? = null
                    var positionList: List<PositionListBean>? = null
                    class PositionListBean {
                        /**
                         * name : 卧室
                         * pointList : [{"name":"卧室检测点一","result":"1","qualifiedStatus":"0"},{"name":"卧室检测点二","result":"","qualifiedStatus":""}]
                         * qualifiedPercent : 0
                         */
                        var name: String? = null
                        var qualifiedPercent: Float = 0.0f
                        var pointList: List<PointListBean>? = null

                        class PointListBean {
                            /**
                             * name : 卧室检测点一
                             * result : 1
                             * qualifiedStatus : 0
                             */
                            var name: String? = null
                            var result: String? = null
                            var qualifiedStatus: String? = null
                        }
                    }
                }
            }
        }
    }
}
