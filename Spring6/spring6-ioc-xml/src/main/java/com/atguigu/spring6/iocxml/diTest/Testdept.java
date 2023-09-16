package com.atguigu.spring6.iocxml.diTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testdept {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-diList.xml");
        Dept dept = context.getBean("dept",Dept.class);
        dept.info();
    }
}
