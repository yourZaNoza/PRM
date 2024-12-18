package pr_9.task_3;

public class CycledList {
    private Node head;

    public void createHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void createTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = head;
        while (current != null) {
            result.append(current.data).append(" -> ");
            current = current.next;
        }
        result.append("null");
        return result.toString();
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void insert(int index, int data) {
        if (index < 0) {
            throw new IllegalArgumentException("Индекс не может быть отрицательным");
        }
        Node newNode = new Node(data);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1 && current != null; i++) {
                current = current.next;
            }
            if (current == null) {
                throw new IndexOutOfBoundsException("Индекс выходит за пределы списка");
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void removeFirst() {
        if (head == null) {
            throw new IllegalStateException("Список пуст");
        }
        head = head.next;
    }

    public void removeLast() {
        if (head == null) {
            throw new IllegalStateException("Список пуст");
        }
        if (head.next == null) {
            head = null;
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
    }

    public void remove(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("Индекс не может быть отрицательным");
        }
        if (head == null) {
            throw new IllegalStateException("Список пуст");
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1 && current != null; i++) {
                current = current.next;
            }
            if (current == null || current.next == null) {
                throw new IndexOutOfBoundsException("Индекс выходит за пределы списка");
            }
            current.next = current.next.next;
        }
    }
}

