

package Vt29;


public class Vt29 
{
      public static void main(String[]args)
    {
        int z=4;
        for(int r=1;r<=9;r++)
        {
            if(r<=5)
            {
                for(int c=r;c>=1;c--)
                {
                    System.out.print(c);
                }
            }
            else
            {
                for(int k=z;k>=1;k--)
                {
                  System.out.print(k);   
                }
                z--;
            }
             System.out.println();
        }
    }
}
