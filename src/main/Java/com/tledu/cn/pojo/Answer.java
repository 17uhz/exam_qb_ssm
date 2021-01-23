package com.tledu.cn.pojo;

public class Answer {
    private String aId;
    private String type;
    private String aTopic;
    private String uId;
    private String aA;
    private String aB;
    private String aC;
    private String aD;
    private String cId;
    private String cName;
    private String aAnswer;
    private int aScore;
    private String aModifyTime;
    private int isDelete;

    public Answer(String aId, String type, String aTopic, String uId, String aA, String aB, String aC, String aD, String cId, String cName, String aAnswer, int aScore, String aModifyTime, int isDelete) {
        this.aId = aId;
        this.type = type;
        this.aTopic = aTopic;
        this.uId = uId;
        this.aA = aA;
        this.aB = aB;
        this.aC = aC;
        this.aD = aD;
        this.cId = cId;
        this.cName = cName;
        this.aAnswer = aAnswer;
        this.aScore = aScore;
        this.aModifyTime = aModifyTime;
        this.isDelete = isDelete;
    }

    public Answer() {
    }

    public String getaId() {
        return aId;
    }

    public void setaId(String aId) {
        this.aId = aId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getaTopic() {
        return aTopic;
    }

    public void setaTopic(String aTopic) {
        this.aTopic = aTopic;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getaA() {
        return aA;
    }

    public void setaA(String aA) {
        this.aA = aA;
    }

    public String getaB() {
        return aB;
    }

    public void setaB(String aB) {
        this.aB = aB;
    }

    public String getaC() {
        return aC;
    }

    public void setaC(String aC) {
        this.aC = aC;
    }

    public String getaD() {
        return aD;
    }

    public void setaD(String aD) {
        this.aD = aD;
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

    public String getaAnswer() {
        return aAnswer;
    }

    public void setaAnswer(String aAnswer) {
        this.aAnswer = aAnswer;
    }

    public int getaScore() {
        return aScore;
    }

    public void setaScore(int aScore) {
        this.aScore = aScore;
    }

    public String getaModifyTime() {
        return aModifyTime;
    }

    public void setaModifyTime(String aModifyTime) {
        this.aModifyTime = aModifyTime;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "aId='" + aId + '\'' +
                ", type='" + type + '\'' +
                ", aTopic='" + aTopic + '\'' +
                ", uId='" + uId + '\'' +
                ", aA='" + aA + '\'' +
                ", aB='" + aB + '\'' +
                ", aC='" + aC + '\'' +
                ", aD='" + aD + '\'' +
                ", cId='" + cId + '\'' +
                ", cName='" + cName + '\'' +
                ", aAnswer='" + aAnswer + '\'' +
                ", aScore=" + aScore +
                ", aModifyTime='" + aModifyTime + '\'' +
                ", isDelete=" + isDelete +
                '}';
    }
}
