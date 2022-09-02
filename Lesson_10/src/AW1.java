import java.util.Scanner;

public class AW1
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    double product = 0;

    do
    {
      System.out.println("Please enter a number!");
      double x = keyboard.nextDouble();
      product = 10*x;
    }
    while(product<100);
    System.out.println("Bye!");
  }
}
