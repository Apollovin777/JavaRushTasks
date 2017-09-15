package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        float sum = 0;
        int count = 0;
        while (true)
        {
            number = scanner.nextInt();
            if (number !=-1) {
                sum += number;
                count++;
            }
            else
                break;
        }

        System.out.println(sum/count);
    }
}

