package com.wj.ssm.test;

import com.wj.ssm.dao.AccountDao;
import com.wj.ssm.domain.AccountBean;
import com.wj.ssm.service.impl.AccountServiceImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.InputStream;
import java.util.List;

/**
 * @Project : ssm_demo
 * @Package : com.wj.ssm.test
 * @Author : Created By wangjun, Copyright © wangjun All Rights Reserved
 * @Date : 2020/3/29 15:51
 **/

public class AccountTest {

    @Test
    public void test1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountServiceImpl accountService = ac.getBean("accountService", AccountServiceImpl.class);
        accountService.findAllAccount();
    }

    @Test
    public void run1() throws Exception {
        // 加载配置文件
        // 创建工厂
        InputStream inputStream = Resources.getResourceAsStream("mybatisConfig.xml");
        // 创建sqlSession对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = factory.openSession();
        // 获取代理对象
        AccountDao dao = session.getMapper(AccountDao.class);
        // 调用查询的方法
        List<AccountBean> list = dao.findAllAccount();
        for (AccountBean account : list) {
            System.out.println(account);
        }
        // 释放资源
        session.close();
        inputStream.close();
    }


    @Test
    public void run2() throws Exception {
        AccountBean accountBean = new AccountBean();
        accountBean.setName("wangqiao");
        accountBean.setBalance(124123D);

        // 加载配置文件
        // 创建工厂
        InputStream inputStream = Resources.getResourceAsStream("mybatisConfig.xml");
        // 创建sqlSession对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = factory.openSession();
        // 获取代理对象
        AccountDao dao = session.getMapper(AccountDao.class);
        dao.addAccount(accountBean);
        session.commit();
        // 释放资源
        session.close();
        inputStream.close();
    }
}
