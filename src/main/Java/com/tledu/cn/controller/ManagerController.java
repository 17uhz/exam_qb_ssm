package com.tledu.cn.controller;

import com.tledu.cn.pojo.Manager;
import com.tledu.cn.pojo.Menu;
import com.tledu.cn.pojo.User;
import com.tledu.cn.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ManagerController {
    @Autowired
    private ManagerService managerService;
    //管理员登录
    @RequestMapping("/managerLogin")
    @ResponseBody
    public Map<String,Boolean> managerLogin(@RequestBody Manager manager){
        Map<String,Boolean> param=new HashMap<String, Boolean>();
        List<Manager> managerList=managerService.managerLogin(manager);
        if (managerList.size()==1){
            param.put("mark",true);
        }else if(managerList.size()==0){
            param.put("mark",false);
        }
        return param;
    }

    //菜单添加
    @RequestMapping("/addMenu")
    @ResponseBody
    public Map<String,Boolean> addMenu(@RequestBody Menu menu){
        Boolean b=managerService.addMenu(menu);
        Map<String,Boolean> param=new HashMap<String, Boolean>();
        param.put("mark",b);
        return param;
    }

    //菜单删除
    @RequestMapping("/deleteMenu")
    @ResponseBody
    public Map<String,Boolean> deleteMenu(@RequestBody Menu menu){
        Boolean b=managerService.deleteMenu(menu);
        Map<String,Boolean> param=new HashMap<String, Boolean>();
        param.put("mark",b);
        return param;
    }

    //显示菜单
    @RequestMapping("/showMenu")
    @ResponseBody
    public List<Menu> showMenu(){
        List<Menu> menuList=managerService.showMenu();
        return menuList;
    }

    //初始化用户密码
    @RequestMapping("/initPwd")
    @ResponseBody
    public Map<String,Boolean> initPwd(@RequestBody User user){
        int i=managerService.initPwd(user);
        Map<String,Boolean> param=new HashMap<String, Boolean>();
        if (i==1){
            param.put("mark",true);
        }else {
            param.put("mark",false);
        }
        return param;
    }

    //修改用户权限
    @RequestMapping("/updateIsAllow")
    @ResponseBody
    public Map<String,Boolean> updateIsAllow(@RequestBody User user){
        int i=managerService.updateIsAllow(user);
        Map<String,Boolean> param=new HashMap<String, Boolean>();
        if (i==1){
            param.put("mark",true);
        }else {
            param.put("mark",false);
        }
        return param;
    }

    //删除用户
    @RequestMapping("/deleteUser")
    @ResponseBody
    public Map<String,Boolean> deleteUser(@RequestBody User user){
        int i=managerService.deleteUser(user);
        Map<String,Boolean> param=new HashMap<String, Boolean>();
        if (i==1){
            param.put("mark",true);
        }else {
            param.put("mark",false);
        }
        return param;
    }

    //显示用户信息
    @RequestMapping("/managerGetUserInfo")
    @ResponseBody
    public List<User> managerGetUserInfo(){
        List<User> userList=managerService.managerGetUserInfo();
        return userList;
    }
}


