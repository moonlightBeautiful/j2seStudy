package com.ims.workingGet.c01enum;

/**
 * @author gaoxu
 * @date 2019-07-12 10:56
 * @description ö�����ѧϰ
 * ����ö����Ҫʹ�� enum �ؼ��֣����������඼�� java.lang.Enum ������ࣨjava.lang.Enum ��һ�������ࣩ��
 * ö�������ǲ��ܱ��̳еģ�Ҳ����˵һ��ö�ٳ���������Ϻ󣬳����޸��ع��������޷�����չ��
 * ö�����ÿһ���ö����Ķ���
 * ��δ���ʵ���ϵ�����3��new Color
 * new Color(0);
 * new Color(1);
 * new Color(2);
 */
public enum Color {
    /**
     * ��ɫ
     */
    RED(0),
    /**
     * ��ɫ
     */
    GREEN(1),
    /**
     * ��ɫ
     */
    YELLOW(2);

    private final int stateNum;

    Color(int stateNum) {
        System.out.println("��ö���౻�õ���ʱ�򣬾Ϳ�ʼΪö�����ÿһ��ʵ������" + stateNum);
        this.stateNum = stateNum;
    }

    public int getStateNum() {

        return this.stateNum;
    }

    public static void main(String[] args) {
        //ö����Ļ�������
        System.out.println("Color.GREEN=" + Color.GREEN);  //��ʶ
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
