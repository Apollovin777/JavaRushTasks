package com.javarush.task.task14.task1408;

import java.util.Formatter;

/**
 * Created by Yurko on 12.05.2017.
 */
public class BelarusianHen extends Hen{
    @Override
    public int getCountOfEggsPerMonth() {
        return 46;
    }

    public String getDescription(){
        return super.getDescription()+" Моя страна - "+Country.BELARUS+". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
