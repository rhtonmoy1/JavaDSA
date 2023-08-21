package LinkedList;

public class BasicLL{



    //  Display Function
    public static void display(Node head){
        Node temp3 = head;
        while(temp3 != null){
            System.out.print(temp3.data + " ");
            temp3 = temp3.next;
        }
    }

//  Recursively Display function
    public static void displayr(Node head){
        if(head == null) return;
        System.out.print(head.data + " ");
        displayr(head.next);
    }

//  Recursively Display Reverse Function
    public static void displayReverse(Node head){
        if(head == null) return;
        displayReverse(head.next);
        System.out.print(head.data + " ");

    }

//    Count length
    public static int length(Node head){
        int l = 0;
        while(head != null){
            l++;
            head = head.next;
        }
        return l;
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
        d.next = e;   // 5->7->3->22->12
        System.out.println(a);      //$Node@1b28cdfa
        System.out.println(a.next); //$Node@eed1f14
        System.out.println(b);      //$Node@eed1f14
        System.out.println(a.data);       //5
        System.out.println(b.data);       //7
        System.out.println(a.next.data);  // b data
        System.out.println(a.next.next.data); // b.next = c data
        System.out.println(a.next.next.next.data); // c.next = d data
        System.out.println(a.next.next.next.next.data); // d.next = e data

       // Using loop
        Node temp = a;

        for(int i = 1; i <= 5; i++){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        //Using while| Linked List last address = null
        System.out.println();
        System.out.println("Printing the List");
        Node temp2 = a;
        while(temp2 != null){

            System.out.print(temp2.data + " ");
            temp2 = temp2.next;
        }

//        Using Display Function
        System.out.println();
        System.out.println("Display Function");
        display(a);
        System.out.println();
        System.out.println("Recursively Display Function");
        displayr(a);
        System.out.println();
        System.out.println("Recursively Display Reverse Function");
        displayReverse(a);

//        Length
        System.out.println();
        System.out.println("Total length");
        System.out.println(length(a));

    }
}
