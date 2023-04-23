package implementationandtheory.implementation;

public class LinkedListImplementation {
    private int size;
    private Node head;
    private Node tail;

    LinkedListImplementation(){
        this.size = 0; // initialize size as 0;
    }


    // insert first
    public int addFirst(int value){
        Node node =  new Node(value);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
        return  value;

    }

    // insert last
    public int addLast(int value){

        //create node
        Node node = new Node(value);
        // check if ll is empty, if empty, simple addfirst.
        if(head == null){
            addFirst(value);
            return value;
        }

        // navigate to preious tail node.
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        // make tail.next as new node
        temp.next = node;
        // make the new node as tail
        tail =  node;
        size++;
        return value;
    }

    // insert anywhere
    public int insert(int value, int index){
        if(index == 0){
            addFirst(value);
            return value;
        }
//        if(index == size -1){
//            addLast(value);
//        }
//        if(index > size || index <0){
//            System.out.println("invalid index. cant add");
//            return  -1;
//        }
        Node node = new Node(value);
        // navigate to previous node store node.next in temp.
        Node temp = head;
        int current = 1;
        while(current < index ){
            temp = temp.next;
            current++;
        }
        node.next = temp.next.next;
        temp.next  = node;
        // make this.next as new node.
        // make new node.next as temp.
        size++;
        return value;
    }


    //display linkedlist
    public  void display(){
        Node temp  = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }


    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }
}
