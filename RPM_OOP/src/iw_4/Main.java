package iw_4;

import iw_4.flower_store.*;
import iw_4.fruit_store.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //printFlowerStore(); // цветы
        printFruitStore(); // фрукты
    }
    // цветы
    public static void printFlowerStore() {
        Flower rose1 = new Rose("Франция", 7, 5.0);
        Flower rose2 = new Rose("Франция", 7, 5.0);
        Flower carnation1 = new Carnation("Россия", 5, 3.0);
        Flower carnation2 = new Carnation("Россия", 5, 3.0);
        Flower tulip1 = new Tulip("Нидерланды", 5, 4.0);
        Flower tulip2 = new Tulip("Нидерланды", 5, 4.0);
        Flower lily1 = new Lily("США", 7, 6.0);
        Flower lily2 = new Lily("США", 7, 6.0);

        Bouquet bouquet1 = new Bouquet(new Flower[]{rose1, carnation1, tulip1});
        Bouquet bouquet2 = new Bouquet(new Flower[]{rose2, carnation2, lily1});
        Bouquet bouquet3 = new Bouquet(new Flower[]{tulip2, lily2});

        System.out.println("Букет 1:");
        bouquet1.displayBouquet();
        System.out.println("Итого: " + bouquet1.calculateCost());

        System.out.println("\nБукет 2:");
        bouquet2.displayBouquet();
        System.out.println("Итого: " + bouquet2.calculateCost());

        System.out.println("\nБукет 3:");
        bouquet3.displayBouquet();
        System.out.println("Итого: " + bouquet3.calculateCost());

        System.out.println("\nВсего продано цветов: " + Flower.getTotalFlowersSold());

    }
    // фрукты
    public static void printFruitStore() {
        Fruit[] fruits = new Fruit[4];

        fruits[0] = new Apple(1);
        fruits[1] = new Pear(2);
        fruits[2] = new Aprikot(3);
        fruits[3] = new Aprikot(2);

        double totalPrice = 0;
        for (int i = 0; i < fruits.length; i++) {
            totalPrice += fruits[i].getPrice();
        }

        System.out.print("Общая стоимость проданных фруктов: ");
        System.out.println(totalPrice);

        int appleCount = 0, pearCount = 0, aprikotCount = 0;
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i] instanceof Apple) { // является ли объект частью класса
                appleCount++;
            } else if (fruits[i] instanceof Pear) {
                pearCount++;
            } else {
                aprikotCount++;
            }
        }

        System.out.println("Яблок продано: " + appleCount);
        System.out.println("Груш продано: " + pearCount);
        System.out.println("Aбрикосов продано: " + aprikotCount);
    }

}

