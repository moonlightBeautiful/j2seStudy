package com.java1234.c16enum;

/**
 * @author gaoxu
 * @date 2019-09-19 14:31
 * @description 接口
 * 全部是静态常亮和抽象方法，可以implements多实现
 * 接口中所有变量默认为public static final 常亮。 public static final 可以不写。
 * 接口中所有方法默认为public abstract。public abstract可以不写。
 */
public interface Season {
    int Sprint = 0;
    int Summer = 1;
    int Autumn = 2;
    int Winter = 3;
}
