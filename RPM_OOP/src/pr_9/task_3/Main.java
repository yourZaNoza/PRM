package pr_9.task_3;

public class Main {
    public static void main(String[] args) {
        cycledList(); // с использованием цикла
        recursionedList();
    }
    public static void cycledList() {
        CycledList list = new CycledList();

        // Создание списка с вводом с головы
        list.createHead(10);
        list.createHead(20);
        list.createHead(30);
        System.out.println("Список после создания с головы: " + list);

        // Создание списка с вводом с хвоста
        list.createTail(40);
        list.createTail(50);
        System.out.println("Список после создания с хвоста: " + list);

        // Добавление элемента в начало списка
        list.addFirst(60);
        System.out.println("Список после добавления в начало: " + list);

        // Добавление элемента в конец списка
        list.addLast(70);
        System.out.println("Список после добавления в конец: " + list);

        // Вставка элемента в список с указанным номером
        list.insert(2, 80);
        System.out.println("Список после вставки элемента: " + list);

        // Удаление элемента с головы списка
        list.removeFirst();
        System.out.println("Список после удаления с головы: " + list);

        // Удаление последнего элемента списка
        list.removeLast();
        System.out.println("Список после удаления последнего элемента: " + list);

        // Удаление элемента с указанным номером
        list.remove(1);
        System.out.println("Список после удаления элемента с указанным номером: " + list);
    }
    public static void recursionedList() {
        RecurtionedList list = new RecurtionedList();

        // Создание списка с вводом с головы с использованием рекурсии
        list.createHeadRec(10);
        list.createHeadRec(20);
        list.createHeadRec(30);
        System.out.println("Список после создания с головы: " + list);

        // Создание списка с вводом с хвоста с использованием рекурсии
        list.createTailRec(40);
        list.createTailRec(50);
        System.out.println("Список после создания с хвоста: " + list);
    }
}

