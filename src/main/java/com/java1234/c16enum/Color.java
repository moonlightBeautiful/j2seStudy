package com.java1234.c16enum;

/**
 * @author gaoxu
 * @date 2019-07-12 10:56
 * @description 枚举类的学习
 * 创建枚举类要使用 enum 关键字，所创建的类都是 java.lang.Enum 类的子类（java.lang.Enum 是一个抽象类）。
 * 枚举类型是不能有继承的，也就是说一个枚举常量定义完毕后，除非修改重构，否则无法做扩展。
 * 枚举类的每一项都是Color的对象，其值是每一项常量的名称
 * 这段代码实际上调用了3次new Color
 * new Color(0);
 * new Color(1);
 * new Color(2);
 */
public enum Color {
    /**
     * 红色
     */
    RED(0),
    /**
     * 绿色
     */
    GREEN(1),
    /**
     * 黄色
     */
    YELLOW(2);

    private final int stateNum;

    Color(int stateNum) {
        this.stateNum = stateNum;
    }

    public int getStateNum() {
        return stateNum;
    }


}
