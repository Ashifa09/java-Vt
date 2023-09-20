
import java.util.ArrayList;
import java.util.Collections;
public class Vt42 
{
   
    public static void main(String[]args)
    {
        ArrayList<String> list1=new ArrayList<String>();
        list1.add("A");
        list1.add("b");
        list1.add("c");
        list1.add("d");
        
        ArrayList<String> list2=new ArrayList<String>();
        list2.add("s");
        list2.add("q");
        list2.add("r");
        list2.add("t");
        //for(dtype of arraylist variablename: arrayname/classname 
        
        list1.addAll(list2);
        
       /* Collections.sort(list1);*/
        for(String a: list1)
        {
          System.out.println(a);  
    }
}

}
