package com.jk.controller;

import com.jk.pojo.AchievementTable;
import com.jk.service.AchievementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Author:HRET Milky Way
 * Date:2023/5/15
 * version:1.0
 */
@Controller
@RequestMapping("/achievement")
public class AchievementController {
    @Autowired
    private AchievementService achievementService;

    //查询所有成绩
    public String findAll(Model model){
       List<AchievementTable> list= achievementService.findAll();
       model.addAttribute("list",list);
       return "achievement";
    }
    @RequestMapping("/insert")
    //添加成绩
    public String insert(AchievementTable achievementTable){
        achievementService.insert(achievementTable);
        return "all.do";
    }
    //删除成绩
    public String delete(int number){
        achievementService.delete(number);
        return "all.do";
    }
    //修改成绩
    public String update(AchievementTable achievementTable){
        achievementService.update(achievementTable);
        return "all.do";
    }
}
