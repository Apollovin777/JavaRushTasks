package com.javarush.task.task14.task1417;

/**
 * Created by Yurko on 15.05.2017.
 */
public class Hrivna extends Money{
    @Override
    public String getCurrencyName() {
        return "HRN";
    }

    public Hrivna(double amount){
        super(amount);
    }
}
