import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Exercise1
{
  public static void main(String[] args)
  {
    Random randomizer = new Random();
    Scanner keyboard = new Scanner(System.in);
    int number = randomizer.nextInt(10)+1;

    System.out.println("I have thought of a number! Try to guess it!");
    int guess = keyboard.nextInt();
    if (guess == number)
    {
      System.out.printf("Well done! It was %d.", number);
    }
    else
    {
      System.out.printf("Better luck next time! It was actually %d", number);
    }
  }
}
