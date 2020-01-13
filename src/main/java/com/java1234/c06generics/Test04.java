package com.java1234.c06generics;

/**
 * @author gaoxu
 * @date 2019-09-19 17:23
 * @description 泛型方法
 */
public class Test04 {

    public <T> T genericMethod(Class<T> tClass) throws IllegalAccessException, InstantiationException {
        T instance = tClass.newInstance();
        return instance;
    }

    public <T> String genericMethod(T t) {
        return "";
    }
}
