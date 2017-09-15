package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
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

        String sThird = bufferedReader.readLine(); //читаем строку с клавиатуры
        int iThird = Integer.parseInt(sThird);

        String result = "";

        if (iFirst == iSecond)
            result = iFirst + " " + iSecond;
        else
        {
            if (iFirst == iThird)
                result = iFirst + " " + iThird;
            else
            {
                if (iSecond == iThird)
                    result = iSecond + " " + iThird;
            }
        }

        if (iFirst == iSecond && iSecond == iThird)
            result = iFirst + " " + iSecond + " " + iThird;
        if (result!="")
            System.out.println(result);
    }
}