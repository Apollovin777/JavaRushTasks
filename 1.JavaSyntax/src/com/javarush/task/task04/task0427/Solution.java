package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();

        String temp;

        if (number >= 1 && number <= 999)
        {
            if (number % 2==0)
                temp = "четное";
            else
                temp = "нечетное";

            if (number.toString().length() == 1)
                temp = temp + " однозначное число";
            else
            {
                if (number.toString().length() == 2)
                    temp = temp + " двузначное число";
                else
                    temp = temp + " трехзначное число";
            }
            System.out.println(temp);
        }


    }
}
