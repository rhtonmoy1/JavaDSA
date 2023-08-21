package LinkedList;

public class LinkedListImplement {

    public static void main(String[] args){
        CustomLinkedList ll = new CustomLinkedList();
        ll.insertAtBeginning(9);
        ll.insertAtEnd(4);
        ll.insertAtEnd(6);
        ll.display();
        System.out.println(ll.size());
        ll.insertAtBeginning(7);
        ll.display();
        ll.insertAtEnd(4);
        ll.display();
        ll.insertAt(2,3);
        ll.display();
        ll.insertAt(1,10);
        ll.display();
        ll.insertAt(2,11);
        ll.display();
        ll.insertAt(0,2);
        ll.display();
        System.out.println(ll.head.data);
        ll.insertAt(9,5);
        ll.display();
        System.out.println(ll.tail.data);
        ll.insertAt(10,6);
        ll.display();
        System.out.println(ll.getAt(3));
        ll.deleteAt(0);
        ll.display();
        System.out.println(ll.tail.data);
        System.out.println(ll.head.data);
    }
}
