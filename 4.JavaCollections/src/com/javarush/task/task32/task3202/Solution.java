package com.javarush.task.task32.task3202;

import java.io.*;

/* 
Читаем из потока
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        StringWriter writer = getAllDataFromInputStream(new FileInputStream("D:\\tmp\\file1.txt"));
        System.out.println(writer.toString());
    }

    public static StringWriter getAllDataFromInputStream(InputStream is) throws IOException {
        try {
            StringWriter writer = new StringWriter(0);
            BufferedInputStream inputStream = new BufferedInputStream(is);
            byte[] buffer = new byte[5];
            int i =0;
            while ((i=inputStream.read(buffer,0,5))>-1){
                String s = new String(buffer,0,i);
                //inputStream.read(buffer);
                writer.write(new String(buffer,0,i));
            }
            return writer;
        }
        catch (Exception e){
            StringWriter writer = new StringWriter(0);
            return writer;
        }

    }
}

