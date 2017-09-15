package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
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

        for (String l: list) {
            int count = 0;
            Set<String> mySet = new HashSet<String>(Arrays.asList(l.split(" ")));
            for (String s :mySet
                 ) {
                if(words.contains(s))
                    count++;
            }
            if(count==2)
                System.out.println(l);
        }



    }
}
