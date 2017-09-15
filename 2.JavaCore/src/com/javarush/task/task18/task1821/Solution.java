package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {


        char b;


        String file1 = args[0];


        FileInputStream fileInputStream = new FileInputStream(file1);
        int character;
        Map treeMap = new TreeMap<Integer,Integer>();
        while (fileInputStream.available()>0){
            character = fileInputStream.read();
            if(treeMap.containsKey(character)){
                treeMap.replace(character,(Integer)treeMap.get(character)+1);
            }
            else
                treeMap.put(character,1);

        }
        fileInputStream.close();
        Set<Integer> set = treeMap.entrySet();

        // Get an iterator
        Iterator i = set.iterator();

        // Display elements
        while(i.hasNext()) {
            Map.Entry<Integer,Integer> me = (Map.Entry)i.next();
            character = me.getKey();
            b = (char)character;
            System.out.println(b + " " + me.getValue());

        }


    }
}
