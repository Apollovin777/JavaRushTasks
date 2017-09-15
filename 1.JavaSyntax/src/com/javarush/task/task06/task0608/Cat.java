package com.javarush.task.task06.task0608;

/* 
Добавить к классу Cat два статических метода: int getCatCount() и setCatCount(int),
с помощью которых можно получить/изменить количество котов (переменную catCount).
*/

public class Cat {
    private static int catCount = 0;

    public Cat() {
        catCount++;
    }

    public static int getCatCount()
    {
        return Cat.catCount;
    }

    public static void setCatCount(int catCount)
    {
        Cat.catCount = catCount;
    }

    public static void main(String[] args)
    {
        Cat cat = new Cat();

        System.out.println(Cat.getCatCount());

        Cat.setCatCount(5);

        System.out.println(Cat.getCatCount());
    }
}
