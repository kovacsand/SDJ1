import java.util.Scanner;

public class PC1
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter a positive integer");
    int x = keyboard.nextInt();

    while (x < 1 )
    {
      System.out.println("That's not a positive integer. Try again!");
      x = keyboard.nextInt();
    }

    int sum = 0;
    for (int i = 1; i <= x; i++)
    {
      sum += i;
    }

    System.out.println(sum);
  }
}
