package Homework3;

public class Cat extends Animals{

    @Override
    public void run(String name, int distance, boolean run) {
                if (distance<=200) {
                    super.run(name, distance, run);
        } else System.out.println("Cat can't run more than 200m");

    }

    @Override
    public void swim(String name, int distance, boolean swim) {
        if (swim==true) {
            super.swim(name, distance, swim);
        } else System.out.println("Cat can't swim");

    }
}
