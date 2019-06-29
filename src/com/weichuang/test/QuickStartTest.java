package com.weichuang.test;

import com.weichuang.annotation.Person;
import com.weichuang.domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuickStartTest {
    @Test
    public void testFn(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        User user = (User)applicationContext.getBean("user3");
        user.setName("小王");
        System.out.println(user);
    }
    @Test
    public void testFn1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/weichuang/set_zr/applicationContext.xml");
        User user = (User)applicationContext.getBean("user");
        System.out.println(user);

    }
    @Test
    public void testFn2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/weichuang/set_zr/applicationContext.xml");
        User user = (User) applicationContext.getBean("user1");
        System.out.println(user);

    }
    @Test
    public void testFn3(){     //自动装配
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person)applicationContext.getBean("person1");
        System.out.println(person);
        applicationContext.close();
    }
    /*@Test
    public void testFn4(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/weichuang/set_zr/applicationContext.xml");
        User user = (User) applicationContext.getBean("user2");
        System.out.println(user);
    }*/


}
