import java.util.Scanner;

public class TestScoresTest
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    TestScores scores = new TestScores();

    System.out.println("What is the first score?");
    scores.setFirstScore(keyboard.nextDouble());
    System.out.println("What is the second score?");
    scores.setSecondScore(keyboard.nextDouble());
    System.out.println("What is the third score?");
    scores.setThirdScore(keyboard.nextDouble());

    System.out.println("The average score is: " + scores.averageScore());
  }
}
