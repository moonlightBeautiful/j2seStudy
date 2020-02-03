package com.workingGet.c01JAXB;

import javax.xml.bind.*;
import java.io.File;

public class JAXBTest {

    public void generateXML() {
        Person person = new Person("abc", "男", "北京", "朝阳区");
        File file = new File("E:\\person.xml");
        JAXBContext jc = null;
        try {
            //根据Person类生成上下文对象
            jc = JAXBContext.newInstance(Person.class);
            //从上下文中获取Marshaller对象，用作将bean编组(转换)为xml
            Marshaller ma = jc.createMarshaller();
            //以下是为生成xml做的一些配置
            //格式化输出，即按标签自动换行，否则就是一行输出
            ma.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            //设置编码（默认编码就是utf-8）
            ma.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
            //是否省略xml头信息，默认不省略（false）
            ma.setProperty(Marshaller.JAXB_FRAGMENT, false);
            //编组
            ma.marshal(person, file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        /**
         *  JDK1.7版本之后使用
         */
        /*Person person = new Person("abc", "男", "北京", "朝阳区");
        File file = new File("E:\\person2.xml");
        JAXB.marshal(person, file);*/
    }


    public void generateBean() {
        File file = new File("E:\\person.xml");
        JAXBContext jc = null;
        try {
            jc = JAXBContext.newInstance(Person.class);
            Unmarshaller uma = jc.createUnmarshaller();
            Person person = (Person) uma.unmarshal(file);
            System.out.println(person);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        /**
         *  JDK1.7版本之后使用
         */
       /* File file = new File("E:\\person2.xml");
        Person person = JAXB.unmarshal(file, Person.class);
        System.out.println(person);*/
    }

    public static void main(String[] args) {
        JAXBTest jaxbTest = new JAXBTest();
        jaxbTest.generateXML();
        /*jaxbTest.generateBean();*/
    }
}
