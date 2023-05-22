package com.jk.pojo;

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
 * *Date:2023/5/11
 */
@Data
@ToString
@Component
@NoArgsConstructor
@AllArgsConstructor
public class AchievementTable implements Serializable {
    private Integer Examination_number;//考试编号
    private Date Examination_time;//考试时间
    private Integer Student_number;//学生学号
    private String Student_name;//学生姓名
    private Integer Student_achievement; //学生成绩
}
