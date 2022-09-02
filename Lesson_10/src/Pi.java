import java.text.DecimalFormat;

public class Pi
{
  public static void main(String[] args)
  {
    DecimalFormat formatter = new DecimalFormat("#.#####");

    double pi = 0;
    int i = 1;
    int n = 0;
    do
    {
      if (i % 4 == 3)
      {
        pi -= (double)1/i;
      }
      else
      {
        pi += (double)1/i;
      }
      n++;
      i += 2;
    }
    while (!formatter.format(Math.PI).equals(formatter.format(4*pi)));

    System.out.println(n);
  }
}
