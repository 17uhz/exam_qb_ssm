package com.tledu.cn.dao;

import com.tledu.cn.pojo.Answer;
import com.tledu.cn.pojo.AtTable;
import com.tledu.cn.pojo.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:17
 * Date:2021-01-23 14:25
 * Description:<描述>
 */

@Mapper
public interface PaperDao {
    int addTest(Test test);  //添加试卷
    List<Test> onlyOneTest(Test test);  //查询试卷表中 此标题的试卷是否存在 保证唯一
    List<Test> getTestInfo(String param);  //查询当前用户下的所有试卷
    ArrayList<AtTable> getAtTableInfo(Test test);  //根据试卷id 查询所有此试卷 下的试题
    int deleteTestAnswer(String param);  //删除试卷的试题
    int deleteTestInfo(String param);    //删除试卷
    Answer getAnswerById(String param);  //通过 at_id 查找answer 表中的试题，添加到 at_table 中
    int addTestAnswer(AtTable atTable);  //给试卷添加相应的试题


}
