package pr_8;

public class ExampleClasses {
    public class Except1 {
        public static int m() {
            try {
                System.out.println("0");
                throw new RuntimeException();
            } finally {
                System.out.println("1");
            }
        }

        public static void main(String[] args) {
            System.out.println(m());
        }
    }
    public class Except2 {
        public static int m(){
            try {
                System.out.println("0");
                return 55;
            } finally {
                System.out.println("1");
            } }
        public static void main(String[] args) {
            System.out.println(m());
        }
    }
    public class Except3 {
        public static int m(){
            try {
                System.out.println("0");
                return 15;
            } finally {
                System.out.println("1");
                return 20;
            } }
        public static void main(String[] args) {
            System.out.println(m());
        }
    }
    public class Except4 {
        public static void main(String[] args) {
            try {
                System.out.println("0");
                throw new NullPointerException("ошибка");
            } catch (NullPointerException e) {
                System.out.println("1" );
            }finally {
                System.out.println("2" );
            }
            System.out.println("3");
        }
    }
    public class Except5 {
        public static void m(String str, double chislo){
            if (str==null) {
                throw new IllegalArgumentException("Строка введена неверно");
            }
            if (chislo>0.001) {
                throw new IllegalArgumentException("Неверное число");
            } }
        public static void main(String[] args) {
            m(null,0.000001);
        }
    }
    public class Except6 {
        public static void main(String[] args) {
            try {
                int l = args.length;
                System.out.println("размер массива= " + l);
                int h=10/l;
                args[l + 1] = "10";
            } catch (ArithmeticException e) {
                System.out.println("Деление на ноль");
            }catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Индекс не существует");
            }
        }
    }
    public class Except7 {
        public static void m(int x) throws ArithmeticException{
            int h=10/x;
        }
        public static void main(String[] args) {
            try {
                int l = args.length;
                System.out.println("размер массива= " + l);
                m(l);
            } catch (ArithmeticException e) {
                System.out.println("Ошибка: Деление на ноль");
            }
        }
    }
}
