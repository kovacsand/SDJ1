public class InvalidTestScore extends RuntimeException
{
  public InvalidTestScore()
  {
    super("Invalid test score.");
  }

  public InvalidTestScore(String msg)
  {
    super("Invalid test score: " + msg);
  }
}
