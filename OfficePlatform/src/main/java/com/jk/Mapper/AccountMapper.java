package com.jk.Mapper;

import com.jk.Pojo.AccountTable;

import java.util.List;

public interface AccountMapper {

    /**
     * 查询所有账户
     * @return 账户列表
     */
    List<AccountTable> findAll();
}
