package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static {
        threads.add(new InfiniteThread());
        threads.add(new InterruptThread());
        threads.add(new UraThread());
        threads.add(new MessageThread());
        threads.add(new SummThread());
    }

    public static void main(String[] args) {
        threads.get(4).start();
    }

    public static class InfiniteThread extends Thread{
        @Override
        public void run() {
            while (true){
                Thread.currentThread().yield();
            }
        }
    }

    public static class InterruptThread extends Thread{
        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()){
                    Thread.currentThread().yield();
                }
                System.out.println("InterruptedException");

        }
    }

    public static class UraThread extends Thread{
        @Override
        public void run() {
            try {
                while (true){
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            }
            catch (InterruptedException e){}

        }
    }

    public static class MessageThread extends Thread implements Message{

        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()){
                Thread.yield();
            }
        }
        @Override
        public void showWarning() {
            this.interrupt();
        }
    }

    public static class SummThread extends Thread{
        public int summ=0;
        @Override
        public void run() {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String input;
            try{
                while(!(input=reader.readLine()).equals("N")){
                    summ = summ + Integer.parseInt(input);
                }
                System.out.println(summ);

            }
            catch (NumberFormatException e){
                System.out.println(e.getMessage());
            }
            catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
