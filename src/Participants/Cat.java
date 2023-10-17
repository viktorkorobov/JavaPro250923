package Participants;

public class Cat implements Participant{
    @Override
    public void run() {
        System.out.println("A cat is running");
    }

    @Override
    public void jump() {
        System.out.println("A cat is jumping");
    }
}
