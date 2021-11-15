public class Treadmill {

    public Treadmill(int run){
    }

    public void treadmillCatInfo() {
        System.out.println("Кот " + RunCat());
    }

    public String RunCat() {
        int run = 200;
        if (run >= 150) {
            return "Успешно пробежал!";
        } else {
            return "Не смог пробежать :(";
        }
    }

    public void humanInfo() {
        System.out.println("Человек " + RunHuman());
    }

    public String RunHuman() {
        int run = 250;
        if (run >= 150) {
            return "Успешно пробежал!";
        } else {
            return "Не смог пробежать :(";
        }
    }

    public void robotInfo() {
        System.out.println("Робот " + RunRobot());
    }

    public String RunRobot() {
        int run = 14;
        if (run >= 150) {
            return "Успешно пробежал!";
        } else {
            return "Не смог пробежать :(";
        }
    }
}
