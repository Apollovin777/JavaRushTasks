package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.*;
import java.nio.CharBuffer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        reader.close();

        FileReader fileReader = new FileReader(fileName1);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        StringBuilder sb = new StringBuilder("");
        int count = 0;
        String s ="";
        while(bufferedReader.ready()) {
            s+=String.valueOf((char)bufferedReader.read());
        }
        bufferedReader.close();
        String[] arr = s.split( "\\W");
        for(String t: arr) {
            if(t.equals("world")) count++;
        }

        System.out.println(count);
    }
}
