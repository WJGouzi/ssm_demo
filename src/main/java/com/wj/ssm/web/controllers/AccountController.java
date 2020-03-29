package com.wj.ssm.web.controllers;

import com.wj.ssm.domain.AccountBean;
import com.wj.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Project : ssm_demo
 * @Package : com.wj.ssm.web.controllers
 * @Author : Created By wangjun, Copyright © wangjun All Rights Reserved
 * @Date : 2020/3/29 15:25
 **/
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAllAccount() {
        System.out.println("查找所有的用户信息");
        List<AccountBean> allAccount = accountService.findAllAccount();
        System.out.println(allAccount);
        return "success";
    }

    @RequestMapping("/saveAccount")
    public void saveAccount(AccountBean account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("保存");
        accountService.addAccount(account);
        response.sendRedirect(request.getContextPath() + "/account/findAll");
    }
}
