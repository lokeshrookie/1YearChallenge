package implementationandtheory.implementation;

public class Main {
    public  static  void main(String[] args){
//        LinkedListImplementation ll  = new LinkedListImplementation();
//        ll.addLast(1);
//        ll.addLast(2);
//        ll.addLast(3);
//        ll.addLast(4);
//        ll.addLast(5);
//        ll.insert(10, 4);
//        ll.display();
          LL l = new LL();
          l.insert(1,0);
          l.display();
          l.delete(0);
          l.display();


        l.inserLast(10);
        l.insertFirst(0);
        l.insert(1,0);
        l.display();
        l.delete(2);
        l.display();
        l.delete(1);
        l.display();
        l.delete(0);
        l.display();
//          l.delete(3);




    }
}
