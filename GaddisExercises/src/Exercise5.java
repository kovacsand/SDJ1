import java.util.Scanner;

public class Exercise5
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Input sales tax!");
    double salesTax = keyboard.nextDouble();
    keyboard.nextLine();
    System.out.println("Input first price!");
    double firstPrice = keyboard.nextInt();
    System.out.println("Input second price!");
    double secondPrice = keyboard.nextInt();
    System.out.println("Input third price!");
    double thirdPrice = keyboard.nextInt();

    double firstTax = firstPrice * salesTax, secondTax = secondPrice * salesTax, thirdTax = thirdPrice * salesTax;
    double firstTotal = firstPrice + firstTax, secondTotal = secondPrice + secondTax, thirdTotal = thirdPrice + thirdTax;

    System.out.println("First: " + firstTax + " tax, " + firstTotal + " in total.");
    System.out.println("Second: " + secondTax + " tax, " + secondTotal + " in total.");
    System.out.println("Third: " + thirdTax + " tax, " + thirdTotal + " in total.");
  }
}
