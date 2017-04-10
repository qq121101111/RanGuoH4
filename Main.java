public class Main {

   public static void main(String[] args) {
     //add data
      Stack stack = new Stack();
       stack.push("A");
       stack.push("B");
       stack.push("C");
       stack.push("E");
       stack.push("F");
       stack.push("G");
       
      
     

     
   }
   
    static Queue stackToQueue(Stack stack) {
       Stack tempStack = new Stack();
       Queue queue = new Queue();
      
       // create queue at the same time create a temporary stack
       while(stack.peek() != null) {
           String s = stack.pop();
           queue.enqueue(s);
           tempStack.push(s);
       }
      
       // restore original stack
       while(tempStack.peek() != null) {
           String s = tempStack.pop();
           stack.push(s);
       }
      
       return queue;
   }
}
    