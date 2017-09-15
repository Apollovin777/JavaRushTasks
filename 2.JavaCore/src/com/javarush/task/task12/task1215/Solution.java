package com.javarush.task.task12.task1215;

/* 
Кошки не должны быть абстрактными!
*/

public class Solution {
    public static void main(String[] args) {
        Cow cow = new Cow();
        Whale whale = new Whale();

        Object o = cow;


    }

    static class Cow
    {
        public void printAll()
        {
            printColor();
            printName();
        }
        public void printColor()
        {
            System.out.println("Я - белая");
        }
        public void printName()
        {
            System.out.println("Я - корова");
        }
    }

    static class Whale extends Cow
    {
        public void printName()
        {
            System.out.println("Я - кит");
        }
    }


}
