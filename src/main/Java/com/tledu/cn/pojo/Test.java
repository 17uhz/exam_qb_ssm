package com.tledu.cn.pojo;

/**
 * Author:17
 * Date:2021-01-23 14:29
 * Description:<描述>
 */
public class Test {
    private String tId;
    private String tType;
    private String title;
    private int status;
    private String uId;
    private String tUrl;
    private String tTime;
    private String tBeginTime;
    private String tEndTime;
    private String tCreateTime;
    private int isDelete;

    public Test() {
    }

    public Test(String tId, String tType, String title, int status, String uId, String tUrl, String tTime, String tBeginTime, String tEndTime, String tCreateTime, int isDelete) {
        this.tId = tId;
        this.tType = tType;
        this.title = title;
        this.status = status;
        this.uId = uId;
        this.tUrl = tUrl;
        this.tTime = tTime;
        this.tBeginTime = tBeginTime;
        this.tEndTime = tEndTime;
        this.tCreateTime = tCreateTime;
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "Test{" +
                "tId='" + tId + '\'' +
                ", tType='" + tType + '\'' +
                ", title='" + title + '\'' +
                ", status=" + status +
                ", uId='" + uId + '\'' +
                ", tUrl='" + tUrl + '\'' +
                ", tTime='" + tTime + '\'' +
                ", tBeginTime='" + tBeginTime + '\'' +
                ", tEndTime='" + tEndTime + '\'' +
                ", tCreateTime='" + tCreateTime + '\'' +
                ", isDelete=" + isDelete +
                '}';
    }

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public String gettType() {
        return tType;
    }

    public void settType(String tType) {
        this.tType = tType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String gettUrl() {
        return tUrl;
    }

    public void settUrl(String tUrl) {
        this.tUrl = tUrl;
    }

    public String gettTime() {
        return tTime;
    }

    public void settTime(String tTime) {
        this.tTime = tTime;
    }

    public String gettBeginTime() {
        return tBeginTime;
    }

    public void settBeginTime(String tBeginTime) {
        this.tBeginTime = tBeginTime;
    }

    public String gettEndTime() {
        return tEndTime;
    }

    public void settEndTime(String tEndTime) {
        this.tEndTime = tEndTime;
    }

    public String gettCreateTime() {
        return tCreateTime;
    }

    public void settCreateTime(String tCreateTime) {
        this.tCreateTime = tCreateTime;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }
}
