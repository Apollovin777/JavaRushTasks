package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException{
        String file1 = args[0];
        String file2 = args[1];
        //String file1 = "C:\\tmp\\file1.txt";
        //String file2 = "C:\\tmp\\file2.txt";

        FileReader fileReader = new FileReader(file1);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<String> list = new ArrayList<>();

        while (bufferedReader.ready()){
            list.add(bufferedReader.readLine());
        }
        fileReader.close();

        FileWriter writer = new FileWriter(file2);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        Pattern p = Pattern.compile("\\d");
        for (String s:list ) {
            String[] arr = s.split(" ");
            for (int i=0;i<arr.length;i++){
                Matcher m = p.matcher(arr[i]);
                if(m.find()) {
                    bufferedWriter.write(arr[i]);
                    bufferedWriter.write(" ");
                }
            }
        }
        bufferedWriter.flush();
        writer.close();



    }
}
