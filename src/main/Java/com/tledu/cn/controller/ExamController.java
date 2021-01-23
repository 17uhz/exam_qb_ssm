package com.tledu.cn.controller;

import com.tledu.cn.pojo.Answer;
import com.tledu.cn.pojo.Classify;
import com.tledu.cn.pojo.User;
import com.tledu.cn.service.UserService;
import com.tledu.cn.util.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author:17
 * Date:2021-01-20 11:39
 * Description:<描述>
 */
@Controller
public class ExamController {
    @Autowired
    private UserService userService;


    //用户注册
    @RequestMapping("/userRegister")
    @ResponseBody
    public Map<String,Integer> userRegister(@RequestBody User user){
        int i = userService.registerUser(user);
        Map<String,Integer> param = new HashMap<String, Integer>();
        param.put("mark",i);
        return param;
    }

    //用户登录
    @RequestMapping("/userLogin")
    @ResponseBody
    public User userLogin(HttpServletRequest request,@RequestBody User user){

//        Map<String,String> param = new HashMap<String, String>();
        User getUser= userService.userLogin(request, user);
        System.out.println(getUser);
//        if (getUser){
//            param.put("mark","true");
//        }else {
//            param.put("mark","false");
//        }
        return getUser;
    }

    //验证登录状态信息
//    @RequestMapping("/getUserInfo")
//    @ResponseBody
//    public Map<String,Object> getUserInfo(HttpServletRequest request){
//        int status = (Integer) request.getSession().getAttribute("status");
//        User user = (User) request.getSession().getAttribute("Info");
//        Map<String,Object> param = new HashMap<String ,Object>();
//        if (status==1){
//            param.put("status",status);
//            param.put("Info",user);
//        }else {
//            param.put("status",0);
//        }
//        return param;
//    }

    //更改密码
    @RequestMapping("/changePwd")
    @ResponseBody
    public Map<String,String> changePwd(@RequestBody User user){
        Map<String,String> param = new HashMap<String, String>();
        int i = userService.changePwd(user);
        if (i==1){
            param.put("mark","true");
        }else {
            param.put("mark","false");
        }

        return param;
    }

    //上传头像
    @RequestMapping("/uploadImage")
    @ResponseBody
    public Map<String,Boolean> uploadImage(HttpServletRequest request){
//        测试代码
//        User user = new User();
//        user.setU_id("10efe075-a94e-4d98-9ef3-28e39713954b");
//        user.setIs_delete(0);
//        request.getSession().setAttribute("Info",user);
        Map<String, Boolean> result = userService.uploadImage(request);
        System.out.println(result);
        return result;
    }

    //添加分类
    @RequestMapping("/addClassify")
    @ResponseBody
    public Map<String,Integer> addClassify(HttpServletRequest request,@RequestBody Classify classify){
        int i=userService.addClassify(classify);
        Map<String,Integer> param=new HashMap<String, Integer>();
        param.put("mark",i);
        return param;
    }

    //删除分类
    @RequestMapping("/deleteClassify")
    @ResponseBody
    public Map<String,Integer> deleteClassify(@RequestBody Classify classify){
        int i=userService.deleteClassify(classify);
        Map<String,Integer> param=new HashMap<String, Integer>();
        param.put("mark",i);
        return param;

    }

    //显示分类
    @RequestMapping("/getClassifyInfo")
    @ResponseBody
    public Map<String, List<Classify>> getClassifyInfo(@RequestBody Classify classify){
        classify.setuId("1");
        List<Classify> classifyList=userService.getClassifyInfo(classify);
        Map<String,List<Classify>> param=new HashMap<String, List<Classify>>();
        param.put("classifyList",classifyList);
        return param;
    }

    //题目添加
    @RequestMapping("/addAnswer")
    @ResponseBody
    public Map<String,Integer> addAnswer(HttpServletRequest request, @RequestBody Answer answer){
        int i=userService.addAnswer(request,answer);
        Map<String,Integer> param=new HashMap<String, Integer>();
        param.put("mark",i);
        return param;
    }
    //题目删除
    @RequestMapping("/deleteAnswer")
    @ResponseBody
    public Map<String,Boolean> deleteAnswer(@RequestBody Map<String, ArrayList<String>> param){
        int n=userService.deleteAnswer(param.get("deleteAnswer"));
        Map<String,Boolean> map=new HashMap<String, Boolean>();
        if(n==param.get("deleteAnswer").size()){
            map.put("mark",true);
        }else{
            map.put("mark",false);
        }
        return map;
    }

    //题目修改
    @RequestMapping("/modifyAnswer")
    @ResponseBody
    public Map<String,Integer> modifyAnswer(@RequestBody Answer answer){
        int i=userService.modifyAnswer(answer);
        Map<String,Integer> param=new HashMap<String, Integer>();
        param.put("mark",i);
        return param;
    }

    //题目显示
    @RequestMapping("/getTopicInfo")
    @ResponseBody
    public PageUtils getTopicInfo(@RequestBody Map<String,Object> param){
        PageUtils pageUtils=userService.getTopicInfo(param);
        return pageUtils;
    }

    //显示单道题目详情
    @RequestMapping("/getAnswerById")
    @ResponseBody
    public Answer getAnswerById(@RequestBody Answer answer){
        Answer answer1=userService.getAnswerById(answer);
        return answer1;
    }





}
