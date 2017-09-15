package com.javarush.task.task31.task3112;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.file.*;

/* 
Загрузчик файлов
*/
public class Solution {

    public static void main(String[] args) throws IOException {
        Path passwords = downloadFile("http://www.sample-videos.com/text/Sample-text-file-10kb.txt", Paths.get("D:/MyDownloads"));

        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        URL url = new URL(urlString);
        InputStream inputStream = url.openStream();
        Path tempFile = Files.createTempFile("temp-",".tmp");
        //try (InputStream inputStream = url.openStream()) {
            Files.copy(inputStream, tempFile);
        inputStream.close();

        Path path = Paths.get(downloadDirectory.toAbsolutePath().toString() + "/"+ urlString.substring(urlString.lastIndexOf("/")+1));
        Files.move(tempFile,path);





        return path;
    }
}
