public class Wheat
{
  public static void main(String[] args)
  {
    double sum = 0;
    double last = 0;
    for (int i = 0; i <= 63; i++)
    {
      sum += Math.pow(2,i);
      last = Math.pow(2,i);
    }
    System.out.println(last);
    System.out.println(sum);
  }
}
