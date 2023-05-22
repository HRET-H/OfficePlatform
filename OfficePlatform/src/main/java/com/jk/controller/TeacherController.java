package com.jk.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jk.pojo.TeacherList;
import com.jk.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Author:HRET Milky Way
 * Date:2023/5/15
 * version:1.0
 */
@Controller
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    //    查询所有教师信息
    @RequestMapping("findAll")
    public String findAll(Model model,@RequestParam(defaultValue = "1",value = "pageNum") Integer pageNum){
        PageHelper.startPage(pageNum,5);
        List<TeacherList> list = teacherService.tfindAll();

        PageInfo<TeacherList> pageInfo = new PageInfo<TeacherList>(list);
        model.addAttribute("pageInfo",pageInfo);
        return "administrator/Teacher";
    }
    //添加教师信息
    @RequestMapping("add")
    public String findAdd(TeacherList teacherList){
        teacherService.tfindAdd(teacherList);
        return "teacher/findAll";
    }
    //删除教师信息
    @RequestMapping("delete")
    public String delete(int tnumber){
        teacherService.tdelete(tnumber);
        return "teacher/findAll";
    }
    //修改教师信息
    @RequestMapping("update")
    public String update(TeacherList teacherList){
        teacherService.tupdate(teacherList);
        return "teacher/findAll";
    }

    //模糊查询教师信息
    @RequestMapping("findByTeacher")
    public String tNumber(Model model,int number,String name,String magor){
        List<TeacherList> list =teacherService.tmohu(number,name,magor);
        model.addAttribute("list",list);
        return "administrator/Teacher";
    }

}
