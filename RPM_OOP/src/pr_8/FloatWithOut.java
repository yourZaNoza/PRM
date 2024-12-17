package pr_8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FloatWithOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int n;

        try {
            n = scanner.nextInt();
            if (n <= 0) {
                throw new IllegalArgumentException("Ошибка: Количество элементов массива должно быть положительным числом.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введено некорректное значение для количества элементов массива.");
            return;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        float[] array = new float[n];
        System.out.println("Введите элементы массива:");

        for (int i = 0; i < n; i++) {
            try {
                array[i] = scanner.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: Введено некорректное значение для элемента массива.");
                return;
            }
        }

        float minNegative = Float.MAX_VALUE;
        int minIndex = -1;
        boolean hasNegative = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                hasNegative = true;
                if (array[i] < minNegative) {
                    minNegative = array[i];
                    minIndex = i;
                }
            }
        }

        if (!hasNegative) {
            System.out.println("Ошибка: В массиве отсутствуют отрицательные элементы.");
        } else {
            System.out.println("Минимальный отрицательный элемент: " + minNegative);
            System.out.println("Индекс минимального отрицательного элемента: " + minIndex);
        }
    }
}

