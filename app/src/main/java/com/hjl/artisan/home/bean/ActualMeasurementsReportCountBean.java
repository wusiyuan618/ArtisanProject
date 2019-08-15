package com.hjl.artisan.home.bean;

import com.hjl.artisan.app.HJLBean;

public class ActualMeasurementsReportCountBean extends HJLBean {

    /**
     * status : 0
     * msg : 成功
     * data : {"warningCounts":0,"normalCounts":0,"seriousWarningCounts":0}
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
         * warningCounts : 0
         * normalCounts : 0
         * seriousWarningCounts : 0
         */

        private int warningCounts;
        private int normalCounts;
        private int seriousWarningCounts;

        public int getWarningCounts() {
            return warningCounts;
        }

        public void setWarningCounts(int warningCounts) {
            this.warningCounts = warningCounts;
        }

        public int getNormalCounts() {
            return normalCounts;
        }

        public void setNormalCounts(int normalCounts) {
            this.normalCounts = normalCounts;
        }

        public int getSeriousWarningCounts() {
            return seriousWarningCounts;
        }

        public void setSeriousWarningCounts(int seriousWarningCounts) {
            this.seriousWarningCounts = seriousWarningCounts;
        }
    }
}
