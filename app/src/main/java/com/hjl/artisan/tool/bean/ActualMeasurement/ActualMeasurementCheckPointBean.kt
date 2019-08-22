package com.hjl.artisan.tool.bean.ActualMeasurement

import com.hjl.artisan.app.HJLBean
import java.io.Serializable

class ActualMeasurementCheckPointBean :  HJLBean(){
    /**
     * status : 0
     * msg : 成功
     * data : [{"status":"1","createTime":1565608382450,"id":"a1d13404acd44f0cbd65ff8d9b315336","floorNumber":"1","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","programId":"cc0b9d96b4c044f7b3067158afb258fd","pointCount":5,"roomList":[{"status":"1","createTime":1565608382460,"id":"bcc70bca2deb4dd7b97bfe7338c506df","programId":"cc0b9d96b4c044f7b3067158afb258fd","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","floorId":"a1d13404acd44f0cbd65ff8d9b315336","roomAllId":"4ecd89608e984312a2f2a8af234ecad8","roomNumber":"2","area":"12","pointCount":3,"measurements":{"status":"1","createTime":1565664282833,"updateTime":1565664282833,"id":"bfda97eb5d314bdda8c0eb4dfe46f2a6","name":"实测实量表1","comId":"59bc934631db4ad6aa8c198d07318f60","programId":"cc0b9d96b4c044f7b3067158afb258fd","programType":"1","articleList":[{"status":"1","createTime":1565664282834,"updateTime":1565664282834,"id":"dc7991a8827d4deeb85cf08023534b7a","measurementsId":"bfda97eb5d314bdda8c0eb4dfe46f2a6","name":"检查项目1","itemList":[{"status":"1","createTime":1565664282835,"updateTime":1565664282835,"id":"3582a0855e4b4c47b6c03a02eb9a90b3","articleId":"dc7991a8827d4deeb85cf08023534b7a","name":"检查指标1","modelList":[{"status":"1","createTime":1565664282836,"updateTime":1565664282836,"id":"fe0d50a60a2f4d769b31b469db5225b4","itemId":"3582a0855e4b4c47b6c03a02eb9a90b3","name":"标准1","criteria":"0，3","pointRule":"1","resultName":"","roomList":[{"status":"1","createTime":1565664282837,"updateTime":1565664282837,"id":"968df431386e4dc4ab31ab7526f2d200","modelId":"fe0d50a60a2f4d769b31b469db5225b4","roomAllId":"4ecd89608e984312a2f2a8af234ecad8","positionList":[{"status":"1","createTime":1565664282838,"updateTime":1565664282838,"id":"b4989fda201b40409c2d2fc1fc83d6d8","name":"卧室","modelRoomId":"968df431386e4dc4ab31ab7526f2d200","positionAllId":"abcc252c9f304f79b97ba0886aec801c","pointList":[{"status":"1","createTime":1565664282840,"updateTime":1565664282840,"id":"7bf9e6e919124a38a51e1ff39ca31dc6","positionId":"b4989fda201b40409c2d2fc1fc83d6d8","name":"3"},{"status":"1","createTime":1565664282839,"updateTime":1565664282839,"id":"9f7bbba6c8914fcc970e0b5003a65385","positionId":"b4989fda201b40409c2d2fc1fc83d6d8","name":"2"},{"status":"1","createTime":1565664282838,"updateTime":1565664282838,"id":"70bea82bfbd640639fdcc214d8c7a1ce","positionId":"b4989fda201b40409c2d2fc1fc83d6d8","name":"1"}]}]}]}]}]}],"employeeLinkList":[{"status":"1","createTime":1565664282846,"updateTime":1565664282846,"id":"9f33da7fb6714ec99b346803fc6c8549","measurementsId":"bfda97eb5d314bdda8c0eb4dfe46f2a6","employeeId":"f2bbff18714a402c84968a82511eed49"},{"status":"1","createTime":1565664282846,"updateTime":1565664282846,"id":"cc9d3ec08ea84c21b6760bcf1093c102","measurementsId":"bfda97eb5d314bdda8c0eb4dfe46f2a6","employeeId":"0592489b42b742ad8dcf1210b9698b9d"},{"status":"1","createTime":1565664282845,"updateTime":1565664282845,"id":"4b71766eedde4e9cbb0663b60f272f51","measurementsId":"bfda97eb5d314bdda8c0eb4dfe46f2a6","employeeId":"dad14983959e48e0a95b90787162a2eb"},{"status":"1","createTime":1565664282844,"updateTime":1565664282844,"id":"7701346543e0434681c75895f3ab37a8","measurementsId":"bfda97eb5d314bdda8c0eb4dfe46f2a6","employeeId":"421d7d8dacbf457789f0aa39034de4d1"}],"floorLinkList":[{"status":"1","createTime":1565664282847,"updateTime":1565664282847,"id":"a686b31615df4123ba23caaf0dcf3b40","measurementsId":"bfda97eb5d314bdda8c0eb4dfe46f2a6","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","building":{"status":"1","createTime":1565608341863,"id":"b5fcb8395ae84c68bd8639b00068b414","morphology":"高层","buildingNumber":"1","unitNumber":"2","programId":"cc0b9d96b4c044f7b3067158afb258fd","unitList":[]},"unit":{"status":"1","createTime":1565608341871,"id":"afc5cc774e624635b4a4213740492a3c","unitNumber":"1","buildingId":"b5fcb8395ae84c68bd8639b00068b414","programId":"cc0b9d96b4c044f7b3067158afb258fd","floorAllList":[]},"floorAll":{"status":"1","createTime":1565608382418,"id":"a3eb090e2a494ff9aa66ed7d6bc5141d","floorNumberStart":"1","floorNumberEnd":"5","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","programId":"cc0b9d96b4c044f7b3067158afb258fd","imgUrl":"","roomAllList":[{"status":"1","createTime":1565608382438,"id":"4ecd89608e984312a2f2a8af234ecad8","programId":"cc0b9d96b4c044f7b3067158afb258fd","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","roomNumber":"2","area":"12","positionList":[{"status":"1","createTime":1565608382442,"id":"abcc252c9f304f79b97ba0886aec801c","programId":"cc0b9d96b4c044f7b3067158afb258fd","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","roomAllId":"4ecd89608e984312a2f2a8af234ecad8","positionName":"卧室"}]},{"status":"1","createTime":1565608382426,"id":"bfff5098ffae414f920c63add7a8d21e","programId":"cc0b9d96b4c044f7b3067158afb258fd","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","roomNumber":"1","area":"12","positionList":[{"status":"1","createTime":1565608382433,"id":"5f97495195f2456aac364fc12373e0f0","programId":"cc0b9d96b4c044f7b3067158afb258fd","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","roomAllId":"bfff5098ffae414f920c63add7a8d21e","positionName":"客厅"}]}]}}]}},{"status":"1","createTime":1565608382457,"id":"70bcf94e6dc54eedb710fe063096ee1c","programId":"cc0b9d96b4c044f7b3067158afb258fd","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","floorId":"a1d13404acd44f0cbd65ff8d9b315336","roomAllId":"bfff5098ffae414f920c63add7a8d21e","roomNumber":"1","area":"12","pointCount":2,"measurements":{"status":"1","createTime":1565664282833,"updateTime":1565664282833,"id":"bfda97eb5d314bdda8c0eb4dfe46f2a6","name":"实测实量表1","comId":"59bc934631db4ad6aa8c198d07318f60","programId":"cc0b9d96b4c044f7b3067158afb258fd","programType":"1","articleList":[{"status":"1","createTime":1565664282834,"updateTime":1565664282834,"id":"dc7991a8827d4deeb85cf08023534b7a","measurementsId":"bfda97eb5d314bdda8c0eb4dfe46f2a6","name":"检查项目1","itemList":[{"status":"1","createTime":1565664282835,"updateTime":1565664282835,"id":"3582a0855e4b4c47b6c03a02eb9a90b3","articleId":"dc7991a8827d4deeb85cf08023534b7a","name":"检查指标1","modelList":[{"status":"1","createTime":1565664282836,"updateTime":1565664282836,"id":"fe0d50a60a2f4d769b31b469db5225b4","itemId":"3582a0855e4b4c47b6c03a02eb9a90b3","name":"标准1","criteria":"0，3","pointRule":"1","resultName":"","roomList":[{"status":"1","createTime":1565664282841,"updateTime":1565664282841,"id":"002986971cc34434a6664f993c3fc8d3","modelId":"fe0d50a60a2f4d769b31b469db5225b4","roomAllId":"bfff5098ffae414f920c63add7a8d21e","positionList":[{"status":"1","createTime":1565664282842,"updateTime":1565664282842,"id":"2b23f41aa94a4aa2a9ec3992a667c8cd","name":"客厅","modelRoomId":"002986971cc34434a6664f993c3fc8d3","positionAllId":"5f97495195f2456aac364fc12373e0f0","pointList":[{"status":"1","createTime":1565664282843,"updateTime":1565664282843,"id":"4acc4d0de8a44f22aa0b4220a48f3171","positionId":"2b23f41aa94a4aa2a9ec3992a667c8cd","name":"2"},{"status":"1","createTime":1565664282842,"updateTime":1565664282842,"id":"1d6f8fc9eac8452f886177003181828e","positionId":"2b23f41aa94a4aa2a9ec3992a667c8cd","name":"1"}]}]}]}]}]}],"employeeLinkList":[{"status":"1","createTime":1565664282846,"updateTime":1565664282846,"id":"9f33da7fb6714ec99b346803fc6c8549","measurementsId":"bfda97eb5d314bdda8c0eb4dfe46f2a6","employeeId":"f2bbff18714a402c84968a82511eed49"},{"status":"1","createTime":1565664282846,"updateTime":1565664282846,"id":"cc9d3ec08ea84c21b6760bcf1093c102","measurementsId":"bfda97eb5d314bdda8c0eb4dfe46f2a6","employeeId":"0592489b42b742ad8dcf1210b9698b9d"},{"status":"1","createTime":1565664282845,"updateTime":1565664282845,"id":"4b71766eedde4e9cbb0663b60f272f51","measurementsId":"bfda97eb5d314bdda8c0eb4dfe46f2a6","employeeId":"dad14983959e48e0a95b90787162a2eb"},{"status":"1","createTime":1565664282844,"updateTime":1565664282844,"id":"7701346543e0434681c75895f3ab37a8","measurementsId":"bfda97eb5d314bdda8c0eb4dfe46f2a6","employeeId":"421d7d8dacbf457789f0aa39034de4d1"}],"floorLinkList":[{"status":"1","createTime":1565664282847,"updateTime":1565664282847,"id":"a686b31615df4123ba23caaf0dcf3b40","measurementsId":"bfda97eb5d314bdda8c0eb4dfe46f2a6","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","building":{"status":"1","createTime":1565608341863,"id":"b5fcb8395ae84c68bd8639b00068b414","morphology":"高层","buildingNumber":"1","unitNumber":"2","programId":"cc0b9d96b4c044f7b3067158afb258fd","unitList":[]},"unit":{"status":"1","createTime":1565608341871,"id":"afc5cc774e624635b4a4213740492a3c","unitNumber":"1","buildingId":"b5fcb8395ae84c68bd8639b00068b414","programId":"cc0b9d96b4c044f7b3067158afb258fd","floorAllList":[]},"floorAll":{"status":"1","createTime":1565608382418,"id":"a3eb090e2a494ff9aa66ed7d6bc5141d","floorNumberStart":"1","floorNumberEnd":"5","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","programId":"cc0b9d96b4c044f7b3067158afb258fd","imgUrl":"","roomAllList":[{"status":"1","createTime":1565608382438,"id":"4ecd89608e984312a2f2a8af234ecad8","programId":"cc0b9d96b4c044f7b3067158afb258fd","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","roomNumber":"2","area":"12","positionList":[{"status":"1","createTime":1565608382442,"id":"abcc252c9f304f79b97ba0886aec801c","programId":"cc0b9d96b4c044f7b3067158afb258fd","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","roomAllId":"4ecd89608e984312a2f2a8af234ecad8","positionName":"卧室"}]},{"status":"1","createTime":1565608382426,"id":"bfff5098ffae414f920c63add7a8d21e","programId":"cc0b9d96b4c044f7b3067158afb258fd","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","roomNumber":"1","area":"12","positionList":[{"status":"1","createTime":1565608382433,"id":"5f97495195f2456aac364fc12373e0f0","programId":"cc0b9d96b4c044f7b3067158afb258fd","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","roomAllId":"bfff5098ffae414f920c63add7a8d21e","positionName":"客厅"}]}]}}]}}]},{"status":"1","createTime":1565608382464,"id":"4acb75e8ba6b485b98d2a404eb55be41","floorNumber":"2","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","programId":"cc0b9d96b4c044f7b3067158afb258fd","pointCount":5,"roomList":[]}]
     */

    var status: String? = null
    var msg: String? = null
    var data: List<DataBean>? = null

    class DataBean :Serializable{
        /**
         * status : 1
         * createTime : 1565608382450
         * id : a1d13404acd44f0cbd65ff8d9b315336
         * floorNumber : 1
         * buildingId : b5fcb8395ae84c68bd8639b00068b414
         * unitId : afc5cc774e624635b4a4213740492a3c
         * floorAllId : a3eb090e2a494ff9aa66ed7d6bc5141d
         * programId : cc0b9d96b4c044f7b3067158afb258fd
         * pointCount : 5
         * roomList : [{"status":"1","createTime":1565608382460,"id":"bcc70bca2deb4dd7b97bfe7338c506df","programId":"cc0b9d96b4c044f7b3067158afb258fd","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","floorId":"a1d13404acd44f0cbd65ff8d9b315336","roomAllId":"4ecd89608e984312a2f2a8af234ecad8","roomNumber":"2","area":"12","pointCount":3,"measurements":{"status":"1","createTime":1565664282833,"updateTime":1565664282833,"id":"bfda97eb5d314bdda8c0eb4dfe46f2a6","name":"实测实量表1","comId":"59bc934631db4ad6aa8c198d07318f60","programId":"cc0b9d96b4c044f7b3067158afb258fd","programType":"1","articleList":[{"status":"1","createTime":1565664282834,"updateTime":1565664282834,"id":"dc7991a8827d4deeb85cf08023534b7a","measurementsId":"bfda97eb5d314bdda8c0eb4dfe46f2a6","name":"检查项目1","itemList":[{"status":"1","createTime":1565664282835,"updateTime":1565664282835,"id":"3582a0855e4b4c47b6c03a02eb9a90b3","articleId":"dc7991a8827d4deeb85cf08023534b7a","name":"检查指标1","modelList":[{"status":"1","createTime":1565664282836,"updateTime":1565664282836,"id":"fe0d50a60a2f4d769b31b469db5225b4","itemId":"3582a0855e4b4c47b6c03a02eb9a90b3","name":"标准1","criteria":"0，3","pointRule":"1","resultName":"","roomList":[{"status":"1","createTime":1565664282837,"updateTime":1565664282837,"id":"968df431386e4dc4ab31ab7526f2d200","modelId":"fe0d50a60a2f4d769b31b469db5225b4","roomAllId":"4ecd89608e984312a2f2a8af234ecad8","positionList":[{"status":"1","createTime":1565664282838,"updateTime":1565664282838,"id":"b4989fda201b40409c2d2fc1fc83d6d8","name":"卧室","modelRoomId":"968df431386e4dc4ab31ab7526f2d200","positionAllId":"abcc252c9f304f79b97ba0886aec801c","pointList":[{"status":"1","createTime":1565664282840,"updateTime":1565664282840,"id":"7bf9e6e919124a38a51e1ff39ca31dc6","positionId":"b4989fda201b40409c2d2fc1fc83d6d8","name":"3"},{"status":"1","createTime":1565664282839,"updateTime":1565664282839,"id":"9f7bbba6c8914fcc970e0b5003a65385","positionId":"b4989fda201b40409c2d2fc1fc83d6d8","name":"2"},{"status":"1","createTime":1565664282838,"updateTime":1565664282838,"id":"70bea82bfbd640639fdcc214d8c7a1ce","positionId":"b4989fda201b40409c2d2fc1fc83d6d8","name":"1"}]}]}]}]}]}],"employeeLinkList":[{"status":"1","createTime":1565664282846,"updateTime":1565664282846,"id":"9f33da7fb6714ec99b346803fc6c8549","measurementsId":"bfda97eb5d314bdda8c0eb4dfe46f2a6","employeeId":"f2bbff18714a402c84968a82511eed49"},{"status":"1","createTime":1565664282846,"updateTime":1565664282846,"id":"cc9d3ec08ea84c21b6760bcf1093c102","measurementsId":"bfda97eb5d314bdda8c0eb4dfe46f2a6","employeeId":"0592489b42b742ad8dcf1210b9698b9d"},{"status":"1","createTime":1565664282845,"updateTime":1565664282845,"id":"4b71766eedde4e9cbb0663b60f272f51","measurementsId":"bfda97eb5d314bdda8c0eb4dfe46f2a6","employeeId":"dad14983959e48e0a95b90787162a2eb"},{"status":"1","createTime":1565664282844,"updateTime":1565664282844,"id":"7701346543e0434681c75895f3ab37a8","measurementsId":"bfda97eb5d314bdda8c0eb4dfe46f2a6","employeeId":"421d7d8dacbf457789f0aa39034de4d1"}],"floorLinkList":[{"status":"1","createTime":1565664282847,"updateTime":1565664282847,"id":"a686b31615df4123ba23caaf0dcf3b40","measurementsId":"bfda97eb5d314bdda8c0eb4dfe46f2a6","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","building":{"status":"1","createTime":1565608341863,"id":"b5fcb8395ae84c68bd8639b00068b414","morphology":"高层","buildingNumber":"1","unitNumber":"2","programId":"cc0b9d96b4c044f7b3067158afb258fd","unitList":[]},"unit":{"status":"1","createTime":1565608341871,"id":"afc5cc774e624635b4a4213740492a3c","unitNumber":"1","buildingId":"b5fcb8395ae84c68bd8639b00068b414","programId":"cc0b9d96b4c044f7b3067158afb258fd","floorAllList":[]},"floorAll":{"status":"1","createTime":1565608382418,"id":"a3eb090e2a494ff9aa66ed7d6bc5141d","floorNumberStart":"1","floorNumberEnd":"5","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","programId":"cc0b9d96b4c044f7b3067158afb258fd","imgUrl":"","roomAllList":[{"status":"1","createTime":1565608382438,"id":"4ecd89608e984312a2f2a8af234ecad8","programId":"cc0b9d96b4c044f7b3067158afb258fd","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","roomNumber":"2","area":"12","positionList":[{"status":"1","createTime":1565608382442,"id":"abcc252c9f304f79b97ba0886aec801c","programId":"cc0b9d96b4c044f7b3067158afb258fd","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","roomAllId":"4ecd89608e984312a2f2a8af234ecad8","positionName":"卧室"}]},{"status":"1","createTime":1565608382426,"id":"bfff5098ffae414f920c63add7a8d21e","programId":"cc0b9d96b4c044f7b3067158afb258fd","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","roomNumber":"1","area":"12","positionList":[{"status":"1","createTime":1565608382433,"id":"5f97495195f2456aac364fc12373e0f0","programId":"cc0b9d96b4c044f7b3067158afb258fd","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","roomAllId":"bfff5098ffae414f920c63add7a8d21e","positionName":"客厅"}]}]}}]}},{"status":"1","createTime":1565608382457,"id":"70bcf94e6dc54eedb710fe063096ee1c","programId":"cc0b9d96b4c044f7b3067158afb258fd","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","floorId":"a1d13404acd44f0cbd65ff8d9b315336","roomAllId":"bfff5098ffae414f920c63add7a8d21e","roomNumber":"1","area":"12","pointCount":2,"measurements":{"status":"1","createTime":1565664282833,"updateTime":1565664282833,"id":"bfda97eb5d314bdda8c0eb4dfe46f2a6","name":"实测实量表1","comId":"59bc934631db4ad6aa8c198d07318f60","programId":"cc0b9d96b4c044f7b3067158afb258fd","programType":"1","articleList":[{"status":"1","createTime":1565664282834,"updateTime":1565664282834,"id":"dc7991a8827d4deeb85cf08023534b7a","measurementsId":"bfda97eb5d314bdda8c0eb4dfe46f2a6","name":"检查项目1","itemList":[{"status":"1","createTime":1565664282835,"updateTime":1565664282835,"id":"3582a0855e4b4c47b6c03a02eb9a90b3","articleId":"dc7991a8827d4deeb85cf08023534b7a","name":"检查指标1","modelList":[{"status":"1","createTime":1565664282836,"updateTime":1565664282836,"id":"fe0d50a60a2f4d769b31b469db5225b4","itemId":"3582a0855e4b4c47b6c03a02eb9a90b3","name":"标准1","criteria":"0，3","pointRule":"1","resultName":"","roomList":[{"status":"1","createTime":1565664282841,"updateTime":1565664282841,"id":"002986971cc34434a6664f993c3fc8d3","modelId":"fe0d50a60a2f4d769b31b469db5225b4","roomAllId":"bfff5098ffae414f920c63add7a8d21e","positionList":[{"status":"1","createTime":1565664282842,"updateTime":1565664282842,"id":"2b23f41aa94a4aa2a9ec3992a667c8cd","name":"客厅","modelRoomId":"002986971cc34434a6664f993c3fc8d3","positionAllId":"5f97495195f2456aac364fc12373e0f0","pointList":[{"status":"1","createTime":1565664282843,"updateTime":1565664282843,"id":"4acc4d0de8a44f22aa0b4220a48f3171","positionId":"2b23f41aa94a4aa2a9ec3992a667c8cd","name":"2"},{"status":"1","createTime":1565664282842,"updateTime":1565664282842,"id":"1d6f8fc9eac8452f886177003181828e","positionId":"2b23f41aa94a4aa2a9ec3992a667c8cd","name":"1"}]}]}]}]}]}],"employeeLinkList":[{"status":"1","createTime":1565664282846,"updateTime":1565664282846,"id":"9f33da7fb6714ec99b346803fc6c8549","measurementsId":"bfda97eb5d314bdda8c0eb4dfe46f2a6","employeeId":"f2bbff18714a402c84968a82511eed49"},{"status":"1","createTime":1565664282846,"updateTime":1565664282846,"id":"cc9d3ec08ea84c21b6760bcf1093c102","measurementsId":"bfda97eb5d314bdda8c0eb4dfe46f2a6","employeeId":"0592489b42b742ad8dcf1210b9698b9d"},{"status":"1","createTime":1565664282845,"updateTime":1565664282845,"id":"4b71766eedde4e9cbb0663b60f272f51","measurementsId":"bfda97eb5d314bdda8c0eb4dfe46f2a6","employeeId":"dad14983959e48e0a95b90787162a2eb"},{"status":"1","createTime":1565664282844,"updateTime":1565664282844,"id":"7701346543e0434681c75895f3ab37a8","measurementsId":"bfda97eb5d314bdda8c0eb4dfe46f2a6","employeeId":"421d7d8dacbf457789f0aa39034de4d1"}],"floorLinkList":[{"status":"1","createTime":1565664282847,"updateTime":1565664282847,"id":"a686b31615df4123ba23caaf0dcf3b40","measurementsId":"bfda97eb5d314bdda8c0eb4dfe46f2a6","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","building":{"status":"1","createTime":1565608341863,"id":"b5fcb8395ae84c68bd8639b00068b414","morphology":"高层","buildingNumber":"1","unitNumber":"2","programId":"cc0b9d96b4c044f7b3067158afb258fd","unitList":[]},"unit":{"status":"1","createTime":1565608341871,"id":"afc5cc774e624635b4a4213740492a3c","unitNumber":"1","buildingId":"b5fcb8395ae84c68bd8639b00068b414","programId":"cc0b9d96b4c044f7b3067158afb258fd","floorAllList":[]},"floorAll":{"status":"1","createTime":1565608382418,"id":"a3eb090e2a494ff9aa66ed7d6bc5141d","floorNumberStart":"1","floorNumberEnd":"5","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","programId":"cc0b9d96b4c044f7b3067158afb258fd","imgUrl":"","roomAllList":[{"status":"1","createTime":1565608382438,"id":"4ecd89608e984312a2f2a8af234ecad8","programId":"cc0b9d96b4c044f7b3067158afb258fd","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","roomNumber":"2","area":"12","positionList":[{"status":"1","createTime":1565608382442,"id":"abcc252c9f304f79b97ba0886aec801c","programId":"cc0b9d96b4c044f7b3067158afb258fd","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","roomAllId":"4ecd89608e984312a2f2a8af234ecad8","positionName":"卧室"}]},{"status":"1","createTime":1565608382426,"id":"bfff5098ffae414f920c63add7a8d21e","programId":"cc0b9d96b4c044f7b3067158afb258fd","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","roomNumber":"1","area":"12","positionList":[{"status":"1","createTime":1565608382433,"id":"5f97495195f2456aac364fc12373e0f0","programId":"cc0b9d96b4c044f7b3067158afb258fd","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","roomAllId":"bfff5098ffae414f920c63add7a8d21e","positionName":"客厅"}]}]}}]}}]
         */

        var status: String? = null
        var createTime: Long = 0
        var id: String? = null
        var floorNumber: String? = null
        var buildingId: String? = null
        var unitId: String? = null
        var floorAllId: String? = null
        var programId: String? = null
        var pointCount: Int = 0
        var roomList: List<RoomListBeanX>? = null
        var qualifiendProbability:Float?=null

        class RoomListBeanX :Serializable{
            /**
             * status : 1
             * createTime : 1565608382460
             * id : bcc70bca2deb4dd7b97bfe7338c506df
             * programId : cc0b9d96b4c044f7b3067158afb258fd
             * buildingId : b5fcb8395ae84c68bd8639b00068b414
             * unitId : afc5cc774e624635b4a4213740492a3c
             * floorAllId : a3eb090e2a494ff9aa66ed7d6bc5141d
             * floorId : a1d13404acd44f0cbd65ff8d9b315336
             * roomAllId : 4ecd89608e984312a2f2a8af234ecad8
             * roomNumber : 2
             * area : 12
             * pointCount : 3
             * measurements : {"status":"1","createTime":1565664282833,"updateTime":1565664282833,"id":"bfda97eb5d314bdda8c0eb4dfe46f2a6","name":"实测实量表1","comId":"59bc934631db4ad6aa8c198d07318f60","programId":"cc0b9d96b4c044f7b3067158afb258fd","programType":"1","articleList":[{"status":"1","createTime":1565664282834,"updateTime":1565664282834,"id":"dc7991a8827d4deeb85cf08023534b7a","measurementsId":"bfda97eb5d314bdda8c0eb4dfe46f2a6","name":"检查项目1","itemList":[{"status":"1","createTime":1565664282835,"updateTime":1565664282835,"id":"3582a0855e4b4c47b6c03a02eb9a90b3","articleId":"dc7991a8827d4deeb85cf08023534b7a","name":"检查指标1","modelList":[{"status":"1","createTime":1565664282836,"updateTime":1565664282836,"id":"fe0d50a60a2f4d769b31b469db5225b4","itemId":"3582a0855e4b4c47b6c03a02eb9a90b3","name":"标准1","criteria":"0，3","pointRule":"1","resultName":"","roomList":[{"status":"1","createTime":1565664282837,"updateTime":1565664282837,"id":"968df431386e4dc4ab31ab7526f2d200","modelId":"fe0d50a60a2f4d769b31b469db5225b4","roomAllId":"4ecd89608e984312a2f2a8af234ecad8","positionList":[{"status":"1","createTime":1565664282838,"updateTime":1565664282838,"id":"b4989fda201b40409c2d2fc1fc83d6d8","name":"卧室","modelRoomId":"968df431386e4dc4ab31ab7526f2d200","positionAllId":"abcc252c9f304f79b97ba0886aec801c","pointList":[{"status":"1","createTime":1565664282840,"updateTime":1565664282840,"id":"7bf9e6e919124a38a51e1ff39ca31dc6","positionId":"b4989fda201b40409c2d2fc1fc83d6d8","name":"3"},{"status":"1","createTime":1565664282839,"updateTime":1565664282839,"id":"9f7bbba6c8914fcc970e0b5003a65385","positionId":"b4989fda201b40409c2d2fc1fc83d6d8","name":"2"},{"status":"1","createTime":1565664282838,"updateTime":1565664282838,"id":"70bea82bfbd640639fdcc214d8c7a1ce","positionId":"b4989fda201b40409c2d2fc1fc83d6d8","name":"1"}]}]}]}]}]}],"employeeLinkList":[{"status":"1","createTime":1565664282846,"updateTime":1565664282846,"id":"9f33da7fb6714ec99b346803fc6c8549","measurementsId":"bfda97eb5d314bdda8c0eb4dfe46f2a6","employeeId":"f2bbff18714a402c84968a82511eed49"},{"status":"1","createTime":1565664282846,"updateTime":1565664282846,"id":"cc9d3ec08ea84c21b6760bcf1093c102","measurementsId":"bfda97eb5d314bdda8c0eb4dfe46f2a6","employeeId":"0592489b42b742ad8dcf1210b9698b9d"},{"status":"1","createTime":1565664282845,"updateTime":1565664282845,"id":"4b71766eedde4e9cbb0663b60f272f51","measurementsId":"bfda97eb5d314bdda8c0eb4dfe46f2a6","employeeId":"dad14983959e48e0a95b90787162a2eb"},{"status":"1","createTime":1565664282844,"updateTime":1565664282844,"id":"7701346543e0434681c75895f3ab37a8","measurementsId":"bfda97eb5d314bdda8c0eb4dfe46f2a6","employeeId":"421d7d8dacbf457789f0aa39034de4d1"}],"floorLinkList":[{"status":"1","createTime":1565664282847,"updateTime":1565664282847,"id":"a686b31615df4123ba23caaf0dcf3b40","measurementsId":"bfda97eb5d314bdda8c0eb4dfe46f2a6","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","building":{"status":"1","createTime":1565608341863,"id":"b5fcb8395ae84c68bd8639b00068b414","morphology":"高层","buildingNumber":"1","unitNumber":"2","programId":"cc0b9d96b4c044f7b3067158afb258fd","unitList":[]},"unit":{"status":"1","createTime":1565608341871,"id":"afc5cc774e624635b4a4213740492a3c","unitNumber":"1","buildingId":"b5fcb8395ae84c68bd8639b00068b414","programId":"cc0b9d96b4c044f7b3067158afb258fd","floorAllList":[]},"floorAll":{"status":"1","createTime":1565608382418,"id":"a3eb090e2a494ff9aa66ed7d6bc5141d","floorNumberStart":"1","floorNumberEnd":"5","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","programId":"cc0b9d96b4c044f7b3067158afb258fd","imgUrl":"","roomAllList":[{"status":"1","createTime":1565608382438,"id":"4ecd89608e984312a2f2a8af234ecad8","programId":"cc0b9d96b4c044f7b3067158afb258fd","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","roomNumber":"2","area":"12","positionList":[{"status":"1","createTime":1565608382442,"id":"abcc252c9f304f79b97ba0886aec801c","programId":"cc0b9d96b4c044f7b3067158afb258fd","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","roomAllId":"4ecd89608e984312a2f2a8af234ecad8","positionName":"卧室"}]},{"status":"1","createTime":1565608382426,"id":"bfff5098ffae414f920c63add7a8d21e","programId":"cc0b9d96b4c044f7b3067158afb258fd","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","roomNumber":"1","area":"12","positionList":[{"status":"1","createTime":1565608382433,"id":"5f97495195f2456aac364fc12373e0f0","programId":"cc0b9d96b4c044f7b3067158afb258fd","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","roomAllId":"bfff5098ffae414f920c63add7a8d21e","positionName":"客厅"}]}]}}]}
             */

            var status: String? = null
            var createTime: Long = 0
            var id: String? = null
            var programId: String? = null
            var buildingId: String? = null
            var unitId: String? = null
            var floorAllId: String? = null
            var floorId: String? = null
            var roomAllId: String? = null
            var roomNumber: String? = null
            var area: String? = null
            var pointCount: Int = 0
            var measurements: MeasurementsBean? = null
            var qualifiendProbability:Float?=null

            class MeasurementsBean :Serializable{
                /**
                 * status : 1
                 * createTime : 1565664282833
                 * updateTime : 1565664282833
                 * id : bfda97eb5d314bdda8c0eb4dfe46f2a6
                 * name : 实测实量表1
                 * comId : 59bc934631db4ad6aa8c198d07318f60
                 * programId : cc0b9d96b4c044f7b3067158afb258fd
                 * programType : 1
                 * articleList : [{"status":"1","createTime":1565664282834,"updateTime":1565664282834,"id":"dc7991a8827d4deeb85cf08023534b7a","measurementsId":"bfda97eb5d314bdda8c0eb4dfe46f2a6","name":"检查项目1","itemList":[{"status":"1","createTime":1565664282835,"updateTime":1565664282835,"id":"3582a0855e4b4c47b6c03a02eb9a90b3","articleId":"dc7991a8827d4deeb85cf08023534b7a","name":"检查指标1","modelList":[{"status":"1","createTime":1565664282836,"updateTime":1565664282836,"id":"fe0d50a60a2f4d769b31b469db5225b4","itemId":"3582a0855e4b4c47b6c03a02eb9a90b3","name":"标准1","criteria":"0，3","pointRule":"1","resultName":"","roomList":[{"status":"1","createTime":1565664282837,"updateTime":1565664282837,"id":"968df431386e4dc4ab31ab7526f2d200","modelId":"fe0d50a60a2f4d769b31b469db5225b4","roomAllId":"4ecd89608e984312a2f2a8af234ecad8","positionList":[{"status":"1","createTime":1565664282838,"updateTime":1565664282838,"id":"b4989fda201b40409c2d2fc1fc83d6d8","name":"卧室","modelRoomId":"968df431386e4dc4ab31ab7526f2d200","positionAllId":"abcc252c9f304f79b97ba0886aec801c","pointList":[{"status":"1","createTime":1565664282840,"updateTime":1565664282840,"id":"7bf9e6e919124a38a51e1ff39ca31dc6","positionId":"b4989fda201b40409c2d2fc1fc83d6d8","name":"3"},{"status":"1","createTime":1565664282839,"updateTime":1565664282839,"id":"9f7bbba6c8914fcc970e0b5003a65385","positionId":"b4989fda201b40409c2d2fc1fc83d6d8","name":"2"},{"status":"1","createTime":1565664282838,"updateTime":1565664282838,"id":"70bea82bfbd640639fdcc214d8c7a1ce","positionId":"b4989fda201b40409c2d2fc1fc83d6d8","name":"1"}]}]}]}]}]}]
                 * employeeLinkList : [{"status":"1","createTime":1565664282846,"updateTime":1565664282846,"id":"9f33da7fb6714ec99b346803fc6c8549","measurementsId":"bfda97eb5d314bdda8c0eb4dfe46f2a6","employeeId":"f2bbff18714a402c84968a82511eed49"},{"status":"1","createTime":1565664282846,"updateTime":1565664282846,"id":"cc9d3ec08ea84c21b6760bcf1093c102","measurementsId":"bfda97eb5d314bdda8c0eb4dfe46f2a6","employeeId":"0592489b42b742ad8dcf1210b9698b9d"},{"status":"1","createTime":1565664282845,"updateTime":1565664282845,"id":"4b71766eedde4e9cbb0663b60f272f51","measurementsId":"bfda97eb5d314bdda8c0eb4dfe46f2a6","employeeId":"dad14983959e48e0a95b90787162a2eb"},{"status":"1","createTime":1565664282844,"updateTime":1565664282844,"id":"7701346543e0434681c75895f3ab37a8","measurementsId":"bfda97eb5d314bdda8c0eb4dfe46f2a6","employeeId":"421d7d8dacbf457789f0aa39034de4d1"}]
                 * floorLinkList : [{"status":"1","createTime":1565664282847,"updateTime":1565664282847,"id":"a686b31615df4123ba23caaf0dcf3b40","measurementsId":"bfda97eb5d314bdda8c0eb4dfe46f2a6","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","building":{"status":"1","createTime":1565608341863,"id":"b5fcb8395ae84c68bd8639b00068b414","morphology":"高层","buildingNumber":"1","unitNumber":"2","programId":"cc0b9d96b4c044f7b3067158afb258fd","unitList":[]},"unit":{"status":"1","createTime":1565608341871,"id":"afc5cc774e624635b4a4213740492a3c","unitNumber":"1","buildingId":"b5fcb8395ae84c68bd8639b00068b414","programId":"cc0b9d96b4c044f7b3067158afb258fd","floorAllList":[]},"floorAll":{"status":"1","createTime":1565608382418,"id":"a3eb090e2a494ff9aa66ed7d6bc5141d","floorNumberStart":"1","floorNumberEnd":"5","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","programId":"cc0b9d96b4c044f7b3067158afb258fd","imgUrl":"","roomAllList":[{"status":"1","createTime":1565608382438,"id":"4ecd89608e984312a2f2a8af234ecad8","programId":"cc0b9d96b4c044f7b3067158afb258fd","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","roomNumber":"2","area":"12","positionList":[{"status":"1","createTime":1565608382442,"id":"abcc252c9f304f79b97ba0886aec801c","programId":"cc0b9d96b4c044f7b3067158afb258fd","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","roomAllId":"4ecd89608e984312a2f2a8af234ecad8","positionName":"卧室"}]},{"status":"1","createTime":1565608382426,"id":"bfff5098ffae414f920c63add7a8d21e","programId":"cc0b9d96b4c044f7b3067158afb258fd","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","roomNumber":"1","area":"12","positionList":[{"status":"1","createTime":1565608382433,"id":"5f97495195f2456aac364fc12373e0f0","programId":"cc0b9d96b4c044f7b3067158afb258fd","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","roomAllId":"bfff5098ffae414f920c63add7a8d21e","positionName":"客厅"}]}]}}]
                 */

                var status: String? = null
                var createTime: Long = 0
                var updateTime: Long = 0
                var id: String? = null
                var name: String? = null
                var comId: String? = null
                var programId: String? = null
                var programType: String? = null
                var articleList: List<ArticleListBean>? = null
                var employeeLinkList: List<EmployeeLinkListBean>? = null
                var floorLinkList: List<FloorLinkListBean>? = null

                class ArticleListBean :Serializable{
                    /**
                     * status : 1
                     * createTime : 1565664282834
                     * updateTime : 1565664282834
                     * id : dc7991a8827d4deeb85cf08023534b7a
                     * measurementsId : bfda97eb5d314bdda8c0eb4dfe46f2a6
                     * name : 检查项目1
                     * itemList : [{"status":"1","createTime":1565664282835,"updateTime":1565664282835,"id":"3582a0855e4b4c47b6c03a02eb9a90b3","articleId":"dc7991a8827d4deeb85cf08023534b7a","name":"检查指标1","modelList":[{"status":"1","createTime":1565664282836,"updateTime":1565664282836,"id":"fe0d50a60a2f4d769b31b469db5225b4","itemId":"3582a0855e4b4c47b6c03a02eb9a90b3","name":"标准1","criteria":"0，3","pointRule":"1","resultName":"","roomList":[{"status":"1","createTime":1565664282837,"updateTime":1565664282837,"id":"968df431386e4dc4ab31ab7526f2d200","modelId":"fe0d50a60a2f4d769b31b469db5225b4","roomAllId":"4ecd89608e984312a2f2a8af234ecad8","positionList":[{"status":"1","createTime":1565664282838,"updateTime":1565664282838,"id":"b4989fda201b40409c2d2fc1fc83d6d8","name":"卧室","modelRoomId":"968df431386e4dc4ab31ab7526f2d200","positionAllId":"abcc252c9f304f79b97ba0886aec801c","pointList":[{"status":"1","createTime":1565664282840,"updateTime":1565664282840,"id":"7bf9e6e919124a38a51e1ff39ca31dc6","positionId":"b4989fda201b40409c2d2fc1fc83d6d8","name":"3"},{"status":"1","createTime":1565664282839,"updateTime":1565664282839,"id":"9f7bbba6c8914fcc970e0b5003a65385","positionId":"b4989fda201b40409c2d2fc1fc83d6d8","name":"2"},{"status":"1","createTime":1565664282838,"updateTime":1565664282838,"id":"70bea82bfbd640639fdcc214d8c7a1ce","positionId":"b4989fda201b40409c2d2fc1fc83d6d8","name":"1"}]}]}]}]}]
                     */

                    var status: String? = null
                    var createTime: Long = 0
                    var updateTime: Long = 0
                    var id: String? = null
                    var measurementsId: String? = null
                    var name: String? = null
                    var itemList: List<ItemListBean>? = null
                    var qualifiendProbability:Float?=null

                    class ItemListBean :Serializable{
                        /**
                         * status : 1
                         * createTime : 1565664282835
                         * updateTime : 1565664282835
                         * id : 3582a0855e4b4c47b6c03a02eb9a90b3
                         * articleId : dc7991a8827d4deeb85cf08023534b7a
                         * name : 检查指标1
                         * modelList : [{"status":"1","createTime":1565664282836,"updateTime":1565664282836,"id":"fe0d50a60a2f4d769b31b469db5225b4","itemId":"3582a0855e4b4c47b6c03a02eb9a90b3","name":"标准1","criteria":"0，3","pointRule":"1","resultName":"","roomList":[{"status":"1","createTime":1565664282837,"updateTime":1565664282837,"id":"968df431386e4dc4ab31ab7526f2d200","modelId":"fe0d50a60a2f4d769b31b469db5225b4","roomAllId":"4ecd89608e984312a2f2a8af234ecad8","positionList":[{"status":"1","createTime":1565664282838,"updateTime":1565664282838,"id":"b4989fda201b40409c2d2fc1fc83d6d8","name":"卧室","modelRoomId":"968df431386e4dc4ab31ab7526f2d200","positionAllId":"abcc252c9f304f79b97ba0886aec801c","pointList":[{"status":"1","createTime":1565664282840,"updateTime":1565664282840,"id":"7bf9e6e919124a38a51e1ff39ca31dc6","positionId":"b4989fda201b40409c2d2fc1fc83d6d8","name":"3"},{"status":"1","createTime":1565664282839,"updateTime":1565664282839,"id":"9f7bbba6c8914fcc970e0b5003a65385","positionId":"b4989fda201b40409c2d2fc1fc83d6d8","name":"2"},{"status":"1","createTime":1565664282838,"updateTime":1565664282838,"id":"70bea82bfbd640639fdcc214d8c7a1ce","positionId":"b4989fda201b40409c2d2fc1fc83d6d8","name":"1"}]}]}]}]
                         */

                        var status: String? = null
                        var createTime: Long = 0
                        var updateTime: Long = 0
                        var id: String? = null
                        var articleId: String? = null
                        var name: String? = null
                        var modelList: List<ModelListBean>? = null
                        var qualifiendProbability:Float?=null

                        class ModelListBean:Serializable {
                            /**
                             * status : 1
                             * createTime : 1565664282836
                             * updateTime : 1565664282836
                             * id : fe0d50a60a2f4d769b31b469db5225b4
                             * itemId : 3582a0855e4b4c47b6c03a02eb9a90b3
                             * name : 标准1
                             * criteria : 0，3
                             * pointRule : 1
                             * resultName :
                             * roomList : [{"status":"1","createTime":1565664282837,"updateTime":1565664282837,"id":"968df431386e4dc4ab31ab7526f2d200","modelId":"fe0d50a60a2f4d769b31b469db5225b4","roomAllId":"4ecd89608e984312a2f2a8af234ecad8","positionList":[{"status":"1","createTime":1565664282838,"updateTime":1565664282838,"id":"b4989fda201b40409c2d2fc1fc83d6d8","name":"卧室","modelRoomId":"968df431386e4dc4ab31ab7526f2d200","positionAllId":"abcc252c9f304f79b97ba0886aec801c","pointList":[{"status":"1","createTime":1565664282840,"updateTime":1565664282840,"id":"7bf9e6e919124a38a51e1ff39ca31dc6","positionId":"b4989fda201b40409c2d2fc1fc83d6d8","name":"3"},{"status":"1","createTime":1565664282839,"updateTime":1565664282839,"id":"9f7bbba6c8914fcc970e0b5003a65385","positionId":"b4989fda201b40409c2d2fc1fc83d6d8","name":"2"},{"status":"1","createTime":1565664282838,"updateTime":1565664282838,"id":"70bea82bfbd640639fdcc214d8c7a1ce","positionId":"b4989fda201b40409c2d2fc1fc83d6d8","name":"1"}]}]}]
                             */

                            var status: String? = null
                            var createTime: Long = 0
                            var updateTime: Long = 0
                            var id: String? = null
                            var itemId: String? = null
                            var name: String? = null
                            var criteria: String? = null
                            var pointRule: String? = null
                            var resultName: String? = null
                            var roomList: List<RoomListBean>? = null
                            var qualifiendProbability:Float?=null

                            class RoomListBean :Serializable{
                                /**
                                 * status : 1
                                 * createTime : 1565664282837
                                 * updateTime : 1565664282837
                                 * id : 968df431386e4dc4ab31ab7526f2d200
                                 * modelId : fe0d50a60a2f4d769b31b469db5225b4
                                 * roomAllId : 4ecd89608e984312a2f2a8af234ecad8
                                 * positionList : [{"status":"1","createTime":1565664282838,"updateTime":1565664282838,"id":"b4989fda201b40409c2d2fc1fc83d6d8","name":"卧室","modelRoomId":"968df431386e4dc4ab31ab7526f2d200","positionAllId":"abcc252c9f304f79b97ba0886aec801c","pointList":[{"status":"1","createTime":1565664282840,"updateTime":1565664282840,"id":"7bf9e6e919124a38a51e1ff39ca31dc6","positionId":"b4989fda201b40409c2d2fc1fc83d6d8","name":"3"},{"status":"1","createTime":1565664282839,"updateTime":1565664282839,"id":"9f7bbba6c8914fcc970e0b5003a65385","positionId":"b4989fda201b40409c2d2fc1fc83d6d8","name":"2"},{"status":"1","createTime":1565664282838,"updateTime":1565664282838,"id":"70bea82bfbd640639fdcc214d8c7a1ce","positionId":"b4989fda201b40409c2d2fc1fc83d6d8","name":"1"}]}]
                                 */

                                var status: String? = null
                                var createTime: Long = 0
                                var updateTime: Long = 0
                                var id: String? = null
                                var modelId: String? = null
                                var roomAllId: String? = null
                                var positionList: List<PositionListBean>? = null

                                class PositionListBean:Serializable {
                                    /**
                                     * status : 1
                                     * createTime : 1565664282838
                                     * updateTime : 1565664282838
                                     * id : b4989fda201b40409c2d2fc1fc83d6d8
                                     * name : 卧室
                                     * modelRoomId : 968df431386e4dc4ab31ab7526f2d200
                                     * positionAllId : abcc252c9f304f79b97ba0886aec801c
                                     * pointList : [{"status":"1","createTime":1565664282840,"updateTime":1565664282840,"id":"7bf9e6e919124a38a51e1ff39ca31dc6","positionId":"b4989fda201b40409c2d2fc1fc83d6d8","name":"3"},{"status":"1","createTime":1565664282839,"updateTime":1565664282839,"id":"9f7bbba6c8914fcc970e0b5003a65385","positionId":"b4989fda201b40409c2d2fc1fc83d6d8","name":"2"},{"status":"1","createTime":1565664282838,"updateTime":1565664282838,"id":"70bea82bfbd640639fdcc214d8c7a1ce","positionId":"b4989fda201b40409c2d2fc1fc83d6d8","name":"1"}]
                                     */

                                    var status: String? = null
                                    var createTime: Long = 0
                                    var updateTime: Long = 0
                                    var id: String? = null
                                    var name: String? = null
                                    var modelRoomId: String? = null
                                    var positionAllId: String? = null
                                    var pointList: List<PointListBean>? = null
                                    var qualifiendProbability:Float?=null

                                    class PointListBean:Serializable {
                                        /**
                                         * status : 1
                                         * createTime : 1565664282840
                                         * updateTime : 1565664282840
                                         * id : 7bf9e6e919124a38a51e1ff39ca31dc6
                                         * positionId : b4989fda201b40409c2d2fc1fc83d6d8
                                         * name : 3
                                         */

                                        var status: String? = null
                                        var createTime: Long = 0
                                        var updateTime: Long = 0
                                        var id: String? = null
                                        var positionId: String? = null
                                        var name: String? = null
                                        var pointValue:String ?= null
                                        var qualifiendStatus:String?=null
                                    }
                                }
                            }
                        }
                    }
                }

                class EmployeeLinkListBean :Serializable{
                    /**
                     * status : 1
                     * createTime : 1565664282846
                     * updateTime : 1565664282846
                     * id : 9f33da7fb6714ec99b346803fc6c8549
                     * measurementsId : bfda97eb5d314bdda8c0eb4dfe46f2a6
                     * employeeId : f2bbff18714a402c84968a82511eed49
                     */

                    var status: String? = null
                    var createTime: Long = 0
                    var updateTime: Long = 0
                    var id: String? = null
                    var measurementsId: String? = null
                    var employeeId: String? = null
                }

                class FloorLinkListBean:Serializable {
                    /**
                     * status : 1
                     * createTime : 1565664282847
                     * updateTime : 1565664282847
                     * id : a686b31615df4123ba23caaf0dcf3b40
                     * measurementsId : bfda97eb5d314bdda8c0eb4dfe46f2a6
                     * buildingId : b5fcb8395ae84c68bd8639b00068b414
                     * unitId : afc5cc774e624635b4a4213740492a3c
                     * floorAllId : a3eb090e2a494ff9aa66ed7d6bc5141d
                     * building : {"status":"1","createTime":1565608341863,"id":"b5fcb8395ae84c68bd8639b00068b414","morphology":"高层","buildingNumber":"1","unitNumber":"2","programId":"cc0b9d96b4c044f7b3067158afb258fd","unitList":[]}
                     * unit : {"status":"1","createTime":1565608341871,"id":"afc5cc774e624635b4a4213740492a3c","unitNumber":"1","buildingId":"b5fcb8395ae84c68bd8639b00068b414","programId":"cc0b9d96b4c044f7b3067158afb258fd","floorAllList":[]}
                     * floorAll : {"status":"1","createTime":1565608382418,"id":"a3eb090e2a494ff9aa66ed7d6bc5141d","floorNumberStart":"1","floorNumberEnd":"5","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","programId":"cc0b9d96b4c044f7b3067158afb258fd","imgUrl":"","roomAllList":[{"status":"1","createTime":1565608382438,"id":"4ecd89608e984312a2f2a8af234ecad8","programId":"cc0b9d96b4c044f7b3067158afb258fd","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","roomNumber":"2","area":"12","positionList":[{"status":"1","createTime":1565608382442,"id":"abcc252c9f304f79b97ba0886aec801c","programId":"cc0b9d96b4c044f7b3067158afb258fd","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","roomAllId":"4ecd89608e984312a2f2a8af234ecad8","positionName":"卧室"}]},{"status":"1","createTime":1565608382426,"id":"bfff5098ffae414f920c63add7a8d21e","programId":"cc0b9d96b4c044f7b3067158afb258fd","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","roomNumber":"1","area":"12","positionList":[{"status":"1","createTime":1565608382433,"id":"5f97495195f2456aac364fc12373e0f0","programId":"cc0b9d96b4c044f7b3067158afb258fd","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","roomAllId":"bfff5098ffae414f920c63add7a8d21e","positionName":"客厅"}]}]}
                     */

                    var status: String? = null
                    var createTime: Long = 0
                    var updateTime: Long = 0
                    var id: String? = null
                    var measurementsId: String? = null
                    var buildingId: String? = null
                    var unitId: String? = null
                    var floorAllId: String? = null
                    var building: BuildingBean? = null
                    var unit: UnitBean? = null
                    var floorAll: FloorAllBean? = null

                    class BuildingBean:Serializable {
                        /**
                         * status : 1
                         * createTime : 1565608341863
                         * id : b5fcb8395ae84c68bd8639b00068b414
                         * morphology : 高层
                         * buildingNumber : 1
                         * unitNumber : 2
                         * programId : cc0b9d96b4c044f7b3067158afb258fd
                         * unitList : []
                         */

                        var status: String? = null
                        var createTime: Long = 0
                        var id: String? = null
                        var morphology: String? = null
                        var buildingNumber: String? = null
                        var unitNumber: String? = null
                        var programId: String? = null
                        var unitList: List<*>? = null
                    }

                    class UnitBean :Serializable{
                        /**
                         * status : 1
                         * createTime : 1565608341871
                         * id : afc5cc774e624635b4a4213740492a3c
                         * unitNumber : 1
                         * buildingId : b5fcb8395ae84c68bd8639b00068b414
                         * programId : cc0b9d96b4c044f7b3067158afb258fd
                         * floorAllList : []
                         */

                        var status: String? = null
                        var createTime: Long = 0
                        var id: String? = null
                        var unitNumber: String? = null
                        var buildingId: String? = null
                        var programId: String? = null
                        var floorAllList: List<*>? = null
                    }

                    class FloorAllBean:Serializable {
                        /**
                         * status : 1
                         * createTime : 1565608382418
                         * id : a3eb090e2a494ff9aa66ed7d6bc5141d
                         * floorNumberStart : 1
                         * floorNumberEnd : 5
                         * buildingId : b5fcb8395ae84c68bd8639b00068b414
                         * unitId : afc5cc774e624635b4a4213740492a3c
                         * programId : cc0b9d96b4c044f7b3067158afb258fd
                         * imgUrl :
                         * roomAllList : [{"status":"1","createTime":1565608382438,"id":"4ecd89608e984312a2f2a8af234ecad8","programId":"cc0b9d96b4c044f7b3067158afb258fd","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","roomNumber":"2","area":"12","positionList":[{"status":"1","createTime":1565608382442,"id":"abcc252c9f304f79b97ba0886aec801c","programId":"cc0b9d96b4c044f7b3067158afb258fd","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","roomAllId":"4ecd89608e984312a2f2a8af234ecad8","positionName":"卧室"}]},{"status":"1","createTime":1565608382426,"id":"bfff5098ffae414f920c63add7a8d21e","programId":"cc0b9d96b4c044f7b3067158afb258fd","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","roomNumber":"1","area":"12","positionList":[{"status":"1","createTime":1565608382433,"id":"5f97495195f2456aac364fc12373e0f0","programId":"cc0b9d96b4c044f7b3067158afb258fd","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","roomAllId":"bfff5098ffae414f920c63add7a8d21e","positionName":"客厅"}]}]
                         */

                        var status: String? = null
                        var createTime: Long = 0
                        var id: String? = null
                        var floorNumberStart: String? = null
                        var floorNumberEnd: String? = null
                        var buildingId: String? = null
                        var unitId: String? = null
                        var programId: String? = null
                        var imgUrl: String? = null
                        var roomAllList: List<RoomAllListBean>? = null

                        class RoomAllListBean:Serializable {
                            /**
                             * status : 1
                             * createTime : 1565608382438
                             * id : 4ecd89608e984312a2f2a8af234ecad8
                             * programId : cc0b9d96b4c044f7b3067158afb258fd
                             * buildingId : b5fcb8395ae84c68bd8639b00068b414
                             * unitId : afc5cc774e624635b4a4213740492a3c
                             * floorAllId : a3eb090e2a494ff9aa66ed7d6bc5141d
                             * roomNumber : 2
                             * area : 12
                             * positionList : [{"status":"1","createTime":1565608382442,"id":"abcc252c9f304f79b97ba0886aec801c","programId":"cc0b9d96b4c044f7b3067158afb258fd","buildingId":"b5fcb8395ae84c68bd8639b00068b414","unitId":"afc5cc774e624635b4a4213740492a3c","floorAllId":"a3eb090e2a494ff9aa66ed7d6bc5141d","roomAllId":"4ecd89608e984312a2f2a8af234ecad8","positionName":"卧室"}]
                             */

                            var status: String? = null
                            var createTime: Long = 0
                            var id: String? = null
                            var programId: String? = null
                            var buildingId: String? = null
                            var unitId: String? = null
                            var floorAllId: String? = null
                            var roomNumber: String? = null
                            var area: String? = null
                            var positionList: List<PositionListBeanX>? = null

                            class PositionListBeanX :Serializable{
                                /**
                                 * status : 1
                                 * createTime : 1565608382442
                                 * id : abcc252c9f304f79b97ba0886aec801c
                                 * programId : cc0b9d96b4c044f7b3067158afb258fd
                                 * buildingId : b5fcb8395ae84c68bd8639b00068b414
                                 * unitId : afc5cc774e624635b4a4213740492a3c
                                 * floorAllId : a3eb090e2a494ff9aa66ed7d6bc5141d
                                 * roomAllId : 4ecd89608e984312a2f2a8af234ecad8
                                 * positionName : 卧室
                                 */

                                var status: String? = null
                                var createTime: Long = 0
                                var id: String? = null
                                var programId: String? = null
                                var buildingId: String? = null
                                var unitId: String? = null
                                var floorAllId: String? = null
                                var roomAllId: String? = null
                                var positionName: String? = null
                            }
                        }
                    }
                }
            }
        }
    }
}
