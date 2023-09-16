package com.atguigu.spring6.autowired.service;

import com.atguigu.spring6.autowired.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements  UserService{

    // 注入dao
    // 第一种方式：属性注入
//    @Autowired //根据类型找到对应对象，完成注入
    private UserDao userDao;


    // 第二种方式：set方法注入
    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public void add() {
        System.out.println("Service...");
        userDao.add();
    }
}
