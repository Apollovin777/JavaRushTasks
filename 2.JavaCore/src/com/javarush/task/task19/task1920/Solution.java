package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException{

        String filename = args[0];
        //String filename = "C:\\tmp\\file1.txt";
        FileReader reader = new FileReader(filename);
        BufferedReader br = new BufferedReader(reader);
        TreeMap<String,Double> treeMap = new TreeMap<>();

        while (br.ready()){
            String[] arr = br.readLine().split(" ");
            Double value = Double.parseDouble(arr[1]);
            if(treeMap.containsKey(arr[0]))
                treeMap.replace(arr[0],treeMap.get(arr[0]),treeMap.get(arr[0])+value);
            else
                treeMap.put(arr[0],value);
        }
        reader.close();

        Double maxVal = Collections.max(treeMap.values());;

        for (Map.Entry g:treeMap.entrySet()
                ) {
            if(g.getValue().equals(maxVal))
                System.out.println(g.getKey());
        }

    }
}
