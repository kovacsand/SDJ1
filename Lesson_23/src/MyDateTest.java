public class MyDateTest
{
  public static void main(String[] args)
  {
    MyDate myDate1 = new MyDate(1, 1, 2000);
    try
    {
      myDate1.setDay(0);
      System.out.println(myDate1);
    }
    catch (IllegalDateException e)
    {
      System.out.println(e.getMessage());
    }
  }
}
