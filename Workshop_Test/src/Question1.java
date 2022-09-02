import java.util.Scanner;

public class Question1
{
  public static void main(String[] args)
  {
    //variable init
    Scanner keyboard = new Scanner(System.in);

    //Input
    System.out.print("Type an integer: ");
    int x = keyboard.nextInt();
    System.out.print("Type a second integer: ");
    int y = keyboard.nextInt();
    System.out.print("Type a third integer: ");
    int z = keyboard.nextInt();

    //Calculating
    int product = x*y;
    int sum = x+y;
    double quotient = (double)y/z; //force it to be a double
    int difference = y-z;
    double total = product + sum + quotient + difference;

    //Output
    System.out.printf("The product of (%d * %d) is %d\n", x, y, product);
    System.out.printf("The sum of (%d + %d) is %d\n", x, y, sum);
    System.out.printf("The quotient of (%d / %d) is %.2f\n", y, z, quotient); //rounding to two decimals
    System.out.printf("The difference of (%d - %d) is %d\n", y, z, difference);
    System.out.printf("The total sum of the calculations is %.2f\n", total); //rounding to two decimals
  }
}
