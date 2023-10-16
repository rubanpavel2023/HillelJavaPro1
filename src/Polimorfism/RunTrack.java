package Polimorfism;
public class RunTrack extends Obstacle {
private int lenght;

    public RunTrack(int lenght, String NumberObstacle) {
        this.lenght = lenght;
        super.NumbObstacle = NumberObstacle;
    }

    @Override
    public boolean overcome(Participant participant) {
        if (lenght<participant.getMaxRunDistance()){
            participant.run();
            return true;
        }
        else {
            System.out.println(new StringBuilder().append(participant.getName()).append("did not pass the obstacle. Exit the game.").toString());
        }
        return false;
    }
}

