package com.tledu.cn.controller;

import com.tledu.cn.pojo.AtTable;
import com.tledu.cn.pojo.Test;
import com.tledu.cn.service.PaperService;
import com.tledu.cn.util.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Author:17
 * Date:2021-01-23 14:23
 * Description:<描述>
 */
@Controller
public class    PaperController {
    @Autowired
    private PaperService paperService;

    @RequestMapping("/addTest")
    @ResponseBody
    public Map<String,Integer> addTest(@RequestBody Test test){
        Map<String,Integer> map = new HashMap<String, Integer>();
        int i = paperService.addTest(test);
        if (i==1){
            map.put("mark",1);
        }else {
            map.put("mark",0);
        }
        return map;
    }


    @RequestMapping("/getTestInfo")
    @ResponseBody
    public PageUtils getTestInfo(@RequestBody Map<String,Object> param){
        PageUtils pageUtils=paperService.getTestInfo(param);
        return pageUtils;
    }

    @RequestMapping("/deleteTestInfo")
    @ResponseBody
    public Map<String,Boolean> deleteTestInfo(@RequestBody Map<String,ArrayList<Test>> param){
        Map<String,Boolean> result = new HashMap<String, Boolean>();
        ArrayList<Test> deleteTestInfo = param.get("deleteTestInfo");
        boolean b = paperService.deleteTestInfo(deleteTestInfo);
        result.put("mark",b);
        return result;
    }

    @RequestMapping("/addTestAnswer")
    @ResponseBody
    public Map<String,Boolean> addTestAnswer(@RequestBody Map<String,ArrayList<AtTable>> param){
        Map<String,Boolean> result = new HashMap<String, Boolean>();
        ArrayList<AtTable> atTableList = param.get("addTestAnswer");
        boolean b = paperService.addTestAnswer(atTableList);
        result.put("mark",b);
        return result;
    }

    @RequestMapping("/getAtTableInfo")
    @ResponseBody
    public PageUtils getAtTableInfo(@RequestBody Map<String,Object> param){
        PageUtils atTableInfo = paperService.getAtTableInfo(param);
        return atTableInfo;
    }

    @RequestMapping("/deleteTestAnswer")
    @ResponseBody
    public Map<String,Boolean> deleteTestAnswer(@RequestBody Map<String,ArrayList<AtTable>> param){
        Map<String,Boolean> map = new HashMap<String, Boolean>();
        ArrayList<AtTable> atTableArrayList = param.get("deleteTestAnswer");
        boolean b = paperService.deleteTestAnswer(atTableArrayList);
        map.put("mark",b);
        return map;

    }


}
