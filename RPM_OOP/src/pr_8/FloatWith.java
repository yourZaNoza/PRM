package pr_8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FloatWith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = readArraySize(scanner);
        if (n <= 0) return;

        float[] array = readArrayElements(scanner, n);
        if (array == null) return;

        try {
            findMinNegative(array);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int readArraySize(Scanner scanner) {
        System.out.print("Введите количество элементов массива: ");
        try {
            int n = scanner.nextInt();
            if (n <= 0) {
                throw new IllegalArgumentException("Ошибка: Количество элементов массива должно быть положительным числом.");
            }
            return n;
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введено некорректное значение для количества элементов массива.");
            return -1;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }

    public static float[] readArrayElements(Scanner scanner, int n) {
        float[] array = new float[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            try {
                array[i] = scanner.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: Введено некорректное значение для элемента массива.");
                return null;
            }
        }
        return array;
    }

    public static void findMinNegative(float[] array) {
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
            throw new IllegalArgumentException("Ошибка: В массиве отсутствуют отрицательные элементы.");
        }

        System.out.println("Минимальный отрицательный элемент: " + minNegative);
        System.out.println("Индекс минимального отрицательного элемента: " + minIndex);
    }
}

