package rpm_8.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Main {
    public static void main(String[] args){
        //List<String> someList = new ArrayList<>();
        //List<Integer> intList = new ArrayList<>();
        List<Integer> intList = new LinkedList<>();
        for (int i=0; i<1000; i++) {
            intList.add(i);
        }
        System.out.println(intList.size());
        for (Integer element: intList) {
            if (element % 15 == 0) {
                System.out.println(element);
            }
        }
        CustomLinkedList<String> customLinkedList = new CustomLinkedList<>();
        customLinkedList.add("ABC");
        customLinkedList.add("DEF");
        customLinkedList.add("XYZ");
        System.out.println(customLinkedList.get(1));
    }
}
