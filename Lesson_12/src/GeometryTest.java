import java.util.Scanner;

public class GeometryTest
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    char choice = ' ';

    do
    {
      System.out.println("Geometry Calculator");
      System.out.println("1. Calculate the Area of a Circle");
      System.out.println("2. Calculate the Area of a Rectangle");
      System.out.println("3. Calculate the Area of a Triangle");
      System.out.println("4. Quit");
      System.out.println("\nEnter your choice (1-4):");

      choice = keyboard.nextLine().charAt(0);

      switch (choice)
      {
        case '1':
          System.out.println("Enter the radius!");
          double radius = keyboard.nextDouble();
          keyboard.nextLine();
          System.out.println(Geometry.Area(radius));
          break;

        case '2':
          System.out.println("Enter the length!");
          double length = keyboard.nextDouble();
          System.out.println("Enter the length!");
          double width = keyboard.nextDouble();
          keyboard.nextLine();
          System.out.println(Geometry.Area(length, width));
          break;
        case '3':
          System.out.println("Enter the base!");
          float base = keyboard.nextFloat();
          System.out.println("Enter the height!");
          float height = keyboard.nextFloat();
          keyboard.nextLine();
          System.out.println(Geometry.Area(base, height));
          break;
      }
    }
    while (choice != '4');
  }
}
