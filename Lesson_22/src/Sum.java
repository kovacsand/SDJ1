import java.util.Scanner;

public class Sum
{
  public static void main(String[] args)
  {
    int positiveSum = 0, negativeSum = 0;
    Scanner keyboard = new Scanner(System.in);
    int x;
    do
    {
      System.out.println("Enter a number");
      x = keyboard.nextInt();
      if (x > 0)
        positiveSum += x;
      if (x < 0)
        negativeSum += x;
    } while (x != 0);
    System.out.println(positiveSum);
    System.out.println(negativeSum);
  }
}
