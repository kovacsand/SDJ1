import java.util.Scanner;

public class Rainfall
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    double[] rainfall = new double[12];
    double total = 0;
    int highest = 0, lowest = 0;
    for (int i = 0; i < rainfall.length; i++)
    {
      do
      {
        System.out.printf("Please enter the amount of rainfall in mms in the %d. month! ", i+1);
        rainfall[i] = keyboard.nextDouble();
      } while (rainfall[i] < 0);
      total += rainfall[i];
      if (rainfall[i] > rainfall[highest])
        highest = i;
      if (rainfall[i] < rainfall[lowest])
        lowest = i;
    }

    System.out.printf("The total rainfall for the year was: %f mm\n", total);
    System.out.printf("The average monthly rainfall was: %f mm\n", total / rainfall.length);
    System.out.printf("The monthly with the most rainfall was the %d. month. It rained: %f mm\n", highest+1, rainfall[highest]);
    System.out.printf("The monthly with the least rainfall was the %d. month. It rained: %f mm\n", lowest+1, rainfall[lowest]);
  }
}
