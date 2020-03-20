package com.ims.c01basic.c06generics;

/**
 * @author gaoxu
 * @date 2019-09-19 16:10
 * @description 泛型类
 */
public class C02GenericClass<T> {
    private T key;
    private String name;

    public void setKey(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public C02GenericClass(T key) {
        this.key = key;
    }

    public static void main(String[] args) {
        C02GenericClass<Integer> test01 = new C02GenericClass<Integer>(1234);
       // C02GenericClass<int> test02 = new C02GenericClass<int>(); //在实例化泛型类时，必须指定T的具体类型，类型参数只能是类类型，不能是基本数据类型
    }
}
