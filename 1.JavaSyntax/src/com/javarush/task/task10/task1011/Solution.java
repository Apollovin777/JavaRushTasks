package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
           String s = "Я не хочу изучать Java, я хочу большую зарплату";
            for (int i = 0; i < 40; i++) {
                String d = s.substring(i,i+1);
                if (s.substring(i,i+1).contentEquals(" "))
                {
                    String v = s.substring(i+1);
                    System.out.println(s.substring(i+1));
                }
                else{
                    String v = s.substring(i);
                    System.out.println(s.substring(i));

                }

            }
        }
    }



