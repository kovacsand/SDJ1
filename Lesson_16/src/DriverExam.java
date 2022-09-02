import java.util.Scanner;

public class DriverExam
{
  private final char[] solutions = {'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D', 'B', 'C', 'D', 'A', 'D', 'C', 'C', 'B', 'D', 'A'};
          char[] answers = new char[20];
          Scanner keyboard = new Scanner(System.in);

  public DriverExam()
  {
    for (int i = 0; i < answers.length; i++)
    {
      do
      {
        System.out.printf("Write your answer to the %d. question. ", i + 1);
        answers[i] = keyboard.nextLine().charAt(0);
      } while (answers[i] != 'A' && answers[i] != 'B' && answers[i] != 'C' && answers[i] != 'D');
    }
  }

  public boolean passed()
  {
    if (totalCorrect() >= 15)
      return true;
    return false;
  }

  public int totalCorrect()
  {
    int counter =0;
    for (int i = 0; i < answers.length; i++)
    {
      if (solutions[i] == answers[i])
        counter++;
    }
    return counter;
  }

  public int totalIncorrect()
  {
    return ((solutions.length)-(totalCorrect()));
  }

  public int[] questionsMissed()
  {
    int[] questionsMissed = new int[20];
    int counter = 0;
    for (int i = 0; i < answers.length; i++)
    {
      if (solutions[i] != answers[i])
      {
        questionsMissed[counter] = i+1;
        counter++;
      }
    }
    return questionsMissed;
  }
}
