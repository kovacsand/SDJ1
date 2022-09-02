public class Player
{
  private String name;
  private int points;

  public Player(String name)
  {
    this.name = name;
    this.points = 50;
  }

  public String getName()
  {
    return name;
  }

  public int getPoints()
  {
    return points;
  }

  public void setPoints(int points)
  {
    this.points = points;
  }
}
