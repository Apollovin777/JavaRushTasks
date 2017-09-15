package com.javarush.task.task20.task2022;

import java.io.*;

/* 
1) создать экземпляр класса Solution
2) записать в него данные — writeObject
3) сериализовать класс Solution — writeObject(ObjectOutputStream out)
4) десериализовать, получаем новый объект
5) записать в новый объект данные — writeObject
6) проверить, что в файле есть данные из п.2 и п.5
*/
public class Solution implements Serializable, AutoCloseable {
    transient private FileOutputStream stream;
    private String filename;

    public Solution(String fileName) throws FileNotFoundException {
        this.stream = new FileOutputStream(fileName);
        this.filename = fileName;
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        //out.close();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        this.stream = new FileOutputStream(filename,true);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws IOException,ClassNotFoundException,Exception{
        String filename = "C:\\tmp\\file1.txt";
        Solution solution = new Solution("C:\\tmp\\file1.txt");
        solution.writeObject("test");
        solution.writeObject("tesddddddt");
        FileOutputStream fileOutputStream= new FileOutputStream("C:\\tmp\\ser.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(solution);
        objectOutputStream.close();
        fileOutputStream.close();
        solution.close();

        FileInputStream fiStream = new FileInputStream("C:\\tmp\\ser.txt");
        ObjectInputStream objectStream = new ObjectInputStream(fiStream);

        //Solution loadsolution = new Solution("C:\\tmp\\file2.txt");

        Solution loadsolution = (Solution) objectStream.readObject();
        loadsolution.writeObject("dddd");
        loadsolution.writeObject("dddd");




    }
}
