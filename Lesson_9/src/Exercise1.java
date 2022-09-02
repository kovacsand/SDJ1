import java.util.Scanner;

public class Exercise1
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a whole number!");
    int n = keyboard.nextInt();

    for (int i = 2; i <= n; i++)
    {
      System.out.print(i + " ");
    }
    System.out.println();

    for (int i = 2; i <= n; i += 2)
    {
      System.out.print(i + " ");
    }
    System.out.println();

    for (int i = 1; i <= n; i++)
    {
      System.out.print((int)Math.pow(i, 2) + " ");
    }
    System.out.println();
  }
}
