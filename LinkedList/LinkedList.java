public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(int item) {
        Node theNode = new Node(item);

        if (head == null) {
            head = theNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = theNode;
    }

    public void search(int data) {
        // logic
        Node current = head;
        int pos = 1;

        while (current != null) {
            if (current.data == data) {
                System.out.println("Found at position: " + pos);
                return;
            }
            current = current.next;
            pos++;
        }

        System.out.println("Element not found");
    }

    public void remove(int data) {
        // logic
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // Removing head node
        if (head.data == data) {
            head = head.next;
            System.out.println("Removed: " + data);
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                System.out.println("Removed: " + data);
                return;
            }
            current = current.next;
        }

        System.out.println("Element not found");
    }

    public void display() {
        Node current = head;

        if (current == null) {
            System.out.println("List is empty");
            return;
        }

        while (current != null) {
            System.out.print(current.data + " -----> ");
            current = current.next;
        }
        System.out.println();
    }
}
