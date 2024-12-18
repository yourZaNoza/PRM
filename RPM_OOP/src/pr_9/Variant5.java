package pr_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Variant5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int n = scanner.nextInt();

        List<Integer> numbers = new ArrayList<>();
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        int sumEven = calculateSumEven(numbers);
        int countEven = calculateCountEven(numbers);
        double averageEven = calculateAverageEven(numbers);

        System.out.println("Сумма четных чисел: " + sumEven);
        System.out.println("Количество четных чисел: " + countEven);
        System.out.println("Среднее значение четных чисел: " + averageEven);

        int[] minMaxIndices = findMinMaxEvenPositive(numbers);
        if (minMaxIndices != null) {
            int minIndex = minMaxIndices[0];
            int maxIndex = minMaxIndices[1];
            swapElements(numbers, minIndex, maxIndex);

            System.out.println("Минимальное четное положительное число: " + numbers.get(maxIndex) + " (индекс: " + maxIndex + ")");
            System.out.println("Максимальное четное положительное число: " + numbers.get(minIndex) + " (индекс: " + minIndex + ")");
        } else {
            System.out.println("В массиве отсутствуют четные положительные числа.");
        }

        System.out.println("Обновленный массив: " + numbers);
    }

    public static int calculateSumEven(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }

    public static int calculateCountEven(List<Integer> numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static double calculateAverageEven(List<Integer> numbers) {
        int sum = calculateSumEven(numbers);
        int count = calculateCountEven(numbers);
        return count > 0 ? (double) sum / count : 0;
    }

    public static int[] findMinMaxEvenPositive(List<Integer> numbers) {
        int minIndex = -1;
        int maxIndex = -1;
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (number > 0 && number % 2 == 0) {
                if (number < minValue) {
                    minValue = number;
                    minIndex = i;
                }
                if (number > maxValue) {
                    maxValue = number;
                    maxIndex = i;
                }
            }
        }

        if (minIndex != -1 && maxIndex != -1) {
            return new int[]{minIndex, maxIndex};
        } else {
            return null;
        }
    }

    public static void swapElements(List<Integer> numbers, int index1, int index2) {
        int temp = numbers.get(index1);
        numbers.set(index1, numbers.get(index2));
        numbers.set(index2, temp);
    }
}
