package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String fileName = "c:\\tmp\\file1.txt";
        String fileName = reader.readLine();
        reader.close();

        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        //List<String> list = new ArrayList<>();
        String str;
        StringBuilder sb = new StringBuilder();
        while (bufferedReader.ready()){
            str = bufferedReader.readLine();
            System.out.println(sb.append(str).reverse().toString());
            sb.setLength(0);
        }
        fileReader.close();
    }
}
