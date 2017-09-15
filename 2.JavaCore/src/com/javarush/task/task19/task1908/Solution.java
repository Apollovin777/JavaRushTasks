package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        FileReader fileReader = new FileReader(file1);
        BufferedReader bufferedReader = new BufferedReader(fileReader);


        String s = "";
        while (bufferedReader.ready())
            s = s + bufferedReader.readLine();
        bufferedReader.close();
        fileReader.close();

        String[] a = s.split(" ");

        FileWriter fileWriter = new FileWriter(file2);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (String el:a
             ) {
            if(el.matches("\\d+")) {
                bufferedWriter.write(el);
                bufferedWriter.write(" ");
            }
        }
        bufferedWriter.close();
        fileWriter.close();
    }
}
