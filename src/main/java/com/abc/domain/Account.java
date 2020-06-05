package com.abc.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 账户实体类。
 */
public class Account implements Serializable {
    private String username;
    private String password;
    private Double money;

    // 成员变量含引用类型
    private Address address;

    // 为了演示自定义类型转换器而加入的字段
    private Date birthday;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", money=" + money +
                ", address=" + address +
                ", birthday=" + birthday +
                '}';
    }
}
