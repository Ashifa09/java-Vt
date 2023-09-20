import java.util.Scanner;
public class Linkedlist1 
{
    public static class Node
            {
         int data;
            Node next;
        Node(int data)
        {
   
           this.data=data;
           this.next=null;
  
        }
    }
    public static class Head
    {
        public Node head=null;
    
        public void creation()
        {
            int data,n;
            Scanner sc=new Scanner(System.in);
            
            do{
                System.out.println("enter value");
            data=sc.nextInt();
            System.out.println("enter value");
            n=sc.nextInt();
            Node e = new Node(data);
            if (head==null)
            {
             head=e.next;
            }
            else
            {
              head.next=e;
            }
            }while(n==1);
     
        }
    
    public static void main(String[]args)
    {
           
     Head h=new Head();
     h.creation();
    }
    }
}

