package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;
import java.util.ArrayList;

import java.util.List;


public class Solution {
    public static void main(String[] args) throws IOException {
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
        boolean flag = false;
        for (int j = 0;j<list.size();j++) {
            String[] arr = list.get(j).split(" ");
            for (int i = 0; i<arr.length;i++) {
                if(arr[i].length()>6) {
                    if(flag)
                        bufferedWriter.write("," + arr[i]);
                    else
                        bufferedWriter.write(arr[i]);
                    flag = true;
                }
            }
        }
        bufferedWriter.flush();
        writer.close();
    }
}
