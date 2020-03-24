package com.workingGet.c19Serializable;

/**
 * @author gaoxu
 * @date 2019-09-18 09:15
 * @description ... 类
 */
public class People {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public People(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
