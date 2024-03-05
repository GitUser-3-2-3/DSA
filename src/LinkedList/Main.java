package LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        LinkedList list = new LinkedList();

//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(13);
//
//        list.insertLast(99);

//        list.display();
//        System.out.println(list.find(2));
//        System.out.println(list.delete(2));
//        list.display();

        DoublyLinkedList dList = new DoublyLinkedList();


        dList.insertFirst(3);
        dList.insertFirst(8);
        dList.insertFirst(12);
        dList.insertFirst(14);
        dList.insertFirst(19);
        dList.insertFirst(21);
        dList.insertAfter(12, 33);

        dList.display();
    }
}
