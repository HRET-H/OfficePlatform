package com.jk.service;

import com.jk.pojo.TeacherList;

import java.util.List;

/**
 * Author:HRET Milky Way
 * Date:2023/5/15
 * version:1.0
 */
public interface TeacherService {

     List<TeacherList> tfindAll();//查询老师所有信息

     Integer tdelete(int tnumber);//删除教师信息

     Integer tupdate(TeacherList teacherList);//修改教师信息

     Integer tfindAdd(TeacherList teacherList);//添加教师信息

     List<TeacherList> tmohu(int tnumber, String tname, String tmajor);//模糊查询教师信息
}
