package com.tledu.cn.pojo;

public class Classify {
    private String cId;
    private String cName;
    private String uId;
    private String createTime;
    private int isDelete;

    public Classify(String cId, String cName, String uId, String createTime, int isDelete) {
        this.cId = cId;
        this.cName = cName;
        this.uId = uId;
        this.createTime = createTime;
        this.isDelete = isDelete;
    }

    public Classify() {
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreatTime(String createTime) {
        this.createTime = createTime;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "Classify{" +
                "cId='" + cId + '\'' +
                ", cName='" + cName + '\'' +
                ", uId='" + uId + '\'' +
                ", creatTime='" + createTime + '\'' +
                ", isDelete=" + isDelete +
                '}';
    }
}
