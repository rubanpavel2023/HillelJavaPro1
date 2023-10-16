package Polimorfism;

public class Competition {

    private static Obstacle[] obstacles;
    private static Participant[] participants;

    public static void goOvercome() {
        Participant Pavel = new Human("Pavel ", 1400, 3);
        Participant Mur = new Cat_2("Mur ", 2000, 3);
        Participant Rob = new Robot("Rob ", 3000, 2);

        Obstacle Wall_1 = new Wall(2, "Wall_1");
        Obstacle Wall_2 = new Wall(3, "Wall_2");
        Obstacle RunTrack_1 = new RunTrack(1500, "RunTrack_1");
        Obstacle RunTrack_2 = new RunTrack(900, "RunTrack_2");

        participants = new Participant[]{Pavel, Mur, Rob};
        obstacles = new Obstacle[]{RunTrack_1, Wall_1, RunTrack_2, Wall_2};

        for (Participant GoParticipant : participants) {
            for (Obstacle GoObstacle : obstacles) {
                if (!GoObstacle.overcome(GoParticipant)) {
                    break;
                };
            }
        }




    }
}








