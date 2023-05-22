package com.jk.controller;

import com.jk.pojo.ExaminationForm;
import com.jk.service.ExaminationService;
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
@RequestMapping("examination")
public class ExaminationController {

    @Autowired
    private ExaminationService examinationService;
//查询班级信息
    @RequestMapping("findAll")
    public String findAll(Model model){
        List<ExaminationForm> list= examinationService.findAll();
        model.addAttribute("list",list);
        list.forEach(System.out::println);
        return "administrator/examination";
    }
//添加班级信息
    public String add(ExaminationForm examinationForm){
        examinationService.insert(examinationForm);
        return "eall.do";
    }
//删除班级信息
    public String delete(int number){
        examinationService.delete(number);
        return "eall.do";
    }
//   修改班级信息
    public String update(ExaminationForm examinationForm){
        examinationService.update(examinationForm);
        return "eall.do";
    }


}
