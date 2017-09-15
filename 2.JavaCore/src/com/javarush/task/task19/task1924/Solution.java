package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }


    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String fileName = "c:\\tmp\\file1.txt";
        String fileName = reader.readLine();
        reader.close();

        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<String> list = new ArrayList<>();

        while (bufferedReader.ready()){
            list.add(bufferedReader.readLine());
        }
        fileReader.close();

        for (int j = 0;j<list.size();j++) {
            String[] arr = list.get(j).split(" ");
                for (int i = 0; i<arr.length;i++) {
                    try{
                        Integer number = Integer.parseInt(arr[i]);
                        if(number!=null && number>=0 && number<=12)
                            arr[i] = map.get(number);
                    }
                    catch (NumberFormatException e){}
                }
            list.set(j, Arrays.stream(arr).collect(Collectors.joining(" ")));

        }
        for (String s : list
             ) {
            System.out.println(s);
        }
    }
}
