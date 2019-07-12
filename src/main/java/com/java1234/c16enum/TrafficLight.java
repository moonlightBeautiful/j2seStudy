package com.java1234.c16enum;

/**
 * @author gaoxu
 * @date 2019-07-12 10:56
 * @description ... 类
 */
public class TrafficLight {
    /**
     * 枚举类型属性 信号灯
     */
    enum Signal {
        /**
         *
         */
        GREEN,
        YELLOW,
        RED
    }

    public void change(Signal color) {
        switch (color) {
            case RED:
                System.out.println("红灯");
                break;
            case YELLOW:
                System.out.println("黄灯");
                break;
            case GREEN:
                System.out.println("绿灯");
                break;
            default:
                System.out.println("故障");
        }
    }

    public static void main(String[] args) {
        new TrafficLight().change(Signal.GREEN);
    }
}
