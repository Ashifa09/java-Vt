    

package Vt29;


public class Vt30
{
      public static void main(String[]args)
    {
        int z=9;
        int y=3;
        for(int r=1;r<=9;r++)
        {
            if(r<=5)
            {
                for(int c=z;c<=9;c=c+2)
                {
                    System.out.print(c);
                }
                z=z-2;
            }
            else
            {
                for(int k=y;k<=9;k=k+2)
                {
                  System.out.print(k);   
                }
                y=y+2;
            }
             System.out.println();
        }
    }
}
