package com.javarush.task.task32.task3210;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
import java.util.Arrays;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args) throws IOException{
        String fileName = args[0];
        //String fileName = "D:\\tmp\\file1.txt";
        String number = args[1];
        //String number = "100";
        long position = Long.parseLong(number);
        String text = args[2];
        //String text = "dfsdfsdfsdf";

        RandomAccessFile file = new RandomAccessFile(fileName ,"rw");
        file.seek(position);
        byte[] arr = new byte[text.length()];
        file.read(arr,0,text.length());
        String readedText = convertByteToString(arr);
        file.seek(file.length());
        if (readedText.equals(text))
            file.write("true".getBytes());
        else
            file.write("false".getBytes());


    }

    public static String convertByteToString(byte readBytes[])
    {
        return new String(readBytes);
    }
}
