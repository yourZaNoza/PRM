import java.util.Random;
import java.util.Scanner;

public class MainPR2 {
    // задание 1, 2, 3
//    public static void main(String[] args) {
//        int[] mass = new int[5];
//        Random random = new Random();
//        for (int i = 0; i < 5; i++) {
//            mass[i] = random.nextInt(100);
//        }
//
//        int minNumber = mass[0];
//        for (int elem : mass) {
//            if (elem < minNumber) {
//                minNumber = elem;
//            }
//        }
//        System.out.println("Наименьшее число в массиве: " + minNumber);
//        int maxNumber = mass[0];
//        int countMax = 0;
//        for (int elem : mass) {
//            if (elem > maxNumber) {
//                maxNumber = elem;
//                countMax += 1;
//            }
//        }
//        System.out.println("Наибольшее число в массиве: " + maxNumber);
//        System.out.println("Количество максимальных чисел: " + countMax);
//    }
    // задание 4
//    public static void main(String[] args) {
//        Scanner inputFromLine = new Scanner(System.in);
//        String firstName;
//        String secondName;
//        System.out.println("Введите первое имя: ");
//        firstName = inputFromLine.nextLine();
//
//        System.out.println("Введите второе имя: ");
//        secondName = inputFromLine.nextLine();
//
//        if (firstName.equals(secondName)) {
//            System.out.println("Эти люди тёзки");
//        } else {
//            System.out.println("Эти люди не тёзки");
//        }
//    }
    // задание 5
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите номер месяца года (1-12):");
        int dayNumber = input.nextInt();
        printDayOfWeek(dayNumber);
    }
    public static void printDayOfWeek(int dayNumber) {
        switch (dayNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Неверный номер месяца");
                break;
        }
    }
}