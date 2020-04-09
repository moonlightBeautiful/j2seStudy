package com.workingGet.c01JAXB;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorOrder(XmlAccessOrder.UNDEFINED)
public class Hunter {
    private int id;
    private String name;
    private boolean hasGun;


}


