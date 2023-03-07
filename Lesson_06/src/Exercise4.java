import java.util.Scanner;

public class Exercise4
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    //Exercise a, b
    System.out.println("Please enter 2 whole numbers!");
    int a = keyboard.nextInt();
    int b = keyboard.nextInt();

    if (a <= b)
    {
      System.out.printf("%d is the smallest number.\nThe order of them is (smallest first): %d, %d\n", a, a, b);
    }
    else
    {
      System.out.printf("%d is the smallest number.\nThe order of them is (smallest first): %d, %d\n", b, b, a);
    }

    System.out.println("Please enter another whole number!");
    int c = keyboard.nextInt();

    //Exercise c
    //The smallest is a
    if (a < b && b < c)
    {
      System.out.printf("The order of them is (smallest first): %d, %d, %d\n", a, b, c);
    }
    else if (a < b && a < c && c < b)
    {
      System.out.printf("The order of them is (smallest first): %d, %d, %d\n", a, c, b);
    }
    //The smallest is b
    if (b < a && a < c)
    {
      System.out.printf("The order of them is (smallest first): %d, %d, %d\n", b, a, c);
    }
    else if (b < a && b < c && c < a)
    {
      System.out.printf("The order of them is (smallest first): %d, %d, %d\n", b, c, a);
    }
    //The smallest is c
    if (c < a && a < b)
    {
      System.out.printf("The order of them is (smallest first): %d, %d, %d\n", c, a, b);
    }
    else if (c < a && c < b && b < a)
    {
      System.out.printf("The order of them is (smallest first): %d, %d, %d\n", c, b, a);
    }
  }
}
