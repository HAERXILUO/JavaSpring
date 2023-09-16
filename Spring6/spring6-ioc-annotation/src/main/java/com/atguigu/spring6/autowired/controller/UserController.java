package com.atguigu.spring6.autowired.controller;


import com.atguigu.spring6.autowired.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    //注入Service
    // 第一种方式：属性注入
//    @Autowired //根据类型找到对应对象，完成注入
    private UserService userService;

    // 第二种方式：set方法注入
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void add(){
        System.out.println("Controller");
        userService.add();
    }



}
