package com.javarush.task.taask;

import java.io.*;

public class FileRead {

    public static void main(String[] args) throws Exception
    {
        //создаем объект FileInputStream, привязанный к файлу «c:/data.txt».
        FileInputStream inputStream = new FileInputStream("d:/test1.txt");
        long sum = 0;
        System.out.println("available:" + inputStream.available());
        while (inputStream.available() > 0) //пока остались непрочитанные байты
        {
            int data = inputStream.read(); //прочитать очередной байт
            System.out.println(data);
            sum += data; //добавить его к общей сумме
        }
        inputStream.close(); // закрываем поток

        System.out.println("Sum:" + sum); //выводим сумму на экран.
    }
}
