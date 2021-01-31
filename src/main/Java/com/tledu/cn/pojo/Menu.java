package com.tledu.cn.pojo;

import java.io.Serializable;

public class Menu implements Serializable {
    private String menuId;
    private String menuName;
    private int menuLevel;
    private String createTime;
    private int isDelete;

    public Menu(String menuId, String menuName, int menuLevel, String createTime, int isDelete) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.menuLevel = menuLevel;
        this.createTime = createTime;
        this.isDelete = isDelete;
    }

    public Menu() {
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(int menuLevel) {
        this.menuLevel = menuLevel;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuId='" + menuId + '\'' +
                ", menuName='" + menuName + '\'' +
                ", menuLevel=" + menuLevel +
                ", creatTime='" + createTime + '\'' +
                ", isDelete=" + isDelete +
                '}';
    }
}
