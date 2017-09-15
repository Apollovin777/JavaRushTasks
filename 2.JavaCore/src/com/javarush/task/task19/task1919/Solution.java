package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        String filename = args[0];
        FileReader reader = new FileReader(filename);
        BufferedReader br = new BufferedReader(reader);
        TreeMap<String,Float> treeMap = new TreeMap<>();

        while (br.ready()){
            String[] arr = br.readLine().split(" ");
            Float value = Float.parseFloat(arr[1]);
            if(treeMap.containsKey(arr[0]))
                treeMap.replace(arr[0],treeMap.get(arr[0]),treeMap.get(arr[0])+value);
            else
                treeMap.put(arr[0],value);
        }
        //br.close();
        reader.close();

        for (Map.Entry g:treeMap.entrySet()
             ) {
            System.out.println(g.getKey() + " " + g.getValue());
        }

    }
}
