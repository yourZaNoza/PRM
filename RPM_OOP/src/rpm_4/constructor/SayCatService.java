package rpm_4.constructor;

public class SayCatService {

    public static String hello = "Hello from static!";
    public static void sayMeow() {
        System.out.println("Meow!");
    }

    void say(Cat cat, String Message) {
        String catName = cat.getName();
        System.out.println(concatNameAndMessage(catName, Message));
    }

    private String concatNameAndMessage(String catName, String message) {
        return catName + ": " + message;
    }
}
