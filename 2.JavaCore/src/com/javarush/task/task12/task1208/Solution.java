package com.javarush.task.task12.task1208;

/* 
Свобода печати
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static void print(int d){
        System.out.println(d);
    }
    public static void print(int d,String pref){
        System.out.println(pref + d);
    }
    public static void print(int d,String pref,String suff){
        System.out.println(pref + d + suff);
    }
    public static void print(String pref){
        System.out.println(pref);
    }
    public static void print(long d,String pref){
        System.out.println(pref + d);
    }
}
