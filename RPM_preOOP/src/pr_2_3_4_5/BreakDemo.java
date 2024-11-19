package pr_2_3_4_5;

public class BreakDemo {
    // задание 6, пр_3
    public static void main(String[] args) {
        String searchMe = "Мама мыыла раму";
        int max = searchMe.length();
        char symb = 'ы';
        int count = 0;

        for (int i = 0; i < max; i++) {
            if (searchMe.charAt(i) == symb) {
                count++;
                if (count >= 2) {
                    System.out.println("Символ '" + symb + "' встречается в строке хотя бы два раза");
                    break;
                }
            }
        }

        if (count < 2) {
            System.out.println("Символ '" + symb + "' встречается в строке менее двух раз");
        }
    }
}