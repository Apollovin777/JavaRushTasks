package com.javarush.task.task05.task0510;

/* 
— Имя,
— Имя, вес, возраст
— Имя, возраст (вес стандартный)
— вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
— вес, цвет, адрес (чужой домашний кот)
*/

public class Cat {
    String name;
    int age;
    int weight;
    String color;
    String address;

    public void initialize(String name){
        this.name = name;
        this.weight = 3;
        this.age = 3;
        this.color = "white";
        this.address = null;
    }

    public void initialize(String name,int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "white";
        this.address = null;
    }

    public void initialize(String name,int age){
        this.name = name;
        this.age = age;
        this.weight = 3;
        this.color = "white";
        this.address = null;;
    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.name = null;
        this.address = null;
        this.age = 3;
    }

    public void initialize(int weight, String color,String address) {
        this.weight = weight;
        this.color = color;
        this.name = null;
        this.address = address;
        this.age = 3;
    }


    public static void main(String[] args) {

    }
}
