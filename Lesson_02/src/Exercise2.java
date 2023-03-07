import java.util.Scanner;

public class Exercise2
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Write a number!");
    int a = keyboard.nextInt();
    System.out.println("Write a number!");
    int b = keyboard.nextInt();
    System.out.println("Write a number!");
    int c = keyboard.nextInt();

    System.out.print("The sum is: ");
    System.out.println(a + b + c);
    System.out.println("The product is: " + a * b * c);
  }
}
