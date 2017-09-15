package com.javarush.task.task31.task3106;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/*
Разархивируем файл
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        String s = args[0];


        List<String> zipParts= new ArrayList<>();
        for (int i = 1; i < args.length; i++) {
            zipParts.add(args[i]);
        }

        Collections.sort(zipParts);

        List<FileInputStream> zipPartsStreams= new ArrayList<>();
        for (int i = 0; i <zipParts.size(); i++) {
            zipPartsStreams.add(new FileInputStream(zipParts.get(i)));
        }

        final int bufferSize = 1048576;
        byte[] buffer = new byte[bufferSize];


        SequenceInputStream sIS = new SequenceInputStream(Collections.enumeration(zipPartsStreams));
        ZipInputStream zipIn = new ZipInputStream(sIS);
        FileOutputStream fileOut = new FileOutputStream(s);

        //for(ZipEntry entry = null; (entry = zipIn.getNextEntry()) != null; ) {
        zipIn.getNextEntry();
            //FileOutputStream fileOut = new FileOutputStream(entry.getName());
            for (int readBytes = -1; (readBytes = zipIn.read(buffer, 0, bufferSize)) > -1; ) {
                fileOut.write(buffer, 0, readBytes);
                fileOut.flush();
            }


//        }
        fileOut.close();
        zipIn.close();
        sIS.close();

    }
}
