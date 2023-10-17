package Participants;

public class Human implements Participant{
    @Override
    public void run() {
        System.out.println("A human is running");
    }

    @Override
    public void jump() {
        System.out.println("A human is jumping");
    }
}
