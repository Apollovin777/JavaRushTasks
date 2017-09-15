package com.javarush.task.task31.task3109;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

/* 
Читаем конфиги
*/
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Properties properties = solution.getProperties("d:\\JavaRushHomeWork\\JavaRushTasks\\4.JavaCollections\\src\\com\\javarush\\task\\task31\\task3109\\properties.xml");
        properties.list(System.out);

        properties = solution.getProperties("d:\\JavaRushHomeWork\\JavaRushTasks\\4.JavaCollections\\src\\com\\javarush\\task\\task31\\task3109\\properties.txt");
        properties.list(System.out);

        properties = solution.getProperties("d:\\JavaRushHomeWork\\JavaRushTasks\\4.JavaCollections\\src\\com\\javarush\\task\\task31\\task3109\\propertie");
        properties.list(System.out);
    }

    public Properties getProperties(String fileName) {
        //File file = new File(fileName);
        Path path = Paths.get(fileName);
        Properties properties = new Properties();
        try {
            if (path.toString().substring(path.toString().lastIndexOf(('.'))+1).equals("xml")) {
                System.out.println(path.toString().substring(path.toString().lastIndexOf((File.separator)) + 1));
                properties.loadFromXML(new FileInputStream(path.toFile()));
            }
            else
                properties.load(new FileInputStream(path.toFile()));
        }
        catch (IOException e){
            return properties;
        }
        return properties;

    }
}
