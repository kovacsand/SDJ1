import java.util.Scanner;

public class Exercise1
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    boolean lucky = false;

    System.out.println("How many elements are you going to insert?");
    int[] numbers = new int[keyboard.nextInt()];

    for (int i = 0; i < numbers.length; i++)
    {
      System.out.printf("Insert the %d. element.", i+1);
      numbers[i] = keyboard.nextInt();
      if (numbers[i] == 7 || numbers[i] == 9 || numbers[i] == 13)
        lucky = true;
    }

    if (lucky)
      System.out.println("Lucky!");
    else
      System.out.println("Contains no 7-9-13");
  }
}
