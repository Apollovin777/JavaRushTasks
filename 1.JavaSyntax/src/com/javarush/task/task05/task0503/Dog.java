package com.javarush.task.task05.task0503;


/* 
Геттеры и сеттеры для класса Dog
*/

public class Dog {
    String name;
    int age;

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setAge (int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return this.age;
    }

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.setName("Jack");
        dog.setAge(5);

        System.out.println(dog.getName());
        System.out.println(dog.getAge());

    }
}
