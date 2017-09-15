package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int n4 = scanner.nextInt();

        int max = n1;

        if (n2>=n1)
            max = n2;

        if (n3>=n2)
            max = n3;

        if (n4>=n3)
            max = n4;


        System.out.println(max);

    }
}
