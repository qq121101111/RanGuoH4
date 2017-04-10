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
       Queue queue = stackToQueue(stack);
       
       // print both
       stack.printStack();
       queue.printQueue();
      
       System.out.println("-----------------------------------");
      
       stack = queueToStack(queue);
       stack.printStack();
       queue.printQueue();
      
       System.out.println("-----------------------------------");
       Stack newStack = stackToStack(stack);
       stack.printStack();
       newStack.printStack();      
     

     
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
     static Stack queueToStack(Queue queue) {
       Queue tempQueue = new Queue();
      
       // creating temp stack, as stack elements will be reversed of queue
       Stack tempStack = new Stack();
       while(queue.peek() != null) {
           String s = queue.dequeue();
           tempQueue.enqueue(s);
           tempStack.push(s);
       }
      
       // restore on queue
       while(tempQueue.peek()!=null) {
           queue.enqueue(tempQueue.dequeue());
       }
      
       // create stack for storing the final result
       // we will reverse the tempstack on this
       // so that results are in order
       Stack stack = new Stack();
       while(tempStack.peek() != null) {
           stack.push(tempStack.pop());
       }
       return stack;
   }
      static Stack stackToStack(Stack stack) {
       Stack tempStack = new Stack();
       while(stack.peek() != null) {
           tempStack.push(stack.pop());
       }
      
       // Now tempStack has reverse elements, and original
       // stack is empty
       // creating new Stack to store result
       Stack resultStack = new Stack();
       while(tempStack.peek()!= null) {
           String s = tempStack.pop();
           resultStack.push(s);
           stack.push(s);
       }
       return resultStack;
      }
}
    