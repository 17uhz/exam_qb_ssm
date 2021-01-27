package com.tledu.cn.controller;

import com.tledu.cn.pojo.*;
import com.tledu.cn.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TestController {
    @Autowired
    private TestService testService;

    //修改考试信息
    @RequestMapping("/updateTestTime")
    @ResponseBody
    public Map<String,Boolean> updateTestTime(@RequestBody Test test){
        int i=testService.updateTestTime(test);
        Map<String,Boolean> param=new HashMap<String, Boolean>();
        if(i==1){
            param.put("mark",true);
        }else{
            param.put("mark",false);
        }
        return param;
    }

    //添加考生信息（登录号、登陆时间）
    @RequestMapping("/addExamineeLogin")
    @ResponseBody
    public Map<String,String> addExamineeLogin(@RequestBody Examinee examinee){
        String eId=testService.addExamineeLogin(examinee);
        Map<String,String> param=new HashMap<String, String>();
        param.put("eId",eId);
        return param;
    }

    //添加考生信息（姓名 ，开始考试时间，考试号）
    @RequestMapping("/addExamineeName")
    @ResponseBody
    public Map<String,String> addExamineeName(@RequestBody Examinee examinee){
        Map<String,String> param=new HashMap<String, String>();
        String tTime=testService.addExamineeName(examinee);
        param.put("tTime",tTime);
        return param;
    }

    //查看试卷考试考生详情信息
    @RequestMapping("/getExamineeInfo")
    @ResponseBody
    public List<Examinee> getExamineeInfo(@RequestBody Map<String,Object> params){
        List<Examinee> examineeList=testService.getExamineeInfo(params);
        return examineeList;
    }

    //得到试卷基本信息
    @RequestMapping("/getTestBasicInfo")
    @ResponseBody
    public Test getTestBasicInfo(@RequestBody Test test){
        Test test1=testService.getTestBasicInfo(test);
        return test1;
    }

    //得到考试的试题信息
    @RequestMapping("/getExamPaperInfo")
    @ResponseBody
    public List<AtTable> getExamPaperInfo(@RequestBody Map<String,Object> params){
        List<AtTable> atTableList=testService.getExamPaperInfo(params);
        return atTableList;
    }

    //交卷
    @RequestMapping("/submitAnswer")
    @ResponseBody
    public Examinee submitAnswer(@RequestBody AnswerResult answerResult){
        Examinee examinee=testService.submitAnswer(answerResult);
        return examinee;
    }
}
