package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
1. Создать массив на 10 строк.
2. Ввести с клавиатуры 8 строк и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке.
    Каждый элемент — с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] arr = new String[10];
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<8;i++){
            arr[i]=scanner.next();
        }

        for(int i = 9;i>=0;i--)
            System.out.println(arr[i]);
    }
}