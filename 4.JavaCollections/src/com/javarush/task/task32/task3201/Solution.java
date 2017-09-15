package com.javarush.task.task32.task3201;

import java.io.IOException;
import java.io.RandomAccessFile;

/*
Запись в существующий файл
*/
public class Solution {
    public static void main(String... args) throws IOException {
        String fileName = args[0];
        //String fileName = "D:\\tmp\\file1.txt";
        String number = args[1];
        //String number = "100";
        long position = Long.parseLong(number);
        String text = args[2];
        //String text = "dfsdfsdfsdf";

        RandomAccessFile file = new RandomAccessFile(fileName ,"rw");
        if (file.length()<position)
            position=file.length();

        file.seek(position);
        file.write(text.getBytes());
        file.close();
    }
}
