package com.jk.controller;

import com.jk.pojo.AccountTable;
import com.jk.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import java.util.List;

/**
 * Author:HRET Milky Way
 * Date:2023/5/15
 * version:1.0
 */
@Controller
@RequestMapping("Achieve")
public class AccountController {
    @Autowired
    private AccountService accountService;

    //查询账户信息
    @RequestMapping("findAll")
    public String findAll(Model model){
        List<AccountTable> list=accountService.findAll();
        model.addAttribute("list",list);
        return "course";
    }
    //添加账户信息
    @RequestMapping("insert")
    public String insert (AccountTable accountTable){
        accountService.insert(accountTable);
        return "aall.do";
    }
    //删除账户信息
    @RequestMapping("delete")
    public String delete(int id){
        accountService.delete(id);
        return "aall.do";
    }
    //修改账户信
    @RequestMapping("update")
    public String update(AccountTable accountTable){
        accountService.update(accountTable);
        return "aall.do";
    }
}
