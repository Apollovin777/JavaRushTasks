package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[15];
        for(int i=0;i<15;i++)
            arr[i]= Integer.parseInt(reader.readLine());

        int oddSum=0;
        int pairSum=0;
        for(int i=0;i<15;i++){
            if(i % 2 == 0) {
                pairSum += arr[i];
            }
            else {
                oddSum += arr[i];
            }
        }
        if (oddSum>pairSum)
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        else
            System.out.println("В домах с четными номерами проживает больше жителей.");


    }
}
