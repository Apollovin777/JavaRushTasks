package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        FileInputStream fileInputStream = new FileInputStream(fileName);

        int[] arr = new int[256];

        while (fileInputStream.available() > 0) {
            arr[fileInputStream.read()]++;
        }
        fileInputStream.close();

        for (int i = 0; i < arr.length; i++)
            if (arr[i] > 0)
                System.out.print(i + " ");
    }
    //    d:\test2.txt
}