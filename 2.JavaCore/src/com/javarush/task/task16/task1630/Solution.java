package com.javarush.task.task16.task1630;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(is);
        try{
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
            reader.close();
            is.close();
        }catch (IOException e){System.out.println(e.getMessage());}

    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface{

        String fileName;
        List<String> fileContent = new ArrayList<>();

        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }

        @Override
        public void run() {

            try {
                InputStream is = new FileInputStream(fileName);
                BufferedReader buf = new BufferedReader(new InputStreamReader(is));
                String line = buf.readLine();
                while(line != null){
                    fileContent.add(line);
                    line = buf.readLine();
                }
            }
            catch (FileNotFoundException e) {
                System.out.printf("File %s not found");
            }
            catch (IOException e){
                System.out.println(e.getMessage());
            }

        }

        @Override
        public String getFileContent() {
            StringBuilder sb = new StringBuilder();
            for (String s:fileContent) {
                sb.append(s);
                sb.append(" ");
            }
            return sb.toString();
        }
    }
}
