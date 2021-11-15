public class Human implements Runner, Jump{

    @Override
    public void run() {
        System.out.println("Human run!");
    }

    @Override
    public void jump() {
        System.out.println("Human jump!");
    }

    public Human(int run, int jump){}


}