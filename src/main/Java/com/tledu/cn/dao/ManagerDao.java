package com.tledu.cn.dao;

import com.tledu.cn.pojo.Manager;
import com.tledu.cn.pojo.Menu;
import com.tledu.cn.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ManagerDao {
    List<Manager> managerLogin(Manager manager);
    int addMenu(Menu menu);
    int deleteMenu(Menu menu);
    List<Menu> showMenu();
    int initPwd(User user);
    int updateIsAllow(User user);
    int deleteUser(User user);
    List<User> managerGetUserInfo();
}
