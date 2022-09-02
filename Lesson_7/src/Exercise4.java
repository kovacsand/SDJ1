import java.util.Scanner;

public class Exercise4
{
  public static void main(String [] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter your username!");
    String username = keyboard.nextLine();
    System.out.println("Enter your password!");
    String password = keyboard.nextLine();
    System.out.println("Enter your password again!");
    String confirmationPassword = keyboard.nextLine();

    System.out.printf("Hello %s! Good to see you back!\n", username);
    if (password.equals(confirmationPassword))
    {
      System.out.println("Your credentials were correct :)");
    }
    else
    {
      System.out.println("Your credentials were incorrect :(");
    }
  }
}
