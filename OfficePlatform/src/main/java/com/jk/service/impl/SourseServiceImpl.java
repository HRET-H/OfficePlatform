package com.jk.service.impl;

import com.jk.mapper.SourseMapper;
import com.jk.pojo.SourseTable;
import com.jk.service.SourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author:HRET Milky Way
 * Date:2023/5/15
 * version:1.0
 */
@Service
public class SourseServiceImpl implements SourseService {
    @Autowired
    private SourseMapper sourseMapper;
    //查询课程所有信息
    @Override
    public List<SourseTable> findAll() {
        return sourseMapper.findAll();
    }
    //添加课程信息
    @Override
    public Integer insert(SourseTable sourseTable) {
        return sourseMapper.insert(sourseTable);
    }
    //删除课程信息
    @Override
    public Integer delete(int number) {
        return sourseMapper.delete(number);
    }
    //修改课程信息
    @Override
    public Integer update(SourseTable sourseTable) {
        return sourseMapper.update(sourseTable);
    }
}
