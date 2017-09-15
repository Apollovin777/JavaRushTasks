package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human child1 = new Human();
        child1.name = "child1";
        child1.age = 10;
        child1.sex = true;

        Human child2 = new Human();
        child2.name = "child2";
        child2.age = 7;
        child2.sex = true;

        Human child3 = new Human();
        child3.name = "child3";
        child3.age = 5;
        child3.sex = true;

        Human mother = new Human();
        mother.name = "mother";
        mother.sex = false;
        mother.age = 35;
        mother.children.add(child1);
        mother.children.add(child2);
        mother.children.add(child3);

        Human father = new Human();
        father.name = "father";
        father.sex = true;
        father.age = 37;
        father.children.add(child1);
        father.children.add(child2);
        father.children.add(child3);

        Human grandfa1 = new Human();
        grandfa1.name = "grandfa1";
        grandfa1.sex = true;
        grandfa1.age = 60;
        grandfa1.children.add(father);

        Human grandma1 = new Human();
        grandma1.name = "grandma1";
        grandma1.sex = false;
        grandma1.age = 60;
        grandma1.children.add(father);

        Human grandfa2 = new Human();
        grandfa2.name = "grandfa2";
        grandfa2.sex = true;
        grandfa2.age = 60;
        grandfa2.children.add(mother);

        Human grandma2 = new Human();
        grandma2.name = "grandma2";
        grandma2.sex = false;
        grandma2.age = 60;
        grandma2.children.add(mother);

        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(grandfa1);
        System.out.println(grandma1);
        System.out.println(grandfa2);
        System.out.println(grandma2);
    }

    public static class Human {
        //Программа должна создавать объекты и заполнять их так, чтобы получилось:
        // два дедушки, две бабушки, отец, мать, трое детей.
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>(0);

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
