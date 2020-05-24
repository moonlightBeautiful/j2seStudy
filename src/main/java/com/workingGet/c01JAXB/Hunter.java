package com.workingGet.c01JAXB;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;
import java.util.List;
import java.util.Map;

@XmlRootElement(name = "ImAHunter")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder(XmlAccessOrder.UNDEFINED)
public class Hunter {
    @XmlAttribute
    private int id;

    @XmlAttribute
    private String name;

    @XmlAttribute
    @XmlJavaTypeAdapter(DateAdapter.class)
    private Date birthday;

    @XmlAttribute
    private int age;

    @XmlElement
    private boolean hasGun;

    @XmlElement
    private Dog dog;

    @XmlElement
    private List<String> ai;

    @XmlElement
    private List<Cat> catList;

    @XmlElement
    private Map<String,String> ai2;

    public Hunter() {
    }

    public Hunter(int id, String name, Date birthday, int age, boolean hasGun, Dog dog) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.age = age;
        this.hasGun = hasGun;
        this.dog = dog;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasGun() {
        return hasGun;
    }

    public void setHasGun(boolean hasGun) {
        this.hasGun = hasGun;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public List<String> getAi() {
        return ai;
    }

    public void setAi(List<String> ai) {
        this.ai = ai;
    }

    public List<Cat> getCatList() {
        return catList;
    }

    public void setCatList(List<Cat> catList) {
        this.catList = catList;
    }

    public Map<String, String> getAi2() {
        return ai2;
    }

    public void setAi2(Map<String, String> ai2) {
        this.ai2 = ai2;
    }

    @Override
    public String toString() {
        return "Hunter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hasGun=" + hasGun +
                '}';
    }
}


