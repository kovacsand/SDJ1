import java.util.Scanner;

public class CarpetTest
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("I'm gonna calculate the cost of carpeting for your room!");
    System.out.println("First, please enter the width of the room in meters.");
    double width = keyboard.nextDouble();
    System.out.println("Now, please enter the length of the room in meters.");
    double length = keyboard.nextDouble();
    System.out.println("Now, please enter the cost of the carpet per square meter!");
    double price = keyboard.nextDouble();

    RoomDimension room = new RoomDimension(length, width);
    RoomCarpet carpet = new RoomCarpet(room, price);

    System.out.println(carpet);
  }
}
