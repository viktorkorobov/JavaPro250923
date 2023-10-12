package Homework3;

public class Animals {
    private String name;
    private int distance;
    private boolean swim;
    private boolean run;

    public void run(String name, int distance, boolean run){
        this.name=name;
        this.distance=distance;
        System.out.println(name+" run distance: "+ distance);
    }
    public void swim(String name, int distance, boolean swim){
        this.name=name;
        this.distance=distance;
        System.out.println(name+" swim distance: "+ distance);
    }


    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", distance=" + distance +
                ", swim=" + swim +
                ", run=" + run +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public boolean isSwim() {
        return swim;
    }

    public void setSwim(boolean swim) {
        this.swim = swim;
    }

    public boolean isRun() {
        return run;
    }

    public void setRun(boolean run) {
        this.run = run;
    }
}
/*
 * бігти та плисти
 */