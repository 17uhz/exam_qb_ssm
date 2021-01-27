package com.tledu.cn.pojo;

import java.util.ArrayList;
import java.util.Map;

public class AnswerResult {
    private String eId;
    private ArrayList<AtTable> AnswerResult;

    public AnswerResult(String eId, ArrayList<AtTable> answerResult) {
        this.eId = eId;
        AnswerResult = answerResult;
    }

    public AnswerResult() {
    }

    public String geteId() {
        return eId;
    }

    public void seteId(String eId) {
        this.eId = eId;
    }

    public ArrayList<AtTable> getAnswerResult() {
        return AnswerResult;
    }

    public void setAnswerResult(ArrayList<AtTable> answerResult) {
        AnswerResult = answerResult;
    }

    @Override
    public String toString() {
        return "AnswerResult{" +
                "eId='" + eId + '\'' +
                ", AnswerResult=" + AnswerResult +
                '}';
    }
}
