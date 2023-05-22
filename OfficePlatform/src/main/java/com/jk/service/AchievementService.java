package com.jk.service;

import com.jk.pojo.AchievementTable;

import java.util.List;

/**
 * Author:HRET Milky Way
 * Date:2023/5/15
 * version:1.0
 */
public interface AchievementService {

    List<AchievementTable> findAll();//查询所有成绩
    
    Integer insert(AchievementTable achievementTable); //添加成绩
    
    Integer delete(int number);//删除成绩
    
    Integer update(AchievementTable achievementTable);//修改成绩
}
