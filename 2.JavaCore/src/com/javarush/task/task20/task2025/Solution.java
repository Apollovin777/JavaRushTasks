package com.javarush.task.task20.task2025;

import java.util.ArrayList;

/*
Алгоритмы-числа
*/
public class Solution {
    public static long[] getNumbers(long N) {
        long[] result = null;
        ArrayList<Long> list = new ArrayList<>();
        for(long j = 1; j<=N;j++){
            String s = Long.toString(j);
            long M = s.length();
            String[] arr;
            arr = s.split("");
            int[] intArr = new int[arr.length];
            for(int i=0;i<intArr.length;i++)
                intArr[i] = Integer.parseInt(arr[i]);
            long sum=0;
            for(int i =0;i<intArr.length;i++){

                sum = sum + (long)Math.pow(intArr[i],M);
            }
            if(sum == j) {
                list.add(sum);
            }

        }
        result = new long[list.size()];
        for(int i = 0; i < list.size(); i++)
            result[i]=list.get(i);
        return result;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
            long[] arr = getNumbers(1000000);
            System.out.println("Count numbers: " + arr.length);
        for (long n: arr
             ) {
            System.out.println(n);
        }
        long timeSpent = System.currentTimeMillis() - startTime;
        long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        System.out.println("Total memory: " + Runtime.getRuntime().totalMemory());
        System.out.println("Free memory: " + Runtime.getRuntime().freeMemory());
        System.out.println("Used memory: " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()));
        System.out.println("программа выполнялась " + timeSpent + " миллисекунд");


    }
}
