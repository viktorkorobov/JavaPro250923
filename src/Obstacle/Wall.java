package Obstacle;

import Participants.Participant;

public class Wall implements Obstacle{

    @Override
    public void overcome(Participant participant) {
        participant.jump();
    }
}
