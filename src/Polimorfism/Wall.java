package Polimorfism;

public class Wall extends Obstacle {

private int height;

    public Wall(int height, String NumberObstacle) {
        this.height = height;
        super.NumbObstacle = NumberObstacle;
    }

@Override
    public boolean overcome(Participant participant) {
        if (height<participant.getMaxJumpHeight()){
           participant.jump();
           return true;
        }
        else {
            System.out.println(new StringBuilder().append(participant.getName()).append("did not pass the obstacle. Exit the game.").toString());
        }
    return false;
}
}
