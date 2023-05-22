package com.jk.service.impl;

import com.jk.mapper.AccountMapper;
import com.jk.pojo.AccountTable;
import com.jk.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author:HRET Milky Way
 * Date:2023/5/15
 * version:1.0
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    //查询账户信息
    @Override
    public List<AccountTable> findAll() {
        return accountMapper.findAll();
    }

    //添加账户信息
    @Override
    public Integer insert(AccountTable accountTable) {
        return accountMapper.insert(accountTable);
    }
    //删除账户信息
    @Override
    public Integer delete(int id) {
        return accountMapper.delete(id);
    }
    //修改账户信息
    @Override
    public Integer update(AccountTable accountTable) {
        return accountMapper.update(accountTable);
    }
}
