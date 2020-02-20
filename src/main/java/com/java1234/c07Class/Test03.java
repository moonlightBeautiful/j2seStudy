package com.java1234.c07Class;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * ͨ��Class��Ķ��󣨼�¼����������Ϣ�� ��ȡ����������
 * <p>
 * ��Declared���ص��ǵ�ǰClass�����ࣩ����ȷ��������Method/Field(������public��protected��default��private��������������򸸽ӿڵ�Method/Field)
 * ����Declared�ķ��ص��ǵ�ǰClass�����ࣩ��ʵ���ܵ��õ�����public Method/Field�������Ӹ���򸸽ӿڼ̳ж���û����д��public Method/Field��
 */
public class Test03 {

    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("com.java1234.c07Class.Student");
            /**
             * ��Declared���ص��ǵ�ǰ������������(������public,protected,default,private)Method/Field,������������򸸽ӿڵ�Method/Field
             */
            Constructor<?> declaredCons[] = c.getDeclaredConstructors();
            for (Constructor<?> con : declaredCons) {
                System.out.println("���췽����" + con);
            }

            Method declaredMds[] = c.getDeclaredMethods();
            for (Method m : declaredMds) {
                System.out.println("�ǹ��췽��" + m);
            }

            Field declaredFs[] = c.getDeclaredFields();
            for (Field f : declaredFs) {
                System.out.println("����" + f);
            }
            /**
             * ����Declared���ص��ǵ�ǰClass���������public Method/Field,��������򸸽ӿڵ�public Method/Field
             */
            System.out.println("����Declared");

            Constructor<?> cons[] = c.getConstructors();
            for (Constructor<?> con : cons) {
                System.out.println("���췽����" + con);
            }

            Method mds[] = c.getMethods();
            for (Method m : mds) {
                System.out.println("�ǹ��췽��" + m);
            }

            Field fs[] = c.getFields();
            for (Field f : fs) {
                System.out.println("����" + f);
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
