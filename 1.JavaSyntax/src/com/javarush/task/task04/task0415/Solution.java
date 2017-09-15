package com.javarush.task.task04.task0415;

/* 
Правило треугольника
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
        int iSecond= Integer.parseInt(sSecond);

        String sThird = bufferedReader.readLine(); //читаем строку с клавиатуры
        int iThird = Integer.parseInt(sThird);

        if (iFirst + iSecond > iThird)
        {
            if (iFirst + iThird > iSecond)
            {
                if (iSecond + iThird > iFirst)
                    System.out.println("Треугольник существует.");
                else
                    System.out.println("Треугольник не существует.");
            }
            else
                System.out.println("Треугольник не существует.");
        }
        else
            System.out.println("Треугольник не существует.");


    }
}