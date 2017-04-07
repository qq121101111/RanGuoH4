public class Queue {
  //properties
   private Node front;
   private Node last;
   private int size;
   
  //constructor 
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
      
     
     public String peek() {
       if(size == 0)
           return null;
      
       return front.getNext().getData();
   }
       
     public void printQueue() {
       System.out.print("Front => ");
       Node temp = front.getNext();
       while (temp != last) {
           System.out.print(temp.getData() + " ");
           temp = temp.getNext();
       }
       System.out.println("");
   }
    



}