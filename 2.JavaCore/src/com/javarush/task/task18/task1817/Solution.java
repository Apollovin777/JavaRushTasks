package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Solution {
    public static void main(String[] args) throws IOException {
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
    }
}
