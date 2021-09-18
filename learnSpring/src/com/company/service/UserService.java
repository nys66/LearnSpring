package com.company.service;


import com.company.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private  UserDao userDao;

     @Value("ning")
    private String name;

    @Value("12")
    private int age;



    public void sayhello(){
        System.out.println("你好"+"我是"+name+",我"+age+"岁了");
        userDao.sayhello();
    }




}
