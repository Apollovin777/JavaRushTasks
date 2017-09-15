package com.javarush.task.task06.task0604;

/* 
В конструкторе класса Cat [public Cat()] увеличивать
счётчик котов (статическую переменную этого же класса
 catCount) на 1. В методе finalize уменьшать на 1.
*/

public class Cat {
    public static int catCount = 0;

    public Cat(){
        catCount++;
    }

    @Override
    protected void finalize() throws Throwable{
        super.finalize();
        catCount--;
    }

    public static void main(String[] args) {
        Cat cat;
        for(int i=0;i<5000000;i++){
            cat = new Cat();
        }

        System.out.println(Cat.catCount);
    }
}