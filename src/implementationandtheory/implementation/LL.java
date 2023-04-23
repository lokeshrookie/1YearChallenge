package implementationandtheory.implementation;

public class LL {

    // class variables
    private Node head;
    private int size;


    public LL(){
        this.size = 0;
    }



// Display
    public void display(){
        Node temp = head;
        while(temp !=  null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }
    // Insert first

    public int insertFirst(int value){
        Node node = new Node(value);
            node.next = head;
            head = node;
            size++;
            return value;
    }
    // Insert last

    public int inserLast(int value){
        Node node = new Node(value);
        if(head == null){
            return insertFirst(value);
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        size++;
        return value;
    }

    // Insert at index
    public int insert(int value, int index){
        if(index == 0) {
            return insertFirst(value);
        }
        if(index == size){
            return inserLast(value);
        }
        Node temp = head; // for iteration.
        // go to previous element of index.
        for(int i = 0 ; i<index; i++){
            temp = temp.next;
        }
        //create node
        Node node = new Node(value);
        temp.next  = node;
        size++;
        return value;
    }


    // delete first
    public int deleteFirst(){
        int value = head.value;
        head = head.next;
        size--;
        return value;

    }

    //delete last

    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        //navigate to second last.
        // make that node's next as null.
        Node temp = head;
        int value;
        for(int i = 0; i<size-2; i++){
         temp = temp.next;
        }
        value = temp.next.value;
        temp.next = null;
        size --;
        return value;
    }




    // delete by index
    public int delete(int index){
        if(index == 0){
           return  deleteFirst();
        }
        if(index == size-1){
            return  deleteLast();
        }
        Node temp = head;
        for(int i = 0; i<index-1; i++){
            temp = temp.next;
        }
        int value = temp.next.value;
        temp.next  = temp.next.next;
        size--;

        return value;
    }













    private class Node{
        private  int value;
        private  Node next;

        Node(int value ){
            this.value = value;
            this.next = null;
        }

        Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }




}
