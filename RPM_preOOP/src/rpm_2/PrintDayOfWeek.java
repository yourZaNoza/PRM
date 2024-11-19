package rpm_2;

import java.util.Scanner;

public class PrintDayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите номер дня недели (1-7):");
        int dayNumber = input.nextInt();
        printDayOfWeek(dayNumber);
    }
    public static void printDayOfWeek(int dayNumber) {
        switch (dayNumber) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Неверный номер дня недели");
                break;
        }
    }
}

