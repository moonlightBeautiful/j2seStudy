package com.ims.c01basic.c07Class;

/**
 * ͨ�� ������ȫ�����෴�䣬�õ�Class��Ķ���Ҳ�����ࣩ
 */
public class C01GetClassObject {

    public static void main(String[] args) {
        System.out.println("ͨ������.getClass()��ȡClass����Ҳ�����ࣩ");
        Student student = new Student("����", 18);
        System.out.println(student.getClass().getName());

        System.out.println("ͨ��ȫ��������·��+��������ȡClass����Ҳ�����ࣩ");
        try {
            Class<?> c = Class.forName("com.ims.c01basic.c07Class.Student");
            System.out.println(c.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("ͨ�����class���Ի�ȡClass����Ҳ�����ࣩ");
        String className = Student.class.getName();
        System.out.println(className);
    }
}
