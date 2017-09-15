package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
        Date currDate = new Date();
        String data = sdf.format(currDate);

        System.out.println(data);
    }
}
