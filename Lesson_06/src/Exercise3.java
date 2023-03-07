import java.util.Scanner;

public class Exercise3
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("What is the Danish grade?");
    int grade = keyboard.nextInt();

    if (grade == 12)
    {
      System.out.println("A");
    }
    else if (grade == 10)
    {
      System.out.println("B");
    }
    else if (grade == 7)
    {
      System.out.println("C");
    }
    else if (grade == 4)
    {
      System.out.println("D");
    }
    else if (grade == 2)
    {
      System.out.println("E");
    }
    else if (grade == 0)
    {
      System.out.println("Fx");
    }
    else if (grade == -3)
    {
      System.out.println("F");
    }
    else
    {
      System.out.println("Error in typed values!");
    }
  }
}
