import java.util.Scanner;

public class FirstToOneGame
{
  public static void main(String[] args)
  {
    Die die1 = new Die(6);
    Die die2 = new Die(6);
    Player player1 = new Player("Lili");
    Player player2 = new Player("Andris");
    Scanner keyboard = new Scanner(System.in);
    int counter = 0;

    do
    {
      counter++;
      die1.roll();
      die2.roll();

      if (player1.getPoints() - die1.getValue() - die2.getValue() < 1)
      {
        player1.setPoints(player1.getPoints() + die1.getValue() + die2.getValue());
      }
      else
      {
        player1.setPoints(player1.getPoints() - die1.getValue() - die2.getValue());
      }
      System.out.printf("%s rolled a %d and a %d. ", player1.getName(), die1.getValue(), die2.getValue());
      System.out.printf("Now they have %d point(s).", player1.getPoints());
      keyboard.nextLine();

      die1.roll();
      die2.roll();

      if (player2.getPoints() - die1.getValue() - die2.getValue() < 1)
      {
        player2.setPoints(player2.getPoints() + die1.getValue() + die2.getValue());
      }
      else
      {
        player2.setPoints(player2.getPoints() - die1.getValue() - die2.getValue());
      }
      System.out.printf("%s rolled a %d and a %d. ", player2.getName(), die1.getValue(), die2.getValue());
      System.out.printf("Now they have %d point(s).", player2.getPoints());
      keyboard.nextLine();


      System.out.printf("This was the %d. round.", counter);
      keyboard.nextLine();
    }
    while (player1.getPoints() != 1 && player2.getPoints() != 1);
    if (player1.getPoints() == 1)
    {
      System.out.printf("The winner is %s!! Congratulations!", player1.getName());
    }
    else
    {
      System.out.printf("The winner is %s!! Congratulations! ", player2.getName());
    }
    System.out.printf("It took them %d rounds.", counter);
  }
}
