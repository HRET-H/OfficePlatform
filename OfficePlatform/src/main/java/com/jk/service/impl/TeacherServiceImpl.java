package com.jk.service.impl;

import com.jk.mapper.TeacherMapper;
import com.jk.pojo.TeacherList;
import com.jk.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author:HRET Milky Way
 * Date:2023/5/15
 * version:1.0
 */
@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;
    //查询老师所有信息
    @Override
    public List<TeacherList> tfindAll() {
        return teacherMapper.tfindAll();
    }
    //删除教师信息
    @Override
    public Integer tdelete(int tnumber) {
        return teacherMapper.tdelete(tnumber);
    }
    //修改教师信息
    @Override
    public Integer tupdate(TeacherList teacherList) {
        return teacherMapper.tupdate(teacherList);
    }
    //添加教师信息
    @Override
    public Integer tfindAdd(TeacherList teacherList) {
        return teacherMapper.tfindAdd(teacherList);
    }
    //模糊查询教师信息
    @Override
    public List<TeacherList> tmohu(int tnumber, String tname, String tmajor) {
        return teacherMapper.tmohu(tnumber,tname,tmajor);
    }
}
