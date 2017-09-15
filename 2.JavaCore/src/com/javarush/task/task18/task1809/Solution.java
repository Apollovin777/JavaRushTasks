package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        FileInputStream fileInputStream = new FileInputStream(fileName1);
        FileOutputStream fileOutputStream = new FileOutputStream(fileName2);

        int fileSize = fileInputStream.available();

        byte[] array = new byte[fileSize];
        byte[] revArray = new byte[fileSize];
        fileInputStream.read(array);
        for(int i = array.length-1;i>=0;i--){
            revArray[i] = array[array.length-i-1];
        }
        fileOutputStream.write(revArray);
        fileInputStream.close();
        fileOutputStream.close();
    }
}
