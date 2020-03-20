package com.ims.c01basic.c07Class;

import java.lang.reflect.Constructor;

/**
 * ͨ��Class��Ķ����ȡʵ��
 * 1.Class��Ķ���.newInstance()��Ĭ�ϵ��õ����޲������췽��
 * 2.��ȡ���췽����
 */
public class C02GetObjectByClassObject {

    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("com.ims.c01basic.c07Class.Student");
            try {
                System.out.println("ͨ��newInstance��ȡʵ����");
                Student s = (Student) c.newInstance();
                s.setName("����");
                s.setAge(28);
                System.out.println(s);
            } catch (InstantiationException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            try {
                //�������й��췽����˳������
                System.out.println("ͨ��getConstructors��ȡ���췽�������췽��newInstance��ȡʵ����");
                Constructor<?>[] cons = c.getConstructors();
                Student s = (Student) cons[0].newInstance("����", 28);
                System.out.println(s);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
