package com.hjl.artisan.home.bean;

import com.hjl.artisan.app.HJLBean;

import java.util.List;

public class ProgramAttendanceSummaryBean extends HJLBean {

    /**
     * status : 0
     * msg : 成功
     * data : {"todayPlanLabourerCount":33,"labourerRegistCount":1159,"todayAddLabourerCount":0,"gangerRegistCount":129,"todayJoinlabourer":0,"weekSign":[{"addLabourerCount":0,"signCount":0,"name":"星期四","planLabourerCount":33,"joinlabourer":0},{"addLabourerCount":0,"signCount":0,"name":"星期五","planLabourerCount":33,"joinlabourer":0},{"addLabourerCount":0,"signCount":0,"name":"星期六","planLabourerCount":33,"joinlabourer":0},{"addLabourerCount":0,"signCount":0,"name":"星期日","planLabourerCount":33,"joinlabourer":0},{"addLabourerCount":0,"signCount":0,"name":"星期一","planLabourerCount":33,"joinlabourer":0},{"addLabourerCount":0,"signCount":0,"name":"星期二","planLabourerCount":33,"joinlabourer":0},{"addLabourerCount":0,"signCount":0,"name":"星期三","planLabourerCount":33,"joinlabourer":0}],"todaySign":0,"todaySignProgram":0,"todayOnlineLabourerCount":0,"programRegistCount":54,"todaySignGanger":0,"time":"2019-08-14","todayAllProgram":23}
     */

    private String status;
    private String msg;
    private DataBean data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * todayPlanLabourerCount : 33
         * labourerRegistCount : 1159
         * todayAddLabourerCount : 0
         * gangerRegistCount : 129
         * todayJoinlabourer : 0
         * weekSign : [{"addLabourerCount":0,"signCount":0,"name":"星期四","planLabourerCount":33,"joinlabourer":0},{"addLabourerCount":0,"signCount":0,"name":"星期五","planLabourerCount":33,"joinlabourer":0},{"addLabourerCount":0,"signCount":0,"name":"星期六","planLabourerCount":33,"joinlabourer":0},{"addLabourerCount":0,"signCount":0,"name":"星期日","planLabourerCount":33,"joinlabourer":0},{"addLabourerCount":0,"signCount":0,"name":"星期一","planLabourerCount":33,"joinlabourer":0},{"addLabourerCount":0,"signCount":0,"name":"星期二","planLabourerCount":33,"joinlabourer":0},{"addLabourerCount":0,"signCount":0,"name":"星期三","planLabourerCount":33,"joinlabourer":0}]
         * todaySign : 0
         * todaySignProgram : 0
         * todayOnlineLabourerCount : 0
         * programRegistCount : 54
         * todaySignGanger : 0
         * time : 2019-08-14
         * todayAllProgram : 23
         */

        private int todayPlanLabourerCount;
        private int labourerRegistCount;
        private int todayAddLabourerCount;
        private int gangerRegistCount;
        private int todayJoinlabourer;
        private int todaySign;
        private int todaySignProgram;
        private int todayOnlineLabourerCount;
        private int programRegistCount;
        private int todaySignGanger;
        private String time;
        private int todayAllProgram;
        private List<WeekSignBean> weekSign;

        public int getTodayPlanLabourerCount() {
            return todayPlanLabourerCount;
        }

        public void setTodayPlanLabourerCount(int todayPlanLabourerCount) {
            this.todayPlanLabourerCount = todayPlanLabourerCount;
        }

        public int getLabourerRegistCount() {
            return labourerRegistCount;
        }

        public void setLabourerRegistCount(int labourerRegistCount) {
            this.labourerRegistCount = labourerRegistCount;
        }

        public int getTodayAddLabourerCount() {
            return todayAddLabourerCount;
        }

        public void setTodayAddLabourerCount(int todayAddLabourerCount) {
            this.todayAddLabourerCount = todayAddLabourerCount;
        }

        public int getGangerRegistCount() {
            return gangerRegistCount;
        }

        public void setGangerRegistCount(int gangerRegistCount) {
            this.gangerRegistCount = gangerRegistCount;
        }

        public int getTodayJoinlabourer() {
            return todayJoinlabourer;
        }

        public void setTodayJoinlabourer(int todayJoinlabourer) {
            this.todayJoinlabourer = todayJoinlabourer;
        }

        public int getTodaySign() {
            return todaySign;
        }

        public void setTodaySign(int todaySign) {
            this.todaySign = todaySign;
        }

        public int getTodaySignProgram() {
            return todaySignProgram;
        }

        public void setTodaySignProgram(int todaySignProgram) {
            this.todaySignProgram = todaySignProgram;
        }

        public int getTodayOnlineLabourerCount() {
            return todayOnlineLabourerCount;
        }

        public void setTodayOnlineLabourerCount(int todayOnlineLabourerCount) {
            this.todayOnlineLabourerCount = todayOnlineLabourerCount;
        }

        public int getProgramRegistCount() {
            return programRegistCount;
        }

        public void setProgramRegistCount(int programRegistCount) {
            this.programRegistCount = programRegistCount;
        }

        public int getTodaySignGanger() {
            return todaySignGanger;
        }

        public void setTodaySignGanger(int todaySignGanger) {
            this.todaySignGanger = todaySignGanger;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public int getTodayAllProgram() {
            return todayAllProgram;
        }

        public void setTodayAllProgram(int todayAllProgram) {
            this.todayAllProgram = todayAllProgram;
        }

        public List<WeekSignBean> getWeekSign() {
            return weekSign;
        }

        public void setWeekSign(List<WeekSignBean> weekSign) {
            this.weekSign = weekSign;
        }

        public static class WeekSignBean {
            /**
             * addLabourerCount : 0
             * signCount : 0
             * name : 星期四
             * planLabourerCount : 33
             * joinlabourer : 0
             */

            private int addLabourerCount;
            private int signCount;
            private String name;
            private int planLabourerCount;
            private int joinlabourer;

            public int getAddLabourerCount() {
                return addLabourerCount;
            }

            public void setAddLabourerCount(int addLabourerCount) {
                this.addLabourerCount = addLabourerCount;
            }

            public int getSignCount() {
                return signCount;
            }

            public void setSignCount(int signCount) {
                this.signCount = signCount;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getPlanLabourerCount() {
                return planLabourerCount;
            }

            public void setPlanLabourerCount(int planLabourerCount) {
                this.planLabourerCount = planLabourerCount;
            }

            public int getJoinlabourer() {
                return joinlabourer;
            }

            public void setJoinlabourer(int joinlabourer) {
                this.joinlabourer = joinlabourer;
            }
        }
    }
}
