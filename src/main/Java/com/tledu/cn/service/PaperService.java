package com.tledu.cn.service;

import com.tledu.cn.pojo.AtTable;
import com.tledu.cn.pojo.Test;
import com.tledu.cn.util.PageUtils;

import java.util.ArrayList;
import java.util.Map;

/**
 * Author:17
 * Date:2021-01-23 14:24
 * Description:<描述>
 */
public interface PaperService {
    public int addTest(Test test);
    public PageUtils getTestInfo(Map<String,Object> params);
    public boolean deleteTestInfo(ArrayList<Test> testList);
    public boolean addTestAnswer(ArrayList<AtTable> atTables);
    public PageUtils getAtTableInfo(Map<String,Object> params);
    public boolean deleteTestAnswer(ArrayList<AtTable> atTables);

}
