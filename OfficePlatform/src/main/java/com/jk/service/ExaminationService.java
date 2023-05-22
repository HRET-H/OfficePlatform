package com.jk.service;

import com.jk.pojo.ClassTable;
import com.jk.pojo.ExaminationForm;

import java.util.List;

/**
 * Author:HRET Milky Way
 * Date:2023/5/15
 * version:1.0
 */
public interface ExaminationService {

    List<ExaminationForm> findAll();//查询考试所有信息

    Integer insert(ExaminationForm examinationForm);//添加考试信息

    Integer delete(int number);//删除考试信息

    Integer update(ExaminationForm examinationForm);//修改考试信息
}