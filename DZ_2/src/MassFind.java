import java.util.Random;
import java.util.Scanner;

public class MassFind {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = input.nextInt();

        int[] mass = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            mass[i] = random.nextInt(100);
        }

        System.out.println("Введите число для поиска:");
        int searchNumber = input.nextInt();

        boolean found = false;
        for (int elem : mass) {
            if (elem == searchNumber) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Число " + searchNumber + " найдено в массиве.");
        } else {
            System.out.println("Число " + searchNumber + " не найдено в массиве.");
        }

        int maxNumber = mass[0];
        for (int elem : mass) {
            if (elem > maxNumber) {
                maxNumber = elem;
            }
        }

        System.out.println("Наибольшее число в массиве: " + maxNumber);
    }
}