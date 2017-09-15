package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        int count = 0;

        if (n1 > 0)
            count++;
        if (n2 > 0)
            count++;
        if (n3 > 0)
            count++;
        System.out.println(count);
    }
}
