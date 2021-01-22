package com.tledu.cn.pojo;

/**
 * Author:17
 * Date:2021-01-20 11:33
 * Description:<描述>
 */
public class User {
    private String uId;
    private String acc;
    private String pwd;
    private String phone;
    private String email;
    private String image;
    private int isAllow;
    private String createTime;
    private int isDelete;

    public User() {
    }

    public User(String uId, String acc, String pwd, String phone, String email, String image, int isAllow, String createTime, int isDelete) {
        this.uId = uId;
        this.acc = acc;
        this.pwd = pwd;
        this.phone = phone;
        this.email = email;
        this.image = image;
        this.isAllow = isAllow;
        this.createTime = createTime;
        this.isDelete = isDelete;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getAcc() {
        return acc;
    }

    public void setAcc(String acc) {
        this.acc = acc;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getIsAllow() {
        return isAllow;
    }

    public void setIsAllow(int isAllow) {
        this.isAllow = isAllow;
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
        return "User{" +
                "uId='" + uId + '\'' +
                ", acc='" + acc + '\'' +
                ", pwd='" + pwd + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", image='" + image + '\'' +
                ", isAllow=" + isAllow +
                ", createAime='" + createTime + '\'' +
                ", isDelete=" + isDelete +
                '}';
    }
}