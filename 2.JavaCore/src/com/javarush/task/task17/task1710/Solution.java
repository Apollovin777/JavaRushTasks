package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException{
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat outFormatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);



        switch (args[0]){
            case "-c":
                int index = allPeople.size();
                if(args[2].equals("м")) {
                    allPeople.add(index, Person.createMale(args[1], formatter.parse(args[3])));
                    System.out.println(allPeople.indexOf(allPeople.get(allPeople.size()-1)));
                }
                else if(args[2].equals("ж")) {
                    allPeople.add(index, Person.createFemale(args[1], formatter.parse(args[3])));
                    System.out.println(allPeople.indexOf(allPeople.get(allPeople.size()-1)));
                }
                break;
            case "-u":
                if(args[3].equals("м"))
                    allPeople.set(Integer.parseInt(args[1]), Person.createMale(args[2], formatter.parse(args[4])));

                else if(args[3].equals("ж"))
                    allPeople.set(Integer.parseInt(args[1]), Person.createFemale(args[2], formatter.parse(args[4])));
                break;
            case "-i":
                System.out.print(allPeople.get(Integer.parseInt(args[1])).getName());
                System.out.print(" ");
                if (allPeople.get(Integer.parseInt(args[1])).getSex().equals(Sex.MALE))
                    System.out.print("м");
                else
                    System.out.print("ж");
                System.out.print(" ");
                System.out.print(outFormatter.format(allPeople.get(allPeople.size()-1).getBirthDay()));
                break;
            case "-d":
                Person p = allPeople.get(Integer.parseInt(args[1]));
                p.setName(null);
                p.setSex(null);
                p.setBirthDay(null);
                allPeople.set(Integer.parseInt(args[1]),p);
                break;
            default:
                break;
        }






    }
}
