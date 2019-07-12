package com.java1234.c16enum;

/**
 * @author gaoxu
 * @date 2019-07-12 10:57
 * @description ... 类
 */
public class Test {

    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Test ct = new Test();
        ct.setColor(Color.RED);
        System.out.println(Color.RED);
        TrafficLight trafficLight = new TrafficLight();

    }
}
