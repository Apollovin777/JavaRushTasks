package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        FileInputStream fileInputStream = new FileInputStream(fileName);

        int[] arr = new int[256];

        while (fileInputStream.available()>0){
            arr[fileInputStream.read()]++;
        }
        fileInputStream.close();

        int max = 0;
        for(int i = 0;i<arr.length;i++){
            if (arr[i]>max)
                max = arr[i];
        }

        for(int i = 0;i<arr.length;i++){
            if (arr[i] == max)
                System.out.print(i + " ");
        }

        //d:\test2.txt



    }
}
