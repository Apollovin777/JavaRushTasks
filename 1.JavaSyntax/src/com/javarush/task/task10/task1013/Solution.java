package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String FirstName;
        private int age;
        private boolean sex;
        private String LastName;
        private float height;
        private float weight;

        public Human(String Firstname){
            this.FirstName = Firstname;
        }

        public Human(String LastName,String FirstName) {
            this.FirstName = FirstName;
            this.LastName = LastName;
        }
        public Human(String LastName,String FirstName,int age) {
            this.FirstName = FirstName;
            this.LastName = LastName;
            this.age = age;
        }

        public Human(String LastName,String FirstName,int age,float height) {
            this.FirstName = FirstName;
            this.LastName = LastName;
            this.age = age;
            this.height = height;
        }

        public Human(String LastName,String FirstName,int age,float height,float weight) {
            this.FirstName = FirstName;
            this.LastName = LastName;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        public Human(String FirstName, String LastName, boolean sex){
            this.FirstName = FirstName;
            this.LastName = LastName;
            this.sex = sex;
        }

        public Human(String FirstName, String LastName, boolean sex,int age){
            this.FirstName = FirstName;
            this.LastName = LastName;
            this.sex = sex;
            this.age = age;
        }

        public Human(String FirstName, String LastName, boolean sex,float height,float weight){
            this.FirstName = FirstName;
            this.LastName = LastName;
            this.sex = sex;
            this.height = height;
            this.weight = weight;
        }

        public Human(String LastName, boolean sex,int age){
            this.LastName = LastName;
            this.sex = sex;
            this.age = age;
        }
        public Human(String LastName, boolean sex,int age,float height,float weight){
            this.LastName = LastName;
            this.sex = sex;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }






    }
}
