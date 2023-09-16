package com.atguigu.spring6.iocxml.di;

public class Book {
    private String bname;
    private String author;

    private String others;

    public Book() {
        System.out.println("无参数构造执行了...");
    }

    public Book(String bname, String author){
        System.out.println("有参数构造执行了...");
        this.bname = bname;
        this.author = author;
    }


    // 生成set方法

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public String getBname() {
        return bname;
    }

    public String getAuthor() {
        return author;
    }


    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", author='" + author + '\'' +
                ", others='" + others + '\'' +
                '}';
    }

    public static void main(String[] args) {
        //set 方法注入
        Book book = new Book();
        book.setBname("java");
        book.setAuthor("shangguigu");

        //通过构造器注入
        Book book1 = new Book("c++","尚硅谷");

    }

}
