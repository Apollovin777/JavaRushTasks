package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args)throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();

        reader.close();

        FileInputStream fileInputStream1 = new FileInputStream(fileName1);
        FileOutputStream fileOutputStream1 = new FileOutputStream(fileName2);
        FileOutputStream fileOutputStream2  = new FileOutputStream(fileName3);

        int fileSize = fileInputStream1.available();
        byte[] bufferStart;
        if (fileSize % 2 ==0)
            bufferStart = new byte[fileSize/2];
        else
            bufferStart = new byte[fileSize/2+1];

        fileInputStream1.read(bufferStart,0,bufferStart.length);
        fileOutputStream1.write(bufferStart);

        byte[] bufferEnd = new byte[fileSize-bufferStart.length];
        fileInputStream1.read(bufferEnd);
        fileOutputStream2.write(bufferEnd);

        fileInputStream1.close();
        fileOutputStream1.close();
        fileOutputStream2.close();

    }
}
