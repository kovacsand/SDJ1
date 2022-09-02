import java.awt.*;

public class Colour
{
  private int red,
              green,
              blue;

  public Colour(int red, int green, int blue)
  {
    this.red = red;
    this.green = green;
    this.blue = blue;
  }

  public void set(int red, int green, int blue)
  {
    this.red = red;
    this.green = green;
    this.blue = blue;
  }

  public int getRed()
  {
    return red;
  }

  public int getGreen()
  {
    return green;
  }

  public int getBlue()
  {
    return blue;
  }

  public boolean isGray()
  {
    return (red == green && green == blue);
  }

  public void mixWith(Colour colour2)
  {
    this.red = (int) (0.5*this.red + 0.5*colour2.red);
    this.green = (int) (0.5*this.green + 0.5*colour2.green);
    this.blue = (int) (0.5*this.blue + 0.5*colour2.blue);
  }

  public Colour copy()
  {
    return new Colour(red, green, blue);
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Colour))
      return false;
    Colour other = (Colour) obj;
    return (red == other.getRed() && green == other.getGreen() && blue == other.getBlue());
  }

  public String toString()
  {
    return String.format("RGB(%d,%d,%d)\n", red, green, blue);
  }
}
