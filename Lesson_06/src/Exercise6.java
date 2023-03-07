import java.util.Scanner;

public class Exercise6
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("I am going to solve a quadratic equation for you.\nPlease enter a, b, c for ax^2+bx=c=0");
    double a = keyboard.nextDouble();
    double b = keyboard.nextDouble();
    double c = keyboard.nextDouble();

    double determinant = Math.pow(b, 2)-4*a*c;
    if (determinant < 0 )
    {
      System.out.println("There are no solutions!");
    }
    else if (determinant == 0)
    {
      System.out.print("There is one solution, and it is x = ");
      System.out.println( (-b)/(2*a) );
    }
    else
    {
      System.out.print("There are two solutions, and they are the following:\nx1 = ");
      System.out.println( (-b+Math.sqrt(determinant))/(2*a) );
      System.out.print("x2 = ");
      System.out.println( (-b-Math.sqrt(determinant))/(2*a) );
    }
  }
}
