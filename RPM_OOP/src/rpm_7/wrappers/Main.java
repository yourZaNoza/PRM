package rpm_7.wrappers;

public class Main {
    public static void main(String[] args) {
//        Integer firstNum = new Integer(10);
//        Integer secondNum = new Integer(10);
//
//        int a = 15;
//        int b = 15;
//
//        System.out.println(a == b);
//        System.out.println(firstNum.equals(secondNum));
//        System.out.println(a == firstNum);
//
//        Integer c = null;
//        int d = c;
//        System.out.println(d);

        String a = "Какая-то строка";
        String b = new String("Какая-то строка");

        String firstStr = "ABC";
        String secondStr = "ABC";
        String thirdStr = new String("ABC");
        String fourthStr = new String("ABC").intern();

        System.out.println(firstStr == thirdStr);
        System.out.println(firstStr.equals(thirdStr));
        System.out.println(firstStr == secondStr);
        System.out.println(firstStr == fourthStr);
    }
}
