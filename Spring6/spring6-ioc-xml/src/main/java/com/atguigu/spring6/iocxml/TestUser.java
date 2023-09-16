package com.atguigu.spring6.iocxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        //1 根据id获取bean
        User user = (User)context.getBean("user");
        System.out.println("1 根据id获取bean:"+user);

        //2 根据类型获取bean
        User user2 = context.getBean(User.class);
        System.out.println("2 根据类型获取bean:"+user2);

        //3 根据id+类型获取bean
        User user3 =context.getBean("user",User.class);
        System.out.println("3 根据id+类型获取bean:"+user3);
    }

}
