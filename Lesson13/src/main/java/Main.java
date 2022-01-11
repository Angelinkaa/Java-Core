import java.util.concurrent.CountDownLatch;

public class Main {
    public static final int CARS_COUNT = 4;
    static final CountDownLatch cdlStart = new CountDownLatch(1);
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Подготовка к гонке");
        Race race = new Race(new Road(60), new Tunnel(), new Road(40));
        Car[] cars = new Car[CARS_COUNT];
        Thread[] threads = new Thread[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10));
        }
        for (int i = 0; i < cars.length; i++) {
            threads[i] = new Thread(cars[i]);
            threads[i].start();
        }
        try {
            cdlStart.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Старт");
        for (int i = 0; i < cars.length; i++) {
            threads[i].join();
        }
        System.out.println("Гонка окончена!");
    }
}