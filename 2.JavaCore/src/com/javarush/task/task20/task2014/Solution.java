package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/
public class Solution implements Serializable {
    public static void main(String[] args) throws Exception{

        OutputStream outputStream = new FileOutputStream("C:\\tmp\\file1.txt");

        Solution savedObject = new Solution(30);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(savedObject);
        objectOutputStream.close();
        outputStream.close();


        InputStream inputStream = new FileInputStream("C:\\tmp\\file1.txt");
        Solution loadedObject = new Solution(25);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        loadedObject = (Solution)objectInputStream.readObject();


        System.out.println(savedObject.toString().equals(loadedObject.toString()));
    }

    private transient final String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
