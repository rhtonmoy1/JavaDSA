package LinkedList;

public class BasicLL {
    public static class Node{
        int data; //value
        Node next; // address of next node

        //Node constructor
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args){
        Node a = new Node(5);
        Node b = new Node(7);
        Node c = new Node(3);
        Node d = new Node(22);
        Node e = new Node(12);

//        5  7  3  22  12
        a.next = b;  // 5->7  3  22  12
        b.next = c;  // 5->7->3  22  12
        c.next = d;  // 5->7->3->22  12
        d.next =e;   // 5->7->3->22->12
        System.out.println(a);      //$Node@1b28cdfa
        System.out.println(a.next); //$Node@eed1f14
        System.out.println(b);      //$Node@eed1f14
        System.out.println(a.data);       //5
        System.out.println(b.data);       //7
        System.out.println(a.next.data);  //7
    }
}
