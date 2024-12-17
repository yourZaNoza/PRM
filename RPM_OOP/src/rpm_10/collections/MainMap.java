package rpm_10.collections;

import java.lang.management.MonitorInfo;
import java.util.HashMap;
import java.util.Map;

public class MainMap {
    public static void main(String[] args){
        Map<String, Cat> catMap = new HashMap<>();
        Cat lori = new Cat("Lori", 4);
        Cat baxter = new Cat("Baxter", 7);
        Cat martin = new Cat("Martin", 3);
        Cat bublik = new Cat("Bublik", 10);

        String loriKey = "Lori";
        String baxterKey = "Baxter";
        String martinKey = "Martin";
        String bublikKey = "Bublik";

        catMap.put(loriKey, lori);
        catMap.put(baxterKey, baxter);
        catMap.put(martinKey, martin);
        catMap.put(bublikKey, bublik);

        catMap.get(loriKey);
        catMap.get(baxterKey);
        catMap.get(martinKey);
        catMap.get(bublikKey);

        Map<Cat, Long> catLongMap = new HashMap<>();
        catLongMap.put(lori, 12L);

        WeekDays friday = WeekDays.FRIDAY;
        if (friday == WeekDays.FRIDAY) {
            System.out.println("Пятница");
        }
        System.out.println(friday.getDayNumberOfWeek());
        WeekDays monday = WeekDays.valueOf("MONDAY");
        System.out.println("Enum value: " + monday + " number: " + monday.getDayNumberOfWeek());
    }
}
