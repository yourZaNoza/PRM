import java.util.Scanner;

public class MainMass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] mass = new int[5];
        for (int i = 0; i < 5; i++) {
            mass[i] = input.nextInt();
        }
        printMass(mass);
    }
    public static void printMass(int[] mass) {
        for (int i=0; i < mass.length; i++) {
            System.out.println("Значение индекса: " + i + ". Значение элемента: " + mass[i]);
        }
    }
//    public static void PrintMass(int[] mass) {
//        for (int elem : mass) {
//            System.out.println("Значение индекса: " + elem + ". Значение элемента: " + mass[elem]);
//        }
//    }
}
