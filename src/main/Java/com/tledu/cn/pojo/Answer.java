package com.tledu.cn.pojo;

public class Answer {
    private String a_id;
    private String type;
    private String a_topic;
    private String u_id;
    private String a_a;
    private String a_b;
    private String a_c;
    private String a_d;
    private String c_id;
    private String c_name;
    private String a_answer;
    private int a_score;
    private String a_modify_time;
    private int is_delete;

    public Answer(String a_id, String type, String a_topic, String u_id, String a_a, String a_b, String a_c, String a_d, String c_id, String c_name, String a_answer, int a_score, String a_modify_time, int is_delete) {
        this.a_id = a_id;
        this.type = type;
        this.a_topic = a_topic;
        this.u_id = u_id;
        this.a_a = a_a;
        this.a_b = a_b;
        this.a_c = a_c;
        this.a_d = a_d;
        this.c_id = c_id;
        this.c_name = c_name;
        this.a_answer = a_answer;
        this.a_score = a_score;
        this.a_modify_time = a_modify_time;
        this.is_delete = is_delete;
    }

    public Answer() {
    }

    public String getA_id() {
        return a_id;
    }

    public void setA_id(String a_id) {
        this.a_id = a_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getA_topic() {
        return a_topic;
    }

    public void setA_topic(String a_topic) {
        this.a_topic = a_topic;
    }

    public String getU_id() {
        return u_id;
    }

    public void setU_id(String u_id) {
        this.u_id = u_id;
    }

    public String getA_a() {
        return a_a;
    }

    public void setA_a(String a_a) {
        this.a_a = a_a;
    }

    public String getA_b() {
        return a_b;
    }

    public void setA_b(String a_b) {
        this.a_b = a_b;
    }

    public String getA_c() {
        return a_c;
    }

    public void setA_c(String a_c) {
        this.a_c = a_c;
    }

    public String getA_d() {
        return a_d;
    }

    public void setA_d(String a_d) {
        this.a_d = a_d;
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

    public String getA_answer() {
        return a_answer;
    }

    public void setA_answer(String a_answer) {
        this.a_answer = a_answer;
    }

    public int getA_score() {
        return a_score;
    }

    public void setA_score(int a_score) {
        this.a_score = a_score;
    }

    public String getA_modify_time() {
        return a_modify_time;
    }

    public void setA_modify_time(String a_modify_time) {
        this.a_modify_time = a_modify_time;
    }

    public int getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(int is_delete) {
        this.is_delete = is_delete;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "a_id='" + a_id + '\'' +
                ", type='" + type + '\'' +
                ", a_topic='" + a_topic + '\'' +
                ", u_id='" + u_id + '\'' +
                ", a_a='" + a_a + '\'' +
                ", a_b='" + a_b + '\'' +
                ", a_c='" + a_c + '\'' +
                ", a_d='" + a_d + '\'' +
                ", c_id='" + c_id + '\'' +
                ", c_name='" + c_name + '\'' +
                ", a_answer='" + a_answer + '\'' +
                ", a_score=" + a_score +
                ", a_modify_time='" + a_modify_time + '\'' +
                ", is_delete=" + is_delete +
                '}';
    }
}
