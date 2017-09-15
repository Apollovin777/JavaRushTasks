package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
1. Создай список строк.
2. Добавь в него 5 строк с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0;i<5;i++)
            list.add(reader.readLine());

        String temp = "";
        for(int i = 0;i<13;i++)
        {
            temp = list.get(list.size()-1);
            list.remove(list.size()-1);
            list.add(0,temp);
        }

        for(int i=0;i<list.size();i++)
            System.out.println(list.get(i));
    }
}
