package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        FileOutputStream fileOutputStream = new FileOutputStream(file1);
        FileInputStream fileInputStream = new FileInputStream(file2);

        while (fileInputStream.available()>0){
            fileOutputStream.write(fileInputStream.read());
        }
        fileInputStream.close();
        fileOutputStream.close();

        fileOutputStream = new FileOutputStream(file1,true);
        fileInputStream = new FileInputStream(file3);

        while (fileInputStream.available()>0){
            fileOutputStream.write(fileInputStream.read());
        }

        fileInputStream.close();
        fileOutputStream.close();

    }
}
