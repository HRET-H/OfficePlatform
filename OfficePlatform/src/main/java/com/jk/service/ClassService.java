package com.jk.service;

import com.jk.pojo.ClassTable;

import java.util.List;
import java.util.Map;

/**
 * Author:HRET Milky Way
 * Date:2023/5/15
 * version:1.0
 */
public interface ClassService {

    List<ClassTable> findClassList(ClassTable classTable);//班级所有信息

    Integer insert(ClassTable classTable);//添加班级信息

    Integer delete(int id);//删除班级信息

    Integer update(ClassTable classTable);//修改班级信息
}
