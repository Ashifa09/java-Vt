

package Vt29;

//take n no input in an array and print the greatest no 
import java.util.Scanner;
public class Vt31
{
    public static void main(String[]args)
    {int max=0;
        int[] X=new int[10];
                Scanner sc=new Scanner(System.in);
                for(int i=0;i<10;i++)
                {
                    X[i]=sc.nextInt();
                }
               for(int i=0;i<10;i++)
               {
                   if(X[i]>max)
                   {
                   max=X[i];
                   }
                   System.out.println(max);
               }
    }
}
