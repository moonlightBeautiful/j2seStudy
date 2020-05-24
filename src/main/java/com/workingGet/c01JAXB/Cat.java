package com.workingGet.c01JAXB;

import javax.xml.bind.annotation.*;

/**
 * @author: GaoXu
 * @date: 2020/5/24
 * @desc：请对类进行描述
 */
@XmlRootElement()
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder(XmlAccessOrder.UNDEFINED)
public class Cat {
    @XmlElement
    private String name;
    @XmlElement
    private String type;

    public Cat() {
    }

    public Cat(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
