package com.ims.c01basic.c07Class;

/**
 * ͨ��Class��Ķ��󣨼�¼����������Ϣ�� ��ȡ����������
 * <p>
 * ��Declared���ص��ǵ�ǰClass�����ࣩ����ȷ��������Method/Field(������public��protected��default��private��������������򸸽ӿڵ�Method/Field)
 * ����Declared�ķ��ص��ǵ�ǰClass�����ࣩ��ʵ���ܵ��õ�����public Method/Field�������Ӹ���򸸽ӿڼ̳ж���û����д��public Method/Field��
 */
public class C03GetClassContent {

    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("com.ims.c01basic.c07Class.Student");
            /**
             * ��Declared���ص��ǵ�ǰ�����������з��������ԣ�������������򸸽ӿڵķ��������ԡ�
             */
            /*System.out.println("��ȡ���������й��췽����=========================================================");
            Constructor<?> declaredCons[] = c.getDeclaredConstructors();
            for (Constructor<?> con : declaredCons) {
                System.out.println("���췽����" + con);
            }*/

              /* System.out.println("��ȡ��������ͨ������==========================================================");
            Method declaredMds[] = c.getDeclaredMethods();
            for (Method m : declaredMds) {
                System.out.println("��ͨ������" + m);
            }

            System.out.println("��ȡ���������ԣ�=============================================================");
            Field declaredFs[] = c.getDeclaredFields();
            for (Field f : declaredFs) {
                System.out.println("����" + f);
            }*/
            /**
             * ����Declared���ص��ǵ�ǰClass���������public ���������ԣ���������򸸽ӿڵ�public ����������
             */
            /*System.out.println("��ȡ����+�̳е�public���췽����=========================================================");
            Constructor<?> cons[] = c.getConstructors();
            for (Constructor<?> con : cons) {
                System.out.println("���췽����" + con);
            }*/

            /*System.out.println("��ȡ����+�̳е�public��ͨ������=========================================================");
            Method mds[] = c.getMethods();
            for (Method m : mds) {
                System.out.println("��ͨ������" + m);
            }*/

            /*System.out.println("��ȡ����+�̳е�public���ԣ�=========================================================");
            Field fs[] = c.getFields();
            for (Field f : fs) {
                System.out.println("���ԣ�" + f);
            }*/
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
