import java.util.Scanner;

public class Exercise6
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Hey! This is a word game. Enter your name!");
    String name = keyboard.nextLine();
    System.out.println("Enter you age!");
    int age = keyboard.nextInt();
    keyboard.nextLine();
    System.out.println("Enter a city!");
    String city = keyboard.nextLine();
    System.out.println("Enter a college!");
    String college = keyboard.nextLine();
    System.out.println("Enter a profession!");
    String profession = keyboard.nextLine();
    System.out.println("Enter a type of animal!");
    String animalType = keyboard.nextLine();
    System.out.println("Enter a pet's name!");
    String petName = keyboard.nextLine();

    System.out.println("There once was a person named " + name + " who lived in " + city
        + ". At the age of " + age + ", " + name + " went to college at " + college + ". "
        + name + " graduated and went to work as a " + profession + ". Then, "
        + name + " adopted a(n) " + animalType + " named " + petName + ". "
        + "They both live happily ever after!");
  }
}
