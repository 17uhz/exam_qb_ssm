package com.tledu.cn.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tledu.cn.dao.TestDao;
import com.tledu.cn.pojo.AnswerResult;
import com.tledu.cn.pojo.AtTable;
import com.tledu.cn.pojo.Examinee;
import com.tledu.cn.pojo.Test;
import com.tledu.cn.service.TestService;
import com.tledu.cn.util.PageUtils;
import com.tledu.cn.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestDao testDao;
    //修改考试信息
    @Override
    public int updateTestTime(Test test) {
        int i=testDao.updateTestTime(test);
        return i;
    }

    //添加考生信息（登录号、登陆时间）
    @Override
    public String addExamineeLogin(Examinee examinee) {
        String eId=null;
        if (examinee==null){
            return eId;
        }
        examinee.seteId(UUID.randomUUID().toString());
        examinee.setLoginTime(TimeUtil.createTime());
        int i=testDao.addExamineeLogin(examinee);
        if (i==1){
            eId=examinee.geteId();
        }
        return eId;
    }

    //添加考生信息（姓名 ，开始考试时间，考试号）
    @Override
    public String addExamineeName(Examinee examinee) {
        String tTime=null;
        if(examinee.geteName()==null||examinee.gettId()==null){
            return tTime;
        }
        Test test=testDao.selectTestTime(examinee);
        if (test!=null) {
            examinee.settTime(test.gettTime());
            examinee.setBeginTime(TimeUtil.createTime());
            examinee.setStatus(0);
            int i = testDao.addExamineeName(examinee);
            if(i==1){
                tTime=examinee.gettTime();
            }
        }
        return tTime;
    }

    //查看试卷考试考生详情信息
    @Override
    public PageUtils getExamineeInfo(Map<String, Object> params) {
        PageHelper.offsetPage(Integer.parseInt(params.get("offset").toString()),Integer.parseInt(params.get("pageSize").toString()));
        List<Examinee> examineeList = testDao.getExamineeInfo(params.get("tId").toString());
        PageInfo<Examinee> testPageInfo = new PageInfo<>(examineeList);
        return new PageUtils(new Long(testPageInfo.getTotal()).intValue(),testPageInfo.getList());
    }

    //得到试卷基本信息
    @Override
    public Test getTestBasicInfo(Test test) {
        Test test1=testDao.getTestBasicInfo(test);
        return test1;

    }

    //得到考试的试题信息
    @Override
    public List<AtTable> getExamPaperInfo(Map<String, Object> params) {
        List<AtTable> atTableList=testDao.getExamPaperInfo(params.get("tId").toString());
        return atTableList;
    }

    //交卷

    @Override
    public Examinee submitAnswer(AnswerResult answerResult) {
        int score=0;
        List<AtTable> atTableList=answerResult.getaResult();
        for (int i=0;i<atTableList.size();i++) {
            AtTable atTable = testDao.submitAnswer(atTableList.get(i));
            if (atTable != null) {
                score += atTable.getAtScore();
            }
        }
        Examinee examinee=new Examinee();
        examinee.seteScore(score);
        examinee.setEndTime(TimeUtil.createTime());
        examinee.seteId(answerResult.geteId());
        int i=testDao.addExamineeScore(examinee);
        Examinee examinee1=testDao.getExamineeResult(answerResult.geteId());
        return examinee1;
    }
}
