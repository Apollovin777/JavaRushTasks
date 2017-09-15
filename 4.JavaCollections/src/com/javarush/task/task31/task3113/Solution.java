package com.javarush.task.task31.task3113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* 
Что внутри папки?
*/
public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String dir = reader.readLine();
        //String dir = "C:\\tmp\\";
        Path folder = Paths.get(dir);

        if (!Files.exists(folder) || !Files.isDirectory(folder)){
            System.out.println(dir + " - не папка");
            return;
        }

        AtomicInteger countFolders = new AtomicInteger(-1);
        AtomicInteger countFiles = new AtomicInteger(0);
        AtomicLong size = new AtomicLong(0);
        Integer i = 0;

        Files.walkFileTree(folder, new SimpleFileVisitor<Path>() {
            @Override
            public  FileVisitResult visitFile(Path file, BasicFileAttributes attrs)  throws IOException {
                size.addAndGet(attrs.size());
                countFiles.addAndGet(1);
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                countFolders.addAndGet(1);
                return FileVisitResult.CONTINUE;
            }
        });

        System.out.println("Всего папок - " + countFolders.get());
        System.out.println("Всего файлов - " + countFiles.get());
        System.out.println("Общий размер - " + size.get());


    }
}
