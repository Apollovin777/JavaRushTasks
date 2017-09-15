package com.javarush.task.task18.task1820;

import java.io.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(file1);

        StringBuilder sb;
        List<String> numbers = new ArrayList<>();
        int character = 0;

        while(fileInputStream.available()>0){
            sb = new StringBuilder();
            while ((character=fileInputStream.read()) != 32 && character>0){
                sb.append((char) character);
            }
            numbers.add(sb.toString());
        }
        fileInputStream.close();

        int[] roundedArr = new int[numbers.size()];

        DecimalFormat df = new DecimalFormat();
        df.setRoundingMode(RoundingMode.HALF_UP);

        for(int i = 0;i<numbers.size();i++){
            roundedArr[i] = (int) Math.round(Double.parseDouble(numbers.get(i)));
        }

        FileOutputStream fileOutputStream = new FileOutputStream(file2);

        for (int d:roundedArr
             ) {
            fileOutputStream.write(new Integer(d).toString().getBytes());
            fileOutputStream.write((byte)32);
        }

        fileOutputStream.close();



        /*
        String fileName;
        int ch, countSymbol = 0, countSpace = 0;
        if (args.length > 0) {
            fileName = args[0];
            FileInputStream fileInputStream = new FileInputStream(fileName);
            while (fileInputStream.available() > 0) {
                ch = fileInputStream.read();
                countSymbol++;
                if (ch == 32)
                    countSpace++;
            }
            fileInputStream.close();

            if (countSymbol > 0) {
                DecimalFormat df = new DecimalFormat("#.##");
                df.setRoundingMode(RoundingMode.HALF_UP);
                float ratio = (float) countSpace / countSymbol * 100;
                System.out.println(df.format(ratio));
            }
        }
        */
    }
}
