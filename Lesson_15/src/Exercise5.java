import java.util.Scanner;

public class Exercise5
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    int[] array1 = new int[4], array2 = new int[4];

    for (int i = 0; i < array1.length; i++)
    {
      System.out.println("Enter a whole number!");
      array1[i] = keyboard.nextInt();
    }
    for (int i = 0; i < array2.length; i++)
    {
      System.out.println("Enter a whole number!");
      array2[i] = keyboard.nextInt();
    }

    boolean equalArrays = true;
    for (int i = 0; i < array1.length; i++)
    {
      equalArrays = (array1[i] == array2[i]);
    }

    System.out.println(equalArrays);
  }
}
