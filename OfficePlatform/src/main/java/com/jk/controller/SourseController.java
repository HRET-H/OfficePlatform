package com.jk.controller;

import com.jk.pojo.SourseTable;
import com.jk.service.SourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Author:HRET Milky Way
 * Date:2023/5/15
 * version:1.0
 */
@Controller
@RequestMapping("/sourse")
public class SourseController {
    @Autowired
    private SourseService sourseService;

        //查询所有课程信息
        @RequestMapping("findAll.do")
        public String findAll(Model model){
            List<SourseTable> list= sourseService.findAll();
            model.addAttribute("list",list);
            return "major";
        }
    //  添加课程信息
        public String add (SourseTable sourseTable){
            sourseService.insert(sourseTable);
            return "findAll.do";
        }
    //  删除课程信息
        public String delete(int number){
            sourseService.delete(number);
            return "findAll.do";
        }
//  修改课程信息
        public String update(SourseTable sourseTable){
        sourseService.update(sourseTable);
        return "findAll.do";
        }

}
