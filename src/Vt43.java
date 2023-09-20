import java.util.*;

public class Vt43 
{
public static void main(String[]args)
{
    Map <Integer, String> student = new HashMap <Integer,String>();
        
student.put(102, "Ashifa");
student.put(103, "Ashu");
student.put(104, "Ashi");
student.put(105, "Arshifa");
student.put(106, "Anshifa");


Iterator itr= student.entrySet().iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
 /*       
for(Map.Entry a: student.entrySet())
        {
          System.out.println(a);  
    }*/

}
}
