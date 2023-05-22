package com.jk.service;

import com.jk.pojo.StudentList;

import java.util.List;

/**
 * Author:HRET Milky Way
 * Date:2023/5/15
 * version:1.0
 */
public interface StudentService {

    List<StudentList> findAll();//查询学生全部信息

    Integer sinsert(StudentList studentList);//添加学生信息

    Integer sdelete(int snumber);//删除学生信息

    Integer supdate(StudentList studentList);//修改学生信息

}
