package ru.geekbrains.java;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public boolean jump(double height){
       return true;
    }

    public boolean swim(int length){
        return true;
    }

    public boolean run(int distance){
        return true;
    };

    public void someDogsRun(int dogMaxRun) {

    }

}
