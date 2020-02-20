package com.java1234.c16enum;

/**
 * @author gaoxu
 * @date 2019-07-12 10:57
 * @description ... 类
 */
public class ColorTest {

    public static void main(String[] args) {
        //枚举类的基本操作
        System.out.println("Color.GREEN=" + Color.GREEN);
        System.out.println("Color.GREEN.toString()=" + Color.GREEN.toString());
        System.out.println("Color.values()：遍历枚举类Color的每一项。");
        for (Color color : Color.values()) {
            System.out.println(color.toString() + "，" + color.getStateNum());
        }
        System.out.println("Color在switch (Color.GREEN)中的应用");
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
    }
}
