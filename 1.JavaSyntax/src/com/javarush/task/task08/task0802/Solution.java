package com.javarush.task.task08.task0802;

/* 
1. Объяви переменную коллекции HashMap с типом элементов String, String и сразу проинициализируй ee.
2. Программа не должна считывать значения с клавиатуры.
3. Программа должна добавлять в коллекцию 10 пар строк, согласно условию.
4. Программа должна выводить содержимое коллекции на экран, каждую пару через дефис и с новой строки.
арбуз — ягода,
банан — трава,
вишня — ягода,
груша — фрукт,
дыня — овощ,
ежевика — куст,
жень-шень — корень,
земляника — ягода,
ирис — цветок,
картофель — клубень.
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String,String> map = new HashMap<String,String>();

        map.put("арбуз","ягода");
        map.put("банан","трава");
        map.put("груша","фрукт");
        map.put("вишня","ягода");
        map.put("дыня","овощ");
        map.put("ежевика","куст");
        map.put("жень-шень","корень");
        map.put("земляника","ягода");
        map.put("ирис","цветок");
        map.put("картофель","клубень");

        for(Map.Entry<String,String>pair : map.entrySet()){
            System.out.println(pair.getKey() + " - "+pair.getValue());
        }


    }
}
