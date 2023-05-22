package com.jk.mapper;

import com.jk.Pojo.AccountTable;

import java.util.List;

@Mapper
public interface AccountMapper {

    /**
     * 查询所有账户
     * @return 账户列表
     */
    List<AccountTable> findAll();
}
