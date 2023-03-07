import java.util.Scanner;

public class StringReverser
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    String str;

    System.out.println("Enter a string, if you want to quit, enter \"quit\"!");
    str = keyboard.nextLine();
    while (!str.equals("quit"))
    {
      for (int i = str.length(); i >= 1; i--)
      {
        System.out.print(str.charAt(i-1));
      }
      System.out.println();
      System.out.println("Enter a string, if you want to quit, enter \"quit\"!");
      str = keyboard.nextLine();
    }
  }
}
