package pr_6;

import java.util.Random;
import java.util.Arrays;

public class MainPR6 {
    public static void main(String[] args) {
        // TwoDimensionalArray(); // задание 1
        // MatrixOperations(); // задание 2
        // Sum2DArray(); // задание 3
        // NegativeCells(); // задание 4
        SortRows(); // задание 5
    }

    // задание 1
    public static void TwoDimensionalArray() {
        int[][] array = new int[5][6];
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j] = random.nextInt(100);
            }
        }
        System.out.println("Весь массив:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Третья строка массива: ");
        for (int j = 0; j < 6; j++) {
            System.out.print(array[2][j] + " ");
        }
        System.out.println();
    }

    // задание 2
    public static void MatrixOperations() {
        int[][] matrixC = new int[3][3];
        int[][] matrixD = new int[3][3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixC[i][j] = random.nextInt(100);
                matrixD[i][j] = random.nextInt(100);
            }
        }

        System.out.println("Матрица C:");
        printMatrix(matrixC);

        System.out.println("Матрица D:");
        printMatrix(matrixD);

        int[][] sumMatrix = addMatrices(matrixC, matrixD);
        System.out.println("Результат сложения:");
        printMatrix(sumMatrix);

        int[][] productMatrix = multiplyMatrices(matrixC, matrixD);
        System.out.println("Результат умножения");
        printMatrix(productMatrix);
    }

    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // задание 3
    public static void Sum2DArray() {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("Сумма всех элементов массива: " + sum);
    }

    // задание 4
    public static void NegativeCells() {
        int[][] array = {
                {1, -2, 3},
                {4, -5, 6},
                {-7, 8, -9}
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    System.out.println("Отрицательное число найдено в ячейке [" + i + "][" + j + "]");
                }
            }
        }
    }

    // задание 5
    public static void SortRows() {
        int[][] array = {
                {3, 1, 2},
                {6, 4, 5},
                {9, 7, 8}
        };
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
        }
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
