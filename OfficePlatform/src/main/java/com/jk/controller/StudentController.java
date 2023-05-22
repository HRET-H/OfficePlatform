package com.jk.controller;

import com.jk.pojo.StudentList;
import com.jk.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import java.util.List;

/**
 * Author:HRET Milky Way
 * Date:2023/5/15
 * version:1.0
 */
@Controller
@RequestMapping("student")
public class StudentController {

        @Autowired
    private StudentService studentListService;
    //    查询所有学生信息
    @RequestMapping("findAll")
    public String findAll(Model model){
        List<StudentList> list =studentListService.findAll();
        model.addAttribute("list",list);
        return "Studentmanagement";
    }
    //添加学生信息
    public String add(StudentList studentList){
        studentListService.sinsert(studentList);
        return "dall.do";
    }
//    删除学生信息
    public String delete(int snumber){
        studentListService.sdelete(snumber);
        return "sall.do";
    }
//   修改学生信息
    public String update(StudentList studentList){
        studentListService.supdate(studentList);
        return "sall.do";
    }

}
