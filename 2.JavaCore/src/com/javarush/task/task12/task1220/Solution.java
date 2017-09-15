package com.javarush.task.task12.task1220;

/* 
1. Класс Solution должен содержать интерфейс Run с одним методом.
2. Класс Solution должен содержать интерфейс Swim с одним методом.
3. Класс Solution должен содержать класс Human.
4. Класс Human должен реализовывать интерфейсы Run и Swim.
5. Класс Human должен быть абстрактным.
6. Класс Human не должен иметь методо
*/

public class Solution {
    public static void main(String[] args) {
    }
    public interface Run{
        public void run();
    }
    public interface Swim{
        public void swim();
    }
    public abstract class Human implements Run,Swim{

    }


    //add public interfaces and public class here - добавь public интерфейсы и public класс тут
}
