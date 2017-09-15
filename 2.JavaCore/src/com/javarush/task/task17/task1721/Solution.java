package com.javarush.task.task17.task1721;

import sun.nio.cs.StandardCharsets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.io.*;


/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = "";
        String secondFile = "";
        try{
            firstFile = reader.readLine();
            secondFile = reader.readLine();
        }catch (IOException e) {
        }


        try {
            reader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(firstFile), Charset.defaultCharset()));
            String line;
            while ((line = reader.readLine()) != null) {
                allLines.add(line);
            }
        } catch (IOException e) {
            // log error
        }

        try {
            reader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(secondFile), Charset.defaultCharset()));
            String line;
            while ((line = reader.readLine()) != null) {
                forRemoveLines.add(line);
            }
        } catch (IOException e) {
            // log error
        }

        try {
            reader.close();
        }catch (IOException e){
        }

        Solution solution = new Solution();
        try {
            solution.joinData();
        }
        catch (CorruptedDataException e){
            System.out.println(e.toString());
        }




    }

    public void joinData () throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines))
            allLines.removeAll(forRemoveLines);
        else
        {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
