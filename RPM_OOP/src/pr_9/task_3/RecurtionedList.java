package pr_9.task_3;

public class RecurtionedList {
    private Node head;

    public void createHeadRec(int data) {
        head = createHeadRecHelper(head, data);
    }

    private Node createHeadRecHelper(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }
        Node newNode = new Node(data);
        newNode.next = current;
        return newNode;
    }

    public void createTailRec(int data) {
        head = createTailRecHelper(head, data);
    }

    private Node createTailRecHelper(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }
        current.next = createTailRecHelper(current.next, data);
        return current;
    }

    @Override
    public String toString() {
        return toStringRecHelper(head);
    }

    private String toStringRecHelper(Node current) {
        if (current == null) {
            return "null";
        }
        return current.data + " -> " + toStringRecHelper(current.next);
    }
}

