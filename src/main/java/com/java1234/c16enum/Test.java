package com.java1234.c16enum;

/**
 * @author gaoxu
 * @date 2019-07-12 10:57
 * @description ... 类
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("遍历Color的每一项：");
        for (Color e : Color.values()) {
            System.out.println(e.toString());
        }

        System.out.println("使用Color的项：");
        switch (Color.GREEN) {
            case GREEN:
                System.out.println("颜色是绿色~");
                break;
            case RED:
                System.out.println("颜色是红色~");
                break;
            default:
                System.out.println("颜色是黄色~");
                break;
        }
       /* if (1 == Color.GREEN.getStateNum()) {
            //AuditState.UNAUDIT.toString()获取字符串描述
            System.out.println(Color.GREEN.toString() + "标识是 " + Color.GREEN.getStateNum());
        }*/
    }
}
