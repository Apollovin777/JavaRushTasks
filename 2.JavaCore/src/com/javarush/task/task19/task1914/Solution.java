package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;

        //Создаем динамический массив
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        //создаем адаптер к классу PrintStream
        PrintStream stream = new PrintStream(outputStream);
        //Устанавливаем его как текущий System.out
        System.setOut(stream);

        //Вызываем функцию, которая ничего не знает о наших манипуляциях
        testString.printSomething();

        //Преобразовываем записанные в наш ByteArray данные в строку
        String result = outputStream.toString();

        //Возвращаем все как было
        System.setOut(consoleStream);


        String[] s = result.split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[2]);
        int c = 0;
        switch (s[1]) {
            case "+":
            c = a + b;
            break;
            case "-":
            c = a - b;
            break;
            case "*":
            c = a * b;
            break;
        }


        StringBuilder stringBuilder = new StringBuilder(result + c);
        String upperCaseString = stringBuilder.toString();

        //выводим ее в консоль
        System.out.println(upperCaseString);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

