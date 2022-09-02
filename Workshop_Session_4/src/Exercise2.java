import java.util.Scanner;

public class Exercise2
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    int counter = 0;
    int[] numbers = new int[5];

    System.out.printf("What is the %d. number?", counter+1);
    numbers[counter++] = keyboard.nextInt();

    for (int i = 1; i < numbers.length; i++)
    {
      boolean newNumber;
      do
      {
        System.out.printf("What is the %d. number?", counter+1);
        numbers[counter] = keyboard.nextInt();
        newNumber = true;
        for (int j = counter-1; j >= 0 ; j--)
          if (numbers[counter] == numbers[j])
            newNumber = false;
      } while (! newNumber);
      counter++;
    }

    for (int i = 0; i < numbers.length; i++)
      System.out.println(numbers[i]);
  }
}
