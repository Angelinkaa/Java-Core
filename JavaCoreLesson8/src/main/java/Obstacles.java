public class Obstacles {

    public Obstacles(int run) {
    }

    public void obstaclesCatInfo() {
        System.out.println("Кот " + ObstaclesCat());
    }

    public String ObstaclesCat() {
        int run = 200;
        int jump = 250;
        if (run >= 150) {
            if (jump >= 150) {
                return "Успешно прошёл дистанцию!";
            } else {
                return "Не смог пройти дистанцию :(";
            }
        } else {
            return "Не смог пройти дистанцию :(";
        }
    }

     public void obstaclesHumanInfo() {
        System.out.println("Человек " + ObstaclesHuman());
    }

    public String ObstaclesHuman() {
        int run = 250;
        int jump = 250;
        if (run >= 150) {
            if (jump >= 150) {
                return "Успешно прошёл дистанцию!";
            } else {
                return "Не смог пройти дистанцию :(";
            }
        } else {
            return "Не смог пройти дистанцию :(";
        }
    }

    public void obstaclesRobotInfo() {
        System.out.println("Робот " + ObstaclesRobot());
    }

    public String ObstaclesRobot() {
        int run = 14;
        int jump = 100;
        if (run >= 150) {
            if (jump >= 150) {
                return "Успешно прошёл дистанцию!";
            } else {
                return "Не смог пройти дистанцию :(";
            }
        } else {
            return "Не смог пройти дистанцию :(";
        }
    }
}