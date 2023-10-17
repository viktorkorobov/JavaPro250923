package Obstacle;

import Participants.Participant;

public class Track implements Obstacle{
    @Override
    public void overcome(Participant participant) {
        participant.run();
    }
}
