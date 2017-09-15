package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        if (n1!=n2 && n1!=n3 && n2==n3)
            System.out.println(1);
        if (n2!=n1 && n2!=n3 && n1==n3)
            System.out.println(2);
        if (n3!=n1 && n3!=n2 && n1==n2)
            System.out.println(3);
    }
}
