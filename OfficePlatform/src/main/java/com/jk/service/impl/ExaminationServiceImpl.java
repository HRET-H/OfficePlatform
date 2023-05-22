package com.jk.service.impl;

import com.jk.mapper.ExaminationMapper;
import com.jk.pojo.ExaminationForm;
import com.jk.service.ExaminationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author:HRET Milky Way
 * Date:2023/5/15
 * version:1.0
 */
@Service
public class ExaminationServiceImpl implements ExaminationService {

    @Autowired
    private ExaminationMapper examinationMapper;

    //查询考试所有信息
    @Override
    public List<ExaminationForm> findAll() {
        return examinationMapper.findAll();
    }
    //添加考试信息
    @Override
    public Integer insert(ExaminationForm examinationForm) {
        return examinationMapper.insert(examinationForm);
    }
    //删除考试信息
    @Override
    public Integer delete(int number) {
        return examinationMapper.delete(number);
    }
    //修改考试信息
    @Override
    public Integer update(ExaminationForm examinationForm) {
        return examinationMapper.update(examinationForm);
    }
}
