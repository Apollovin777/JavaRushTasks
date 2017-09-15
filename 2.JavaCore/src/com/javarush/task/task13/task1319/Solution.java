package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Запись в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        String output = reader.readLine();
        while (!output.equals("exit")){
            writer.write(output);
            writer.newLine();
            output = reader.readLine();
        }
        writer.write(output);
        writer.close();
        reader.close();

    }
}
