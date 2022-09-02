import java.util.Scanner;

public class AreaTest
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("I'm gonna calculate areas for you.");
    System.out.println("Let's start with a rectangle. Enter the width!");
    float width = keyboard.nextFloat();
    System.out.println("Now enter the length!");
    float length = keyboard.nextFloat();
    System.out.println("The area of the rectangle is: " + Area.area(width, length));

    System.out.println("Now a circle. Enter the radius!");
    double radius = keyboard.nextDouble();
    System.out.println("The area of the circle is: " + Area.area(radius));

    System.out.println("Now a cylinder. Enter the radius!");
    double cylinderRadius = keyboard.nextDouble();
    System.out.println("Now enter the height!");
    double cylinderHeight = keyboard.nextDouble();
    System.out.println("The are of the cylinder is: " + Area.area(cylinderRadius, cylinderHeight));

  }
}
