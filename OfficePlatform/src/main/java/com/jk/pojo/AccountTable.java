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
 * *Date:2023/5/10
 */
@Data
@ToString
@Component
@NoArgsConstructor
@AllArgsConstructor
public class AccountTable implements Serializable {
    private Integer Account_id;//账户id
    private Integer password;//账户密码
    private Integer Authority_level;//账户权限级别 (1.学生 2.老师 3.管理员)
}
