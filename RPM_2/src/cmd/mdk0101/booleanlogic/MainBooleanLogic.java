package cmd.mdk0101.booleanlogic;

import java.util.Scanner;

public class MainBooleanLogic {
    public static void main(String[] args) {
        Scanner inputFromLine = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        String inputFirstNum = "Введите первое число: ";
        String inputSecondNum = "Введите второе число: ";
        String firstIsBigger = "Первое число больше";
        String secondIsBigger = "Второе число больше";
        String numAreEquals = "Числа равны";

        System.out.println(inputFirstNum);
        firstNumber = inputFromLine.nextInt();

        System.out.println(inputSecondNum);
        secondNumber = inputFromLine.nextInt();

        boolean result = firstNumber > secondNumber;
        if (result) {
            System.out.println(firstIsBigger);
        } else if (firstNumber < secondNumber) {
            System.out.println(secondIsBigger);
        } else if (firstNumber == secondNumber) {
            System.out.println(numAreEquals);
        }

    }
}
