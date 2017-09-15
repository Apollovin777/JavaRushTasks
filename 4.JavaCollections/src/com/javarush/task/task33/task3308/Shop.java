package com.javarush.task.task33.task3308;


/*
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<shop>
    <goods>
        <names>S1</names>
        <names>S2</names>
    </goods>
    <count>12</count>
    <profit>123.4</profit>
    <secretData>String1</secretData>
    <secretData>String2</secretData>
    <secretData>String3</secretData>
    <secretData>String4</secretData>
    <secretData>String5</secretData>
</shop>

 */

import java.util.List;

public class Shop {

    public Goods goods;
    public int count;
    public double profit;
    public String[] secretData;

    public static class Goods{
        public List<String> names;
    }
}
