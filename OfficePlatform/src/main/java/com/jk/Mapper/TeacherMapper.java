package com.jk.Mapper;

import com.jk.Pojo.TeacherList;

import java.util.List;

public interface TeacherMapper {
    public List<TeacherList> tfindAll();
    public Integer tdelete(int tnumber);
    public Integer tupdate(TeacherList teacherList);
    public Integer tfindAdd(TeacherList teacherList);
    public List<TeacherList> tmohu(int tnumber, String tname, String tmajor);
}
