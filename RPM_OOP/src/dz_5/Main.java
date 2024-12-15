package dz_5;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList<String> list = new CustomLinkedList<>();
        list.add("ABC");
        list.add("DEF");
        list.add("XYZ");
        System.out.println(list.size());
        System.out.println(list.first());
        System.out.println(list.last());
        list.addFirst("AAAAA");
        System.out.println(list.first());
        System.out.println(list.size());
        list.delete(2);
        System.out.println(list.size());
        for (String element : list) {
            System.out.println(element);
        }
    }
}
