package implementationandtheory.implementation;

public class Main {
    public  static  void main(String[] args){

          LL l = new LL();
          l.insertFirst(1);
          l.inserLast(2);
          l.inserLast(3);
          l.inserLast(4);
          l.inserLast(5);
          l.inserLast(6);
          l.display();
          l.display(l.findMiddle(l.getHead()));
          l.display();

    }
}
