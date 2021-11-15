public class Main {

    public static void main(String[] args) {

        Treadmill treadmill = new Treadmill(200);
        treadmill.treadmillCatInfo();
        treadmill.humanInfo();
        treadmill.robotInfo();
        Wall jump = new Wall( 150);
        jump.wallCatInfo();
        jump.humanInfo();
        jump.robotInfo();
        Obstacles obstacles;
        obstacles = new Obstacles( 200);
        obstacles.obstaclesCatInfo();
        obstacles.obstaclesHumanInfo();
        obstacles.obstaclesRobotInfo();
    }
    

}
