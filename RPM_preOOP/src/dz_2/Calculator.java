package dz_2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double num1 = input.nextDouble();
        System.out.println("Введите второе число:");
        double num2 = input.nextDouble();

        System.out.println("Выберите операцию: 1 - сложение, 2 - вычитание, 3 - целочисленное деление, 4 - деление с остатком");
        int operation = input.nextInt();

        double result;
        switch (operation) {
            case 1:
                result = num1 + num2;
                System.out.println("Результат: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Результат: " + result);
                break;
            case 3:
                if (num2 == 0) {
                    System.out.println("Ошибка: деление на ноль невозможно.");
                } else {
                    result = num1 / num2;
                    System.out.println("Результат: " + result);
                }
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Ошибка: деление на ноль невозможно.");
                } else {
                    result = num1 % num2;
                    System.out.println("Остаток: " + result);
                }
                break;
            default:
                System.out.println("Неверная операция");
                break;
        }
    }
}

