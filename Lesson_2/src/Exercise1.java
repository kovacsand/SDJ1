import java.util.Scanner;

public class Exercise1
{
  public static void main (String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    String city = keyboard.nextLine();
    System.out.println(city.length());
    System.out.println(city.toUpperCase());
    System.out.println(city.toLowerCase());
    System.out.println(city.charAt(0));
  }
}
