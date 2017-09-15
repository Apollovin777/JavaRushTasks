package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Консоль-копилка
*/

public class Solution {

        public static void main(String [] args)
        {
            String a = new String("1");  // Line1
            String b = new String ("2");     // Line2
            String c = new String("3"); // Line3
            System.out.println(a + " " + b + " " + c);
            a = null;                     // Line4
            System.out.println(a + " " + b + " " + c);
            a = c;                        // Line5
            System.out.println(a + " " + b + " " + c);
            c = b;                        // Line6
            System.out.println(a + " " + b + " " + c);
            b = a;                        // Line7
            System.out.println(a + " " + b + " " + c);
            // Rest of the code here
        }

}
