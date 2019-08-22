package com.hjl.artisan.tool.bean.ActualMeasurement;

import java.io.Serializable;

public class CheckPointTreeBean implements Serializable {
    /**
     * 节点Id
     */
    private int id;
    /**
     * 节点父id
     */
    private int pId;
    /**
     * 节点name
     */
    private String name;

    private Object data;
    private Float qualifiendProbability;


    public CheckPointTreeBean(int id, int pId, String name) {
        super();
        this.id = id;
        this.pId = pId;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getPid() {
        return pId;
    }
    public void setPid(int pId) {
        this.pId = pId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Float getQualifiendProbability() {
        return qualifiendProbability;
    }

    public void setQualifiendProbability(Float qualifiendProbability) {
        this.qualifiendProbability = qualifiendProbability;
    }
}
