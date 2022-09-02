public class AW5
{
  public static void main(String[] args)
  {
    double x = 0;
    for (int i = 1; i <= 30; i++)
    {
      x += (i/(31-i));
    }
    System.out.println(x);
  }
}
