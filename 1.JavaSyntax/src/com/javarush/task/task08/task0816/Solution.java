package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» — «дата рождения».
Удалить из словаря всех людей, родившихся летом.
Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только три метода.
4. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Date состоящий из 10 записей.
5. Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Taylor", new Date("JULY 1 1980"));
        map.put("Jackson", new Date("APRIL 1 1980"));
        map.put("Pitt", new Date("APRIL 1 1980"));
        map.put("Brosnan", new Date("FEBRUARY 1 1980"));
        map.put("Perry", new Date("MARCH 1 1980"));
        map.put("Hewit", new Date("APRIL 1 1980"));
        map.put("Berry", new Date("MAY 1 1980"));
        map.put("Raider", new Date("MAY 1 1980"));
        map.put("Knight", new Date("JUNE 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<Map.Entry<String,Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Date> mapEntry = iterator.next();
            if(mapEntry.getValue().getMonth()>4 && mapEntry.getValue().getMonth()<8) {
                System.out.println(mapEntry.getValue().getMonth());
                iterator.remove();
            }
        }

    }

    public static void main(String[] args) {

    }
}
