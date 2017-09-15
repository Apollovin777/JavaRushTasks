package com.javarush.task.task20.task2021;

import java.io.*;

/* 
Сериализация под запретом
*/
public class Solution implements Serializable {
    public static class SubSolution extends Solution {
    }

    private void writeObject(ObjectOutputStream stream)throws IOException{
        throw new NotSerializableException("Не сегодня!");
    }

    private void readObject(ObjectInputStream stream)throws IOException{
        throw new NotSerializableException("Не сегодня!");
    }

    public static void main(String[] args) throws IOException{
        SubSolution subSolution = new SubSolution();
        SubSolution subSolution1 = new SubSolution();
        FileOutputStream fileOutput = new FileOutputStream("C:\\tmp\\file1.txt");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput);

        //outputStream.writeObject (subSolution);
        System.out.println(subSolution.hashCode());
        System.out.println(subSolution1.hashCode());

    }
}
