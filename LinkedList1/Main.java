public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.display();

        list.search(20);
        list.search(50);

        list.remove(20);
        list.display();
    }
}
