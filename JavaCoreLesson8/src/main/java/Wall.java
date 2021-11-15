public class Wall {

    public Wall( int jump){
    }

    public void wallCatInfo() {
        System.out.println("Кот " + JumpCat());
    }
    public String JumpCat() {
        int jump = 250;
        if (jump >= 150) {
            return "Успешно перепрыгнул!";
        } else {
            return "Не смог перепрыгнуть :(";
        }
    }

    public void humanInfo() {
        System.out.println("Человек " + JumpHuman());
    }

    public String JumpHuman() {
        int jump = 250;
        if (jump >= 150) {
            return "Успешно перепрыгнул!";
        } else {
            return "Не смог перепрыгнуть :(";
        }
    }

    public void robotInfo() {
        System.out.println("Робот " + JumpRobot());
    }

    public String JumpRobot() {
        int jump = 100;
        if (jump >= 150) {
            return "Успешно перепрыгнул!";
        } else {
            return "Не смог перепрыгнуть :(";
        }
    }

}
