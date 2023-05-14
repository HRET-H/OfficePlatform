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
public class ExaminationForm implements Serializable {
    private Integer Examination_number;//考试编号
    private Date Examination_time;//考试时间
    private String Sourse_name;//课程名字
}
