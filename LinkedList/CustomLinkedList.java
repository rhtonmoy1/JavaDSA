package LinkedList;

public class CustomLinkedList {
    Node head = null;
    Node tail = null;

    void insertAtEnd(int data){
        Node temp = new Node(data);  // put the new data in temp for example 7
        // last value become = temp;
        if(head == null){            // Check if there is no value
            head = temp;             // then temp will become head
        }else {                      // if there is values then team will go after the tail
            tail.next = temp;            // last location null changed to = temp
        }
        tail = temp;             // tail value become team
    }

    void insertAtBeginning(int data){
        Node temp = new Node(data);
        if(head == null ){
            head = temp;
            tail = temp;
        }else{
            temp.next = head;
            head = temp;
        }

    }

    void insertAt(int idx, int data){
        Node t = new Node(data);
        Node temp = head;
        if(idx == size()){
            insertAtEnd(data);
            return;
        }
        else if(idx == 0){
            insertAtBeginning(data);
            return;
        }else if(idx < 0){
            System.out.println("Wrong input -> index cant be less than zero");
            return;
        }else if(idx > size()){
            System.out.println("Wrong input -> Index is out of bound");
            return;
        }
        for(int i = 0; i < idx-1; i++){
            temp = temp.next;               // node index move keep moving until the before target node
        }
        t.next = temp.next;                 // input Node next address = Target Node
        temp.next = t;                      // Before target Node next address = input Node

    }
    int getAt(int idx){
        Node temp = head;
        if(idx < 0){
            System.out.println("Wrong input -> index cant be less than zero");
            return -1;
        }else if(idx > size()){
            System.out.println("Wrong input -> Index is out of bound");
            return 99999;
        }

        for(int i = 0; i < idx; i++){
            temp = temp.next;
        }
        return temp.data;
    }

    void deleteAt(int idx){
        if(idx == 0){
            head = head.next;
            return;
        }
        Node temp = head;
        for(int i = 0; i < idx -1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if(idx == size()-1) tail = temp;
    }

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }

    int size(){
        int count = 0;
        Node temp = head;
        while(temp != null){
            count ++;
            temp = temp.next;
        }
        return count;
    }


}
