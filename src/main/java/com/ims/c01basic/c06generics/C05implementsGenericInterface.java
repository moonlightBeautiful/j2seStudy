package com.ims.c01basic.c06generics;

/**
 * @author gaoxu
 * @date 2019-09-19 16:10
 * @description 泛型接口
 */
public class C05implementsGenericInterface<T> implements C03GenericInterface<T> {

    private T key;

    @Override
    public T next() {
        return null;
    }
}
