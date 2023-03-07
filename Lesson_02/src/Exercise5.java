import java.util.Scanner;

public class Exercise5
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter the first score!");
    double firstScore = keyboard.nextDouble();
    System.out.println("Enter the second score!");
    double secondScore = keyboard.nextDouble();
    System.out.println("Enter the third score!");
    double thirdScore = keyboard.nextDouble();

    System.out.println("Your scores are: " + firstScore + ", " + secondScore + "; " + thirdScore);
    System.out.print("Your average is: ");
    System.out.println((firstScore + secondScore + thirdScore)/3);
  }
}
