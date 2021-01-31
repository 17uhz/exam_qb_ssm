package com.tledu.cn.service;

import com.tledu.cn.pojo.Manager;
import com.tledu.cn.pojo.Menu;
import com.tledu.cn.pojo.User;

import java.util.List;

public interface ManagerService {
    public List<Manager> managerLogin(Manager manager);
    public Boolean addMenu(Menu menu);
    public Boolean deleteMenu(Menu menu);
    public List<Menu> showMenu();
    public int initPwd(User user);
    public int updateIsAllow(User user);
    public int deleteUser(User user);
    public List<User> managerGetUserInfo();
}
