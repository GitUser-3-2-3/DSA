package LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        LL list1 = new LL();

        list1.insertFirst(12);
        list1.insertFirst(42);
        list1.insertFirst(91);
        list1.insertFirst(25);
        list1.display();

        list1.insertRec(55, 2);

        list1.display();
    }
}
