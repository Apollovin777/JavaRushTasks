package com.javarush.task.task08.task0807;

import java.util.*;

/* 
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Программа должна содержать только три метода.
4. Метод createArrayList() должен создавать и возвращать список ArrayList.
5. Метод createLinkedList() должен создавать и возвращать список LinkedList.
*/

public class Solution {
    public static Object createArrayList() {
        ArrayList<Object> list = new ArrayList<Object>();
        return list;

    }

    public static Object createLinkedList() {
        LinkedList<Object> list = new LinkedList<Object>();
        return list;
    }

    public static void main(String[] args) {

    }
}
