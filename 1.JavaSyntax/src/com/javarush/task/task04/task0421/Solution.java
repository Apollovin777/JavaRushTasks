package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import sun.security.util.Length;

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String n1 = scanner.next();
        String n2 = scanner.next();

        if (n1.equals(n2))
            System.out.println("Имена идентичны");
        else{
            if(n1.length()==n2.length())
                System.out.println("Длины имен равны");
        }


    }
}
