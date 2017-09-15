package com.javarush.task.task12.task1204;

/* 
То ли птица, то ли лампа
*/

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        String str = o.getClass().getName();
        str = str.substring(str.indexOf('$')+1);
        switch (str) {
            case "Lamp":
                System.out.println("Лампа");
                break;
            case "Dog":
                System.out.println("Собака");
                break;
            case "Cat":
                System.out.println("Кошка");
                break;
            case "Bird":
                System.out.println("Птица");
                break;
        }


    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
