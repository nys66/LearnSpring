package test;

import com.company.service.UserService;
import com.company.dao.UserDao;
import com.company.service.UserService1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public void test_byXML(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1_xml.xml");
        UserService1 myuser=context.getBean("user1", UserService1.class);
        System.out.println(myuser);
        myuser.sayhello();
    }


    @Test
    public void test_byAnnotation(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean2_annotation.xml");
        UserService userService=context.getBean("userService",UserService.class);
        UserDao userDao=context.getBean("userDao",UserDao.class);
        userDao.sayhello();
        userService.sayhello();
    }

}
