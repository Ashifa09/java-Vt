import java.util.Scanner;
public class Linkedlist4 {
    public static class Node
    {
      int data;
      Node next;
      Node(int dataip)
      {
          this.data=dataip;
          this.next=null;
      }
    }
   public static class Operations
    {
        Node head=null;
        Node tail=null;
        
        public void creation()
        {
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            Node newNode= new Node(a);
            System.out.println(newNode);
        } 
        
        public void insertion()
        {
            int n;
            do {
                Scanner sc=new Scanner(System.in);
                System.out.println("enter data");
                int b=sc.nextInt();
                System.out.println("do u want to continue");
                 n=sc.nextInt();
                Node newNode= new Node(b);
                if (head==null)
                {
                    head = newNode;
                    tail = newNode;
                }
               else
                {
                tail.next=newNode;
                tail=newNode;
//                newNode.next = head;(circular ll)
                }
            } while(n==1);
            
        }
        
        
       public void insertion_in_mid()
       {
           Node temp=head;
           for(int i=0; i<3;i++)
           {
               
           }
       }
        
        
        public void display()
        {
            Node current=head;
            
           while(current!=null)
           {
             System.out.println(current.data);
             current=current.next;
             
           }
        }
    }
   public static void main(String[]args)
   {
       Operations l=new Operations();
       l.insertion();
       l.display();
   }
}
