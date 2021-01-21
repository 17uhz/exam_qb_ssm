package com.tledu.cn.service;

import com.tledu.cn.pojo.Answer;
import com.tledu.cn.pojo.Classify;
import com.tledu.cn.pojo.User;
import com.tledu.cn.util.PageUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Author:17
 * Date:2021-01-20 13:04
 * Description:<描述>
 */
public interface UserService {
    //用户
    int registerUser(User user);
    int userLogin(HttpServletRequest request, User user);
    int changePwd(User user);
    Map<String,Boolean> uploadImage(HttpServletRequest request);
    //分类
    int addClassify(HttpServletRequest request,Classify classify);
    int deleteClassify(Classify classify);
    List<Classify> getClassifyInfo(HttpServletRequest request);
    //题目
    int addAnswer(HttpServletRequest request, Answer answer);
    int deleteAnswer(ArrayList<String> IdList);
    int modifyAnswer(Answer answer);
    PageUtils getTopicInfo(Map<String,Object> param);
    Answer getAnswerById(Answer answer);
}
