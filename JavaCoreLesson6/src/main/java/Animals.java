import static java.lang.System.*;

public class Animals {
    String name;

    public Animals() {
    }

    public Animals (String name) {
        this.name = name;
    }

    public boolean RunCats() {
        int run = 200;
        if (run >= 200) {
            return true;
        } else {
            return false;
        }
    }

    public boolean RunDogs() {
        int run = 500;
        if (run >= 500) {
            return true;
        } else {
            return false;
        }
    }


    public boolean SwimCats() {
        int swim = 0;
        if (swim > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean SwimDogs() {
        int swim = 10;
        if (swim >= 10) {
            return true;
        } else {
            return false;
        }
    }
}
