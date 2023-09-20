import java.util.Scanner;
public class Vt11
{
    public static void main(String[]args)
    {
        int marks;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks");
        marks=sc.nextInt();
        if (marks<=100&&marks>=91)
        {
           System.out.println("o grade");
        } 
        else if (marks<=90&&marks>=81)
        {
           System.out.println("A+ grade");
        } 
         else if (marks<=80&&marks>=71)
        {
           System.out.println("A grade");
        } 
          else if (marks<=70&&marks>=61)
        {
           System.out.println("B+ grade");
        } 
         else   if (marks<=60&&marks>=51)
        {
           System.out.println("B grade");
        } 
           else  if (marks<=50&&marks>=0)
        {
           System.out.println("Reapper");
        } 
             else
        {
           System.out.println("enter marks between 0 and 100");
        } 
    }
}
