import java.util.Scanner;

public class Exercise4
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    int[] numbers = new int[5];
    float sum = 0;

    for (int i = 0; i < numbers.length; i++)
    {
      System.out.println("Enter a whole number!");
      numbers[i] = keyboard.nextInt();
      sum += numbers[i];
    }

    System.out.println(sum / numbers.length);
  }
}
