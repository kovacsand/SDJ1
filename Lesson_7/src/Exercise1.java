import java.util.Scanner;

public class Exercise1
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter a number between 1 and 10");
    int x = keyboard.nextInt();

    if (x >= 1 && x <=10)
    {
     if (x == 1)
     {
       System.out.println("I");
     }
     else if (x == 2)
     {
       System.out.println("II");
     }
     else if (x == 3)
     {
       System.out.println("III");
     }
     else if (x == 4)
     {
       System.out.println("IV");
     }
     else if (x == 5)
     {
       System.out.println("V");
     }
     else if (x == 6)
     {
       System.out.println("VI");
     }
     else if (x == 7)
     {
       System.out.println("VII");
     }
     else if (x == 8)
     {
       System.out.println("VIII");
     }
     else if (x == 9)
     {
       System.out.println("IX");
     }
     else
     {
       System.out.println("X");
     }
    }
    else
    {
      System.out.println("Incorrect input values!");
    }
  }
}
