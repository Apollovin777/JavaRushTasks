package com.javarush.task.task15.task1522;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
5. Реализуй функционал метода readKeyFromConsoleAndInitPlanet:
5.1. С консоли считай один параметр типа String.
5.2. Если параметр равен одной из констант интерфейса Planet,
создай соответствующий объект и присвой его Planet thePlanet, иначе обнулить Planet thePlanet.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static{
        try {
            readKeyFromConsoleAndInitPlanet();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readKeyFromConsoleAndInitPlanet() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String param = reader.readLine();
        switch (param) {
            case Planet.SUN:
                thePlanet = Sun.getInstance();
                break;
            case Planet.MOON:
                thePlanet = Moon.getInstance();
                break;
            case Planet.EARTH:
                thePlanet = Earth.getInstance();
                break;
            default:
                thePlanet = null;
        }
    }
}

