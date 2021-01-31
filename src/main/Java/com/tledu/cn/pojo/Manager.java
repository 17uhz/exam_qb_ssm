package com.tledu.cn.pojo;

public class Manager {
    private String mId;
    private String mAcc;
    private String mPwd;
    private String createTime;
    private int isDelete;

    public Manager(String mId, String mAcc, String mPwd, String createTime, int isDelete) {
        this.mId = mId;
        this.mAcc = mAcc;
        this.mPwd = mPwd;
        this.createTime = createTime;
        this.isDelete = isDelete;
    }

    public Manager() {
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public String getmAcc() {
        return mAcc;
    }

    public void setmAcc(String mAcc) {
        this.mAcc = mAcc;
    }

    public String getmPwd() {
        return mPwd;
    }

    public void setmPwd(String mPwd) {
        this.mPwd = mPwd;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
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
        return "Manager{" +
                "mId='" + mId + '\'' +
                ", mAcc='" + mAcc + '\'' +
                ", mPwd='" + mPwd + '\'' +
                ", createTime='" + createTime + '\'' +
                ", isDelete=" + isDelete +
                '}';
    }
}
