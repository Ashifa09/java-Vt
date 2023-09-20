import java.util.*;
public class Vt44 
{
    public static void main(String[]args)
{
    Map <Integer, String> student = new HashMap <Integer,String>();
        
student.put(102, "Ashifa");
student.put(103, "Ashu");
student.put(104, "Ashi");
student.put(105, "Arshifa");
student.put(106, "Anshifa");

/*for(String key: student.keySet())
{
 System.out.println(key+""+ student.get(Key));  
System.out.println();  
String searchKey="Ashifa";
}*/
String searchValue="Ashifa";
if(student.containsValue(searchValue))

   System.out.println("Ashifa's present"); 



/*for(Map.Entry a: student.entrySet())
       {
         System.out.println(student.get(104));  
       }*/
}
}
