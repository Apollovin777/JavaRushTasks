package com.javarush.task.task19.task1904;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private final Scanner fileScanner;

        PersonScannerAdapter(Scanner scanner){
            this.fileScanner = scanner;
        }

        @Override
        public Person read() throws IOException {
            String line = fileScanner.nextLine();
            String[] string = line.split(" ");
            Date date = new Date(Integer.parseInt(string[3].substring(2)),Integer.parseInt(string[4])-1,Integer.parseInt(string[5]));
            return new Person(string[0],string [1], string[2],date);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
