package com.wj.ssm.service.impl;

import com.wj.ssm.dao.AccountDao;
import com.wj.ssm.domain.AccountBean;
import com.wj.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Project : ssm_demo
 * @Package : com.wj.ssm.service.impl
 * @Author : Created By wangjun, Copyright © wangjun All Rights Reserved
 * @Date : 2020/3/29 15:29
 **/
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<AccountBean> findAllAccount() {
        System.out.println("业务层:查询所有的账户");
        return accountDao.findAllAccount();
    }

    @Override
    public void addAccount(AccountBean accountBean) {
        System.out.println("业务层:新增账户");
        accountDao.addAccount(accountBean);
    }
}
