import java.util.Scanner;

public class LandTractTest
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter the width of the first tract!");
    double width = keyboard.nextDouble();
    System.out.println("Please enter the length of the first tract!");
    double length = keyboard.nextDouble();
    LandTract landTract1 = new LandTract(width, length);
    System.out.println("Please enter the width of the second tract!");
    width = keyboard.nextDouble();
    System.out.println("Please enter the length of the second tract!");
    length = keyboard.nextDouble();
    LandTract landTract2 = new LandTract(width, length);

    if (landTract1.equals(landTract2))
    {
      System.out.println("They are of equal size.");
    }
    else
    {
      System.out.println("They are not of equal size.");
    }

    System.out.println("Information about the first tract: " + landTract1);
    System.out.println("Information about the second tract: " + landTract2);
  }
}
