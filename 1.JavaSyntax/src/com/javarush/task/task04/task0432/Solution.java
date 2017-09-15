package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int a = scanner.nextInt();

        while (a>0){
            System.out.println(str);
            a--;
        }

    }
}
