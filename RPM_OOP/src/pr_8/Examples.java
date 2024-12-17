package pr_8;

public class Examples {

    public static void main(String[] args) {
        printExamples();
    }
    public static void printExamples() throws RuntimeException {
        // пример 4.1
        try {
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка");
        } catch (RuntimeException e) {
            System.out.println("1 " + e);
        }
        System.out.println("2");
        // пример 4.2
        try {
            System.out.println("0");
            throw new RuntimeException("Непроверяемая ошибка");
            //System.out.println("1");
        } catch (Exception e) {
            System.out.println("2 " + e);
        }
        System.out.println("3");
        // пример 4.3
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
        } catch (RuntimeException e) {
            System.out.println("2");
        } catch (Exception e) {
            System.out.println("3");
        }
        System.out.println("4");
        // пример 4.4
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
        } catch (Exception e) {
            System.out.println("2");
        } catch (Error e) {
            System.out.println("3");
        }
        System.out.println("4");
        // пример 4.5
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
        }
        System.out.println("2");
        // пример 4.6
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (ArithmeticException e) {
            System.out.println("1");
        } catch (RuntimeException e) {
            System.out.println("2");
        } catch (Exception e) {
            System.out.println("3" );
        }
            System.out.println("4");
        // пример 4.7
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1" );
            throw new ArithmeticException();
        }catch (ArithmeticException e) {
            System.out.println("2" );
        }
        System.out.println("3");
        }
}

