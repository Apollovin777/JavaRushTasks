package com.javarush.task.task25.task2515;

import java.util.ArrayList;

public class Space {
    private int height;
    private int width;

    private SpaceShip ship;

    private ArrayList<Ufo> ufos = new ArrayList<>();
    private ArrayList<Rocket> rockets = new ArrayList();
    private ArrayList<Bomb> bombs = new ArrayList<>();

    public Space(int width, int height) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public SpaceShip getShip() {
        return ship;
    }

    public ArrayList<Ufo> getUfos() {
        return ufos;
    }

    public ArrayList<Rocket> getRockets() {
        return rockets;
    }

    public ArrayList<Bomb> getBombs() {
        return bombs;
    }

    public void setShip(SpaceShip ship) {
        this.ship = ship;
    }

    public void run(){}

    public void draw(){}

    public void sleep(int ms){
        try {
            Thread.sleep(ms);
        }
        catch (InterruptedException e){

        }

    }

    public static Space game;

    public static void main(String[] args){}

}
