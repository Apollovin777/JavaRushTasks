package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        for(int i=0;i<10;i++){
            arr[i]= Integer.parseInt(reader.readLine());
        }
        int[] temp = new int[10];
        for(int i=0;i<10;i++){
            temp[i]=arr[i];
        }
        for(int i=0;i<10;i++){
            arr[i]=temp[9-i];
        }

        for(int i=0;i<10;i++){
            System.out.println(arr[i]);
        }
    }
}

