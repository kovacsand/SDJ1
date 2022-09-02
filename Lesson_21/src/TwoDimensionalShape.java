public abstract class TwoDimensionalShape
{
  private double x,
                 y;

  public TwoDimensionalShape(double x, double y)
  {
    this.x = x;
    this.y = y;
  }

  public double getX()
  {
    return x;
  }

  public double getY()
  {
    return y;
  }

  public void moveTo(double x, double y)
  {
    this.x = x;
    this.y = y;
  }

  public abstract double getArea();

  public boolean equals(Object obj)
  {
    if (!(obj instanceof TwoDimensionalShape))
      return false;
    TwoDimensionalShape other = (TwoDimensionalShape) obj;
    return (x == other.x && y == other.y);
  }

  public String toString()
  {
    return String.format("This shape is at %f, %f\n", x, y);
  }
}
