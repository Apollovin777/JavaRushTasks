package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        FileInputStream fileInputStream = new FileInputStream(fileName);

        int count = 0;
        int comaCode = (int)',';



        while (fileInputStream.available() > 0) {
            if(fileInputStream.read()==comaCode)
                count++;
        }
        fileInputStream.close();
        System.out.println(count);
    }

    //   d:\test2.txt
}
