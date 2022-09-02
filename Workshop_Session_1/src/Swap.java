import java.util.Scanner;

public class Swap
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Input an integer!");
    int x = keyboard.nextInt();
    System.out.println("Input another integer!");
    int y = keyboard.nextInt();

    System.out.printf("The first integer is %d, the second one is %d.\n", x, y);
    System.out.println("Swapping values...");
    x += y;
    y = x-y;
    x -= y;
    System.out.printf("The first integer is %d, the second one is %d.\n", x, y);
  }
}
