import java.util.ArrayList;
import java.util.Iterator;
public class Vt41 {
    public static void main(String[]args)
    {
        ArrayList<String> Vt41=new ArrayList<String>();
        Vt41.add("A");
        Vt41.add("b");
        Vt41.add("c");
        Vt41.add("d");
        //Iterator variablename= classname/listname.iterator(); {used to retrieve data one by one}
        Iterator itr= Vt41.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
       // System.out.println(Vt41); it gives op s[a b c d }
    }
}
