package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        int[] arr = new int[20];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0;i < 20; i++)
            arr[i]=scanner.nextInt();
        return arr;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int n:array
             ) {
            if (n>max)
                max = n;
        }
        return max;
    }
}
