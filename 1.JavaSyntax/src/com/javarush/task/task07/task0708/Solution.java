package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i<5;i++){
            list.add(reader.readLine());
        }

        int maxLenght = 0;
        for(int i=0;i<list.size();i++){
            if (list.get(i).length()>maxLenght)
                maxLenght=list.get(i).length();
        }

        for(int i=0;i<list.size();i++){
            if (list.get(i).length()==maxLenght)
                System.out.println(list.get(i));
        }
    }
}
