package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();


        FileInputStream fileInputStream = new FileInputStream(file1);
        byte[] tempArray = new byte[fileInputStream.available()];

        fileInputStream.read(tempArray);
        fileInputStream.close();

        fileInputStream = new FileInputStream(file2);
        FileOutputStream fileOutputStream = new FileOutputStream(file1);

        while (fileInputStream.available()>0){
            fileOutputStream.write(fileInputStream.read());
        }
        fileOutputStream.close();
        fileInputStream.close();

        fileOutputStream = new FileOutputStream(file1,true);

        fileOutputStream.write(tempArray);

        fileOutputStream.close();
    }
}
