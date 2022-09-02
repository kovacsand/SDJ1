public class Rectangle extends TwoDimensionalShape
{
  private double width,
                 length;

  public Rectangle(double x, double y, double width, double length)
  {
    super(x, y);
    this.width = width;
    this.length = length;
  }

  public double getWidth()
  {
    return width;
  }

  public void setWidth(double width)
  {
    this.width = width;
  }

  public double getLength()
  {
    return length;
  }

  public void setLength(double length)
  {
    this.length = length;
  }

  public double getArea()
  {
    return width * length;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Rectangle))
      return false;
    Rectangle other = (Rectangle) obj;
    return super.equals(other) && width == other.width && length == other.length;
  }

  public String toString()
  {
    return String.format("%sIts a rectangle with a width of: %f\nAnd a length of: %f\nIts area is: %f\n", super.toString(), width, length, getArea());
  }
}
