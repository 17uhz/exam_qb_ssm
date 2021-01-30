package com.tledu.cn.service.Impl;

import com.tledu.cn.dao.ManagerDao;
import com.tledu.cn.pojo.Manager;
import com.tledu.cn.pojo.Menu;
import com.tledu.cn.pojo.User;
import com.tledu.cn.service.ManagerService;
import com.tledu.cn.util.RedisUtil;
import com.tledu.cn.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ManagerServiceImpl implements ManagerService {
    @Autowired
    private ManagerDao managerDao;
    @Autowired
    private RedisUtil redisUtil;
    //管理员登录
    @Override
    public List<Manager> managerLogin(Manager manager) {
        List<Manager> managerList=managerDao.managerLogin(manager);
        return managerList;
    }

    //菜单添加
    @Override
    public Boolean addMenu(Menu menu) {
        Boolean b=false;
        if (menu.getMenuName()==null||menu.getMenuLevel()!=1){
            return b;
        }else {
            menu.setMenuId(UUID.randomUUID().toString());
            menu.setCreateTime(TimeUtil.createTime());
            menu.setIsDelete(0);
            managerDao.addMenu(menu);
            List<Menu> menuList=managerDao.showMenu();
            b=redisUtil.set("menuList",menuList);
            return b;
        }
    }

    //菜单删除
    @Override
    public Boolean deleteMenu(Menu menu) {
        Boolean b=false;
        int i=managerDao.deleteMenu(menu);
        if(i==1){
            List<Menu> menuList=managerDao.showMenu();
            b=redisUtil.set("menuList",menuList);
        }
        return b;
    }

    //显示菜单
    @Override
    public List<Menu> showMenu() {
        List<Menu> menuList=(List<Menu>)redisUtil.get("menuList");
        if (menuList==null){
            menuList=managerDao.showMenu();
        }
        return menuList;
    }

    //初始化用户密码
    @Override
    public int initPwd(User user) {
        user.setPwd("123456");
        int i=managerDao.initPwd(user);
        return i;
    }

    //修改用户权限
    @Override
    public int updateIsAllow(User user) {
        int i=managerDao.updateIsAllow(user);
        return i;
    }

    //删除用户
    @Override
    public int deleteUser(User user) {
        int i=managerDao.deleteUser(user);
        return i;
    }

    //显示用户信息
    @Override
    public List<User> managerGetUserInfo() {
        List<User> userList=managerDao.managerGetUserInfo();
        return userList































                ;
    }
}
