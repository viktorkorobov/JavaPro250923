import Obstacle.Obstacle;
import Obstacle.Wall;
import Obstacle.Track;
import Participants.Cat;
import Participants.Human;
import Participants.Participant;
import Participants.Robot;

public class Main {
    public static void main(String[] args) {
         Participant[] participants={new Human(),new Robot(),new Cat()};
         Obstacle[] obstacles ={new Track(), new Wall()};
         for(Participant participant: participants){
             for (Obstacle obstacle: obstacles){
                 obstacle.overcome(participant);
             }
         }
    }
}
