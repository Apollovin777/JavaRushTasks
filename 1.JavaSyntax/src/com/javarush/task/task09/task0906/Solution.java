package com.javarush.task.task09.task0906;

/* 
1. Метод log должен выводить сообщение на экран.
2. Выведенное сообщение должно содержать имя класса, метод которого вызвал метод log.
3. Выведенное сообщение должно содержать имя метода, который вызвал метод log.
4. Выведенное сообщение должно содержать переданное сообщение.
5. Вывод должен соответствовать примеру из задания.
com.javarush.task.task09.task0906.Solution: main: In main method
*/

public class Solution {
    public static void main(String[] args) {

        log("In main method");
    }

    public static void log(String s) {
        StackTraceElement[] ss = Thread.currentThread().getStackTrace();
        StringBuilder str = new StringBuilder();
        str.append(ss[2].getClassName());
        str.append(": ");
        str.append(ss[2].getMethodName());
        str.append(": ");
        str.append(s);
        System.out.println(str.toString());

    }
}
