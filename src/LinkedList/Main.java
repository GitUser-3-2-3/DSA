package LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        CircularLinkedList list = new CircularLinkedList();
        list.insert(23);
        list.insert(8);
        list.insert(14);
        list.insert(45);
        list.insert(76);

        list.display();
        list.delete(14);
        list.display();
    }
}
