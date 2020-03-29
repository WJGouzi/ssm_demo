package com.wj.ssm.domain;

import java.io.Serializable;

/**
 * @Project : ssm_demo
 * @Package : com.wj.ssm.dao
 * @Author : Created By wangjun, Copyright © wangjun All Rights Reserved
 * @Date : 2020/3/29 15:23
 **/
public class AccountBean implements Serializable {

    private Integer id;

    private String name;

    private Double balance;

    public AccountBean() {
    }

    public AccountBean(Integer id, String name, Double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "AccountBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
