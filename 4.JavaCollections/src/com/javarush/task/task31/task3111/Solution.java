package com.javarush.task.task31.task3111;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.nio.file.*;

/* 
Продвинутый поиск файлов
*/
public class Solution {
    String s;
    public static void main(String[] args) throws IOException {
        SearchFileVisitor searchFileVisitor = new SearchFileVisitor();

        searchFileVisitor.setPartOfName("amigo");
        searchFileVisitor.setPartOfContent("programmer");
        searchFileVisitor.setMinSize(500);
        searchFileVisitor.setMaxSize(10000);

        Path path = Paths.get("d:\\tmp\\ConsoleApplication2");
        Files.walkFileTree(path, searchFileVisitor);


        List<Path> foundFiles = searchFileVisitor.getFoundFiles();
        for (Path file : foundFiles) {
            System.out.println(file);
        }


    }

}
