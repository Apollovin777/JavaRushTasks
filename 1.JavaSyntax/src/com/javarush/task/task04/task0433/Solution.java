package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        String str = "S";
        int i = 10,j=10;

        while (i>0){
            while (j>0){
                System.out.print(str);
                j--;
            }
            j = 10;
            i--;
            System.out.println();
        }

    }
}
