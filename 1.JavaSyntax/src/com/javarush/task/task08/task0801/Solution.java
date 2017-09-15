package com.javarush.task.task08.task0801;

/* 
1. Объяви переменную коллекции HashSet с типом элементов String и сразу проинициализируй ee.
2. Программа не должна считывать строки с клавиатуры.
3. Программа должна добавлять в коллекцию 10 строк, согласно условию.
4. Программа должна выводить 10 строк из коллекции на экран, каждую с новой строки.
арбуз, банан, вишня, груша, дыня, ежевика, жень-шень, земляника, ирис, картофель
*/

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashSet<String> set = new HashSet<String>();
        set.add("z");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");
        set.add("f");
        set.add("g");
        set.add("h");
        set.add("i");
        set.add("v");

        for(String str:set){
            System.out.println(str);
            System.out.println(str.hashCode());
        }




    }
}
