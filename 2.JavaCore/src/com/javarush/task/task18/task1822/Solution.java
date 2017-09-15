package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException{

        Scanner scanner = new Scanner(System.in);
        String file1 = scanner.nextLine();
        BufferedReader readerFile = new BufferedReader(new FileReader(file1));

        scanner.close();

        int id = Integer.parseInt(args[0]);
        String line;
        List<String> lines = new ArrayList<String>();
        while ((line = readerFile.readLine()) != null) {
            String temp = line.substring(0,line.indexOf(" "));
            int foundId = Integer.parseInt(temp);
            if(foundId==id){
                System.out.println(line);
                break;
            }

        }

        readerFile.close();




    }
}
