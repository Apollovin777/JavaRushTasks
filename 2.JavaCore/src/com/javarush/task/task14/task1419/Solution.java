package com.javarush.task.task14.task1419;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try{
            int[] arr = {0};
            arr[1] = 1;
        }
        catch (IndexOutOfBoundsException e){
            exceptions.add(e);
        }
        try{
            Integer.parseInt("ddd");
        }
        catch (NumberFormatException e){
            exceptions.add(e);
        }
        try {
            String str = null;
            str.length();
        }
        catch (NullPointerException e){
            exceptions.add(e);
        }
        try {
            FileInputStream out = new FileInputStream("OutFile.txt");
        }
        catch (IOException e){
            exceptions.add(e);
        }
        try {
            ArrayList<Integer> list = new ArrayList<>(-1);
        }
        catch (IllegalArgumentException e){
            exceptions.add(e);
        }
        try {
            int[] arr = new int[-1];
        }
        catch (NegativeArraySizeException e){
            exceptions.add(e);
        }
        try {
            Date date = new Date();
            DateFormat dateFormat= new SimpleDateFormat("dd-MMM-yyy");
            Date formattedDate = dateFormat.parse(date.toString());
        }
        catch (ParseException e){
            exceptions.add(e);
        }
        try {
            throw new RuntimeException("demo");
        }
        catch (RuntimeException e){
            exceptions.add(e);
        }
        try {
            throw new IOException("d");
        }
        catch (IOException e){
            exceptions.add(e);
        }





        //напишите тут ваш код

    }
}
