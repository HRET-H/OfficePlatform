package com.jk.service.impl;

import com.jk.mapper.ClassMapper;
import com.jk.pojo.ClassTable;
import com.jk.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author:HRET Milky Way
 * Date:2023/5/15
 * version:1.0
 */
@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    private ClassMapper classMapper;

    //查询所有班级信息
    @Override
    public List<ClassTable> findClassList(ClassTable classTable) {
        return classMapper.findClassList(classTable);
    }

    //添加班级信息
    @Override
    public Integer insert(ClassTable classTable) {
        return classMapper.insert(classTable);
    }
    //删除班级信息
    @Override
    public Integer delete (int classid){
        return classMapper.delete(classid);
    }
    //修改班级信息
    @Override
    public Integer update(ClassTable classTable) {
        return classMapper.update(classTable);
    }

}
