package com.jk.Mapper;

import com.jk.Pojo.AchievementTable;

import java.util.List;

public interface AchievementMapper {
    /**
     * 查询所有成绩
     * @return 成绩列表
     * @return 账户列表
     */
    List<AchievementTable> findAll();

}