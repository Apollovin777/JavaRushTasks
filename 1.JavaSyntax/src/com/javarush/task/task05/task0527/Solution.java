package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat tomCat = new Cat("Tom",25,6);
        Dog spikeDog = new Dog("Spike",30,50);
        Dog tikeDog = new Dog("Tike",14,25);
        Cat buchCat = new Cat("Buch", 26,6);

        //напишите тут ваш код
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat {
        String name;
        int height;
        int tail;

        public Cat(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

        public static class Dog {
            String name;
            int height;
            int loud;

            public Dog(String name, int height, int loud) {
                this.name = name;
                this.height = height;
                this.loud = loud;
            }
    }


    //напишите тут ваш код
}
