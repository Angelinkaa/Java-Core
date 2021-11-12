public class Main {
    public static void main(String[] args) throws InterruptedException {
        Cat cat1 = new Cat("Флеш");
        Cat cat2 = new Cat("Мася");
        Cat cat3 = new Cat("Барсик");
        Plate plate = new Plate(0);

        plate.printInfo();

        Cat[] cats = {cat1, cat2, cat3};

        while (true) {
            plate.addFoodCount(10);
            for (Cat cat : cats) {
                cat.eat(plate);
                System.out.printf("Котик %s поел и его сытость: %s%n", cat.getName(), cat.isSatiety());
            }
            plate.printInfo();
            Thread.sleep(3000);
        }

    }
}
