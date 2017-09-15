package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        int max = n1;
        if (n2>=max)
            max = n2;
        if (n3>=max)
            max = n3;

        int min = n1;
        if (n2<=min)
            min = n2;
        if (n3<=min)
            min=n3;
        int average=n1;
        if (n1>min && n1<max)
            average=n1;
        if (n2>min && n2<max)
            average=n2;
        if (n3>min && n3<max)
            average=n3;
        System.out.println(max +" "+average+" "+ min);
    }
}
