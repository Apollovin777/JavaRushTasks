package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException,InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename;
        List<ReadThread> list = new ArrayList<>();
        while (!(filename=reader.readLine()).equals("exit")){
            new ReadThread(filename).start();

        }




    }

    public static class ReadThread extends Thread {
        private String fileName;
        public ReadThread(String fileName) throws IOException{
            super(fileName);
            this.fileName = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут

        @Override
        public void run() {
            //System.out.println(this.getName() + " starts");
            try {
                FileInputStream fileInputStream = new FileInputStream(this.fileName);
                byte[] arr = new byte[256];
                int character;
                while (fileInputStream.available() > 0) {
                    character = fileInputStream.read();
                    arr[character]++;
                }
                fileInputStream.close();
                int max = 0;
                int index = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                        index = i;
                    }

                }

                resultMap.put(this.fileName, index);
               // System.out.println(this.getName() + " normally ends");

            }catch (IOException e){}


        }
    }
}
