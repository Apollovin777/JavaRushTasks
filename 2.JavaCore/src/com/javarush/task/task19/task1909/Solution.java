package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();


        BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));


        String s = "";
        while (bufferedReader.ready())
            s = s + bufferedReader.readLine()+"\n";
        bufferedReader.close();


        //System.out.println(s);

        String outputLine = s.replaceAll("\\.","!");
        //System.out.println(outputLine);


        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));

        bufferedWriter.write(outputLine);
        bufferedWriter.flush();


        bufferedWriter.close();




    }
}
