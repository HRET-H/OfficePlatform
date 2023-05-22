package com.jk.util;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Author:HRET Milky Way
 * Date:2023/5/18
 * version:1.0
 */
@Data
@AllArgsConstructor
public class LayuiUtilsJSON {
    private String msg; //提示信息
    private Integer code; //0表示成功
    private Integer count; //总条数
    private Object data; //数据
}
