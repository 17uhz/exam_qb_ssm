package com.tledu.cn.pojo;

public class Examinee {
    private String eId;
    private String eAcc;
    private String eName;
    private int eScore;
    private String loginTime;
    private String beginTime;
    private String endTime;
    private int status;
    private String tId;
    private String tTime;
    private int isDelete;

    public Examinee(String eId, String eAcc, String eName, int eScore, String loginTime, String beginTime, String endTime, int status, String tId, String tTime, int isDelete) {
        this.eId = eId;
        this.eAcc = eAcc;
        this.eName = eName;
        this.eScore = eScore;
        this.loginTime = loginTime;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.status = status;
        this.tId = tId;
        this.tTime = tTime;
        this.isDelete = isDelete;
    }

    public Examinee() {
    }

    public String geteId() {
        return eId;
    }

    public void seteId(String eId) {
        this.eId = eId;
    }

    public String geteAcc() {
        return eAcc;
    }

    public void seteAcc(String eAcc) {
        this.eAcc = eAcc;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public int geteScore() {
        return eScore;
    }

    public void seteScore(int eScore) {
        this.eScore = eScore;
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public String gettTime() {
        return tTime;
    }

    public void settTime(String tTime) {
        this.tTime = tTime;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "Examinee{" +
                "eId='" + eId + '\'' +
                ", eAcc='" + eAcc + '\'' +
                ", eName='" + eName + '\'' +
                ", eScore='" + eScore + '\'' +
                ", loginTime='" + loginTime + '\'' +
                ", beginTime='" + beginTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", status=" + status +
                ", tId='" + tId + '\'' +
                ", tTime='" + tTime + '\'' +
                ", isDelete=" + isDelete +
                '}';
    }
}
