public class Queue {

   private Node front;
   private Node last;
   private int size;
   
   
    Queue() {
       front = new Node();
       last = new Node();
       front.setNext(last);
       last.setBack(front);
       size = 0;
   }
    
     public int getSize() {
       return size;
   }
    



}