package com.jk.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

/**
 * Author:Zhou Jin Yu
 * version:17
 * *Date:2023/5/9
 */
@Data
@ToString
@Component
@NoArgsConstructor
@AllArgsConstructor
public class StudentList implements Serializable {
    private Integer Student_number;//学生学号
    private String Student_name;//学生姓名
    private Integer Student_age;//学生年龄
    private String Student_grade;//学生年级
    private String Student_gender;//学生性别
    private String HomeAddress;//家庭住址
    private String Course_Elective;//选修课程
    private String Class_name;//班级名
    private Date Enrollment_time;//入学时间
    private String Student_IdNumber;//身份证号
    private Integer Student_phone;//学生手机号

}
