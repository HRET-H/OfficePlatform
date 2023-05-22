package com.jk.service;

import com.jk.pojo.SourseTable;

import java.util.List;

/**
 * Author:HRET Milky Way
 * Date:2023/5/15
 * version:1.0
 */
public interface SourseService {

    List<SourseTable> findAll();//查询课程所有信息

    Integer insert(SourseTable sourseTable);//添加课程信息

    Integer delete(int number);//删除课程信息

    Integer update(SourseTable sourseTable);//修改课程信息
}
