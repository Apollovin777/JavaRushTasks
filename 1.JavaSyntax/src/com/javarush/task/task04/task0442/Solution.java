package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int sum = 0;

        while (number!=-1){
            number = scanner.nextInt();
            sum+=number;
        }

        System.out.println(sum);

    }
}
