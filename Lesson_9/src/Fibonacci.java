public class Fibonacci
{
  public static void main(String[] args)
  {
    int i = 1, j = 1, k = 0;
    System.out.printf("Fibonacci(%d) = %d\n", 0, 1);
    System.out.printf("Fibonacci(%d) = %d\n", 1, 1);
    for (int n = 2; n <= 20; n++)
    {
      k = j;
      j = i;
      i = j + k;
      System.out.printf("Fibonacci(%d) = %d\n", n, i);
    }
  }
}
