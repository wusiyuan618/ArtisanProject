package com.hjl.artisan.login.bean

import com.hjl.artisan.app.HJLBean
import java.io.Serializable

class LoginBean : HJLBean(),Serializable {

    /**
     * msg : 登录成功
     * data : {"list":[{"functionList":[{"parent":null,"include":null,"functionName":"劳工库","childList":[{"parent":null,"include":null,"functionName":"劳工移出","childList":null,"updateTime":null,"sort":null,"functionUrl":"PROJECT_WORKER_REMOVE","functionParentId":"04c199a3747d4bca9e6bef7254a374ad","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563960440503,"functionDescribe":"","includeStr":null,"id":"24854c31e3c74a39b65593a37fbc3283","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"劳工审核","childList":null,"updateTime":null,"sort":null,"functionUrl":"PROJECT_WORKER_CHECK","functionParentId":"04c199a3747d4bca9e6bef7254a374ad","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563963509885,"functionDescribe":"","includeStr":null,"id":"55eb1296d09d457a9ba1314ad9ad843f","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"工匠评价(新增)","childList":null,"updateTime":null,"sort":null,"functionUrl":"WORKER_EVALUATE_ADD","functionParentId":"04c199a3747d4bca9e6bef7254a374ad","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563952639027,"functionDescribe":"","includeStr":null,"id":"808751f727f446bf90c892731af960f6","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"劳工编辑","childList":null,"updateTime":null,"sort":null,"functionUrl":"PROJECT_WORKER_EDIT","functionParentId":"04c199a3747d4bca9e6bef7254a374ad","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563960402691,"functionDescribe":"","includeStr":null,"id":"d06c20a988424ad39c2ade0851e86c7f","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"劳工库列表查看","childList":null,"updateTime":null,"sort":null,"functionUrl":"PROJECT_WORKER_MANAGER","functionParentId":"04c199a3747d4bca9e6bef7254a374ad","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1546595194834,"functionDescribe":"","includeStr":null,"id":"dbb5b9cfad904c038e94dd5009cd9928","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"添加劳工","childList":null,"updateTime":null,"sort":null,"functionUrl":"PROJECT_WORKER_ADD","functionParentId":"04c199a3747d4bca9e6bef7254a374ad","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563960380316,"functionDescribe":"","includeStr":null,"id":"e3dd044a7a0d4f569660749604a7ca8e","comId":null,"functionType":"2","status":"1"}],"updateTime":null,"sort":null,"functionUrl":"/pages/projectWorker/main","functionParentId":"0","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563952598043,"functionDescribe":"","includeStr":null,"id":"04c199a3747d4bca9e6bef7254a374ad","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"首页","childList":[{"parent":null,"include":null,"functionName":"实测实量","childList":null,"updateTime":null,"sort":null,"functionUrl":"SPOT_CHECK_REPORT_ENTRY","functionParentId":"8661b2fa73944012a85994bb9cf1551d","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1562916262878,"functionDescribe":"","includeStr":null,"id":"532a3d95f8bb412099516aa34a7f949a","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"巡检表","childList":null,"updateTime":null,"sort":null,"functionUrl":"INSPECTION_REPORT_ENTRY","functionParentId":"8661b2fa73944012a85994bb9cf1551d","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1562924273752,"functionDescribe":"","includeStr":null,"id":"e9760e9fcf3e470c9869aada3f871e01","comId":null,"functionType":"2","status":"1"}],"updateTime":null,"sort":null,"functionUrl":"/pages/home/main","functionParentId":"0","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1562916047242,"functionDescribe":"","includeStr":null,"id":"8661b2fa73944012a85994bb9cf1551d","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"工具","childList":[{"parent":null,"include":null,"functionName":"查看资金计划","childList":null,"updateTime":null,"sort":null,"functionUrl":"FUNDING_PLAN","functionParentId":"ae6a6c637db7425fba4e0068740ba416","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563328474441,"functionDescribe":"","includeStr":null,"id":"17db05714a2b4550b018760dc0ef6dc4","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"实测实量表","childList":null,"updateTime":null,"sort":null,"functionUrl":"SPOTCHECK_ENTRY","functionParentId":"ae6a6c637db7425fba4e0068740ba416","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563328433004,"functionDescribe":"","includeStr":null,"id":"2858266470e14c68ab1e924affeeff86","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"资金收入/支出计划","childList":null,"updateTime":null,"sort":null,"functionUrl":"FUNDING_PLAN_ADD","functionParentId":"ae6a6c637db7425fba4e0068740ba416","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1564022063327,"functionDescribe":"","includeStr":null,"id":"2cf2e30aed7443cca7c698284d767c4e","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"巡检表","childList":null,"updateTime":null,"sort":null,"functionUrl":"INSPECTION_ENTRY","functionParentId":"ae6a6c637db7425fba4e0068740ba416","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563328372962,"functionDescribe":"","includeStr":null,"id":"32a50c0ce0a34d1792e63251c82b79f4","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"材料管理","childList":null,"updateTime":null,"sort":null,"functionUrl":"MATERIAL_REPORT","functionParentId":"ae6a6c637db7425fba4e0068740ba416","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563873138070,"functionDescribe":"","includeStr":null,"id":"80f641f7664542e2bc90c6f484280f8e","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"用工计划","childList":null,"updateTime":null,"sort":null,"functionUrl":"EMPLOYEMENT_PLAN","functionParentId":"ae6a6c637db7425fba4e0068740ba416","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563328516597,"functionDescribe":"","includeStr":null,"id":"90718034ae8a470b81bac02e2337ab59","comId":null,"functionType":"2","status":"1"}],"updateTime":null,"sort":null,"functionUrl":"/pages/tools/main","functionParentId":"0","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563328325869,"functionDescribe":"","includeStr":null,"id":"ae6a6c637db7425fba4e0068740ba416","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"作战台","childList":[{"parent":null,"include":null,"functionName":"7日数据分析","childList":null,"updateTime":null,"sort":null,"functionUrl":"DAY7_ANALYSIS","functionParentId":"d30094db1fa3433798047c8772041e72","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563965416924,"functionDescribe":"","includeStr":null,"id":"713b42db844a42e294b79e9ab930cb65","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"工种分布","childList":null,"updateTime":null,"sort":null,"functionUrl":"WORK_DISTRIBUTION","functionParentId":"d30094db1fa3433798047c8772041e72","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563965494565,"functionDescribe":"","includeStr":null,"id":"89e3eff69e3749cebfc9f071f4845fed","comId":null,"functionType":"2","status":"1"}],"updateTime":null,"sort":null,"functionUrl":"/pages/station/main","functionParentId":"0","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563965359893,"functionDescribe":"","includeStr":null,"id":"d30094db1fa3433798047c8772041e72","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"班组管理","childList":[{"parent":null,"include":null,"functionName":"添加/编辑班组","childList":null,"updateTime":null,"sort":null,"functionUrl":"WOEKER_GROUP_ADD","functionParentId":"e276f858f1c54d33bea2a77853d6d072","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1564025102160,"functionDescribe":"","includeStr":null,"id":"273f1074c68a41bba40e1addc1b166e9","comId":null,"functionType":"2","status":"1"}],"updateTime":null,"sort":null,"functionUrl":"/pages/workerGroup/main","functionParentId":"0","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1564024961979,"functionDescribe":"","includeStr":null,"id":"e276f858f1c54d33bea2a77853d6d072","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"项目管理","childList":[{"parent":null,"include":null,"functionName":"编辑项目","childList":null,"updateTime":null,"sort":null,"functionUrl":"EDIT_PROJECT","functionParentId":"f1af560d17d74431baa3b73599d939f8","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1539760993077,"functionDescribe":"","includeStr":null,"id":"19e02c4b847741b2b6d9410f0871b9fd","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"材料管理","childList":null,"updateTime":null,"sort":null,"functionUrl":"MATERIAL_MANAGER","functionParentId":"f1af560d17d74431baa3b73599d939f8","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563873369302,"functionDescribe":"","includeStr":null,"id":"585e6ce287774c78b2af0929ae99806b","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"考勤统计","childList":null,"updateTime":null,"sort":null,"functionUrl":"ATTENDANCE_STATISTICS","functionParentId":"f1af560d17d74431baa3b73599d939f8","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563963298625,"functionDescribe":"","includeStr":null,"id":"5dfeb119d50e488bba269f0142324a4e","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"编辑/查看项目资金信息","childList":null,"updateTime":null,"sort":null,"functionUrl":"PROJECT_MONEY_OPTION","functionParentId":"f1af560d17d74431baa3b73599d939f8","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1564478518938,"functionDescribe":"","includeStr":null,"id":"9f7b8e9b18d64ba09ba4d57fca3b87a4","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"班组管理","childList":null,"updateTime":null,"sort":null,"functionUrl":"PROJECT_WORKER_GROUP_MANAGER","functionParentId":"f1af560d17d74431baa3b73599d939f8","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1564024682762,"functionDescribe":"","includeStr":null,"id":"e7191222bcbc42efb6aabf555c980b9b","comId":null,"functionType":"2","status":"1"}],"updateTime":null,"sort":null,"functionUrl":"/pages/project/main","functionParentId":"0","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1539761036279,"functionDescribe":"","includeStr":null,"id":"f1af560d17d74431baa3b73599d939f8","comId":null,"functionType":"2","status":"1"}],"company":{"area":null,"VName":null,"address":"大坪时代天街","buildTime":null,"wxAppId":null,"updateTime":null,"handOverTime":null,"vid":null,"createBy":null,"phone":"","updateBy":null,"createTime":1540008879343,"propertyType":null,"communityImg":null,"logo":"/root/pic/CgProgramBackGroundImg/companyLogo/dbff00ecd7a4425a9bb55315e8798950.png","location":null,"communityName":"重庆创高装饰工程股份有限公司","id":"586238e5f33b4788b0d4663b18de33d4","propertyId":null,"developerName":null,"status":"1"},"employee":{"birthday":"","deptPosition":null,"idCard":"","openId":null,"sex":"1","deptId":"3de5a2ce4f4941ee86f255c7a1310ca7","updateTime":null,"dept":{"deptName":"总经办","createBy":null,"positionList":null,"updateBy":null,"createTime":1540008934769,"updateTime":null,"id":"3de5a2ce4f4941ee86f255c7a1310ca7","comId":"586238e5f33b4788b0d4663b18de33d4","employeeCount":null,"status":"1"},"userName":"欧亮","createBy":null,"phoneNumber":"18696602662","employeeType":"1","imgTwo":null,"updateBy":null,"createTime":1548812797650,"deptPositionId":"76501860ae474ba6bca91543cc96abe6","id":"c9485e4ce3f74291b54a286f42d3ca08","comId":"586238e5f33b4788b0d4663b18de33d4","appUserId":"c4c3755681a14ce8ac6b9343ab5c2790","headPortrait":"","imgOne":"","status":"1"}}],"user":{"birthday":null,"idCard":null,"openId":null,"nickName":null,"sex":null,"updateTime":null,"userName":null,"token":"439657a5f21946488c8dac8c244fa5df","createBy":null,"phoneNumber":"18696602662","updateBy":null,"createTime":1548812797633,"miniProgramOpenId":null,"id":"c4c3755681a14ce8ac6b9343ab5c2790","pwd":null,"headPortrait":null,"status":"1"}}
     * status : 0
     */

    var msg: String? = null
    var data: DataBean? = null
    var status: String? = null

    class DataBean : Serializable {
        /**
         * list : [{"functionList":[{"parent":null,"include":null,"functionName":"劳工库","childList":[{"parent":null,"include":null,"functionName":"劳工移出","childList":null,"updateTime":null,"sort":null,"functionUrl":"PROJECT_WORKER_REMOVE","functionParentId":"04c199a3747d4bca9e6bef7254a374ad","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563960440503,"functionDescribe":"","includeStr":null,"id":"24854c31e3c74a39b65593a37fbc3283","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"劳工审核","childList":null,"updateTime":null,"sort":null,"functionUrl":"PROJECT_WORKER_CHECK","functionParentId":"04c199a3747d4bca9e6bef7254a374ad","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563963509885,"functionDescribe":"","includeStr":null,"id":"55eb1296d09d457a9ba1314ad9ad843f","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"工匠评价(新增)","childList":null,"updateTime":null,"sort":null,"functionUrl":"WORKER_EVALUATE_ADD","functionParentId":"04c199a3747d4bca9e6bef7254a374ad","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563952639027,"functionDescribe":"","includeStr":null,"id":"808751f727f446bf90c892731af960f6","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"劳工编辑","childList":null,"updateTime":null,"sort":null,"functionUrl":"PROJECT_WORKER_EDIT","functionParentId":"04c199a3747d4bca9e6bef7254a374ad","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563960402691,"functionDescribe":"","includeStr":null,"id":"d06c20a988424ad39c2ade0851e86c7f","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"劳工库列表查看","childList":null,"updateTime":null,"sort":null,"functionUrl":"PROJECT_WORKER_MANAGER","functionParentId":"04c199a3747d4bca9e6bef7254a374ad","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1546595194834,"functionDescribe":"","includeStr":null,"id":"dbb5b9cfad904c038e94dd5009cd9928","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"添加劳工","childList":null,"updateTime":null,"sort":null,"functionUrl":"PROJECT_WORKER_ADD","functionParentId":"04c199a3747d4bca9e6bef7254a374ad","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563960380316,"functionDescribe":"","includeStr":null,"id":"e3dd044a7a0d4f569660749604a7ca8e","comId":null,"functionType":"2","status":"1"}],"updateTime":null,"sort":null,"functionUrl":"/pages/projectWorker/main","functionParentId":"0","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563952598043,"functionDescribe":"","includeStr":null,"id":"04c199a3747d4bca9e6bef7254a374ad","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"首页","childList":[{"parent":null,"include":null,"functionName":"实测实量","childList":null,"updateTime":null,"sort":null,"functionUrl":"SPOT_CHECK_REPORT_ENTRY","functionParentId":"8661b2fa73944012a85994bb9cf1551d","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1562916262878,"functionDescribe":"","includeStr":null,"id":"532a3d95f8bb412099516aa34a7f949a","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"巡检表","childList":null,"updateTime":null,"sort":null,"functionUrl":"INSPECTION_REPORT_ENTRY","functionParentId":"8661b2fa73944012a85994bb9cf1551d","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1562924273752,"functionDescribe":"","includeStr":null,"id":"e9760e9fcf3e470c9869aada3f871e01","comId":null,"functionType":"2","status":"1"}],"updateTime":null,"sort":null,"functionUrl":"/pages/home/main","functionParentId":"0","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1562916047242,"functionDescribe":"","includeStr":null,"id":"8661b2fa73944012a85994bb9cf1551d","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"工具","childList":[{"parent":null,"include":null,"functionName":"查看资金计划","childList":null,"updateTime":null,"sort":null,"functionUrl":"FUNDING_PLAN","functionParentId":"ae6a6c637db7425fba4e0068740ba416","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563328474441,"functionDescribe":"","includeStr":null,"id":"17db05714a2b4550b018760dc0ef6dc4","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"实测实量表","childList":null,"updateTime":null,"sort":null,"functionUrl":"SPOTCHECK_ENTRY","functionParentId":"ae6a6c637db7425fba4e0068740ba416","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563328433004,"functionDescribe":"","includeStr":null,"id":"2858266470e14c68ab1e924affeeff86","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"资金收入/支出计划","childList":null,"updateTime":null,"sort":null,"functionUrl":"FUNDING_PLAN_ADD","functionParentId":"ae6a6c637db7425fba4e0068740ba416","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1564022063327,"functionDescribe":"","includeStr":null,"id":"2cf2e30aed7443cca7c698284d767c4e","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"巡检表","childList":null,"updateTime":null,"sort":null,"functionUrl":"INSPECTION_ENTRY","functionParentId":"ae6a6c637db7425fba4e0068740ba416","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563328372962,"functionDescribe":"","includeStr":null,"id":"32a50c0ce0a34d1792e63251c82b79f4","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"材料管理","childList":null,"updateTime":null,"sort":null,"functionUrl":"MATERIAL_REPORT","functionParentId":"ae6a6c637db7425fba4e0068740ba416","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563873138070,"functionDescribe":"","includeStr":null,"id":"80f641f7664542e2bc90c6f484280f8e","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"用工计划","childList":null,"updateTime":null,"sort":null,"functionUrl":"EMPLOYEMENT_PLAN","functionParentId":"ae6a6c637db7425fba4e0068740ba416","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563328516597,"functionDescribe":"","includeStr":null,"id":"90718034ae8a470b81bac02e2337ab59","comId":null,"functionType":"2","status":"1"}],"updateTime":null,"sort":null,"functionUrl":"/pages/tools/main","functionParentId":"0","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563328325869,"functionDescribe":"","includeStr":null,"id":"ae6a6c637db7425fba4e0068740ba416","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"作战台","childList":[{"parent":null,"include":null,"functionName":"7日数据分析","childList":null,"updateTime":null,"sort":null,"functionUrl":"DAY7_ANALYSIS","functionParentId":"d30094db1fa3433798047c8772041e72","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563965416924,"functionDescribe":"","includeStr":null,"id":"713b42db844a42e294b79e9ab930cb65","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"工种分布","childList":null,"updateTime":null,"sort":null,"functionUrl":"WORK_DISTRIBUTION","functionParentId":"d30094db1fa3433798047c8772041e72","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563965494565,"functionDescribe":"","includeStr":null,"id":"89e3eff69e3749cebfc9f071f4845fed","comId":null,"functionType":"2","status":"1"}],"updateTime":null,"sort":null,"functionUrl":"/pages/station/main","functionParentId":"0","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563965359893,"functionDescribe":"","includeStr":null,"id":"d30094db1fa3433798047c8772041e72","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"班组管理","childList":[{"parent":null,"include":null,"functionName":"添加/编辑班组","childList":null,"updateTime":null,"sort":null,"functionUrl":"WOEKER_GROUP_ADD","functionParentId":"e276f858f1c54d33bea2a77853d6d072","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1564025102160,"functionDescribe":"","includeStr":null,"id":"273f1074c68a41bba40e1addc1b166e9","comId":null,"functionType":"2","status":"1"}],"updateTime":null,"sort":null,"functionUrl":"/pages/workerGroup/main","functionParentId":"0","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1564024961979,"functionDescribe":"","includeStr":null,"id":"e276f858f1c54d33bea2a77853d6d072","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"项目管理","childList":[{"parent":null,"include":null,"functionName":"编辑项目","childList":null,"updateTime":null,"sort":null,"functionUrl":"EDIT_PROJECT","functionParentId":"f1af560d17d74431baa3b73599d939f8","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1539760993077,"functionDescribe":"","includeStr":null,"id":"19e02c4b847741b2b6d9410f0871b9fd","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"材料管理","childList":null,"updateTime":null,"sort":null,"functionUrl":"MATERIAL_MANAGER","functionParentId":"f1af560d17d74431baa3b73599d939f8","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563873369302,"functionDescribe":"","includeStr":null,"id":"585e6ce287774c78b2af0929ae99806b","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"考勤统计","childList":null,"updateTime":null,"sort":null,"functionUrl":"ATTENDANCE_STATISTICS","functionParentId":"f1af560d17d74431baa3b73599d939f8","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563963298625,"functionDescribe":"","includeStr":null,"id":"5dfeb119d50e488bba269f0142324a4e","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"编辑/查看项目资金信息","childList":null,"updateTime":null,"sort":null,"functionUrl":"PROJECT_MONEY_OPTION","functionParentId":"f1af560d17d74431baa3b73599d939f8","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1564478518938,"functionDescribe":"","includeStr":null,"id":"9f7b8e9b18d64ba09ba4d57fca3b87a4","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"班组管理","childList":null,"updateTime":null,"sort":null,"functionUrl":"PROJECT_WORKER_GROUP_MANAGER","functionParentId":"f1af560d17d74431baa3b73599d939f8","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1564024682762,"functionDescribe":"","includeStr":null,"id":"e7191222bcbc42efb6aabf555c980b9b","comId":null,"functionType":"2","status":"1"}],"updateTime":null,"sort":null,"functionUrl":"/pages/project/main","functionParentId":"0","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1539761036279,"functionDescribe":"","includeStr":null,"id":"f1af560d17d74431baa3b73599d939f8","comId":null,"functionType":"2","status":"1"}],"company":{"area":null,"VName":null,"address":"大坪时代天街","buildTime":null,"wxAppId":null,"updateTime":null,"handOverTime":null,"vid":null,"createBy":null,"phone":"","updateBy":null,"createTime":1540008879343,"propertyType":null,"communityImg":null,"logo":"/root/pic/CgProgramBackGroundImg/companyLogo/dbff00ecd7a4425a9bb55315e8798950.png","location":null,"communityName":"重庆创高装饰工程股份有限公司","id":"586238e5f33b4788b0d4663b18de33d4","propertyId":null,"developerName":null,"status":"1"},"employee":{"birthday":"","deptPosition":null,"idCard":"","openId":null,"sex":"1","deptId":"3de5a2ce4f4941ee86f255c7a1310ca7","updateTime":null,"dept":{"deptName":"总经办","createBy":null,"positionList":null,"updateBy":null,"createTime":1540008934769,"updateTime":null,"id":"3de5a2ce4f4941ee86f255c7a1310ca7","comId":"586238e5f33b4788b0d4663b18de33d4","employeeCount":null,"status":"1"},"userName":"欧亮","createBy":null,"phoneNumber":"18696602662","employeeType":"1","imgTwo":null,"updateBy":null,"createTime":1548812797650,"deptPositionId":"76501860ae474ba6bca91543cc96abe6","id":"c9485e4ce3f74291b54a286f42d3ca08","comId":"586238e5f33b4788b0d4663b18de33d4","appUserId":"c4c3755681a14ce8ac6b9343ab5c2790","headPortrait":"","imgOne":"","status":"1"}}]
         * user : {"birthday":null,"idCard":null,"openId":null,"nickName":null,"sex":null,"updateTime":null,"userName":null,"token":"439657a5f21946488c8dac8c244fa5df","createBy":null,"phoneNumber":"18696602662","updateBy":null,"createTime":1548812797633,"miniProgramOpenId":null,"id":"c4c3755681a14ce8ac6b9343ab5c2790","pwd":null,"headPortrait":null,"status":"1"}
         */

        var user: UserBean? = null
        var list: List<ListBean>? = null

        class UserBean : Serializable {
            /**
             * birthday : null
             * idCard : null
             * openId : null
             * nickName : null
             * sex : null
             * updateTime : null
             * userName : null
             * token : 439657a5f21946488c8dac8c244fa5df
             * createBy : null
             * phoneNumber : 18696602662
             * updateBy : null
             * createTime : 1548812797633
             * miniProgramOpenId : null
             * id : c4c3755681a14ce8ac6b9343ab5c2790
             * pwd : null
             * headPortrait : null
             * status : 1
             */

            var birthday: Any? = null
            var idCard: Any? = null
            var openId: Any? = null
            var nickName: Any? = null
            var sex: Any? = null
            var updateTime: Any? = null
            var userName: Any? = null
            var token: String? = null
            var createBy: Any? = null
            var phoneNumber: String? = null
            var password:String?=null
            var updateBy: Any? = null
            var createTime: Long = 0
            var miniProgramOpenId: Any? = null
            var id: String? = null
            var pwd: Any? = null
            var headPortrait: Any? = null
            var status: String? = null
        }

        class ListBean : Serializable {
            /**
             * functionList : [{"parent":null,"include":null,"functionName":"劳工库","childList":[{"parent":null,"include":null,"functionName":"劳工移出","childList":null,"updateTime":null,"sort":null,"functionUrl":"PROJECT_WORKER_REMOVE","functionParentId":"04c199a3747d4bca9e6bef7254a374ad","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563960440503,"functionDescribe":"","includeStr":null,"id":"24854c31e3c74a39b65593a37fbc3283","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"劳工审核","childList":null,"updateTime":null,"sort":null,"functionUrl":"PROJECT_WORKER_CHECK","functionParentId":"04c199a3747d4bca9e6bef7254a374ad","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563963509885,"functionDescribe":"","includeStr":null,"id":"55eb1296d09d457a9ba1314ad9ad843f","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"工匠评价(新增)","childList":null,"updateTime":null,"sort":null,"functionUrl":"WORKER_EVALUATE_ADD","functionParentId":"04c199a3747d4bca9e6bef7254a374ad","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563952639027,"functionDescribe":"","includeStr":null,"id":"808751f727f446bf90c892731af960f6","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"劳工编辑","childList":null,"updateTime":null,"sort":null,"functionUrl":"PROJECT_WORKER_EDIT","functionParentId":"04c199a3747d4bca9e6bef7254a374ad","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563960402691,"functionDescribe":"","includeStr":null,"id":"d06c20a988424ad39c2ade0851e86c7f","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"劳工库列表查看","childList":null,"updateTime":null,"sort":null,"functionUrl":"PROJECT_WORKER_MANAGER","functionParentId":"04c199a3747d4bca9e6bef7254a374ad","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1546595194834,"functionDescribe":"","includeStr":null,"id":"dbb5b9cfad904c038e94dd5009cd9928","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"添加劳工","childList":null,"updateTime":null,"sort":null,"functionUrl":"PROJECT_WORKER_ADD","functionParentId":"04c199a3747d4bca9e6bef7254a374ad","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563960380316,"functionDescribe":"","includeStr":null,"id":"e3dd044a7a0d4f569660749604a7ca8e","comId":null,"functionType":"2","status":"1"}],"updateTime":null,"sort":null,"functionUrl":"/pages/projectWorker/main","functionParentId":"0","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563952598043,"functionDescribe":"","includeStr":null,"id":"04c199a3747d4bca9e6bef7254a374ad","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"首页","childList":[{"parent":null,"include":null,"functionName":"实测实量","childList":null,"updateTime":null,"sort":null,"functionUrl":"SPOT_CHECK_REPORT_ENTRY","functionParentId":"8661b2fa73944012a85994bb9cf1551d","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1562916262878,"functionDescribe":"","includeStr":null,"id":"532a3d95f8bb412099516aa34a7f949a","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"巡检表","childList":null,"updateTime":null,"sort":null,"functionUrl":"INSPECTION_REPORT_ENTRY","functionParentId":"8661b2fa73944012a85994bb9cf1551d","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1562924273752,"functionDescribe":"","includeStr":null,"id":"e9760e9fcf3e470c9869aada3f871e01","comId":null,"functionType":"2","status":"1"}],"updateTime":null,"sort":null,"functionUrl":"/pages/home/main","functionParentId":"0","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1562916047242,"functionDescribe":"","includeStr":null,"id":"8661b2fa73944012a85994bb9cf1551d","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"工具","childList":[{"parent":null,"include":null,"functionName":"查看资金计划","childList":null,"updateTime":null,"sort":null,"functionUrl":"FUNDING_PLAN","functionParentId":"ae6a6c637db7425fba4e0068740ba416","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563328474441,"functionDescribe":"","includeStr":null,"id":"17db05714a2b4550b018760dc0ef6dc4","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"实测实量表","childList":null,"updateTime":null,"sort":null,"functionUrl":"SPOTCHECK_ENTRY","functionParentId":"ae6a6c637db7425fba4e0068740ba416","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563328433004,"functionDescribe":"","includeStr":null,"id":"2858266470e14c68ab1e924affeeff86","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"资金收入/支出计划","childList":null,"updateTime":null,"sort":null,"functionUrl":"FUNDING_PLAN_ADD","functionParentId":"ae6a6c637db7425fba4e0068740ba416","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1564022063327,"functionDescribe":"","includeStr":null,"id":"2cf2e30aed7443cca7c698284d767c4e","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"巡检表","childList":null,"updateTime":null,"sort":null,"functionUrl":"INSPECTION_ENTRY","functionParentId":"ae6a6c637db7425fba4e0068740ba416","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563328372962,"functionDescribe":"","includeStr":null,"id":"32a50c0ce0a34d1792e63251c82b79f4","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"材料管理","childList":null,"updateTime":null,"sort":null,"functionUrl":"MATERIAL_REPORT","functionParentId":"ae6a6c637db7425fba4e0068740ba416","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563873138070,"functionDescribe":"","includeStr":null,"id":"80f641f7664542e2bc90c6f484280f8e","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"用工计划","childList":null,"updateTime":null,"sort":null,"functionUrl":"EMPLOYEMENT_PLAN","functionParentId":"ae6a6c637db7425fba4e0068740ba416","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563328516597,"functionDescribe":"","includeStr":null,"id":"90718034ae8a470b81bac02e2337ab59","comId":null,"functionType":"2","status":"1"}],"updateTime":null,"sort":null,"functionUrl":"/pages/tools/main","functionParentId":"0","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563328325869,"functionDescribe":"","includeStr":null,"id":"ae6a6c637db7425fba4e0068740ba416","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"作战台","childList":[{"parent":null,"include":null,"functionName":"7日数据分析","childList":null,"updateTime":null,"sort":null,"functionUrl":"DAY7_ANALYSIS","functionParentId":"d30094db1fa3433798047c8772041e72","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563965416924,"functionDescribe":"","includeStr":null,"id":"713b42db844a42e294b79e9ab930cb65","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"工种分布","childList":null,"updateTime":null,"sort":null,"functionUrl":"WORK_DISTRIBUTION","functionParentId":"d30094db1fa3433798047c8772041e72","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563965494565,"functionDescribe":"","includeStr":null,"id":"89e3eff69e3749cebfc9f071f4845fed","comId":null,"functionType":"2","status":"1"}],"updateTime":null,"sort":null,"functionUrl":"/pages/station/main","functionParentId":"0","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563965359893,"functionDescribe":"","includeStr":null,"id":"d30094db1fa3433798047c8772041e72","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"班组管理","childList":[{"parent":null,"include":null,"functionName":"添加/编辑班组","childList":null,"updateTime":null,"sort":null,"functionUrl":"WOEKER_GROUP_ADD","functionParentId":"e276f858f1c54d33bea2a77853d6d072","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1564025102160,"functionDescribe":"","includeStr":null,"id":"273f1074c68a41bba40e1addc1b166e9","comId":null,"functionType":"2","status":"1"}],"updateTime":null,"sort":null,"functionUrl":"/pages/workerGroup/main","functionParentId":"0","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1564024961979,"functionDescribe":"","includeStr":null,"id":"e276f858f1c54d33bea2a77853d6d072","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"项目管理","childList":[{"parent":null,"include":null,"functionName":"编辑项目","childList":null,"updateTime":null,"sort":null,"functionUrl":"EDIT_PROJECT","functionParentId":"f1af560d17d74431baa3b73599d939f8","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1539760993077,"functionDescribe":"","includeStr":null,"id":"19e02c4b847741b2b6d9410f0871b9fd","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"材料管理","childList":null,"updateTime":null,"sort":null,"functionUrl":"MATERIAL_MANAGER","functionParentId":"f1af560d17d74431baa3b73599d939f8","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563873369302,"functionDescribe":"","includeStr":null,"id":"585e6ce287774c78b2af0929ae99806b","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"考勤统计","childList":null,"updateTime":null,"sort":null,"functionUrl":"ATTENDANCE_STATISTICS","functionParentId":"f1af560d17d74431baa3b73599d939f8","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563963298625,"functionDescribe":"","includeStr":null,"id":"5dfeb119d50e488bba269f0142324a4e","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"编辑/查看项目资金信息","childList":null,"updateTime":null,"sort":null,"functionUrl":"PROJECT_MONEY_OPTION","functionParentId":"f1af560d17d74431baa3b73599d939f8","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1564478518938,"functionDescribe":"","includeStr":null,"id":"9f7b8e9b18d64ba09ba4d57fca3b87a4","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"班组管理","childList":null,"updateTime":null,"sort":null,"functionUrl":"PROJECT_WORKER_GROUP_MANAGER","functionParentId":"f1af560d17d74431baa3b73599d939f8","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1564024682762,"functionDescribe":"","includeStr":null,"id":"e7191222bcbc42efb6aabf555c980b9b","comId":null,"functionType":"2","status":"1"}],"updateTime":null,"sort":null,"functionUrl":"/pages/project/main","functionParentId":"0","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1539761036279,"functionDescribe":"","includeStr":null,"id":"f1af560d17d74431baa3b73599d939f8","comId":null,"functionType":"2","status":"1"}]
             * company : {"area":null,"VName":null,"address":"大坪时代天街","buildTime":null,"wxAppId":null,"updateTime":null,"handOverTime":null,"vid":null,"createBy":null,"phone":"","updateBy":null,"createTime":1540008879343,"propertyType":null,"communityImg":null,"logo":"/root/pic/CgProgramBackGroundImg/companyLogo/dbff00ecd7a4425a9bb55315e8798950.png","location":null,"communityName":"重庆创高装饰工程股份有限公司","id":"586238e5f33b4788b0d4663b18de33d4","propertyId":null,"developerName":null,"status":"1"}
             * employee : {"birthday":"","deptPosition":null,"idCard":"","openId":null,"sex":"1","deptId":"3de5a2ce4f4941ee86f255c7a1310ca7","updateTime":null,"dept":{"deptName":"总经办","createBy":null,"positionList":null,"updateBy":null,"createTime":1540008934769,"updateTime":null,"id":"3de5a2ce4f4941ee86f255c7a1310ca7","comId":"586238e5f33b4788b0d4663b18de33d4","employeeCount":null,"status":"1"},"userName":"欧亮","createBy":null,"phoneNumber":"18696602662","employeeType":"1","imgTwo":null,"updateBy":null,"createTime":1548812797650,"deptPositionId":"76501860ae474ba6bca91543cc96abe6","id":"c9485e4ce3f74291b54a286f42d3ca08","comId":"586238e5f33b4788b0d4663b18de33d4","appUserId":"c4c3755681a14ce8ac6b9343ab5c2790","headPortrait":"","imgOne":"","status":"1"}
             */

            var company: CompanyBean? = null
            var employee: EmployeeBean? = null
            var functionList: List<FunctionListBean>? = null

            class CompanyBean : Serializable {
                /**
                 * area : null
                 * VName : null
                 * address : 大坪时代天街
                 * buildTime : null
                 * wxAppId : null
                 * updateTime : null
                 * handOverTime : null
                 * vid : null
                 * createBy : null
                 * phone :
                 * updateBy : null
                 * createTime : 1540008879343
                 * propertyType : null
                 * communityImg : null
                 * logo : /root/pic/CgProgramBackGroundImg/companyLogo/dbff00ecd7a4425a9bb55315e8798950.png
                 * location : null
                 * communityName : 重庆创高装饰工程股份有限公司
                 * id : 586238e5f33b4788b0d4663b18de33d4
                 * propertyId : null
                 * developerName : null
                 * status : 1
                 */

                var area: Any? = null
                var vName: Any? = null
                var address: String? = null
                var buildTime: Any? = null
                var wxAppId: Any? = null
                var updateTime: Any? = null
                var handOverTime: Any? = null
                var vid: Any? = null
                var createBy: Any? = null
                var phone: String? = null
                var updateBy: Any? = null
                var createTime: Long = 0
                var propertyType: Any? = null
                var communityImg: Any? = null
                var logo: String? = null
                var location: Any? = null
                var communityName: String? = null
                var id: String? = null
                var propertyId: Any? = null
                var developerName: Any? = null
                var status: String? = null
            }

            class EmployeeBean : Serializable {
                /**
                 * birthday :
                 * deptPosition : null
                 * idCard :
                 * openId : null
                 * sex : 1
                 * deptId : 3de5a2ce4f4941ee86f255c7a1310ca7
                 * updateTime : null
                 * dept : {"deptName":"总经办","createBy":null,"positionList":null,"updateBy":null,"createTime":1540008934769,"updateTime":null,"id":"3de5a2ce4f4941ee86f255c7a1310ca7","comId":"586238e5f33b4788b0d4663b18de33d4","employeeCount":null,"status":"1"}
                 * userName : 欧亮
                 * createBy : null
                 * phoneNumber : 18696602662
                 * employeeType : 1
                 * imgTwo : null
                 * updateBy : null
                 * createTime : 1548812797650
                 * deptPositionId : 76501860ae474ba6bca91543cc96abe6
                 * id : c9485e4ce3f74291b54a286f42d3ca08
                 * comId : 586238e5f33b4788b0d4663b18de33d4
                 * appUserId : c4c3755681a14ce8ac6b9343ab5c2790
                 * headPortrait :
                 * imgOne :
                 * status : 1
                 */

                var birthday: String? = null
                var deptPosition: Any? = null
                var idCard: String? = null
                var openId: Any? = null
                var sex: String? = null
                var deptId: String? = null
                var updateTime: Any? = null
                var dept: DeptBean? = null
                var userName: String? = null
                var createBy: Any? = null
                var phoneNumber: String? = null
                var employeeType: String? = null
                var imgTwo: Any? = null
                var updateBy: Any? = null
                var createTime: Long = 0
                var deptPositionId: String? = null
                var id: String? = null
                var comId: String? = null
                var appUserId: String? = null
                var headPortrait: String? = null
                var imgOne: String? = null
                var status: String? = null

                class DeptBean : Serializable {
                    /**
                     * deptName : 总经办
                     * createBy : null
                     * positionList : null
                     * updateBy : null
                     * createTime : 1540008934769
                     * updateTime : null
                     * id : 3de5a2ce4f4941ee86f255c7a1310ca7
                     * comId : 586238e5f33b4788b0d4663b18de33d4
                     * employeeCount : null
                     * status : 1
                     */

                    var deptName: String? = null
                    var createBy: Any? = null
                    var positionList: Any? = null
                    var updateBy: Any? = null
                    var createTime: Long = 0
                    var updateTime: Any? = null
                    var id: String? = null
                    var comId: String? = null
                    var employeeCount: Any? = null
                    var status: String? = null
                }
            }

            class FunctionListBean : Serializable {
                /**
                 * parent : null
                 * include : null
                 * functionName : 劳工库
                 * childList : [{"parent":null,"include":null,"functionName":"劳工移出","childList":null,"updateTime":null,"sort":null,"functionUrl":"PROJECT_WORKER_REMOVE","functionParentId":"04c199a3747d4bca9e6bef7254a374ad","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563960440503,"functionDescribe":"","includeStr":null,"id":"24854c31e3c74a39b65593a37fbc3283","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"劳工审核","childList":null,"updateTime":null,"sort":null,"functionUrl":"PROJECT_WORKER_CHECK","functionParentId":"04c199a3747d4bca9e6bef7254a374ad","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563963509885,"functionDescribe":"","includeStr":null,"id":"55eb1296d09d457a9ba1314ad9ad843f","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"工匠评价(新增)","childList":null,"updateTime":null,"sort":null,"functionUrl":"WORKER_EVALUATE_ADD","functionParentId":"04c199a3747d4bca9e6bef7254a374ad","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563952639027,"functionDescribe":"","includeStr":null,"id":"808751f727f446bf90c892731af960f6","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"劳工编辑","childList":null,"updateTime":null,"sort":null,"functionUrl":"PROJECT_WORKER_EDIT","functionParentId":"04c199a3747d4bca9e6bef7254a374ad","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563960402691,"functionDescribe":"","includeStr":null,"id":"d06c20a988424ad39c2ade0851e86c7f","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"劳工库列表查看","childList":null,"updateTime":null,"sort":null,"functionUrl":"PROJECT_WORKER_MANAGER","functionParentId":"04c199a3747d4bca9e6bef7254a374ad","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1546595194834,"functionDescribe":"","includeStr":null,"id":"dbb5b9cfad904c038e94dd5009cd9928","comId":null,"functionType":"2","status":"1"},{"parent":null,"include":null,"functionName":"添加劳工","childList":null,"updateTime":null,"sort":null,"functionUrl":"PROJECT_WORKER_ADD","functionParentId":"04c199a3747d4bca9e6bef7254a374ad","createBy":null,"functionIcon":null,"updateBy":null,"createTime":1563960380316,"functionDescribe":"","includeStr":null,"id":"e3dd044a7a0d4f569660749604a7ca8e","comId":null,"functionType":"2","status":"1"}]
                 * updateTime : null
                 * sort : null
                 * functionUrl : /pages/projectWorker/main
                 * functionParentId : 0
                 * createBy : null
                 * functionIcon : null
                 * updateBy : null
                 * createTime : 1563952598043
                 * functionDescribe :
                 * includeStr : null
                 * id : 04c199a3747d4bca9e6bef7254a374ad
                 * comId : null
                 * functionType : 2
                 * status : 1
                 */

                var parent: Any? = null
                var include: Any? = null
                var functionName: String? = null
                var updateTime: Any? = null
                var sort: Any? = null
                var functionUrl: String? = null
                var functionParentId: String? = null
                var createBy: Any? = null
                var functionIcon: Any? = null
                var updateBy: Any? = null
                var createTime: Long = 0
                var functionDescribe: String? = null
                var includeStr: Any? = null
                var id: String? = null
                var comId: Any? = null
                var functionType: String? = null
                var status: String? = null
                var childList: List<ChildListBean>? = null

                class ChildListBean : Serializable {
                    /**
                     * parent : null
                     * include : null
                     * functionName : 劳工移出
                     * childList : null
                     * updateTime : null
                     * sort : null
                     * functionUrl : PROJECT_WORKER_REMOVE
                     * functionParentId : 04c199a3747d4bca9e6bef7254a374ad
                     * createBy : null
                     * functionIcon : null
                     * updateBy : null
                     * createTime : 1563960440503
                     * functionDescribe :
                     * includeStr : null
                     * id : 24854c31e3c74a39b65593a37fbc3283
                     * comId : null
                     * functionType : 2
                     * status : 1
                     */

                    var parent: Any? = null
                    var include: Any? = null
                    var functionName: String? = null
                    var childList: Any? = null
                    var updateTime: Any? = null
                    var sort: Any? = null
                    var functionUrl: String? = null
                    var functionParentId: String? = null
                    var createBy: Any? = null
                    var functionIcon: Any? = null
                    var updateBy: Any? = null
                    var createTime: Long = 0
                    var functionDescribe: String? = null
                    var includeStr: Any? = null
                    var id: String? = null
                    var comId: Any? = null
                    var functionType: String? = null
                    var status: String? = null
                }
            }
        }
    }
}
