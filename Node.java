
public class Node
{
  //properties
     private String data;
     private Node back;
     private Node next;
  
  // setter and getter
     public String getData(){

       return data;

     }

     public Node getBack(){

       return back;

     }

     public Node getNext(){

       return next;

     }
     
     public void setData(String d){

       data = d;

     }

     public void setBack(Node n){

       back = n;

     }

     public void setNext(Node n)

     {

       next = n;

     }
}