public class StudentTest
{
  public static void main(String[] args)
  {
    try
    {
      Student student1 = new Student("Sofia", 15);
      System.out.println(student1);
    }
    catch (IllegalGradeException e)
    {
      System.out.println(e.getMessage());
    }
  }
}
