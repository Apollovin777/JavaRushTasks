package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException{
        String fileName;
        int ch,count=0;
        if(args.length > 0) {
            fileName = args[0];
            FileInputStream fileInputStream = new FileInputStream(fileName);
            while (fileInputStream.available()>0){
                ch = fileInputStream.read();
                if(ch > 64 && ch < 123 )
                    count++;
            }
            fileInputStream.close();
            System.out.println(count);
        }

    }
}
