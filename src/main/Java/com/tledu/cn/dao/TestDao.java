package com.tledu.cn.dao;

import com.tledu.cn.pojo.AtTable;
import com.tledu.cn.pojo.Examinee;
import com.tledu.cn.pojo.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestDao {
    int updateTestTime(Test test);
    int addExamineeLogin(Examinee examinee);
    Test selectTestTime(Examinee examinee);//查询考试时长
    int addExamineeName(Examinee examinee);
    List<Examinee> getExamineeInfo(String tId);
    Test getTestBasicInfo(Test test);
    List<AtTable> getExamPaperInfo(String tId);
    AtTable submitAnswer(AtTable atTable);
    int addExamineeScore(Examinee examinee);
    Examinee getExamineeResult(String eId);
}
