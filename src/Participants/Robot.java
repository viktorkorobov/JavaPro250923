package Participants;

public class Robot implements Participant {
    @Override
    public void run() {
        System.out.println("A robot is running");
    }

    @Override
    public void jump() {
        System.out.println("A robot is jumping");
    }
}
