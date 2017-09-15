package com.javarush.task.task04.task0426;

/* 
Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
«отрицательное четное число» — если число отрицательное и четное,
«отрицательное нечетное число» — если число отрицательное и нечетное,
«ноль» — если число равно 0,
«положительное четное число» — если число положительное и четное,
«положительное нечетное число» — если число положительное и нечетное.
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String temp = "";

        if (number==0)
            temp ="ноль";
        else
        {
            if (number>0)
                temp = "положительное";
            else
                temp = "отрицательное";
            if (number%2==0)
                temp = temp + " " + "четное число";
            else
                temp = temp + " " + "нечетное число";
        }
        System.out.println(temp);
    }
}
