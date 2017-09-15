package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static final String key = "password";

    public static void main(String[] args)throws IOException {
       if(args[0].equals("-e")){
            EncriptFile(args[1],args[2]);
        }else if(args[0].equals("-d"))
            DecriptFile(args[1],args[2]);
    }

    public static void EncriptFile (String sourceFile, String encriptedFile)throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(sourceFile);
        byte[] buff = new byte[fileInputStream.available()];
        fileInputStream.read(buff);
        fileInputStream.close();
        buff = encrypt(buff,key);
        FileOutputStream fileOutputStream = new FileOutputStream(encriptedFile);
        fileOutputStream.write(buff);
        fileOutputStream.close();

    }

    public static void DecriptFile(String sourceFile, String dencriptedFile)throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream(sourceFile);
        byte[] buff = new byte[fileInputStream.available()];
        fileInputStream.read(buff);
        fileInputStream.close();
        buff = decrypt(buff,key);
        FileOutputStream fileOutputStream = new FileOutputStream(dencriptedFile);
        fileOutputStream.write(buff);
        fileOutputStream.close();
    }


    public static byte[] encrypt(byte[] arr, String keyWord)
    {
        byte[] keyarr = keyWord.getBytes();
        byte[] result = new byte[arr.length];
        for(int i = 0; i< arr.length; i++)
        {
            result[i] = (byte) (arr[i] ^ keyarr[i % keyarr.length]);
        }
        return result;
    }
    public static byte[] decrypt(byte[] result, String keyWord)
    {
        byte[] keyarr = keyWord.getBytes();
        for(int i = 0; i < result.length;i++)
        {
            result[i] = (byte) (result[i] ^ keyarr[i% keyarr.length]);
        }
        return result;
    }

}
