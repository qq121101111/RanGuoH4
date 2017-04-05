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
       return size
       }
     
       public void enqueue(String string) {
       Node n = new Node();
       n.setData(string);
       n.setBack(last.getBack());
       last.getBack().setNext(n);
       last.setBack(n);
       n.setNext(last);
      
       size++;
       }
       
     public String dequeue() {
       if(size == 0)
           return null;
      
       Node n = front.getNext();
      
       front.setNext(n.getNext());
       n.getNext().setBack(front);
       size--;
       return n.getData();
       }
   }
    



}