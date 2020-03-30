package com.wj.ssm.dao;

import com.wj.ssm.domain.AccountBean;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Project : ssm_demo
 * @Package : com.wj.ssm.dao
 * @Author : Created By wangjun, Copyright © wangjun All Rights Reserved
 * @Date : 2020/3/29 15:26
 **/
@Repository
public interface AccountDao {

    /**
     * 查找所有的用户信息
     * @return
     */
    @Select("select * from t_account")
    List<AccountBean> findAllAccount();

    /**
     * 新增账户
     * @param accountBean
     */
    @Insert("insert into t_account(name, balance) values(#{name}, #{balance})")
    void addAccount(AccountBean accountBean);

}
