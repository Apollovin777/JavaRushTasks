package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Объяви переменную типа список целых чисел и сразу проинициализируй ee.
2. Считай 10 целых чисел с клавиатуры и добавь их в список.
3. Выведи числа в обратном порядке.
4. Используй цикл for.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0;i<10;i++)
            list.add(Integer.parseInt(reader.readLine()));

        for(int i = 9;i>=0;i--)
            System.out.println(list.get(i));

    }
}
