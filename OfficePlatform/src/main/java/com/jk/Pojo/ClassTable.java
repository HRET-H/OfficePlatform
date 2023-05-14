package com.jk.Pojo;

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
public class ClassTable implements Serializable {
    private Integer Class_id;//班级编号
    private String Student_grade;//学生年级
    private String Class_name;//班级名
    private Integer Class_size;//班级人数
    private String Sourse_name;//班级课程
}
