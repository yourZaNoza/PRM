import java.util.Random;
import java.util.Scanner;

public class MainPR4 {
    public static void main(String[] args) {
        //printOddNumbers(); // задание 1
        //printMinMaxElem(); // задание 2 и 3
        //printSwapMass(); // задание 4
        printAverageOfArray(); // задание 5
    }

    // задание 1
    public static void printOddNumbers() {
        int[] oddNumbers = new int[10];
        for (int i = 0; i < 10; i++) {
            oddNumbers[i] = 2 * i + 1;
        }
        for (int i = 0; i < oddNumbers.length; i++) {
            System.out.print(oddNumbers[i] + ", ");
        }
    }

    // задание 2 и 3
    public static void printMinMaxElem() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int n = input.nextInt();
        int[] array = new int[n];
        Random random = new Random();
        System.out.print("Массив: ");
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int min = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Наименьший элемент массива: " + min);
        int max = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Наибольший элемент массива: " + max);
    }

    // задание 4
    public static void printSwapMass() {
        int[] array = {4, -5, 0, 6, 8};
        System.out.print("Массив до замены: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int min = array[0];
        int max = array[0];
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }

        int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;

        System.out.print("Массив после замены: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // задание 5
    public static void printAverageOfArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int n = input.nextInt();
        int[] array = new int[n];
        Random random = new Random();
        System.out.print("Массив: ");
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        double average = (double) sum / n;
        System.out.println("Среднее арифметическое всех элементов массива: " + average);
    }
}

