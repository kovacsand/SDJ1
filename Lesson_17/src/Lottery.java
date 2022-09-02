import java.util.Random;

public class Lottery
{
  private int[] lotteryNumbers = new int[5];

  public Lottery()
  {
    Random randomizer = new Random();
    for (int i = 0; i < lotteryNumbers.length; i++)
      lotteryNumbers[i] = randomizer.nextInt(10);
  }

  public int guess(int[] guess)
  {
    int counter = 0;
    for (int i = 0; i < guess.length; i++)
      if (guess[i] == lotteryNumbers[i])
        counter++;
    return counter;
  }

  public int[] copy()
  {
    int[] temp = new int[5];
    for (int i = 0; i < lotteryNumbers.length; i++)
      temp[i] = lotteryNumbers[i];
    return temp;
  }
}
