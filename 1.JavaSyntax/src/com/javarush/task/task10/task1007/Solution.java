package com.javarush.task.task10.task1007;

/* 
Задача №7 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        char ch = '9';

        // c использованием метода getNumericValue
        // класса Character
        int i1 = Character.getNumericValue(ch);
        System.out.println(i1);

        // c использованием метода digit класса Character
        int i2 = Character.digit(ch,10);
        System.out.println(i2);
    }
}