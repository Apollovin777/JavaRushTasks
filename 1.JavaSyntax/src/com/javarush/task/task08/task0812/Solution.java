package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
1. Программа должна выводить число на экран.
2. Программа должна считывать значения с клавиатуры.
3. В методе main объяви переменную типа ArrayList с типом элементов Integer и сразу проинициализируй ee.
4. Программа должна добавлять в коллекцию 10 чисел, согласно условию.
5. Программа должна выводить на экран длину самой длинной последовательности повторяющихся чисел в списке.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList < Integer >  list = new ArrayList < Integer >();
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(in);
        for(int i = 0; i < 10; i++)
            list.add(Integer.parseInt(buff.readLine()));

        //find long set
        int num = list.get(0);
        int count = 0, max = 0;
        for(int i: list)
            if(num == i){
                count++;
                max = (max < count)?count:max;
            }
            else {
                num = i;
                count = 1;
            }

        System.out.println(max);
    }
}