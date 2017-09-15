package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TreeMap;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        String filename = args[0];
        //String filename = "C:\\tmp\\file1.txt";
        FileReader reader = new FileReader(filename);
        BufferedReader br = new BufferedReader(reader);

        List<String> list = new ArrayList<>();

        while (br.ready()){
            String line = br.readLine();
            int digitPos=0;
            for(int i=0;i<line.length();i++){
                if(Character.isDigit(line.charAt(i))) {
                    digitPos = i;
                    break;
                }
            }
            String[] dateArr = line.substring(digitPos).split(" ");
            GregorianCalendar newGregCal = new GregorianCalendar(
                    Integer.parseInt(dateArr[2]),
                    Integer.parseInt(dateArr[1]) - 1,
                    Integer.parseInt(dateArr[0])
            );
            PEOPLE.add(new Person(line.substring(0,digitPos-1),newGregCal.getTime()));
        }
        reader.close();


    }
}
