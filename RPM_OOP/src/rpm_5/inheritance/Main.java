package rpm_5.inheritance;

public class Main {
    public static void main(String[] args) {
        British lori = new British(4, "Alex", "Lori");
        Scottish baxter = new Scottish(10, "Marina", "Baxter");

        lori.sayMeow();
        baxter.sayMeow();

        //System.out.println("Имя кота: " + lori.getName() + ", возраст кота: " + lori.getAge() + ", родитель: " + lori.getOwner());
        //System.out.println("Имя кота: " + baxter.getName() + ", возраст кота: " + baxter.getAge() + ", родитель: " + baxter.getOwner());

        System.out.println(lori.toString());
        System.out.println(baxter.toString());

        British martin = new British(4, "Alex", "Martin");
        British anotherMartin = new British(4, "Alex", "Martin");
        System.out.println(martin == anotherMartin);
    }
}
