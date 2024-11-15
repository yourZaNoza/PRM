import java.util.Scanner;

public class MainPR3 {
    // задание 1
//    public static void main(String[] args) {
//        for (int i = 0; i < 100; i++) {
//            if (i % 2 == 1) {
//                System.out.print(i + ", ");
//            };
//        }
//    }
    // задание 2
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = input.nextInt();
        int fact = 1;
        for (int i = 1; i < n + 1; i++) {
            fact = fact * i;
        }
        System.out.println("Факториал числа: " + fact);
    }

    // задание 3 (1)
//    public static void main(String[] args) {
//        int i = 0;
//        while (i < 100) {
//            if (i % 2 == 1) {
//                System.out.print(i + ", ");
//            }
//            i += 1;
//        }
//    }
    // задание 3 (2)
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Введите число:");
//        int n = input.nextInt();
//        int fact = 1;
//        int i = 1;
//        while (i < n+1) {
//            fact = fact * i;
//            i += 1;
//        }
//        System.out.println("Факториал числа: " + fact);
//    }
// задание 4
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Введите число:");
//        int x = input.nextInt();
//        System.out.println("Введите степень для числа:");
//        int n = input.nextInt();
//        int result = 1;
//        for (int i = 1; i < n+1; i++) {
//            result = result * x;
//        }
//        System.out.println("Результат: " + result);
//    }
//
// задание 5
//    /public static void main(String[] args) {
//        System.out.println("Первые 10 чисел последовательности: ");
//        for (int i = 0; i < 10; i++) {
//            int number = -5 * i;
//            System.out.print(number + ", ");
//        }
//    }
}

