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
public class SourseTable implements Serializable {
    private Integer Sourse_number;//课程编号
    private String Sourse_name;//课程名宇
    private String Sourse_type;//课程类型
    private String Teacher_name;//开课教师
    private Date Start_time;//开课时间
    private Date End_time;//结课时间
}
