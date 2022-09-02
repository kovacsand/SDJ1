import java.util.Scanner;

public class Exercise2
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("What is your gender?");
    char gender = keyboard.nextLine().charAt(0);
    System.out.println("What is your age?");
    int age = keyboard.nextInt();

    if ( !(gender == 'M' || gender =='F' ) || (age < 0) )
    {
      System.out.println("Error in typed values!");
    }
    else if (gender == 'M')
    {
      if (age<18)
      {
        System.out.println("Boy");
      }
      else
      {
        System.out.println("Man");
      }
    }
    else if (age<18)
    {
      System.out.println("Girl");
    }
    else
    {
      System.out.println("Woman");
    }
  }
}
