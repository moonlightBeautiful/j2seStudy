package com.java1234.c16enum;

/**
 * @author gaoxu
 * @date 2019-07-12 10:57
 * @description ... ��
 */
public class ColorTest {

    public static void main(String[] args) {
        //ö����Ļ�������
        System.out.println("Color.GREEN=" + Color.GREEN);
        System.out.println("Color.GREEN.toString()=" + Color.GREEN.toString());
        System.out.println("Color.values()������ö����Color��ÿһ�");
        for (Color color : Color.values()) {
            System.out.println(color.toString() + "��" + color.getStateNum());
        }
        System.out.println("Color��switch (Color.GREEN)�е�Ӧ��");
        switch (Color.GREEN) {
            case GREEN:
                System.out.println("��ɫ����ɫ~");
                break;
            case RED:
                System.out.println("��ɫ�Ǻ�ɫ~");
                break;
            default:
                System.out.println("��ɫ�ǻ�ɫ~");
                break;
        }
    }
}
