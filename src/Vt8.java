import java.util.Scanner;
public class Vt8 
{
 
    void function()
    {
        int num1=10,num2=20;
        Scanner sc=new Scanner(System.in);
    
        System.out.println("press a for add");
        System.out.println("press s for sub");
        System.out.println("press m for mul");
        System.out.println("press d for div");
        
        System.out.println("enter choice");
        String ch=sc.next();
        num1=sc.nextInt();
        num2=sc.nextInt();
        
        
        int res;
        if(ch.equals("a"))
        {
            res=num1+num2;
            System.out.println("addition is; " +res);
           
        }
        else if(ch.equals("s"))
            
        {
            res=num1-num2;
            System.out.println("sub is; " +res);
           
        }
         else if(ch.equals("m"))
        {
            res=num1*num2;
            System.out.println("mult is; " +res);
           
        }
          else if(ch.equals("d"))
        {
            res=num1/num2;
            System.out.println("addition is; " +res);
           
        }
          else 
          {
              System.out.println("Wrong choice ");
          }
    }
      public static void main (String[]args)
    {
        Vt8 v=new Vt8();
        v.function();
    }

   
}
