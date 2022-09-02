import java.util.Random;
import java.util.Scanner;

public class NumberGuesser
{
  public static void main(String[] args)
  {
    Random randomizer = new Random();
    Scanner keyboard = new Scanner(System.in);
    int randomNumber = randomizer.nextInt(1000)+1;
    int guess, counter = 0;

    System.out.println("I have thought of a number between 1 and 1000. Can you guess it? ;)");
    do
    {
      System.out.println("Enter your guess!");
      guess = keyboard.nextInt();
      counter++;

      if (guess < randomNumber)
      {
        System.out.println("Your guess was too low.");
      }
      if (guess > randomNumber)
      {
        System.out.println("Your guess was too high.");
      }
    }
    while (guess != randomNumber);

    System.out.printf("Congratulations! That was my number! It took you %d turns to guess.", counter);
  }
}
