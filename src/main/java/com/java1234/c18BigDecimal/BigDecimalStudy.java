package com.java1234.c18BigDecimal;

import java.math.BigDecimal;

/**
 * @author gaoxu
 * @date 2019-09-17 17:19
 * @description BigDecimal ��
 */
public class BigDecimalStudy {
    public static void main(String[] args) {
        /**
         * Java���ṩ�˴�����(����16λ��Чλ)�Ĳ�����,�� java.math.BinInteger ��� java.math.BigDecimal ��,���ڸ߾��ȼ���.
         * ���� BigInteger ������Դ������Ĵ�����,�� BigDecimal ��������Դ�С���Ĵ�����.
         * float��Doubleֻ����������ѧ��������ǹ��̼���;
         * ����ҵ������,�����־���Ҫ��ϸ�,����ʹ�� BigInteger ��� BigDecimal ��,��֧���κξ��ȵĶ�����,������������ȷ�������ֵ.
         *
         */
        /**
         *  BigDecimal(double d); //���ַ�ʽ���Բ�����!!!!!��Ȼ���������Ǿ��Ȼᶪʧ�������Ҫ��doubleת��BigDecimal��������ʹ��
         *      BigDecimal.valueOf(2.3 double);
         *      new BigDecimal(Double.toString(2.3));
         *  new BigDecimal(String s);   //����,�Ƽ�ʹ��
         *  BigDecimal.valueOf(double d);     //����,�Ƽ�ʹ��
         */


        double d1 = 0.2;
        double d2 = 0.1;

        //Ϊʲô����ʹ��double�������㣬���ȿ��ܻᶪʧ!!!!
        System.out.println("Ϊʲô����ʹ��double����Ϊdouble���������ܻ����");
        System.out.println(d1 + " + " + d2 + " = " + (0.2 + 0.1));
        System.out.println(d1 + " - " + d2 + " = " + (0.3 - 0.1));
        System.out.println(d1 + " * " + d2 + " = " + (0.2 * 0.1));
        System.out.println(d1 + " / " + d2 + " = " + (0.3 / 0.1));
        System.out.println("");

        //BigDecimal��ʵ����
        //new BigDecimal(double)���ַ�ʽ���Բ��������Ȼᶪʧ!!!!!
        System.out.println("BigDecimal��ʵ������ʽһ");
        System.out.println("new BigDecimal(double)�����Ȼᶪʧ!!!!!");
        System.out.println("new BigDecimal(" + d1 + ") = " + new BigDecimal(d1));
        System.out.println("new BigDecimal(" + d2 + ") = " + new BigDecimal(d2));
        System.out.println("new BigDecimal(double)��������Ȼᶪʧ!!!!!BigDecimal.valueOf(double);");
        System.out.println("BigDecimal.valueOf(" + d2 + ") = " + BigDecimal.valueOf(d2));
        System.out.println("new BigDecimal(double)��������Ȼᶪʧ!!!!!new BigDecimal(Double.toString(double));");
        System.out.println("new BigDecimal(Double.toString(" + d2 + ") = " + new BigDecimal(Double.toString(d2)));
        System.out.println("");

        System.out.println("BigDecimal��ʵ������ʽ��");
        System.out.println("new BigDecimal(String.valueOf(" + d1 + "))=" + new BigDecimal(String.valueOf(d1)));
        System.out.println("new BigDecimal(String.valueOf(" + d2 + "))=" + new BigDecimal(String.valueOf(d2)));
        System.out.println("");

        System.out.println("BigDecimal��ʵ����1��1.00000�ıȽ�");
        BigDecimal b1 = BigDecimal.valueOf(1);
        BigDecimal b2 = BigDecimal.valueOf(1.00000);
        System.out.println(b1.equals(b2));
        System.out.println(b1.compareTo(b2));

        /**
         * setScale�������ڸ�ʽ��С���㣬Ĭ�Ϸ�ʽ����������
         */
        BigDecimal decimal = new BigDecimal("1.123455");
        System.out.println(decimal);
        //ROUND_DOWNֱ��ɾ�������С��λ
        BigDecimal setScale1 = decimal.setScale(4, BigDecimal.ROUND_DOWN);
        System.out.println(setScale1);
        //ROUND_UP��λ
        BigDecimal setScale2 = decimal.setScale(3, BigDecimal.ROUND_UP);
        System.out.println(setScale2);
        //ROUND_HALF_UP��������
        BigDecimal setScale3 = decimal.setScale(4, BigDecimal.ROUND_HALF_UP);
        System.out.println(setScale3);
        //ROUND_HALF_UP��������
        BigDecimal setScale4 = decimal.setScale(5, BigDecimal.ROUND_HALF_DOWN);
        System.out.println(setScale4);

        /*
            BigDecimal�ļӼ��˳�
         */
        BigDecimal a = new BigDecimal("4.50");
        BigDecimal b = new BigDecimal("1.5");

        System.out.println("a + b =" + a.add(b));
        System.out.println("a - b =" + a.subtract(b));
        System.out.println("a * b =" + a.multiply(b));
        System.out.println("a / b =" + a.divide(b));

        BigDecimal c = new BigDecimal("4.50");
        BigDecimal d = new BigDecimal("1.3");
        System.out.println("c / d =" + c.divide(d,2,BigDecimal.ROUND_HALF_UP));
        /*System.out.println("c / d =" + c.divide(d));*/
    }
}
