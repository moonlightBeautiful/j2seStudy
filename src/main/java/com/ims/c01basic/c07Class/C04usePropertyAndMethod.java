package com.ims.c01basic.c07Class;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ͨ�� ������ȫ������ ����õ�Class��Ķ��󣨼�¼����������Ϣ��
 * Ȼ��ͨ��Class��Ķ��󣨼�¼����������Ϣ��new Object����ʵ��
 * �����new��ʵ��Object���ͻ�ȡ�͵���ָ��������private���Ͳ����ԣ�
 * <p>
 * ��Declared���ص��ǵ�ǰClass�����ࣩ����ȷ��������Method/Field(������public��protected��default��private��������������򸸽ӿڵ�Method/Field)
 * ����Declared�ķ��ص��ǵ�ǰClass�����ࣩ��ʵ���ܵ��õ�����public Method/Field�������Ӹ���򸸽ӿڼ̳ж���û����д��public Method/Field��
 * note�����ֱ��ת���ɾ������ͣ������ֱ�ӵ��÷���
 */

public class C04usePropertyAndMethod {

    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("com.ims.c01basic.c07Class.Student");

            /**
             * private
             */
            // ��ȡ����
            Object obj = c.newInstance();


            // ��ȡָ������
           /* Field nameField = c.getDeclaredField("name");
            // private����Ҫ��������Ȩ��
            nameField.setAccessible(true);
            // �������Ը�ֵ
            nameField.set(obj, "����");
            // ��ȡָ�����Ե�ֵ
            System.out.println("name:" + nameField.get(obj));
            // ��ȡָ������
            Method eatMethod = c.getDeclaredMethod("eat");
            // private����Ҫ��������Ȩ��
            eatMethod.setAccessible(true);
            // ����ָ������
            eatMethod.invoke(obj);*/

            /**
             * public
             */
            // ��ȡָ������
            Field wife = c.getField("wife");
            // ָ�����Ը�ֵ
            wife.set(obj, "����");
            // ��ȡָ�����Ե�ֵ
            System.out.println("wife:" + wife.get(obj));
            // ��ȡָ������
            Method setNameMethod = c.getMethod("setName", String.class);
            Method getNameMethod = c.getMethod("getName");
            // ����ָ������
            setNameMethod.invoke(obj, "����");
            String name = (String) getNameMethod.invoke(obj);
            System.out.println("name=" + name);


        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
