package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.MOLDOVA);
        hen.getCountOfEggsPerMonth();
        System.out.println(hen.getDescription());
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            switch (country){
                case Country.UKRAINE:
                    hen = new UkrainianHen();
                    return hen;
                case Country.BELARUS:
                    hen = new BelarusianHen();
                    return hen;
                case Country.MOLDOVA:
                    hen = new MoldovanHen();
                    return hen;
                case Country.RUSSIA:
                    hen = new RussianHen();
                    return hen;
            }
            return hen;
        }
    }


}


