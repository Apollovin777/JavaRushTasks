package com.javarush.task.task06.task0607;

/* 
Создать статическую переменную int catCount в классе Cat.
Создай конструктор [public Cat()], в котором увеличивай данную переменную на 1.
*/

import java.awt.*;

public class Cat {
    public static int catCount;

    public Cat()
    {
        catCount++;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        System.out.println(Cat.catCount);

    }
}
