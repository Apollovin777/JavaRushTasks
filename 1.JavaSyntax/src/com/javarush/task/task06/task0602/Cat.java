package com.javarush.task.task06.task0602;

/* 
В каждом классе Cat и Dog написать метод finalize, который выводит на экран текст о том, что такой-то объект уничтожен.
*/

public class Cat {
    public static void main(String[] args) {

    }

    String name;

    protected void finalize() throws Throwable{
        System.out.println("Cat was destroyed");
    }

}

class Dog {
    String name;

    protected void finalize() throws Throwable{
        System.out.println("Dog was destroyed");
    }
}
