package com.weichuang.annotation;

import com.weichuang.domain.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
@Service(value = "person1")
@Scope("singleton")
public class Person {
    private String name;
    private int no;
    //@Autowired  //自动装配
    @Resource(name = "car1")
    private Car car;

    public String getName() {
        return name;
    }
    @Value("dabao")   //set方式注入
    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    @Value("10086")
    public void setNo(int no) {
        this.no = no;
    }

    @PostConstruct
    public void init(){
        System.out.println("初始化");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("销毁");
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", no=" + no +
                ", car=" + car +
                '}';
    }
}
