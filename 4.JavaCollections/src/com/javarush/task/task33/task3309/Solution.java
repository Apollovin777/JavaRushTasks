package com.javarush.task.task33.task3309;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

/*
Комментарий внутри xml
*/
public class Solution {
    public static String toXmlWithComment(Object obj, String tagName, String comment) throws JAXBException{
        StringWriter writer = new StringWriter();

        //создание объекта Marshaller, который выполняет сериализацию
        JAXBContext context = JAXBContext.newInstance(obj.getClass());
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        // самосериализация
        marshaller.marshal(obj, writer);

        return null;
    }

    public static void main(String[] args) {

    }
}
