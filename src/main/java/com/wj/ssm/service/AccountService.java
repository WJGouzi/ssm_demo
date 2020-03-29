package com.wj.ssm.service;

import com.wj.ssm.domain.AccountBean;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Project : ssm_demo
 * @Package : com.wj.ssm.service
 * @Author : Created By wangjun, Copyright © wangjun All Rights Reserved
 * @Date : 2020/3/29 15:25
 **/
public interface AccountService {

    /**
     * 查找所有的用户信息
     * @return
     */
    List<AccountBean> findAllAccount();

    /**
     * 新增账户
     * @param accountBean
     */
    void addAccount(AccountBean accountBean);
}
