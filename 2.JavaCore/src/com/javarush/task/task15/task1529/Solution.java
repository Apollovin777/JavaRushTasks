package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
3.1. Считать с консоли параметр типа String.
3.2. Если параметр равен «helicopter«, то статическому объекту Flyable result присвоить объект класса Helicopter.
3.3. Если параметр равен «plane«, то считать второй параметр типа int(количество пассажиров),
    статическому объекту Flyable result присвоить объект класса Plane.
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        try {
            reset();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

    public static Flyable result;

    public static void reset() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String param = reader.readLine();

        if(param.equals("helicopter")){
            result = new Helicopter();
            reader.close();
        }else if(param.equals("plane")){
            try {
                result = new Plane(Integer.parseInt(reader.readLine()));
            }
            catch (NumberFormatException e){
                System.out.println(e.getMessage());
            }
            finally {
                reader.close();
            }
        }
    }
}
