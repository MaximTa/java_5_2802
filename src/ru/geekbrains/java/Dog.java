package ru.geekbrains.java;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    @Override
    public boolean jump(double dogMaxJump) {
        if (dogMaxJump <= 0.5) {
            System.out.println(name + " jump: true ");
            return true;
        }
        System.out.println(name + " jump: false ");
        return false;
    }
    @Override
    public boolean swim(int dogMaxSwim) {
        if (dogMaxSwim <= 10) {
            System.out.println(name + " swim: true ");
            return true;
        }
        System.out.println(name + " swim: false ");
        return false;
    }
    @Override
    public boolean run(int dogMaxRun) {
        if (dogMaxRun <= 600) {
            System.out.println(name + " run: true ");
            return true;
        }
        System.out.println(name + " run: false ");
        return false;
    }
    @Override
    public void someDogsRun(int dogMaxRun) {
        if (dogMaxRun <= 150) {
            System.out.println(name + " Я ленивая собачка. Далеко не побегу. ");
        } else if (dogMaxRun >= 150 && dogMaxRun <= 400) {
            System.out.println(name + " Я большая собака. Быстро устаю. ");
        }else if(dogMaxRun >= 400 && dogMaxRun <= 600){
            System.out.println(name + " Я охотничая собака. Могу бегать далеко. ");
        }

    }

}
