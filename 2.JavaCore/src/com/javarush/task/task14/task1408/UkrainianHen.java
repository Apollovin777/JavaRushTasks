package com.javarush.task.task14.task1408;

import java.text.Format;
import java.util.Formatter;

/**
 * Created by Yurko on 12.05.2017.
 */
public class UkrainianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 45;
    }

    public String getDescription(){
        return super.getDescription()+" Моя страна - "+Country.UKRAINE+". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
