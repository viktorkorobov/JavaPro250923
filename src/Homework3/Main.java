package Homework3;

public class Main {
    public static void main(String[] args) {
        Animals cat= new Cat();
        cat.run("Cat1", 250, true);
        cat.swim("Cat2",50, false);

        Animals dog =new Dog();
        dog.run("Dog1",550, true);
        dog.swim("Dog2",50, true);

    }
}
