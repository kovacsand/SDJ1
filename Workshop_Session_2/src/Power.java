import java.util.Scanner;

public class Power
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a number!");
    double x = keyboard.nextDouble();
    System.out.println("Enter a non-negative integer!");
    int n = keyboard.nextInt();
    while (n < 0) {
      System.out.println("Error! That was a negative integer. Try again!");
      n = keyboard.nextInt();
    }
    double pow = 1;
    for (int i = 0; i < n; i++)
    {
      pow *= x;
    }

    System.out.println(pow);
  }
}
