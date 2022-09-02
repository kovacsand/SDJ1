public class TestScoresTest
{
  public static void main(String[] args)
  {
    int[] testScores = {1, 2, 3, 4, 10};
    try
    {
      TestScores testScores1 = new TestScores(testScores);
    }
    catch (InvalidTestScore e)
    {
      System.err.println(e.getMessage());
    }
  }
}
