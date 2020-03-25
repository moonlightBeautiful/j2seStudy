package com.ims.workingGet.c02BigDecimal;

import java.math.BigDecimal;


public class BigDecimalStudy {
    public static void main(String[] args) {

        double d1 = 0.2;
        double d2 = 0.1;
        /**
         * Ϊʲô����ʹ��double�������㣬��Ϊʹ��double�������㣬���ȿ��ܻᶪʧ!!!!
         */
       /* System.out.println("Ϊʲô����ʹ��double����Ϊdouble���������ܻ����");
        System.out.println(d1 + " + " + d2 + " = " + (0.2 + 0.1));
        System.out.println(d1 + " - " + d2 + " = " + (0.3 - 0.1));
        System.out.println(d1 + " * " + d2 + " = " + (0.2 * 0.1));
        System.out.println(d1 + " / " + d2 + " = " + (0.3 / 0.1));
        System.out.println("===============================================================");*/
        /**
         * BigDecimal��ʵ����һ��new BigDecimal(double)�����ַ�ʽ���Բ��������Ȼᶪʧ!!!!!
         */
       /* System.out.println("BigDecimal��ʵ������ʽһ��new BigDecimal(double)�����Ȼᶪʧ!!!!!");
        System.out.println("new BigDecimal(" + d1 + ") = " + new BigDecimal(d1));
        System.out.println("new BigDecimal(" + d2 + ") = " + new BigDecimal(d2));
        System.out.println("===============================================================");*/

        /**
         * BigDecimal��ʵ��������new BigDecimal(double)�����ַ�ʽ���Բ��������Ȼᶪʧ!!!!!
         */
       /* System.out.println("BigDecimal��ʵ������ʽ����new BigDecimal(string)�����Ȳ���ʧ!!!!!");
        System.out.println("new BigDecimal(String.valueOf(" + d1 + "))=" + new BigDecimal(String.valueOf(d1)));
        System.out.println("new BigDecimal(String.valueOf(" + d2 + "))=" + new BigDecimal(String.valueOf(d2)));
        System.out.println("===============================================================");*/

        /**
         * setScale���þ���
         */
        /*BigDecimal decimal = new BigDecimal("0.1234500");
        System.out.println("��ʼֵ��" + decimal);
        BigDecimal setScale1 = decimal.setScale(5);
        System.out.println("Ĭ�϶��������0�����ǲ����������ķ�0��" + setScale1);
        BigDecimal setScale2 = decimal.setScale(4, BigDecimal.ROUND_HALF_UP);
        System.out.println("ROUND_HALF_UP�������룺" + setScale2);
        BigDecimal setScale3 = decimal.setScale(4, BigDecimal.ROUND_DOWN);
        System.out.println("ROUND_DOWNֱ��ɾ�������С��λ��" + setScale3);
        BigDecimal setScale4 = decimal.setScale(4, BigDecimal.ROUND_UP);
        System.out.println("ROUND_UP��λ��"+setScale4);
        BigDecimal setScale5 = decimal.setScale(4, BigDecimal.ROUND_HALF_DOWN);
        System.out.println("ROUND_HALF_UP�������룺"+setScale5);
        System.out.println("===============================================================");*/
        /**
         * valueOfת����BigDecimal����
         */
        /*System.out.println("BigDecimal BigDecimal.valueOf(" + d2 + ") = " + BigDecimal.valueOf(d2));*/
        /**
         * BigDecimal�ļӼ��˳�
         */
        BigDecimal a = new BigDecimal("4.00");
        BigDecimal b = new BigDecimal("1.2");
        System.out.println("a + b =" + a.add(b));
        System.out.println("a - b =" + a.subtract(b));
        System.out.println("a * b =" + a.multiply(b));
        System.out.println("a / b =" + a.divide(b,2,BigDecimal.ROUND_HALF_UP));
    }
}
