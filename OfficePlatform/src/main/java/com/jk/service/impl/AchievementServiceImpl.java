package com.jk.service.impl;

import com.jk.mapper.AchievementMapper;
import com.jk.pojo.AchievementTable;
import com.jk.service.AchievementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author:HRET Milky Way
 * Date:2023/5/15
 * version:1.0
 */
@Service
public class AchievementServiceImpl implements AchievementService {
    @Autowired
    private AchievementMapper achievementMapper;
    //查询所有成绩
    @Override
    public List<AchievementTable> findAll() {
        return achievementMapper.findAll();
    }

    //添加成绩
    @Override
    public Integer insert(AchievementTable achievementTable) {
        return achievementMapper.insert(achievementTable);
    }
    //删除成绩
    @Override
    public Integer delete(int number) {
        return achievementMapper.delete(number);
    }
    //修改成绩
    @Override
    public Integer update(AchievementTable achievementTable) {
        return achievementMapper.update(achievementTable);
    }

}
