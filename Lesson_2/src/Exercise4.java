import java.util.Scanner;

public class Exercise4
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("What is your name?");
    String name = keyboard.nextLine();
    System.out.println("What is your age?");
    int age = keyboard.nextInt();
    keyboard.nextLine();
    System.out.println("What is your address?");
    String address = keyboard.nextLine();

    System.out.println("Hi " + name + "!\nYou are " + age + " years old...");
    System.out.println("And this is where you live ;) " + address);
  }
}
