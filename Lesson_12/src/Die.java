import java.util.Random;

public class Die
{
  private int sides,
              value;

  public Die(int numSides)
  {
    sides = numSides;
  }

  public void roll()
  {
    Random rand = new Random();
    value = rand.nextInt(sides) + 1;
  }

  public int getSides()
  {
    return sides;
  }

  public int getValue()
  {
    return value;
  }
}
