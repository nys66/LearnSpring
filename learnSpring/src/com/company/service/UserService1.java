package com.company.service;

public class UserService1 {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sayhello(){
        System.out.println("你好，我是Service");
    }
}
