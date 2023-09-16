package com.atguigu.spring6.iocxml.diTest;

import java.util.Arrays;

// 员工类
public class Emp {

    // 对象类属性：员工属于某个部门
    private Dept dept;
    // 员工名称
    private String ename;
    // 员工年龄
    private String age;

    // 爱好
    private String[] loves;

    public String[] getLoves() {
        return loves;
    }

    public void setLoves(String[] loves) {
        this.loves = loves;
    }

    public void work(){
        System.out.println(ename+"Emp is working..."+age);
        dept.info();
        System.out.println(Arrays.toString(loves));
    }

    public Dept getDept() {
        return dept;
    }

    public String getEname() {
        return ename;
    }

    public String getAge() {
        return age;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
