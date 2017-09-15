package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
boolean readBoolean() – читает с клавиатуры строку «true» или «false» и
возвращает соответствующую логическую переменную true или false

Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода.
*/

public class ConsoleReader {

   public static String readString() throws Exception {
       return new BufferedReader(new InputStreamReader(System.in)).readLine();
   }

   public static int readInt() throws Exception {
       return Integer.parseInt(ConsoleReader.readString());
   }

   public static double readDouble() throws Exception {
        return Double.parseDouble(ConsoleReader.readString());
   }

   public static boolean readBoolean() throws Exception {
        return Boolean.parseBoolean(ConsoleReader.readString());
   }

    public static void main(String[] args) throws Exception{

    }
}
