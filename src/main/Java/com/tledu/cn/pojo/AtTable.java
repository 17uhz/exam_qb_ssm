package com.tledu.cn.pojo;

/**
 * Author:17
 * Date:2021-01-24 19:54
 * Description:<描述>
 */
public class AtTable {
    private String atId;
    private String aId;
    private String atType;
    private String atTopic;
    private String uId;
    private String atA;
    private String atB;
    private String atC;
    private String atD;
    private String cId;
    private String cName;
    private String atAnswer;
    private int atScore;
    private String tId;
    private String atModifyTime;
    private int isDelete;

    public AtTable() {
    }

    public AtTable(String atId, String aId, String atType, String atTopic, String uId, String atA, String atB, String atC, String atD, String cId, String cName, String atAnswer, int atScore, String tId, String atModifyTime, int isDelete) {
        this.atId = atId;
        this.aId = aId;
        this.atType = atType;
        this.atTopic = atTopic;
        this.uId = uId;
        this.atA = atA;
        this.atB = atB;
        this.atC = atC;
        this.atD = atD;
        this.cId = cId;
        this.cName = cName;
        this.atAnswer = atAnswer;
        this.atScore = atScore;
        this.tId = tId;
        this.atModifyTime = atModifyTime;
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "AtTable{" +
                "atId='" + atId + '\'' +
                ", aId='" + aId + '\'' +
                ", atType='" + atType + '\'' +
                ", atTopic='" + atTopic + '\'' +
                ", uId='" + uId + '\'' +
                ", atA='" + atA + '\'' +
                ", atB='" + atB + '\'' +
                ", atC='" + atC + '\'' +
                ", atD='" + atD + '\'' +
                ", cId='" + cId + '\'' +
                ", cName='" + cName + '\'' +
                ", atAnswer='" + atAnswer + '\'' +
                ", atScore=" + atScore +
                ", tId='" + tId + '\'' +
                ", atModifyTime='" + atModifyTime + '\'' +
                ", isDelete=" + isDelete +
                '}';
    }

    public String getaId() {
        return aId;
    }

    public void setaId(String aId) {
        this.aId = aId;
    }

    public String getAtId() {
        return atId;
    }

    public void setAtId(String atId) {
        this.atId = atId;
    }

    public String getAtType() {
        return atType;
    }

    public void setAtType(String atType) {
        this.atType = atType;
    }

    public String getAtTopic() {
        return atTopic;
    }

    public void setAtTopic(String atTopic) {
        this.atTopic = atTopic;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getAtA() {
        return atA;
    }

    public void setAtA(String atA) {
        this.atA = atA;
    }

    public String getAtB() {
        return atB;
    }

    public void setAtB(String atB) {
        this.atB = atB;
    }

    public String getAtC() {
        return atC;
    }

    public void setAtC(String atC) {
        this.atC = atC;
    }

    public String getAtD() {
        return atD;
    }

    public void setAtD(String atD) {
        this.atD = atD;
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

    public String getAtAnswer() {
        return atAnswer;
    }

    public void setAtAnswer(String atAnswer) {
        this.atAnswer = atAnswer;
    }

    public int getAtScore() {
        return atScore;
    }

    public void setAtScore(int atScore) {
        this.atScore = atScore;
    }

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public String getAtModifyTime() {
        return atModifyTime;
    }

    public void setAtModifyTime(String atModifyTime) {
        this.atModifyTime = atModifyTime;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }
}
