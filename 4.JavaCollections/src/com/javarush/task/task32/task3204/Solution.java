package com.javarush.task.task32.task3204;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Генератор паролей
*/
public class Solution {
    public static void main(String[] args) {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());


    }


    public static ByteArrayOutputStream getPassword() {

        Random rnd = new Random();
        char[] c = new char[8];
        for (int i = 0;i<8;i++){

            int var = rnd.nextInt(3);
            switch (var){
                case 0:
                    c[i] = (char) (rnd.nextInt(10)+48);
                    //System.out.println(c);
                    break;
                case 1:
                    c[i]= (char) (rnd.nextInt(26)+65);
                    //System.out.println(c);
                    break;
                case 2:
                    c[i] = (char) (rnd.nextInt(26)+97);
                    //System.out.println(c);
                    break;
            }
        }
        String string = new String(c);

        Pattern pattern = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8})");
        Matcher matcher = pattern.matcher(string);


        if (matcher.matches()){
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(string.getBytes());
            }
            catch (IOException e){}
            return byteArrayOutputStream;
        }
        else {
            return getPassword();
        }

    }
}