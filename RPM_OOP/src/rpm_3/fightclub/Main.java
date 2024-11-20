package rpm_3.fightclub;

public class Main {
    public static void main(String[] args) {
        Cat loriCat = new Cat();
        loriCat.setName("Lori");
        loriCat.setWeight(12);

        Cat baxter = new Cat();
        baxter.setName("Baxter");
        baxter.setWeight(10);

        FightClub fightClub = new FightClub();
        System.out.println("Winner: " + fightClub.fight(loriCat, baxter));
    }
}


