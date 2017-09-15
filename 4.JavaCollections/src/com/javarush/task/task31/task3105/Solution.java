package com.javarush.task.task31.task3105;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* 
Добавить файл (fileName) внутрь архива в директорию ‘new‘.
Если в архиве есть файл с таким именем, то заменить его.
*/
public class Solution {
    public static void main(String[] args) throws IOException {

        String zipFile = args[1];


        Map<String, byte[]> zipEntries = new HashMap<>();
        //Enumeration<? extends ZipEntry> zipEntries = zipFile.entries();

        try(ZipInputStream zin = new ZipInputStream(new FileInputStream(zipFile)))
        {
            ZipEntry entry;
            while((entry=zin.getNextEntry())!=null){
                if (!entry.isDirectory()) {
                    byte[] buff = new byte[(int) entry.getSize()];
                    zin.read(buff);
                    zipEntries.put(entry.getName(), buff);
                }
                else {
                    zipEntries.put(entry.getName(),null);
                }
            }
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(args[1]));
        Path newFilePath = Paths.get(args[0]);
        String newFileName = newFilePath.getFileName().toString();
        for (Map.Entry<String, byte[]> mapEntry : zipEntries.entrySet()) {
            if (mapEntry.getValue() != null) {
                if (!mapEntry.getKey().equals(newFileName) && !mapEntry.getKey().equals("new/" + newFileName)) {
                    zipOutputStream.putNextEntry(new ZipEntry(mapEntry.getKey()));
                    zipOutputStream.write(mapEntry.getValue());
                }
            }
            else
            {
                zipOutputStream.putNextEntry(new ZipEntry(mapEntry.getKey()));
            }
        }
        zipOutputStream.putNextEntry(new ZipEntry("new/" + newFileName));
        Files.copy(newFilePath, zipOutputStream);
        zipOutputStream.close();

    }
}

