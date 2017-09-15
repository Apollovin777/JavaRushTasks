package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.*;

public class Solution {
       public static void main(String[] args) throws DownloadException, IOException
        {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            String fn = bf.readLine();
            FileInputStream fis = new FileInputStream(fn);

            while (fis.available() > 999)
            {
                fis.close();
                fn = bf.readLine();
                fis = new FileInputStream(fn);
            }
            fis.close();
            bf.close();
            throw new DownloadException();
        }




    public static class DownloadException extends Exception {

    }
}
