public class TestScores
{
  private double firstScore;
  private double secondScore;
  private double thirdScore;

  public void setFirstScore(double firstScore)
  {
    this.firstScore = firstScore;
  }
  public void setSecondScore(double secondScore)
  {
    this.secondScore = secondScore;
  }
  public void setThirdScore(double thirdScore)
  {
    this.thirdScore = thirdScore;
  }
  public double getFirstScore()
  {
    return firstScore;
  }
  public double getSecondScore()
  {
    return secondScore;
  }
  public double getThirdScore()
  {
    return thirdScore;
  }
  public double averageScore()
  {
    return (firstScore + secondScore + thirdScore) / 3;
  }
}
