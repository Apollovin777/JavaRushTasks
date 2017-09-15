package com.javarush.task.task20.task2017;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* 
Десериализуй объект в методе getOriginalObject так,
чтобы в случае возникновения исключения было выведено сообщение на экран и возвращен null.
Реализуй интерфейс Serializable где необходимо.
*/
public class Solution {
    public A getOriginalObject(ObjectInputStream objectStream) {
        try {
            Object o = objectStream.readObject();
            if (o instanceof A)
                return (A) o;
            else
                return null;
        }
        catch (Exception e){
            System.out.println("Error during deserialization. Class not found.");
            return null;
        }



    }

    public class A implements Serializable {
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) {

    }
}
