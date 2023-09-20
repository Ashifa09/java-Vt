
import java.util.Scanner;
public class Linkedlist2
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
    Linkedlist2.Node head=null;
    
        public void creation()
        {
            int data,n;
            Scanner sc=new Scanner(System.in);
            
            do{
                System.out.println("enter value");
            data=sc.nextInt();
            System.out.println("enter value");
            n=sc.nextInt();
           
            }while(n==1);
     
        }
        public void traversal()
        {
           Node temp=head;
           if(head==null)
           {
               System.out.println("linked list doesn't exist");
           }
           else
           {
               while(temp!=null)
               {
                   System.out.println(temp.data);
               }
           }
        }
    //wrap in which singly ll 3rd node has to traverse through singly ll traversal logic
    public static void main(String[]args)
    {
        Linkedlist2 l=new Linkedlist2();
        l.creation();
        l.traversal();
    }
    
}



