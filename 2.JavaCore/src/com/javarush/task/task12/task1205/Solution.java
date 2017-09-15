package com.javarush.task.task12.task1205;

/* 
6. Метод getObjectType() должен возвращать одно значение из: «Корова», «Кит», «Собака»,
 «Неизвестное животное» в зависимости от переданного объекта. Например "Корова" для объектов типа Solution.Cow.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));

    }

    public static String getObjectType(Object o) {
        String str = o.getClass().getName();
        str = str.substring(str.indexOf('$')+1);
        switch (str) {
            case "Cow":
                return "Корова";
            case "Dog":
                return "Собака";
            case "Whale":
                return "Кит";
            default: return "Неизвестное животное";
        }

    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
