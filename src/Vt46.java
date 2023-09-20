import java.util.*;
public class Vt46 {
   public static void main(String[]args)
   {
       Scanner sc=new Scanner(System.in);
       int n,b,r=0,z;
       System.out.println("enter value");
       n=sc.nextInt();
       z=n;
       while(n!=0)
       {
           b=n%10;
           r=r*10+b;
           n=n/10;
       }
       if (r==z)
       {
           System.out.println("palindrome");
       }   
       else
       {
            System.out.println(" not palindrome");
       }
   }
}
