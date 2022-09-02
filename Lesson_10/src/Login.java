import java.util.Scanner;

public class Login
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter your username!");
    String username = keyboard.nextLine();
    System.out.println("Enter your password!");
    String pass = keyboard.nextLine();
    System.out.println("Enter your confirmation password!");
    String confirmationPass = keyboard.nextLine();

    while (!pass.equals(confirmationPass))
    {
      System.out.println("Password and confirmation password are not equal!\nEnter it again!");
      System.out.println("Enter your confirmation password!");
      confirmationPass = keyboard.nextLine();
    }

    System.out.printf("Hello %s!\nThis is your password: %s", username, pass);
  }
}
