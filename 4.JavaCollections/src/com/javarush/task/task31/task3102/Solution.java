package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;


/* 
Находим все файлы
*/
public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        List<String> list = new ArrayList<>();

        File file = new File(root);
        Queue<File> queue = new PriorityQueue<>();
        queue.add(file);

        File temp;
        while (!queue.isEmpty()){
            temp = queue.poll();
            for (File s : temp.listFiles()
                    ) {
                if (s.isDirectory()) {
                    queue.add(s);
                } else {
                    list.add(s.getAbsolutePath());
                }
            }
        }


        return list;

    }

    public static void main(String[] args) throws IOException{
        List<String> list = getFileTree("C:\\tmp\\ConsoleApplication2");
        for (String s : list
             ) {
            System.out.println(s);
        }

    }
}
