package com.workingGet.c01JAXB;

import javax.xml.bind.*;
import java.io.File;

public class JAXBTest {

    public void generateXML() throws JAXBException {
        Hunter person = new Hunter();
        File file = new File("person.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Hunter.class);
        try {
            Marshaller ma = jaxbContext.createMarshaller();
            ma.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            ma.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
            ma.setProperty(Marshaller.JAXB_FRAGMENT, false);
            ma.marshal(person, file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        /*Person person1 = new Person();
        File file = new File("E:\\person2.xml");
        JAXB.marshal(person1, file);*/
    }


    public void generateBean() {
        File file = new File("E:\\person.xml");
        JAXBContext jc = null;
        try {
            jc = JAXBContext.newInstance(Hunter.class);
            Unmarshaller uma = jc.createUnmarshaller();
            Hunter person = (Hunter) uma.unmarshal(file);
            System.out.println(person);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        /**
         *  JDK1.7?汾??????
         */
       /* File file = new File("E:\\person2.xml");
        Person person = JAXB.unmarshal(file, Person.class);
        System.out.println(person);*/
    }

    public static void main(String[] args) {
        JAXBTest jaxbTest = new JAXBTest();
        /*jaxbTest.generateXML();*/
        /*jaxbTest.generateBean();*/
    }
}
