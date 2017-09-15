package com.javarush.task.task31.task3111;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class SearchFileVisitor extends SimpleFileVisitor<Path> {
    private String partOfName;
    private String partOfContent;
    private int minSize;
    private int maxSize;
    private List<Path> foundFiles = new ArrayList<>();

    public List<Path> getFoundFiles() {
        return foundFiles;
    }

    public void setPartOfName(String setPartOfName) {
        this.partOfName = setPartOfName;
    }

    public void setPartOfContent(String setPartOfContent) {
        this.partOfContent = setPartOfContent;
    }

    public void setMinSize(int setMinSize) {
        this.minSize = setMinSize;
    }

    public void setMaxSize(int setMaxSize) {
        this.maxSize = setMaxSize;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {



        if (partOfName != null) {
            Path name = file.getFileName();
            FileSystem fileSystem = FileSystems.getDefault();
            PathMatcher matcher = fileSystem.getPathMatcher("glob:*" + partOfName + "*");
            if (!matcher.matches((name)))
                return FileVisitResult.CONTINUE;
        }

        if (partOfContent!=null){
            List<String> list = new ArrayList<>();
            list = Files.readAllLines(file);
            boolean flag = false;
            for (String s: list
                 ) {
                if(s.indexOf(partOfContent)>-1){
                    flag = true;
                    break;
                }
            }
            if(!flag)
                return FileVisitResult.CONTINUE;
        }

        if (minSize>0){
            if (Files.size(file)>minSize)
                ;
            else
                return FileVisitResult.CONTINUE;
        }

        if (maxSize>0){
            if (Files.size(file)<maxSize)
                ;
            else
                return FileVisitResult.CONTINUE;
        }


            foundFiles.add(file);

        return FileVisitResult.CONTINUE;

    }
}
