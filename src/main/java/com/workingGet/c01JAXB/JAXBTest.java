package com.workingGet.c01JAXB;

import javax.xml.bind.*;
import java.io.File;

public class JAXBTest {

    public void generateXML() {
        Person person = new Person("abc", "��", "����", "������");
        File file = new File("E:\\person.xml");
        JAXBContext jc = null;
        try {
            //����Person�����������Ķ���
            jc = JAXBContext.newInstance(Person.class);
            //���������л�ȡMarshaller����������bean����(ת��)Ϊxml
            Marshaller ma = jc.createMarshaller();
            //������Ϊ����xml����һЩ����
            //��ʽ�������������ǩ�Զ����У��������һ�����
            ma.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            //���ñ��루Ĭ�ϱ������utf-8��
            ma.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
            //�Ƿ�ʡ��xmlͷ��Ϣ��Ĭ�ϲ�ʡ�ԣ�false��
            ma.setProperty(Marshaller.JAXB_FRAGMENT, false);
            //����
            ma.marshal(person, file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        /**
         *  JDK1.7�汾֮��ʹ��
         */
        /*Person person = new Person("abc", "��", "����", "������");
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
         *  JDK1.7�汾֮��ʹ��
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
