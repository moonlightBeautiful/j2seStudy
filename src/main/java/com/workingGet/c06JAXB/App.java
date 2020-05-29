package com.workingGet.c06JAXB;

import javax.xml.bind.*;
import java.io.File;

/**
 * @author: GaoXu
 * @date: 2020/5/24
 * @desc：请对类进行描述
 */
public class App {

    public static void main(String[] args) throws JAXBException {
        /*
            beanToXml
         */
        /*Hunter hunter = new Hunter(1,"高旭",new Date(),11,true,new Dog("张三","中华田园犬"));
        List<String> ai = new ArrayList<>();
        ai.add("1");
        ai.add("2");
        hunter.setAi(ai);
        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat("猫1","小"));
        catList.add(new Cat("猫2","大"));
        hunter.setCatList(catList);
        Map<String,String> ai2 = new HashMap<>();
        ai2.put("1","1");
        ai2.put("2","3");
        hunter.setAi2(ai2);

        File file = new File("person.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Hunter.class);
        try {
            Marshaller ma = jaxbContext.createMarshaller();
            ma.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            ma.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
            ma.setProperty(Marshaller.JAXB_FRAGMENT, false);
            //beanToXml  ma.marshal(hunter, file);
            ma.marshal(hunter, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }*/


        /*
            xmlToBean
         */
        File file = new File("E:\\person.xml");
        try {
            JAXBContext jc = JAXBContext.newInstance(Hunter.class);
            Unmarshaller uma = jc.createUnmarshaller();
            Hunter person = (Hunter) uma.unmarshal(file);
            System.out.println(person);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
