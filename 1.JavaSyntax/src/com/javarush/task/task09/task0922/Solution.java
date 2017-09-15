package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
1. Программа должна считывать данные с клавиатуры.
2. В программе должна быть объявлена переменная типа SimpleDateFormat.
3. В программе должна быть объявлена переменная типа Date.
4. Все переменные должны быть проинициализированы.
5. Программа должна выводить данные на экран.
6. Вывод должен соответствовать заданию.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String d = reader.readLine();
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        try {
            date = format.parse(d);
        }
        catch (ParseException e)
        {
            System.out.println("Wrong data format.");
        }
        format.applyPattern("MMM dd, yyyy");
        System.out.println(format.format(date).toUpperCase());
    }
}
