import java.util.Collections;
import java.util.Random;
import java.util.Arrays;

public class MainPR5 {
    public static void main(String[] args) {
        printBubbleSort(); // задание 1
        // printCarSorting(); // задание 2
    }

    // задание 1
    public static void printBubbleSort() {
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1001);
        }
        System.out.print("Массив до сортировки: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        bubbleSortDescending(array);
        System.out.print("Массив после сортировки: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSortDescending(int[] array) {
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] < array[i]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }

    // задание 2
    public static void printCarSorting() {
        String[] carBrands = {"Toyota", "BMW", "Audi", "Mercedes", "Ford", "Honda", "Tesla", "Volvo", "Nissan", "Hyundai"};

        System.out.println("Массив до сортировки:");
        printArray(carBrands);

        Arrays.sort(carBrands);
        System.out.println("Массив после сортировки по возрастанию:");
        printArray(carBrands);

        Arrays.sort(carBrands, Collections.reverseOrder()); // (a, b) -> b.compareTo(a)
        System.out.println("Массив после сортировки по убыванию:");
        printArray(carBrands);
    }

    public static void printArray(String[] array) {
        for (String element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
