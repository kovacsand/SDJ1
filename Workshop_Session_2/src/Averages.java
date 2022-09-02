import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Averages
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    double sumPos = 0, counterPos = 0;
    double sumNeg = 0, counterNeg = 0;
    for (int i = 1; i <= 10; i++)
    {
      System.out.println("Enter an integer!");
      int x = keyboard.nextInt();
      if (x < 0)
      {
        counterNeg++;
        sumNeg += x;
      }
      else
      {
        counterPos++;
        sumPos += x;
      }
    }
    if (counterNeg == 0 || counterPos == 0)
    {
      System.out.println("Incorrect input!");
    }
    else
    {
      System.out.println("The average of the positive integers is: " + sumPos/counterPos);
      System.out.println("The average of the negative integers is: " + sumNeg/counterNeg);
    }

  }
}
