package com.ims.c01basic.c07Class;

public class Student extends People {

    private String name;
    private Integer age;
    public String wife = "pink";
    public static final String COLOR = "pink";

    public Student() {
    }

    public Student(String name, Integer age) {
        super();
        this.name = name;
        this.age = age;
    }

    private Student(Integer age) {
        super();
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    public static void say() {
        System.out.println("说你好");
    }

    private void eat() {
        System.out.println("吃馒头");
    }

    @Override
    public void run() {
        System.out.println("子跑");
    }
}
