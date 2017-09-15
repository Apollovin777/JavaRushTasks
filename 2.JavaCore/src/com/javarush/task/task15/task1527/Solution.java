package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String URI = reader.readLine();
        String paramsOnly = URI.substring(URI.indexOf('?')+1);

        String[] arr = paramsOnly.split("&");
        Object objValue = null;
        for(int i = 0;i<arr.length;i++){
            int charIndex;
            if ((charIndex=arr[i].indexOf('='))>=0){
                String paramName = arr[i].substring(0,charIndex);
                if(paramName.equals("obj")){
                    String objValueStr = arr[i].substring(charIndex+1);
                    try{
                        Double d = Double.parseDouble(objValueStr);
                        objValue = d;
                    }
                    catch (NumberFormatException e){
                        objValue = objValueStr;
                    }
                }
                arr[i] = paramName;
            }
        }

        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println(" ");

        if(objValue != null){
            if(objValue instanceof Double)
                alert((Double) objValue);
            else
                alert((String) objValue);
        }

    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
