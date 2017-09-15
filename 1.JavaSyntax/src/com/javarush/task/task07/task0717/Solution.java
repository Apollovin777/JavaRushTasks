package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Выведи результат на экран, каждое значение с новой строки.


Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Считай 10 строк с клавиатуры и добавь их в список.
3. Метод doubleValues должен удваивать элементы списка по принципу a,b,c -> a,a,b,b,c,c..
4. Выведи получившийся список на экран, каждый элемент с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        ArrayList<String> result = doubleValues(list);

        for (int i=0;i<result.size();i++)
            System.out.println(result.get(i));

    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> doubleList = new ArrayList<String>();
        int listSize = list.size();

        for (int i = 0; i < listSize; i++) {
            doubleList.add(list.get(i));
            doubleList.add(list.get(i));
        }

        return doubleList;
    }
}
