package com.tledu.cn.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageInterceptor;
import com.tledu.cn.dao.PaperDao;
import com.tledu.cn.pojo.Answer;
import com.tledu.cn.pojo.AtTable;
import com.tledu.cn.pojo.Test;
import com.tledu.cn.service.PaperService;
import com.tledu.cn.util.PageUtils;
import com.tledu.cn.util.TimeUtil;
import org.apache.ibatis.annotations.Select;
import org.omg.Dynamic.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Author:17
 * Date:2021-01-23 14:24
 * Description:<描述>
 */
@Service
public class PaperServiceImpl implements PaperService {
    @Autowired
    private PaperDao paperDao;


    //添加试卷
    @Override
    public int addTest(Test test) {
        System.out.println(test);
        //判断标题名是否已存在
        List<Test> tests = paperDao.onlyOneTest(test);
        System.out.println(tests);
        if (tests.size()!=0){
            return 0;
        }

        //插入数据库
        test.settId(UUID.randomUUID().toString());
        test.setStatus(0);
        test.settUrl(test.gettId());
        test.settCreateTime(TimeUtil.createTime());
        test.setIsDelete(0);
        System.out.println(test);
        int i = paperDao.addTest(test);
        System.out.println(i);
        return i;
    }

    //显示试卷
    public PageUtils getTestInfo(Map<String,Object> param){
        PageHelper.offsetPage(Integer.parseInt(param.get("offset").toString()),Integer.parseInt(param.get("pageSize").toString()));
        List<Test> testList = paperDao.getTestInfo(param.get("uId").toString());
        PageInfo<Test> testPageInfo = new PageInfo<>(testList);
        return new PageUtils(new Long(testPageInfo.getTotal()).intValue(),testPageInfo.getList());

    }

    //删除试卷及试卷的试题
    @Override
    public boolean deleteTestInfo(ArrayList<Test> testArrayList) {
        int count=0;
        int num=0;
        boolean result = false;

        //试卷数组，循环删除试卷
        outer:
        for (num=0;num<testArrayList.size();num++){

            ArrayList<AtTable> atTableInfo = paperDao.getAtTableInfo(testArrayList.get(num));
            for (count=0;count<atTableInfo.size();count++){
                //循环删除此试卷id 下的试题
                int i1 = paperDao.deleteTestAnswer(atTableInfo.get(count).getAtId());
                if (i1==0){
//                    ==0 说明删除失败，跳出循环
                    break;
                }
            }
//            判断删除此试卷下的试题，是否全部删除成功
            if (count==atTableInfo.size()){
                int i = paperDao.deleteTestInfo(testArrayList.get(num).gettId());
                if (i==0){
//                    result=true;
//                    删除试卷失败，跳出循环
                    break;
                }
            }else {
//                此试卷下的试题没有全部删除成功，跳出到外侧循环
                break outer;
            }
        }
        if (num==testArrayList.size()){
            result=true;
        }
        return result;
    }


    //给试卷添加试题
    @Override
    public boolean addTestAnswer(ArrayList<AtTable> atTables) {
        boolean result = true;
        for (int i =0;i<atTables.size();i++){
            Answer answer = paperDao.getAnswerById(atTables.get(i).getaId());
            if (answer!=null){
                atTables.get(i).setAtId(UUID.randomUUID().toString());
                atTables.get(i).setAtType(answer.getaType());
                atTables.get(i).setAtTopic(answer.getaTopic());
                atTables.get(i).setuId(answer.getuId());
                atTables.get(i).setAtA(answer.getaA());
                atTables.get(i).setAtB(answer.getaB());
                atTables.get(i).setAtC(answer.getaC());
                atTables.get(i).setAtD(answer.getaD());
                atTables.get(i).setcId(answer.getcId());
                atTables.get(i).setcName(answer.getcName());
                atTables.get(i).setAtAnswer(answer.getaAnswer());
                atTables.get(i).setAtScore(answer.getaScore());
                atTables.get(i).setAtModifyTime(answer.getaModifyTime());
                atTables.get(i).setIsDelete(answer.getIsDelete());

                int i1 = paperDao.addTestAnswer(atTables.get(i));
                if (i1==0){
                    result=false;
                    break;
                }
            }
        }

        return result;
    }

    //显示试卷的试题
    @Override
    public PageUtils getAtTableInfo(Map<String,Object> params) {
        PageHelper.offsetPage(Integer.parseInt(params.get("offset").toString()),Integer.parseInt(params.get("pageSize").toString()));
        Test test = new Test();
        test.settId(params.get("tId").toString());
        ArrayList<AtTable> atTableInfo = paperDao.getAtTableInfo(test);
        PageInfo<AtTable> atTablePageInfo = new PageInfo<>(atTableInfo);
        return new PageUtils(new Long(atTablePageInfo.getTotal()).intValue(),atTablePageInfo.getList());
    }

    //删除试卷的试题
    @Override
    public boolean deleteTestAnswer(ArrayList<AtTable> atTables) {
        int count=0;
        boolean result = false;
        for (count=0;count<atTables.size();count++){
            int i = paperDao.deleteTestAnswer(atTables.get(count).getAtId());
            if (i==0){
                break;
            }
        }
        if (count==atTables.size()){
            result=true;
        }
        return result;
    }


}
