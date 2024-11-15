public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int firstNumber = 10;
        int secondNumber = 5;
        int sum;
        int subtraction;
        int multiplication;
        int division;
        int remainderOfTheDivision;

        sum = firstNumber + secondNumber;
        subtraction = firstNumber - secondNumber;
        multiplication = firstNumber * secondNumber;
        division = firstNumber / secondNumber;
        remainderOfTheDivision = firstNumber % secondNumber;
        System.out.println("Сумма: " + sum);
        System.out.println("Вычитание: " + subtraction);
        System.out.println("Умножение: " + multiplication);
        System.out.println("Деление: " + division);
        System.out.println("Остаток от деления: " + remainderOfTheDivision);
    }
}