package com.jk.service;

import com.jk.pojo.AccountTable;

import java.util.List;

/**
 * Author:HRET Milky Way
 * Date:2023/5/15
 * version:1.0
 */
public interface AccountService{

    List<AccountTable> findAll();//查询账户

    Integer insert(AccountTable accountTable);//添加账户信息

    Integer delete(int id);//删除账户信息

    Integer update(AccountTable accountTable);//修改账户信息
}
