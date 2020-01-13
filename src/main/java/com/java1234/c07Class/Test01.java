package com.java1234.c07Class;

/**
 * 通过 对象、类全名、类 反射得到Class类的对象（记录对象的类的信息）
 */
public class Test01 {

    public static void main(String[] args) {
        System.out.println("通过对象获取Class对象（也就是类）");
        Student student = new Student("张三", 18);
        System.out.println(student.getClass().getName());
        System.out.println("通过全类名（包路径+类名）获取Class对象（也就是类）");
        try {
            Class<?> c = Class.forName("com.java1234.c15Class.Student");
            System.out.println(c.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("通过类的class属性获取Class对象（也就是类）");
        String className = Student.class.getName();
        System.out.println(className);
    }
}
