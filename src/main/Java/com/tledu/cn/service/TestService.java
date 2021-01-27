package com.tledu.cn.service;

import com.tledu.cn.pojo.AnswerResult;
import com.tledu.cn.pojo.AtTable;
import com.tledu.cn.pojo.Examinee;
import com.tledu.cn.pojo.Test;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public interface TestService {
    public int updateTestTime(Test test);
    public String addExamineeLogin(Examinee examinee);
    public String addExamineeName(Examinee examinee);
    public List<Examinee> getExamineeInfo(Map<String,Object> params);
    public Test getTestBasicInfo(Test test);
    public List<AtTable> getExamPaperInfo(Map<String,Object> params);
    public Examinee submitAnswer(AnswerResult answerResult);
}
