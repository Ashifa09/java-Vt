import java.util.Scanner;
public class Vt9 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
int ch=1;
ch=sc.nextInt();

switch(ch)
{
    case 1:
System.out.println("Monday");
break;

    case 2:
System.out.println("tuesday");
break;

    case 3:
System.out.println("wednesday");
break;

    case 4:
System.out.println("thursday");
break;

    case 5:
System.out.println("friday");
break;

    case 6:
System.out.println("saturday");
break;

    case 7:
System.out.println("sunday");
break;


default:
System.out.println("enter key");

}
    }
}
