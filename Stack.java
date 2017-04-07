public class Stack {
   private Node front;
   private Node last;
   private int size;

   Stack() {
       front = new Node();
       last = new Node();
       front.setNext(last);
       last.setBack(front);
       size = 0;
   }



}