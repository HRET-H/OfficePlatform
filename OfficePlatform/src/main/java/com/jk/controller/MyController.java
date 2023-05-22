package com.jk.controller;


import com.jk.pojo.ClassTable;
import com.jk.service.ClassService;
import lombok.SneakyThrows;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.FileWriter;
import java.util.List;

/**
 * Author:HRET Milky Way
 * Date:2023/5/16
 * version:1.0
 */
@Controller

public class MyController {
    @Autowired
    private ClassService classService;

    @SneakyThrows
    @RequestMapping("MyFindAll")
    public String findAll(){
        List<ClassTable> list = classService.findClassList(null);
        //将查询到的结果按照键值对的形式存放到JSONObject中
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("msg","");
        jsonObject.put("code",0);
        jsonObject.put("count",1000);
        jsonObject.put("data",list);
        //将json字符串写入到JSON格式文件中
        String json = jsonObject.toString();
        FileWriter fileWriter = new FileWriter("E:/Desktop/前端/Web/校园数字化办公平台/OfficePlatform/src/main/resources/static/api/table.json");
        //通过循环将json字符串按照指定格式进行缩进或者换行
        for (int i = 0; i < json.length(); i++) {
            char c = json.charAt(i);
            if (c == '[' || c == '{') {
                fileWriter.write(c + "\n");
                fileWriter.write("\t");
            } else if (c == ']' || c == '}') {
                fileWriter.write("\n" + c);
            } else if (c == ',') {
                fileWriter.write(c + "\n");
                fileWriter.write("\t");
            } else {
                System.out.println(c);
                fileWriter.write(c);
            }
        }
        System.out.println(jsonObject);
//        fileWriter.write(jsonObject.toString());
//        fileWriter.flush();
        fileWriter.close();

        return "../static/administrator/table";
    }
}
