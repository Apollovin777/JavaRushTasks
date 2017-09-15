package com.javarush.task.task08.task0813;

import java.util.HashSet;
import java.util.Set;

/* 
Создать множество строк (Set<String>), занести в него 20 сЛов на букву «Л».
Требования:
1. Программа не доЛжна выводить текст на экран.
2. Программа не доЛжна считывать значения с кЛавиатуры.
3. КЛасс Solution доЛжен содержать тоЛько два метода.
4. Метод createSet() доЛжен создавать и возвращать множество HashSet.
5. Множество из метода createSet() доЛжно содержать 20 сЛов на букву «Л».
*/

public class Solution {
    public static HashSet<String> createSet() {
        HashSet<String> set = new HashSet<String>();
        set.add("Лиза");
        set.add("Лира");
        set.add("Лама");
        set.add("Луза");
        set.add("Лак");
        set.add("Лук");
        set.add("Лимбо");
        set.add("Лавка");
        set.add("Лорка");
        set.add("Лора");
        set.add("Лунка");
        set.add("Лем");
        set.add("Лето");
        set.add("Ларс");
        set.add("Лом");
        set.add("Лог");
        set.add("Лоно");
        set.add("Лиман");
        set.add("Лоза");
        set.add("Ларец");

        return set;
    }

    public static void main(String[] args) {

    }
}
