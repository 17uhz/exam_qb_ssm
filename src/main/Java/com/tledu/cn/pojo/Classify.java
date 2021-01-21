package com.tledu.cn.pojo;

public class Classify {
    private String c_id;
    private String c_name;
    private String u_id;
    private String creat_time;
    private int is_delete;

    public Classify(String c_id, String c_name, String u_id, String creat_time, int is_delete) {
        this.c_id = c_id;
        this.c_name = c_name;
        this.u_id = u_id;
        this.creat_time = creat_time;
        this.is_delete = is_delete;
    }

    public Classify() {
    }

    public String getC_id() {
        return c_id;
    }

    public void setC_id(String c_id) {
        this.c_id = c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getU_id() {
        return u_id;
    }

    public void setU_id(String u_id) {
        this.u_id = u_id;
    }

    public String getCreat_time() {
        return creat_time;
    }

    public void setCreat_time(String creat_time) {
        this.creat_time = creat_time;
    }

    public int getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(int is_delete) {
        this.is_delete = is_delete;
    }

    @Override
    public String toString() {
        return "Classify{" +
                "c_id='" + c_id + '\'' +
                ", c_name='" + c_name + '\'' +
                ", u_id='" + u_id + '\'' +
                ", creat_time='" + creat_time + '\'' +
                ", is_delete=" + is_delete +
                '}';
    }
}
