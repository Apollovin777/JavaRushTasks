package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String time = bufferedReader.readLine(); //читаем строку с клавиатуры
        float ftime = Float.parseFloat(time);

        float period = ftime % 5;

        if (period <= 3)
            System.out.println("зелёный");
        else
        {
            if (period > 3 && period <=4)
                System.out.println("желтый");
            else
                System.out.println("красный");
        }

    }
}