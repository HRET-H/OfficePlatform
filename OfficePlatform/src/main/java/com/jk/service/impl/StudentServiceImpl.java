package com.jk.service.impl;

import com.jk.mapper.StudentMapper;
import com.jk.pojo.StudentList;
import com.jk.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author:HRET Milky Way
 * Date:2023/5/15
 * version:1.0
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    //查询所有学生信息
    @Override
    public List<StudentList> findAll() {
        return studentMapper.findAll();
    }
    //添加学生信息
    @Override
    public Integer sinsert(StudentList studentList) {
        return studentMapper.sinsert(studentList);
    }
    //删除学生信息
    @Override
    public Integer sdelete(int snumber) {
        return studentMapper.sdelete(snumber);
    }
    //修改学生信息
    @Override
    public Integer supdate(StudentList studentList) {
        return studentMapper.supdate(studentList);
    }

}
