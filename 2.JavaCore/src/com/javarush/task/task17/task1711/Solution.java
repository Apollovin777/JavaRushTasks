package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
-c name1 sex1 bd1 name2 sex2 bd2 ...
-u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
-d id1 id2 id3 id4 ...
-i id1 id2 id3 id4 ...
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException{
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyy", Locale.ENGLISH);
        SimpleDateFormat format1 = new SimpleDateFormat("dd-MMM-yyyy");
        switch (args[0]){
            case ("-c"):
                synchronized (allPeople) {
                    for (int i = 1; i < args.length - 2; i += 3) {
                        if (args[i + 1].equals("м"))
                            allPeople.add(Person.createMale(args[i], format.parse(args[i + 2])));
                        else
                            allPeople.add(Person.createFemale(args[i], format.parse(args[i + 2])));
                        System.out.println(allPeople.indexOf(allPeople.get(allPeople.size()-1)));
                    }
                }
                break;
            case ("-u"):
                synchronized (allPeople) {
                    Person p;
                    for (int i = 1; i < args.length - 3; i += 4) {
                        if (args[i + 2].equals("м"))
                            p = Person.createMale(args[i + 1], format.parse(args[i + 3])); //сегодня родился    id=0
                        else
                            p = Person.createFemale(args[i + 1], format.parse(args[i + 3])); //сегодня родился    id=0
                        allPeople.set(Integer.parseInt(args[i]), p);
                    }
                }
                break;
            case ("-d"):
                synchronized (allPeople) {
                    Person p1 = Person.createMale(null, null);
                    p1.setSex(null);
                    for (int i = 1; i < args.length; i++) {
                        allPeople.set(Integer.parseInt(args[i]), p1);
                    }
                }
                break;
            case ("-i"):
                synchronized (allPeople) {
                    Person p2;
                    String s;
                    for (int i = 1; i < args.length ; i++) {
                        p2 = allPeople.get(Integer.parseInt(args[i]));
                        if (p2.getSex().equals(Sex.MALE))
                            s = "м";
                        else
                            s = "ж";
                        System.out.println(p2.getName() + " " + s + " " + format1.format(p2.getBirthDay()));
                    }
                }
                break;
        }

        /*for (Person p:allPeople
                ) {
            String s;
            if (p.getSex().equals(Sex.MALE))
                s = "м";
            else
                s = "ж";
            System.out.println(p.getName() + " " + s + " " +format1.format(p.getBirthDay()));
        }*/

    }
}
