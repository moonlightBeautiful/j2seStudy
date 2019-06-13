package com.java1234.c15Class;

/**
 * 通过反射得到Class类的对象
 */
public class Test01 {

    public static void main(String[] args) {
        System.out.println("通过对象获取Class对象" +
                "===============================================================================");
        Student student = new Student("张三", 18);
        System.out.println(student.getClass().getName());
        System.out.println("通过全类名获取Class对象" +
                "===============================================================================");
        Class<?> c = null;
        try {
            c = Class.forName("com.java1234.c15Class.Student");
            System.out.println(c.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("通过类的class" +
                "属性获取Class对象===============================================================================");
        System.out.println(Student.class.getName());
    }
}
