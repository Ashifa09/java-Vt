import java.util.*;
public class Vt45 {
 public static void main(String[]srgs)
 {
     String input = "character";
        String output = "";
        TreeSet<Character> my_set = new TreeSet<Character>();

        for(char x : input.toCharArray())
        {
            my_set.add(x);
        }
        for(char s : my_set) {
            output+=s;
        }
        System.out.println(output);
 
 }
}
