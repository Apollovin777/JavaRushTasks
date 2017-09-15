package com.javarush.task.task08.task0815;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* 
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» — «Имя».
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.
Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только четыре метода.
4. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String,
 String состоящих из 10 записей по принципу «Фамилия» - «Имя».
5. Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
6. Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String,String> hashMap = new HashMap<String,String>();
        hashMap.put("Иванов","Иван");
        hashMap.put("Ковальчук","Василий");
        hashMap.put("Петров","Сергей");
        hashMap.put("Сидоров","Николай");
        hashMap.put("Сидор","Николай");
        hashMap.put("Пуго","Николай");
        hashMap.put("Лановой","Юрий");
        hashMap.put("Мальцев","Олег");
        hashMap.put("Никитин","Игорь");
        hashMap.put("Сергеев","Александр");

        return hashMap;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;
        Collection<String> values = map.values();
        for(String str:values){
            if(str.equals(name))
                count++;
        }
        return count;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count = 0;
        Set<String> keys = map.keySet();
        for(String str:keys){
           if(str.equals(lastName))
                count++;
        }
        return count;

    }

    public static void main(String[] args) {


    }
}
