package dz_2;

public class Table {
    public static void main(String[] args) {
        int[] array = new int[9];
        int[] squares = squarestable(array);
        printSquaresTable(squares);
        int[] cubes = cubestable(array);
        printCubesTable(cubes);
    }

    public static int[] squarestable(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (i + 1) * (i + 1);
        }
        return array;
    }

    public static int[] cubestable(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (i + 1) * (i + 1) * (i + 1);
        }
        return array;
    }

    public static void printSquaresTable(int[] array) {
        System.out.println("Таблица квадратов:");
        System.out.println("|\tЗначение индекса\t|\tРезультат\t|");
        System.out.println("-----------------------------------------");
        for (int i = 0; i < array.length; i++) {
            System.out.println("|\t\t\t" + (i + 1) + "\t\t\t|\t\t" + array[i] + "\t\t|");
        }
    }

    public static void printCubesTable(int[] array) {
        System.out.println("Таблица кубов:");
        System.out.println("|\tЗначение индекса\t|\tРезультат\t|");
        System.out.println("-----------------------------------------");
        for (int i = 0; i < array.length; i++) {
            System.out.println("|\t\t\t" + (i + 1) + "\t\t\t|\t\t" + array[i] + "\t\t|");
        }
    }
}
