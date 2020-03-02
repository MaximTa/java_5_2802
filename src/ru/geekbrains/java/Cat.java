package ru.geekbrains.java;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public boolean jump(double catMaxJump) {
        if (catMaxJump <= 2) {
            System.out.println(name + " jump ");
            return true;
        }
        System.out.println();
        return false;
    }
    @Override
    public boolean swim(int catMaxSwim) {
        if (catMaxSwim == 0) {
            System.out.println(name + " Я только лапки помочить. ");
            return true;
        }
        System.out.println(name + " Кошки не плавают! ");
        return false;
    }
    @Override
    public boolean run(int catMaxRun) {
        if (catMaxRun <= 200) {
            System.out.println(name + " run: true ");
            return true;
        }
        System.out.println(name + " Я столько не пробегу! ");
        return false;
    }
}
