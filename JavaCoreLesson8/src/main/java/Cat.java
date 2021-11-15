public class Cat implements Runner, Jump{

    @Override
    public void run() {
        System.out.println("Cat run!");
    }

    @Override
    public void jump() {
        System.out.println("Cat jump!");
    }

}