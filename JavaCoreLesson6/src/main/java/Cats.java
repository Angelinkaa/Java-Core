public class Cats extends Animals {

    public Cats(String name, int run, int swim) {
        this.name = name;
    }

    public void catInfo() {
            System.out.println("Кот " + name + " пробежал дистанцию : " + RunCats() + " и проплыл дистанцию: " + SwimCats());
        }
}

