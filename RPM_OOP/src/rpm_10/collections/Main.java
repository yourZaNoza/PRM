package rpm_10.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Set<Integer> hashSet = new HashSet<>();
        SortedSet<Integer> treeSet = new TreeSet<>();

        int [] mass = new int[]{7, 2, 4, 5, 9, 8, 6};
        fillCollection(arrayList, mass);
        fillCollection(linkedList, mass);
        fillCollection(hashSet, mass);
        fillCollection(treeSet, mass);

        System.out.println("arrayList");
        printCollection(arrayList);
        System.out.println("linkedList");
        printCollection(linkedList);
        System.out.println("hashSet");
        printCollection(hashSet);
        System.out.println("treeSet");
        printCollection(treeSet);
    }
    private static void printCollection(Collection<Integer> collection) {
        for (Integer element : collection) {
            System.out.println(collection);
        }
    }
    private static void fillCollection(Collection<Integer> collection, int[] mass) {
        for (int element : mass) {
            collection.add(element);
        }
    }
}
