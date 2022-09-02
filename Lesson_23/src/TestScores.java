public class TestScores
{
  private int[] testScores;

  public TestScores(int[] testScores)
  {
    this.testScores = new int[testScores.length];
    int counter = 0;
    for (int i = 0; i < testScores.length; i++)
    {
      if (testScores[i] < 0)
        throw new InvalidTestScore(testScores[i] + " is smaller than 0.");
      if (testScores[i] > 100)
        throw new InvalidTestScore(testScores[i] + " is greater than 100.");
      this.testScores[counter++] = testScores[i];
    }
  }
}
