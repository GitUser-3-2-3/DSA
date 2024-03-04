package LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        LinkedList list = new LinkedList();

        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(13);

        list.insertLast(99);
        // list.insert(100, 3);

        list.display();
        System.out.println(list.find(2));
        System.out.println(list.delete(2));
        list.display();

//        list.display();
//        list.deleteFirst();
//        System.out.println(list.deleteLast());
//        list.displaySize();
//        list.display();
    }
}
