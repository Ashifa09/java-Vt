
public class Vt34 {
     void show()
    {
        System.out.println("b");
    }
}
class Student extends Vt34
{
    void display()
    {
      System.out.println("a");  
    }
    public static void main (String[]args)
    {
        Student s= new Student();
        s.show();
        s.display();
    }
}
