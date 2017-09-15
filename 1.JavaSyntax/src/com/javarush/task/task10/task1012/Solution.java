package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        for(Character ch: alphabet){
            int count = 0;
            for(String str: list)
                for(Character ch2: str.toCharArray())
                    if(ch.equals(ch2))
                        count++;
            System.out.println(ch+ " " +count);
        }


    }
    public static Integer CountChars(String str, char ch){
        Integer count = 0;

        int index = str.indexOf(ch);
        while (index>-1){
            count++;
            index = str.indexOf(ch,index+1);
        }
        return count;

    }

}
