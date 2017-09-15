package com.javarush.task.taask;

/**
 * Created by Yurko on 04.07.2017.
 */
import java.io.*;

class A implements Serializable{
    private static int n=0;
    private int i;
    A(int i){
        this.i=i;
        n=i;
    }
    public String toString(){
        return i+" "+n;
    }
    public static void serializeStatic(ObjectOutputStream oos) throws IOException{
        oos.writeInt(n);
    }
    public static void deserializeStatic(ObjectInputStream ois) throws IOException{
        n=ois.readInt();
    }
    public static void main(String []args) throws IOException,ClassNotFoundException {
        A a = new A(5);
        System.out.println(a);
        String path = "serial.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
        A.serializeStatic(oos);
        oos.writeObject(a);
        a = new A(10);
        System.out.println(a);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));

        A.deserializeStatic(ois);
        a = (A)ois.readObject();
        System.out.println(a);
    }
}


