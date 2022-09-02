import java.util.Scanner;

public class Exercise6
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
      System.out.println("Enter a whole number for the second array!");
      array2[i] = keyboard.nextInt();
    }

    int[] sumArray = new int[array1.length];
    for (int i = 0; i < sumArray.length; i++)
    {
      sumArray[i] = array1[i] + array2[i];
      System.out.print(sumArray[i] + ", ");
    }


  }
}
