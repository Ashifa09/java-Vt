
public class vt27 
{
    public static void main(String[]args)
    {
        int z=4;
        for(int r=1;r<=9;r++)
        {
            if(r<=5)
            {
                for(int c=1;c<=r;c++)
                {
                    System.out.print(c);
                }
            }
            else
            {
                for(int k=1;k<=z;k++)
                {
                  System.out.print(k);   
                }
                z--;
            }
             System.out.println();
        }
    }
}
