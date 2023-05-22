package com.jk.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jk.pojo.ClassTable;
import com.jk.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

/**
 * Author:HRET Milky Way
 * Date:2023/5/15
 * version:1.0
 */
@Controller
@RequestMapping("/class")
public class ClassController {
    @Autowired
    private ClassService classService;

    //分页查询
    @RequestMapping ( "/findByPage" )
    public String getAllPerson(Model model, @RequestParam(defaultValue = "1",value = "pageNum") Integer pageNum){
        PageHelper.startPage(pageNum,7);
        List<ClassTable> list = classService.findClassList(null);

        PageInfo<ClassTable> pageInfo = new PageInfo<ClassTable>(list);
        model.addAttribute("pageInfo",pageInfo);
        return "/administrator/class";
    }

    @RequestMapping ( "/findByClass" )
    public String findByClass(Model model, String Student_grade , String Class_name , @RequestParam(defaultValue = "1",value = "pageNum") Integer pageNum){
        PageHelper.startPage(pageNum,100);
        ClassTable classTable = new ClassTable();
        classTable.setStudent_grade(Student_grade);
        classTable.setClass_name(Class_name);
        List<ClassTable> list = classService.findClassList(classTable);

        PageInfo<ClassTable> pageInfo = new PageInfo<ClassTable>(list);
        model.addAttribute("pageInfo",pageInfo);
        return "/administrator/class";
    }

    //添加班级
    @RequestMapping("/insert")
    public String insert(ClassTable classTable){
        classService.insert(classTable);
        return "/class/findByPage";
    }
//删除班级信息
    @RequestMapping("/delete")
    public String delete(Integer Class_id){
        classService.delete(Class_id);
        return "/class/findByPage";
    }
//    修改班级信息
    public String update(ClassTable classTable){

        classService.update(classTable);
        return "all.do";
    }

    @RequestMapping("/add")
    public String add(Model model){
        List<ClassTable> list = classService.findClassList(null);
        model.addAttribute("list",list);
        return "add/addclass";
    }
}
