
public class Vt38 {
  void getstudent()
  {
     
    System.out.println("Ashifa");
    System.out.println(5);
  }
}
class Class extends Vt38
        {
    void getsection(String section)
    {
     System.out.println("A");
    }
}
class Exam extends Class
{
    public static void main (String[]args)
    {
        Exam e=new Exam();
        e.getstudent();
        e.getsection("A");
        
    }
}
