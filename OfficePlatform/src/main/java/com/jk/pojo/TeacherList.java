package com.jk.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.io.Serializable;

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
public class TeacherList implements Serializable {
    private Integer Teacher_number;//教师编号
    private String Teacher_name;//教师姓名
    private String Teacher_gender;//教师性别
    private String Teacher_age;//教师年龄
    private String Teacher_phone;//教师手机号
    private String Teacher_major;//教师专业
}
