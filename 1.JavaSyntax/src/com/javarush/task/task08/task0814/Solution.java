package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Random;

/* 
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только три метода.
4. Метод createSet() должен создавать и возвращать множество HashSet состоящих из 20 различных чисел.
5. Метод removeAllNumbersMoreThan10() должен удалять из множества все числа больше 10.
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> set = new HashSet<Integer>();
        Random rnd = new Random(34);
        Integer temp = 0;
        for(int i = 0;i<20;i++){
            temp = rnd.nextInt(40);
            while (set.contains(temp)){
               temp = rnd.nextInt(40);
            }
            set.add(temp);
        }
        return  set;

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {


        for (Iterator<Integer> iterator = set.iterator(); iterator.hasNext();) {
            Integer integer = iterator.next();
            if (integer > 10)
                iterator.remove();
        }

        return set;
    }

    public static void main(String[] args) {
        HashSet<Integer> set = createSet();
        set = removeAllNumbersMoreThan10(set);
    }
}
