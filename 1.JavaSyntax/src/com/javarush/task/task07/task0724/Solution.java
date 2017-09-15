package com.javarush.task.task07.task0724;

/* 
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
Вывести объекты на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Human grF1 = new Human("Jack",true,70);

        Human grF2 = new Human("John",true,65);

        Human grM1 = new Human("Jecky",false,63);

        Human grM2 = new Human("Molly",false,64);

        Human Father = new Human("Bill",true,35,grF1,grM1);

        Human Mother = new Human("Barbara",false,30,grF2,grM2);

        Human ch1 = new Human("Nick",true,4,Father,Mother);

        Human ch2 =  new Human("Kristina",false,2,Father,Mother);

        Human ch3 =  new Human("Arnold",true,7,Father,Mother);

        System.out.println(grF1.toString());
        System.out.println(grF2.toString());
        System.out.println(grM1.toString());
        System.out.println(grM2.toString());
        System.out.println(Father.toString());
        System.out.println(Mother.toString());
        System.out.println(ch1.toString());
        System.out.println(ch2.toString());
        System.out.println(ch3.toString());
    }

    public static class Human {
        String name;
        Boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex,int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex,int age,Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















