public class Stack {
//properties 
  private Node front;
   private Node last;
   private int size;
//constructor
   Stack() {
       front = new Node();
       last = new Node();
       front.setNext(last);
       last.setBack(front);
       size = 0;
   }



}