package com.atguigu.spring6;

public class User {

    private  String name;
    private Person person;
//    无参数构造 执行了
    public User(){
        System.out.println("0");
    }

    public void add(){
        System.out.println("add...");
    }

}
