package Homework1;

import org.w3c.dom.ranges.DocumentRange;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = 1;
        int b = 2;
        int SumSign = a + b;
        System.out.println(a + b);
        if (0 < a + b) {
            System.out.println("Сумма положительна");
        } else if (0 > a + b) {
            System.out.println("Сумма отрицательна");

        }

    }

    static void printColor() {
        int value = 5;
        if (value < 0 || value == 0) {
            System.out.println("Красный");
        } else if (100 <= value || value < 0) {
            System.out.println("Жёлтый");
        } else if (100 > value) {
            System.out.println("Зелёный");
        }

    }

    static void compareNumbers() {
        int a = 3;
        int b = 7;
        if (a > b || a == b) {
            System.out.println("a=>b");
        } else if (a < b) {
            System.out.println("a<b");

        }
    }
}