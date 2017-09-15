package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        if (this.strength == anotherCat.strength)
        {
           if (this.weight == anotherCat.weight)
           {
               if (this.age == anotherCat.age)
               {
                    return true; //sudden attack :)
               }
               else
               {
                   if (this.age > anotherCat.age)
                       return true;
                   else
                       return false;
               }
           }
           else
           {
               if (this.weight > anotherCat.weight)
                   return true;
               else
                   return false;
           }
        }
        else
        {
            if (this.strength > anotherCat.strength)
                return true;
            else
                return false;
        }

    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        cat1.strength = 9;
        cat2.strength = 9;
        cat1.weight = 6;
        cat2.weight = 6;
        cat1.age = 5;
        cat2.age = 4;

        boolean result = cat1.fight(cat2);
        boolean result1 = cat2.fight(cat1);
        System.out.println(result);
        System.out.println(result1);
        System.out.println("End");
    }
}
