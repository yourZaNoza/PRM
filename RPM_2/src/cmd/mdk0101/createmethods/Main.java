package cmd.mdk0101.createmethods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputFromLine = new Scanner(System.in);
        int first;
        int second;
        System.out.println("Введите первое число: ");
        first = inputFromLine.nextInt();

        System.out.println("Введите второе число: ");
        second = inputFromLine.nextInt();

        System.out.println("Сумма: " + sum(first, second));

//        int a = 10;
//        byte b;
//        b = (byte) a;
//        System.out.println(a + b);
    }
    public static int sum(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }
}