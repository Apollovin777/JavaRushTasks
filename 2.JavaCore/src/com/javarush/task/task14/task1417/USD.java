package com.javarush.task.task14.task1417;

/**
 * Created by Yurko on 15.05.2017.
 */
public class USD extends Money {
    @Override
    public String getCurrencyName() {
        return "USD";
    }

    public USD(double amount){
        super(amount);
    }
}
