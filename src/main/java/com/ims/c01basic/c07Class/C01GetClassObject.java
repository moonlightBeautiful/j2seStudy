package com.ims.c01basic.c07Class;

/**
 * 通过 对象、类全名、类反射，得到Class类的对象（也就是类）
 */
public class C01GetClassObject {

    public static void main(String[] args) {
        System.out.println("通过对象.getClass()获取Class对象（也就是类）");
        Student student = new Student("张三", 18);
        System.out.println(student.getClass().getName());

        System.out.println("通过全类名（包路径+类名）获取Class对象（也就是类）");
        try {
            Class<?> c = Class.forName("com.ims.c01basic.c07Class.Student");
            System.out.println(c.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("通过类的class属性获取Class对象（也就是类）");
        String className = Student.class.getName();
        System.out.println(className);
    }
}
