package com.javarush.task.task31.task3101;

import java.io.*;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
Проход по дереву файлов
*/
public class Solution {
    public static List<File> list = new ArrayList<>();
    private static Logger logger = Logger.getLogger(Solution.class.getName());

    public static void main(String[] args) throws IOException{
        FileHandler fh = new FileHandler("D:\\mylog.txt");
        logger.addHandler(fh);
        logger.setLevel(Level.FINEST );
        logger.warning("finest");

        String path = "C:\\tmp\\";
        //String path = args[0];

        logger.info("doing stuff");
        File allFile = new File("D:\\1.txt");
        String allFilesContent  = allFile.getParent() + "\\allFilesContent.txt";
        FileUtils.renameFile( allFile, new File(allFilesContent) );
        //FileOutputStream fileOutputStream = null;
        logger.fine("finest");
        logger.warning("warning");
        logger.warning("warning");
        try (FileOutputStream fileOutputStream = new FileOutputStream(allFilesContent))
        {


            File file = new File(path);
            getList(file);
            Collections.sort(list, (f1, f2) -> f1.getName().compareTo(f2.getName()));


            for (File f : list) {
                FileInputStream fileInputStream = new FileInputStream(f);
                BufferedInputStream reader = new BufferedInputStream(fileInputStream);
                while (reader.available() > 0) {
                    fileOutputStream.write(reader.read());
                }
                reader.close();
                fileInputStream.close();
                fileOutputStream.write("\n".getBytes());
            }
        }
        catch (IOException e){}



    }

    public static void deleteFile(File file) {
        if (!file.delete()) System.out.println("Can not delete file with name " + file.getName());
    }

    public static void getList(File f){
        for (File file: f.listFiles()
                ) {

            if(file.isDirectory())
                getList(file);
            if(file.isFile()) {
                if (file.length() > 50) {
                    //FileUtils.deleteFile(file);
                    //System.out.println(file.getAbsolutePath());

                } else {
                    list.add(file);
                }
            }


        }
    }
}
