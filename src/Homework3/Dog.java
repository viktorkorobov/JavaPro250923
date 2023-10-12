package Homework3;

public class Dog extends Animals{

    @Override
    public void run(String name, int distance, boolean run) {
        if (distance<=500) {
            if(run==true) super.run(name, distance, run);
        } else System.out.println("Dog can't run more than 500m");
    }

    @Override
    public void swim(String name, int distance, boolean swim) {
        if (distance<=10) {
            if(swim==true) super.swim(name, distance, swim);
        } else System.out.println("Dog can't swim more than 10m");

    }
}
