package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        if (n1>0 && n2>0)
            System.out.println(1);
        if (n1<0 && n2>0)
            System.out.println(2);
        if (n1>0 && n2<0)
            System.out.println(4);
        if (n1<0 && n2<0)
            System.out.println(3);
    }
}
