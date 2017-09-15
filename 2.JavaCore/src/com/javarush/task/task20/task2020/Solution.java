package com.javarush.task.task20.task2020;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;

/* 
Сериализация человека
*/
public class Solution {

    public static class Person implements Serializable{
        String firstName;
        String lastName;
        transient String fullName;
        transient final String greetingString;
        String country;
        Sex sex;
        transient PrintStream outputStream;
        transient Logger logger;

        Person(String firstName, String lastName, String country, Sex sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.fullName = String.format("%s, %s", lastName, firstName);
            this.greetingString = "Hello, ";
            this.country = country;
            this.sex = sex;
            this.outputStream = System.out;
            this.logger = Logger.getLogger(String.valueOf(Person.class));
        }
        Person (){
            this.greetingString = "Hello, ";
        }
    }

    enum Sex {
        MALE,
        FEMALE
    }

    public static void main(String[] args) throws IOException,ClassNotFoundException{
        Person person = new Person("first","last","UA",Sex.MALE);
        FileOutputStream fileOutput = new FileOutputStream("C:\\tmp\\file1.txt");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput);

        outputStream.writeObject(person);
        outputStream.close();
        fileOutput.close();

        FileInputStream fiStream = new FileInputStream("C:\\tmp\\file1.txt");
        ObjectInputStream objectStream = new ObjectInputStream(fiStream);

        Person loadedPerson = new Person();
        loadedPerson = (Person) objectStream.readObject();
        System.out.println(loadedPerson.firstName);
        System.out.println(loadedPerson.lastName);
        System.out.println(loadedPerson.greetingString);
        System.out.println(loadedPerson.fullName);

        objectStream.close();
        fiStream.close();


    }
}
