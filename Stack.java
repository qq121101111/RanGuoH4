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
    public int getSize() {
       return size;
   }

   public void push(String string) {
       Node n = new Node();
       n.setData(string);
      
       front.getNext().setBack(n);
       n.setNext(front.getNext());
       front.setNext(n);
       n.setBack(front);
      
       size++;
   }
    public String pop() {
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
     //print method
     public void printStack() {
       System.out.print("Top => ");
       Node temp = front.getNext();
       while (temp != last) {
           System.out.print(temp.getData() + " ");
           temp = temp.getNext();
       }
       System.out.println("");
   }
  
  
}