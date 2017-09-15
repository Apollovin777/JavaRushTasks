package com.javarush.task.task08.task0818;

import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только три метода.
4. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String,
    Integer состоящих из 10 записей по принципу «фамилия» - «зарплата».
5. Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Stallone", 100);
        map.put("Taylor", 200);
        map.put("Jackson", 300);
        map.put("Pitt", 400);
        map.put("Brosnan", 800);
        map.put("Perry", 900);
        map.put("Hewit", 1000);
        map.put("Berry", 700);
        map.put("Raider", 500);
        map.put("Knight", 600);
        return  map;

    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            if(iterator.next().getValue()<500)
               iterator.remove();
        }

    }

    public static void main(String[] args) {

    }
}