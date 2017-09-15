package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
количество отрицательных чисел: 0
количество положительных чисел: 3
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        int countPos = 0;
        int countNeg = 0;

        if (n1 > 0)
            countPos++;
        else
            if (n1 < 0)
                countNeg++;
        if (n2 > 0)
            countPos++;
        else
            if (n2 < 0)
                countNeg++;
        if (n3 > 0)
            countPos++;
        else
            if (n3 < 0)
            countNeg++;


        System.out.println("количество отрицательных чисел: " + countNeg);
        System.out.println("количество положительных чисел: " + countPos);

    }
}
