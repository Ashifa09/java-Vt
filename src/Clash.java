import java.util.*;
 class Stack1 {
    public boolean validparantheses(String s)
    {
          System.out.println("empty stack");
        
      Stack<Character> student=new Stack<Character>();
      
     
      for(char a: s.toCharArray())
      {
       if (a==('('))
       {
         student.push(')');  
       }
      else if (a==('{'))
       {
         student.push('}');  
       }
      else if (a==('['))
       {
         student.push(']');  
       }
      else if (student.isEmpty()||student.pop()!=a)
       {
          return false;
       }
      }
      return student.isEmpty();
    }
}

public class Clash
{
    public static void main(String[]args)
    {
      Stack1 c=new Stack1();
      boolean ans=c.validparantheses("(");
      System.out.println(ans);
    }
}
