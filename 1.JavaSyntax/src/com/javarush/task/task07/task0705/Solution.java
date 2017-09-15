package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] bigArr = new int[20];
        int[] firstArr = new int[10];
        int[] secondArr = new int[10];

        for(int i=0;i<20;i++){
            bigArr[i]= Integer.parseInt(reader.readLine());
        }

        for(int i=0;i<20;i++){
            if (i<10)
                firstArr[i]=bigArr[i];
            else
                secondArr[i-10]=bigArr[i];
        }

        for(int i=0;i<10;i++)
            System.out.println(secondArr[i]);


    }
}
