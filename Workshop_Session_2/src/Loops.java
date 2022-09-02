import java.util.Scanner;

public class Loops
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a positive integer!");
    int n = keyboard.nextInt();

    //Ex a,
    int sum = 0;
    for (int i = 1; i <= n; i++)
    {
      sum += i;
    }
    System.out.println(sum);

    //Ex b,
    int factorial = 1;
    for (int i = n; i >= 1; i--)
    {
      factorial *= i;
    }
    System.out.println(factorial);

    //Ex c,
    double weirdSum = 0;
    for (int i = 1; i <= n; i++)
    {
      weirdSum += ((double)i / (2*i+1) );
    }
    System.out.println(weirdSum);

    //Ex d,
    int powerOfTwo = 1;
    for (int i = 1; i <= n; i++)
    {
      powerOfTwo *= 2;
    }
    System.out.println(powerOfTwo);

    //Ex e,
    double powerSum = 0;
    for (int i = 1; i <= n; i++)
    {
      powerSum += (1 / (Math.pow(2,i) ) );
    }
    System.out.println(powerSum);
  }
}
