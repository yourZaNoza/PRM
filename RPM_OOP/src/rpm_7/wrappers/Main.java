package rpm_7.wrappers;

public class Main {
    public static void main(String[] args) {
        Integer firstNum = new Integer(10);
        Integer secondNum = new Integer(10);

        int aa = 15;
        int bb = 15;

        System.out.println(aa == bb);
        System.out.println(firstNum.equals(secondNum));
        System.out.println(aa == firstNum);

        Integer c = null;
        int d = c;
        System.out.println(d);

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
