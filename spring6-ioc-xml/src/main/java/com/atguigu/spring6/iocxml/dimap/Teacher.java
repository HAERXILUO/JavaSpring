package com.atguigu.spring6.iocxml.dimap;

public class Teacher {
    private String teacherId;
    private String tearcherName;

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public void setTearcherName(String tearcherName) {
        this.tearcherName = tearcherName;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public String getTearcherName() {
        return tearcherName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId='" + teacherId + '\'' +
                ", tearcherName='" + tearcherName + '\'' +
                '}';
    }
}
