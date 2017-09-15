package com.javarush.task.task20.task2003;


import java.io.*;
import java.util.*;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        InputStream inputStream= new FileInputStream(fileName);
        load(inputStream);
        inputStream.close();

    }

    public void save(OutputStream outputStream) throws Exception {
        Properties prop = new Properties();
        prop.putAll(properties);
        prop.store(outputStream,null);
    }

    public void load(InputStream inputStream) throws Exception {
        Properties params = new Properties();
        params.load(inputStream);
        properties.putAll((Map)params);

    }

    public static void main(String[] args) throws Exception{

        Solution solution = new Solution();
        solution.fillInPropertiesMap();

        for (Map.Entry<String,String> entry:properties.entrySet()
             ) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }




    }
}
