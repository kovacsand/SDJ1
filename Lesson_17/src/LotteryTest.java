import java.util.Scanner;

public class LotteryTest
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    int[] guess = new int[5];
    Lottery lottery= new Lottery();

    int[] copy = lottery.copy();
    for (int i = 0; i < 5; i++)
    {
      System.out.print(copy[i] + " ");
    }
    System.out.println();

    for (int i = 0; i < 5; i++)
    {
      System.out.printf("Please enter your %d. guess. ", i+1);
      guess[i] = keyboard.nextInt();
    }

    System.out.printf("You got %d numbers right!\n", lottery.guess(guess));
  }
}
