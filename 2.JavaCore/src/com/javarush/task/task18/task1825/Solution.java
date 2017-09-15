package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        List<String> list = new ArrayList<>();

        while (!((fileName=reader.readLine()).equals("end"))){
            list.add(fileName);
        }
        reader.close();
        Collections.sort(list);
        String resultFile = list.get(0).substring(0,list.get(0).lastIndexOf('.'));
        //System.out.println(resultFile);

        FileOutputStream fileOutputStream = new FileOutputStream(resultFile,true);

        for (String s:list ) {
            FileInputStream fileInputStream = new FileInputStream(s);
            byte[] buffer = new byte[fileInputStream.available()];
            fileInputStream.read(buffer, 0, buffer.length);
            fileOutputStream.write(buffer, 0, buffer.length);
            fileInputStream.close();
        }
        fileOutputStream.close();

    }
}
