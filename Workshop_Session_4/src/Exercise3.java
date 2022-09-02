import java.util.Scanner;

public class Exercise3
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    int[] numbers = new int[5], copy = new int[numbers.length], reverse = new int[numbers.length];

    for (int i = 0; i < numbers.length; i++)
    {
      System.out.printf("What is the %d. number?", i + 1);
      numbers[i] = keyboard.nextInt();
    }

    for (int i = 0; i < numbers.length; i++)
      copy[i] = numbers[i];

    for (int i = 0; i < numbers.length; i++)
      reverse[i] = numbers[numbers.length-i-1];

    for (int i = 0; i < numbers.length; i++)
      System.out.printf("The %d. number: %d, %d, %d\n", i + 1, numbers[i], copy[i], reverse[i]);
  }
}
