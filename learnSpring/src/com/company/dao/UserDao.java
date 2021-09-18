package com.company.dao;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    @Value("113")
    private int age;

    public void sayhello(){
        System.out.println("你好,我是Dao,我"+age+"了");
    }



}
