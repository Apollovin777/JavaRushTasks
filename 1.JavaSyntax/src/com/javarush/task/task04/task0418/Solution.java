package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String sFirst = bufferedReader.readLine(); //читаем строку с клавиатуры
        int iFirst = Integer.parseInt(sFirst);

        String sSecond = bufferedReader.readLine(); //читаем строку с клавиатуры
        int iSecond = Integer.parseInt(sSecond);

        if (iFirst >= iSecond)
            System.out.println(iSecond);
        else
            System.out.println(iFirst);
    }
}