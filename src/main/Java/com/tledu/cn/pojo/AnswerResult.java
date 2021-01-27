package com.tledu.cn.pojo;

import java.util.ArrayList;
import java.util.Map;

public class AnswerResult {
    private String eId;
    private ArrayList<AtTable> aResult;

    public AnswerResult(String eId, ArrayList<AtTable> aResult) {
        this.eId = eId;
        this.aResult = aResult;
    }

    public AnswerResult() {
    }

    public String geteId() {
        return eId;
    }

    public void seteId(String eId) {
        this.eId = eId;
    }

    public ArrayList<AtTable> getaResult() {
        return aResult;
    }

    public void setaResult(ArrayList<AtTable> aResult) {
        this.aResult = aResult;
    }

    @Override
    public String toString() {
        return "AnswerResult{" +
                "eId='" + eId + '\'' +
                ", aResult=" + aResult +
                '}';
    }
}
