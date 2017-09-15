package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws Exception{

        BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
        String adresWord = buffReader.readLine();
        buffReader.close();
        Map mapVal = new HashMap();
        BufferedReader buffIn = new BufferedReader(new FileReader(adresWord));
        final Pattern pattern = Pattern.compile("^\\d+");
        Matcher matcher;
        String str;
        while (buffIn.ready()){
            str = buffIn.readLine();
            matcher = pattern.matcher(str);
            Long num = new Long(0);
            while (matcher.find()){
                num = Long.parseLong(matcher.group(0));
            }
            mapVal.put(num, str);
        }
        buffIn.close();
        Long keyMap;
        if (args[0].equals("-u")) {
            keyMap = new Long(args[1]);
            String valMap = String.format("%-8d%-30s%-8s%-4s", args[1], args[2], args[3], args[4]);
            mapVal.put(keyMap, valMap);
        }

        if (args[0].equals("-d")) {
                keyMap = new Long(args[1]);
                mapVal.remove(keyMap);
        }

        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(adresWord));
        for (Object s : mapVal.values()){
            buffWrite.write(s + "\n");
        }

        buffWrite.close();

    }
}
