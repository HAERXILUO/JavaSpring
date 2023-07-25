package com.atguigu.spring6.iocxml.diTest;

import java.util.List;

public class Dept {
    private String dname;

    // 一个部门很多员工
    private List<Emp> empList;

    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public void info(){
        System.out.println("部门名称:"+dname);
        for (Emp emp:empList){
            System.out.println(emp.getEname());
        }
    }

}
