package com.weichuang.domain;

public class User {
    private String name;
    private int age;
    private Car car;
    public User(){}
    public User(String name, int age)
    {
        System.out.println("User(String name, int age)");
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void init(){
        System.out.println("初始化方法!");
    }
    public void destroy(){
        System.out.println("销毁方法!");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }
}
