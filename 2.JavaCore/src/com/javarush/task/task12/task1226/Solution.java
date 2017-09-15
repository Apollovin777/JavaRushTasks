package com.javarush.task.task12.task1226;

/* 
1. Внутри класса Solution создай интерфейс public interface Fly(летать) с методом void fly().
2. Внутри класса Solution создай интерфейс public interface Climb(лазить по деревьям) с методом void climb().
3. Внутри класса Solution создай интерфейс public interface Run(бегать) с методом void run().
*/

public class Solution {

    public interface Fly{
        public void fly();
    }

    public interface Climb{
        public void climb();
    }

    public interface Run{
        public void run();
    }

    public abstract class Cat implements Climb,Run{

    }

    public abstract class Dog implements Run{
    }

    public abstract class Tiger extends Cat {
    }

    public abstract class Duck implements Fly,Run{
    }
}
