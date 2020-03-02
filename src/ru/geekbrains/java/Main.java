package ru.geekbrains.java;

public class Main {

    public static void main(String[] args) {
        //Задание5
        Cat cat = new Cat("Barsik");
        cat.jump(2);
        cat.swim(10);
        cat.run(300);
        Cat cat1 = new Cat("Shustrik");
        cat1.run(150);

        Dog dog1 = new Dog("Pekines");
        dog1.jump(0.5);
        dog1.run(150);
        dog1.someDogsRun(150);

        Dog dog2 = new Dog("Taksa");
        dog2.jump(0.5);
        dog2.run(550);
        dog2.someDogsRun(550);
    }
}
