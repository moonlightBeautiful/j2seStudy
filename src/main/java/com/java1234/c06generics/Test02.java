package com.java1234.c06generics;

/**
 * @author gaoxu
 * @date 2019-09-19 16:10
 * @description 泛型类
 */
public class Test02<T> {
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

    public Test02(T key) {
        this.key = key;
    }

    public static void main(String[] args) {
        Test02<Integer> test02 = new Test02<Integer>(1234);
        // Test02<int> test02 = new Test02<int>(); 在实例化泛型类时，必须指定T的具体类型，类型参数只能是类类型，不能是基本数据类型
    }
}
