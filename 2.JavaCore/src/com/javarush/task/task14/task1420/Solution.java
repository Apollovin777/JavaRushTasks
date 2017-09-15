package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws NumberFormatException,IOException {
        //Scanner scanner = new Scanner(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        if (a>0 && b>0){
            System.out.println(gcd(a,b));
        }
        else
            throw new NumberFormatException();


    }

    public static int gcd(int a, int b)
    {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
