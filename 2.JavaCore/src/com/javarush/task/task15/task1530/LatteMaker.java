package com.javarush.task.task15.task1530;

/**
 * Created by Yurko on 20.05.2017.
 */
public class LatteMaker extends DrinkMaker {
    void getRightCup(){
        System.out.println("Берем чашку для латте");
    }
    void putIngredient(){
        System.out.println("Делаем кофе");
    }
    void pour(){
        System.out.println("Заливаем молоком с пенкой");
    }

    /*
    «Заливаем кипятком»
«Берем чашку для латте»
«Насыпаем чай»
«Берем чашку для чая»
«Заливаем молоком с пенкой»
«Делаем кофе«

     */
}
