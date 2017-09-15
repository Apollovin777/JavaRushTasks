package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        //String fileName = "C:\\tmp\\file1.txt";
        reader.close();
        String tag = args[0];
        //String tag = "a";

        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        StringBuilder sb = new StringBuilder();

        while (bufferedReader.ready())
            sb.append(bufferedReader.readLine());
        fileReader.close();
        String text = sb.toString();
        //text = text.replaceAll("\\n","");

        ArrayList<Integer> arrayList = new ArrayList<>();
        Integer tagIndex = 0;

        while ((tagIndex =text.indexOf("<" + tag, tagIndex)) != -1){
            arrayList.add(tagIndex);
            tagIndex++;
        }

        for (Integer i:arrayList
             ) {
            OutputTag(i,tag,text);
        }
    }
    public static void OutputTag(int index, String tag, String text){
        int opened = 0;
        int closed = 0;
        int firstOpened = 0;
        int openTemp = 0;
        int closedTemp = 0;
        int temp = index;

        firstOpened = text.indexOf("<" + tag, temp);
        do {
            closedTemp = text.indexOf("</" + tag, temp);
            openTemp = text.indexOf("<" + tag, temp);
            if (openTemp > -1 && closedTemp > -1) {
                if (openTemp > closedTemp) {
                    closed++;
                    temp = closedTemp + 1;
                } else {
                    opened++;
                    temp = openTemp + 1;
                }
            } else if (closedTemp > -1) {
                closed++;
                temp = closedTemp + 1;
            }

        } while (opened != closed);
        System.out.println(text.substring(firstOpened, closedTemp+ tag.length() + 3));
    }
}
