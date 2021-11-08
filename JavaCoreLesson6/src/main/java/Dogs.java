public class Dogs extends Animals {

    public Dogs(String name, int run, int swim) {
        this.name = name;
    }

    public void dogInfo() {
        System.out.println("Собака " + name + " пробежала дистанцию : " + RunDogs() + " и проплыла дистанцию: " + SwimDogs());
    }
}
