package com.javarush.task.task08.task0827;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.Locale;

/* 
1. Программа должна выводить текст на экран.
2. Класс Solution должен содержать два метода.
3. Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число, иначе false.
4. Метод main() должен вызывать метод isDateOdd().
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("APRIL 20 2017"));

    }

    public static boolean isDateOdd(String date) {
        Date date1 = new Date(date);
        Date date2 = new Date(date);
        date1.setHours(0);
        date1.setMinutes(0);
        date1.setSeconds(0);
        date1.setDate(0);
        date1.setMonth(0);

        long msTimeDiff = date2.getTime() - date1.getTime();
        long msDay = 24 * 60 * 60 * 1000;
        int dayCount = (int) (msTimeDiff/msDay);

        boolean result;

        if (dayCount%2 != 0)
            result = true;
        else
            result = false;

        return result;

    }
}
