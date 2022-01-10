import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        Integer[] testArr1 = {1, 2, 3, 4, 5};
        System.out.print("Первоначальное состояние массива arr:");
        System.out.println(Arrays.toString(testArr1));
        SwapTwoArrayElements(testArr1, 1, 2);
        System.out.print("Результат работы метода перестановки:");
        System.out.println(Arrays.toString(testArr1));
        String[] testArr2 = {"Первый", "Второй", "Третий", "Четвертый", "Пятый"};
        System.out.print("Первоначальное состояние массива arr:");
        System.out.println(Arrays.toString(testArr2));
        SwapTwoArrayElements(testArr2, 1, 2);
        System.out.print("Результат работы метода перестановки:");
        System.out.println(Arrays.toString(testArr2));


        //Задание 2
        System.out.println("Задание №2 :)");

        //Задание 3
        System.out.println("Задание №3");

        Box box1 = new Box();
        box1.add(new Apple());
        box1.add(new Apple());
        box1.add(new Apple());
        System.out.println("Вес коробки №1: " + box1.getWeight());
        Box box2 = new Box();
        box2.add(new Orange());
        box2.add(new Orange());
        box2.add(new Orange());
        System.out.println("Вес коробки №2: " + box2.getWeight());
        System.out.println("Результат работы метода compare() класса Box)");
        System.out.println("Массы коробок " + (box1.compare(box2) ? "одинаковы" : "различны") + ".");
        System.out.println("В коробке 1 хранятся " + box1.getProduct().get(0).getClass().getSimpleName());
        Box box3 = new Box();
        box3.add(new Apple());
        box3.add(new Apple());
        box3.add(new Apple());
        box3.add(new Apple());
        box3.add(new Apple());
        System.out.println("Вес коробки №3: " + box3.getWeight());
        System.out.println("В коробке 3 хранятся " + box3.getProduct().get(0).getClass().getSimpleName());
        box1.shiftSingleItem(box3);
        System.out.println("Вес коробки №3: " + box3.getWeight());
        System.out.println("Вес коробки №1: " + box1.getWeight());
        try {
            box2.shiftSingleItem(box3);
        } catch (BoxCustom e) {
            System.out.println(e);
        }
        System.out.println("Вес коробки №3: " + box3.getWeight());
        System.out.println("Вес коробки №2: " + box2.getWeight());
        try {
            box3.add(new Orange());
            box3.add(new Orange());
            box3.add(new Orange());
        } catch (BoxCustom e) {
            System.out.println(e);
        }
        System.out.println("Вес коробки №3: " + box3.getWeight());

    }

    public static <T> void SwapTwoArrayElements(T[] modifiableArray, int elemNum1, int elemNum2) {
        T backupElement = modifiableArray[elemNum1];
        modifiableArray[elemNum1] = modifiableArray[elemNum2];
        modifiableArray[elemNum2] = backupElement;
    }

}