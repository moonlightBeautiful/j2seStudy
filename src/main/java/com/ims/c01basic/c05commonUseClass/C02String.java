package com.ims.c01basic.c05commonUseClass;

public class C02String {
    public static void main(String[] args) {
        /**
         * String �� ���ݷ����˶����У��ѷ�Ϊ�����Ѻ�˽�ж�
         */
        /**
         * �����ѣ���ʹ��new����String�����������ͬ����������һ��String����
         */
       /* String str1 = "123";    //���������� ������123�Ŀռ�
        str1 += "abc";    //���������У�������123�Ŀռ䣬Ȼ�󴴽���123abc�Ŀռ�
        System.out.println(str1);*/

        /**
         * ˽�жѣ�ʹ��new
         */
       /* String str2 = new String("123");
        System.out.println(str2);*/

        /**
         * == �Ƚϵ�������
         * equals() �Ƚϵ��Ǿ��������
         */

        /**
         * String.format("��ʽ",""...)
         */
        //String.format("��ʽ",""...)�������ʽ������ַ�������ʽĿǰ��֪��%s���ú���Ĳ����滻%s��
      /*  String s1 = String.format("��ã�%s��%s��", "���»�", "��ѧ��");
        System.out.println(s1);*/

        /**
         * str.chartAt��int index��
         * ����str��indexλ�õ��ַ�
         */

        /**
         * str.indexOf��char c��
         * ����str���е�һ�γ����ַ�c��index
         */

        /**
         * str.indexOf��char c��int startIndex��
         * ����str���д�startIndex��ʼ��һ�γ����ַ�c��index
         */

        /**
         * str.subString��int startIndex��
         * ����str���д�startIndex��ʼ��ĩβ���ַ���
         */

        /**
         * str.subString��int startIndex��int endIndex��
         * ����str���д�startIndex��ʼ��endIndex�������ַ���
         */

        /**
         * str.toUpperCase����/str.toLowerCase����
         * ����ת��Ϊ��д/Сд��str
         */

        /**
         * str.trim����
         * ����ȥ��ǰ��ո��str
         */

        /**
         * String.valueOf(Object)
         * ����objectת���ɵ��ַ���
         */


       /* String s = null;*/
        String s = "";
        System.out.println(s.split(",").length);
    }
}
