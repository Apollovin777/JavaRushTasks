package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Самые редкие байты
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

        int min = 256;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] < min)
                min = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min)
                System.out.print(i + " ");
        }

        //d:\test2.txt
    }
}
