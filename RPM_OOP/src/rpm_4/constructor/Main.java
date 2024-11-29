package rpm_4.constructor;

public class Main {
    public static void main(String[] args) {
        Cat lori = new Cat("Lori");
        SayCatService sayCatService = new SayCatService();
        sayCatService.say(lori, "Я хочу есть");

        Cat baxter = new Cat("Baxter");
        sayCatService.say(baxter, "Я хочу спать");

        Cat martin = new Cat("Martin");
        sayCatService.say(martin, "Я хочу играть");

        SayCatService.sayMeow();
        System.out.println(SayCatService.hello);
    }
}
