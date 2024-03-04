package LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        LinkedList list = new LinkedList();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(13);

        list.display();
    }
}
