package com.javarush.task.task32.task3213;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/* 
Шифр Цезаря
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        StringReader reader = new StringReader("Khoor Dpljr");
        System.out.println(decode(reader, -3));  //Hello Amigo

    }

    public static String decode(StringReader reader, int key) throws IOException {

        try {
            StringWriter stringWriter = new StringWriter();

            char[] chars = new char[10];

            int i = 0;
            while ((i = reader.read(chars)) > -1) {

                for (int j = 0; j < i; j++) {
                    chars[j] = (char) ((int) chars[j] + key);
                }
                stringWriter.write(chars, 0, i);

            }
            return stringWriter.toString();
        }
        catch (Exception e){
            return new String();
        }
    }

}
