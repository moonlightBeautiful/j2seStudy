package com.ims.c01basic.c06generics;

/**
 * @author gaoxu
 * @date 2019-09-19 17:23
 * @description 泛型方法
 */
public class C04GenericMethod {

    public <T> T genericMethod(Class<T> tClass, String string) throws IllegalAccessException, InstantiationException {
        T instance = tClass.newInstance();
        return instance;
    }

    public <T> String genericMethod(T t) {
        return "";
    }
}
